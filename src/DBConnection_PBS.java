public class DBConnection_PBS {

    private DBConnection_PBS(){

    }

    //same as Eager Initialization difference is this only writing this object inside static nested claases
    private static class DBConncetionHelper {
        //need to write inside this static  nested class
        private static final  DBConnection_PBS INSTANCE_OBJECT = new DBConnection_PBS();
    }
//Intializing this in private nested class

    public static DBConnection_PBS getInstance(){
        return DBConncetionHelper.INSTANCE_OBJECT;
    }
}
//one more way is enum. check on EDBConnetion class.