public enum EnumSampleAbs {
    MONDAY{
        public void dummyMethod(){
            System.out.println("in Monday");
        }
    },
    TUESDAY{
        public void dummyMethod(){
            System.out.println("in Tuesday");
        }
    },
    SUNDAY{
        public void dummyMethod(){
            System.out.println("in Sunday");
        }
    };

    public abstract void dummyMethod(); //here I have put abstaract Method
    //here its child classes have to override and provide its definition
    //here concept is all the constants have to provide the definition

    public static  void main(String [] args){
        EnumSampleAbs enumSample=EnumSampleAbs.MONDAY;
        enumSample.dummyMethod(); //o/p-in Monday // so abstract method can be there each constant has to define/implement it
    }

}
