public class DBConnection_DoubleCheck {

    private static  volatile DBConnection_DoubleCheck conObject;

    private DBConnection_DoubleCheck() {

    }

    public static DBConnection_DoubleCheck getInstance() {
        if (conObject == null) { //here checks conObject=null then sync -->Lock goes and check again
            //if not present create new Object
            synchronized (DBConnection_DoubleCheck.class) {
                if (conObject == null) {
                    conObject = new DBConnection_DoubleCheck();
                }
            }
        }
        return conObject;
    }
}
//The problem here is Like 2 CPU ->Core/Core then L1 cache/L2 Cache
//for temporary basis they store object at L1Cache and periodically sync to the Memory
//suppose for T1 checks conObject==null creates reference of conObject to L1 Cache ,
//again check for T2 create refeence at L1 cache suppose for T3 create reference in L2cache
// but L1 cache ,L2 Cache not synced before so its dosent have info for conObject
// and even to memory  also no syncing happened no update to memory ,if it is null
//again it create new conObject reference and this is the memory issue


//To overcome this volatile is used.In volatile object is directly stored in memory not in L1Cache
//So it directly searches the memory if not created the create otherwise returns it.
//It wont even check the Cache.


//still it will be slow because volatile we are using because we are not using cache so it will be little show and
//uses synchronized also so lock/unlock checks happening so it makes slow
//To Overcome this -->Bill Pugh Solution. see in DBConnection_BPS