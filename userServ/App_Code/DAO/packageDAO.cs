using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using App_Code;
using System.Data.Entity;
using MySql.Data.MySqlClient;

public class packageDAO : DbContext
{
    public virtual DbSet<package> package { get; set; }
    private ConnectDB connectionDB = new ConnectDB();
    private MySqlConnection connection;
    private string query;
    private MySqlTransaction transaction;

    protected override void OnModelCreating(DbModelBuilder modelBuilder)
    {
        modelBuilder.Entity<package>()
                .Property(e => e.description)
                .IsUnicode(false);

        modelBuilder.Entity<package>()
            .Property(e => e.name)
            .IsUnicode(false);
    }

    public List<package> SearchPackage(string name)
    {
        connection = connectionDB.OpenConnection();
        query = "SELECT * FROM package WHERE name = @name";
        MySqlCommand command = new MySqlCommand(query, connection);

        command.Parameters.Add(new MySqlParameter("name", name));
        package pack = new package();
        List<package> packages = new List<package>();

        using (MySqlDataReader reader = command.ExecuteReader())
        {
            while(reader.Read())
            {
                pack.id = (int)reader[0];
                pack.description = (string)reader[1];
                pack.name = (string)reader[2];
                pack.destinationCity_id = (int)reader[4];
                pack.receiver_id = (int)reader[5];
                pack.sender_id = (int)reader[6];
                pack.senderCity_id = (int)reader[7];

                String track = reader[3].ToString();

                if (track.Equals("1"))
                    pack.tracking = true;
                else
                    pack.tracking = false;

                packages.Add(pack);
            }
        }
            connectionDB.CloseConnection();

        return packages;
    }

    public string Status(string name)
    {
        connection = connectionDB.OpenConnection();
        query = "SELECT * FROM package WHERE name = @name";
        MySqlCommand command = new MySqlCommand(query, connection);

        command.Parameters.Add(new MySqlParameter("name", name));
        string status="";

        using (MySqlDataReader reader = command.ExecuteReader())
        {
            while (reader.Read())
            {
                status = reader[3].ToString();
            }
        }
        connectionDB.CloseConnection();

        if (status.Equals("1"))
            return "tracking";
        else
            return "not tracking";
    }

    public String FindPackages(int id)
    {
        connection = connectionDB.OpenConnection();
        query = "SELECT * FROM package WHERE receiver_id = @id OR sender_id = @id";
        MySqlCommand command = new MySqlCommand(query, connection);

        command.Parameters.Add(new MySqlParameter("id", id));
        package pack = new package();
        List<package> packages = new List<package>();

        using (MySqlDataReader reader = command.ExecuteReader())
        {
            while (reader.Read())
            {
                pack.id = (int)reader[0];
                pack.description = (string)reader[1];
                pack.name = (string)reader[2];
                pack.destinationCity_id = (int)reader[4];
                pack.receiver_id = (int)reader[5];
                pack.sender_id = (int)reader[6];
                pack.senderCity_id = (int)reader[7];

                String track = reader[3].ToString();
                if (track.Equals("1"))
                    pack.tracking = true;
                else
                    pack.tracking = false;

                packages.Add(pack);
            }
        }
        connectionDB.CloseConnection();

        string aux = "";
        foreach (package p in packages)
            aux += p.ToString();
        return aux;
    }
}