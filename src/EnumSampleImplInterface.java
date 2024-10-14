public enum EnumSampleImplInterface implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    //it is for each one  this is for all
    // interface is generally used when certain method is generally common for all
    @Override
    public  String toLowerCase(){
        return name().toLowerCase(); //interface should provide its definition
        //MONDAY object.toLowercase()-->change it to Monday
    }


    public static void main(String args[]){
        EnumSampleImplInterface enumSampleMonday=EnumSampleImplInterface.MONDAY;
        System.out.println(enumSampleMonday.toLowerCase()); //monday->O/P
    }
}
