import java.util.EnumSet;

public enum EnumSampleCheck {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    //internally ordinal has been assigned
    //now observe in Main to see difference why enum is needed? first create method isweekend in both enum and class

    public static void main(String args[]) {

        //the code is self readable we dont have to put like that for SUNDAY its 0 like that
        //better readability and full control on what we can pass in parameter
        isWeekend(EnumSampleCheck.WEDNESDAY); //return false
        isWeekend(EnumSampleCheck.SUNDAY);// return true
    }

    //parameter is expecting enum sample
        public static  boolean isWeekend (EnumSampleCheck day){
            if (EnumSampleCheck.SATURDAY == day || EnumSampleCheck.SUNDAY == day) {
                return true;
            } else {
                return false;
            }
            //now observe in main
        }


}
