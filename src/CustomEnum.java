public enum CustomEnum {

    MONDAY(101,"1st day of the Week"),
    TUESDAY(102,"2nd day of the Week"),
    WEDNESDAY(103,"3rd day of the Week"),
    THURSDAY(104,"4th day of the Week"),
    FRIDAY(105,"5th day of the Week"),
    SATURDAY(106," 1st week off"),
    SUNDAY(107,"2nd week off");

    private int val;
    private String comment; //for every custom values appropriate member variables you need to have

    CustomEnum(int val, String comment) { //private only but parameterized constructor
        this.val = val;
        this.comment = comment;
    //for each get comment they internally have their  version
    }

    public int getVal(){
        return  val; //for each they have every value ,for MONDAY,TUESDAY...WEd also
    }

    public String getComment(){
        return comment;
    }

    //method which we want to keep class level that is static.....that is one for every all
    //static for EnumClass not for each constant
    public static CustomEnum getEnumValue(int value){
        for(CustomEnum sample: CustomEnum.values()){
            if(sample.val==value){
                return sample;
            }
        }
        return null;
    }
//Observe in Main
}
