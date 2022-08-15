package Adapter;

public class MySQLConnection implements ISQLConnection {


    @Override
    public void connection() {
        System.out.println("Connecting to MySQL...");
    }

    @Override
    public String runQuery() {
        return "MySQL query";
    }
}
