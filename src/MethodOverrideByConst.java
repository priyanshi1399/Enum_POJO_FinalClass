public enum MethodOverrideByConst {
    //Example of MethodOverrideByConstant
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday dummy Method");
        } //here created its dummy method which is overriding
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    //this method is common for all but if MONDAY says no I want to override this method,I want certain changes
    public void dummyMethod(){
        System.out.println("default dummy Method");
    }

    //here If I want enumSample.FRIDAY so it will call default dummy Method.
    //Observe in below

    public static void main(String [] args){

        MethodOverrideByConst fridaySampleEnum=MethodOverrideByConst.FRIDAY;
        fridaySampleEnum.dummyMethod();
        //calling FRIDAY
        MethodOverrideByConst mondaySampleEnum=MethodOverrideByConst.MONDAY;
        mondaySampleEnum.dummyMethod();
        //Calling MONDAY calling Overriden METHOD

        /*O/P--
        default dummy Method
        Monday dummy Method */
    }
}
