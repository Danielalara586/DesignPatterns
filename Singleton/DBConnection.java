package Singleton;

public class DBConnection {
    private static DBConnection connection;
    public String host;

    private DBConnection() {

    }

    public synchronized static DBConnection getConnection() {
        if (connection == null)
            connection = new DBConnection();

        return connection;
    }
}
