public class DBConnection_LazyINIT {
    //This is an example of lazy initialization to overcome the issue of EagerInitialization

    private static DBConnection_LazyINIT conObject;

    private DBConnection_LazyINIT(){

    }


    public static  DBConnection_LazyINIT getInstance(){
        //here it checks if conObject is null then create new

        if(conObject==null){
            conObject=new DBConnection_LazyINIT();

        }
        return conObject;
    }

  //Problem here is if there are 2 threads running parallely if conObject==null at  one T1 and at the same time T2 ,if condition conObject=null  is checked then it
    //will create 2 objects that is disadvantage

    //to overcome this problem synchronized solved the problem. Check in DBConnection_Sync Class/

}
