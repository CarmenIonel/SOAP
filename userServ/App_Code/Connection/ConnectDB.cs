using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

public class ConnectDB
{
    private MySqlConnection connection;
    private string server;
    private string database;
    private string uid;
    private string password;

    public ConnectDB()
    {
        Initialize();
    }

    private void Initialize()
    {
        server = "localhost";
        database = "assignment4";
        uid = "root";
        password = "root";
        string connectionString;
        connectionString = "SERVER=" + server + ";" + "DATABASE=" +
        database + ";" + "UID=" + uid + ";" + "PASSWORD=" + password + ";";

        connection = new MySqlConnection();
        connection.ConnectionString = connectionString;
    }

    public MySqlConnection OpenConnection()
    {
            connection.Open();
            return connection;
    }

    public bool CloseConnection()
    {
        try
        {
            connection.Close();
            return true;
        }
        catch (MySqlException ex)
        {
            return false;
        }
    }

}