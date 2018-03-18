using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using App_Code;
using System.Data.Entity;
using MySql.Data.MySqlClient;

public class userDAO : DbContext
{
    public virtual DbSet<user> user { get; set; }
    private ConnectDB connectionDB = new ConnectDB();
    private MySqlConnection connection;
    private string query;

    protected override void OnModelCreating(DbModelBuilder modelBuilder)
    {
        modelBuilder.Entity<user>()
                .Property(e => e.name)
                .IsUnicode(false);

        modelBuilder.Entity<user>()
            .Property(e => e.password)
            .IsUnicode(false);

        modelBuilder.Entity<user>()
            .Property(e => e.role)
            .IsUnicode(false);

        modelBuilder.Entity<user>()
            .Property(e => e.username)
            .IsUnicode(false);
    }

    public user FindUserByUsername(string username)
    {
        connection = connectionDB.OpenConnection();
        query = "SELECT * FROM user WHERE username = @username";
        MySqlCommand command = new MySqlCommand(query, connection);

        command.Parameters.Add(new MySqlParameter("username", username));
        user user = new user();

        using (MySqlDataReader reader = command.ExecuteReader())
        {
            
            while(reader.Read())
            {
                user.id = (int)reader[0];
                user.name = (string)reader[1];
                user.password = (string)reader[2];
                user.role = (string)reader[3];
                user.username = (string)reader[4];
            }
        }

        connectionDB.CloseConnection();

        return user;
    }
}