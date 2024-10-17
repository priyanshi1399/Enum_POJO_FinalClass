public class DBConnection_Sync {

    private static DBConnection_Sync conObject;

    private DBConnection_Sync(){

    }

    synchronized public static DBConnection_Sync getInstance(){
        if(conObject==null){
            conObject=new DBConnection_Sync();
        }
        return  conObject; //here it checks again and again if conObject==null then creates
        //by the synchronized keyword it locks and unlocks .first locks T1 works then check conObject=null
        //creates then only T2 will go to queue.

        //but here 100th of places getInstance() method , object is created place2 again we have to put lock /unlock
        //so this is very very slow .to overcome Double Check locking system comes ..see in DBConnection_DoubleC
    }
}
