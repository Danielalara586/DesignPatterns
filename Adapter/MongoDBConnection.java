package Adapter;

public class MongoDBConnection implements INoSQLConnection{
    @Override
    public void connection() {
        System.out.println("Connecting to MongoDB...");
    }

    @Override
    public String executeSentence() {
        return "MongoDB query";
    }
}
