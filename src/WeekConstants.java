public class WeekConstants {
    //1st way of creating constants

    public static final int MONDAY=0;
    public static final int TUESDAY=1;
    public static final int WEDNESDAY=2;
    public static final int THURSDAY=3;
    public static final int FRIDAY=4;
    public static final int SATURDAY=5;
    public static final int SUNDAY=6;

    public static void main(String argds[]) {
   isWeekend(2); //wednesday, so it will return false
   isWeekend(6);// sunday, so it will return false
   isWeekend(100); //this.value is not expected, but still we are able to  send this in paramter
       // is there any control no
        // I never had intenstion to write any unidentified value, with this I can pass integer 100
        //this method can work unexpectedily
    }


    public static boolean isWeekend(int day){
        if(WeekConstants.SATURDAY==day || WeekConstants.SUNDAY==day){
            return true;
        }
        else{
            return false;
        }
        //now observe in Main
    }

}
