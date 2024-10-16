public class DBConnection_Singleton {

    private static  DBConnection_Singleton conObject=new DBConnection_Singleton();
    //this conObject belongs to the class no matter how many object you make

    private  DBConnection_Singleton(){
        //nobody will be able to do apart from this class new DB Connection
    }

    public static DBConnection_Singleton getInstance(){
        return conObject; //only one object we have created and we will return this
    }

    public static void main(String [] args){
        DBConnection_Singleton connObject= DBConnection_Singleton.getInstance(); //accessed by className
    }

}
//this is Eager Initialization as soon as you start this then all the static variable are preloaded in memory

//even someone not calling not using it will be created in memory