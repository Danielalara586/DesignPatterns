package Adapter;

public class Adapter implements ISQLConnection{
    private INoSQLConnection noSQL;

    public Adapter(INoSQLConnection noSQL) {
        this.noSQL = noSQL;
    }

    @Override
    public void connection() {
        this.noSQL.connection();
    }

    @Override
    public String runQuery() {
        return this.noSQL.executeSentence();
    }
}
