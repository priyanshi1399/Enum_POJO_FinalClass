import java.util.*;
final class MyImmutableClass { //make final

    private final String name;
    private final List<Object> petNameList; //all class member should be private

    MyImmutableClass(String name,List<Object> petNameList){
         //intialized once using constructor
        this.name=name;
        this.petNameList=petNameList;
    }

    public String getName(){ //only getter method
        return name;
    }

    //final says you will always point to sameList but you are allowed to change internally
    //created object stored sj and pj
    public List<Object> getPetNameList(){
        //this is required ,because making kist Final.
        //means you can not now point it to new list , but still can add ,delete values to it
        //so thats why we send a copy of it.
        return new ArrayList<Object>(petNameList); //in getter always return a copy
    }

    public static void main(String [] args){

        List<Object> petNames=new ArrayList<>( );
        petNames.add("sj");
        petNames.add("pj");
        //petNames.add("hell");

        MyImmutableClass obj= new MyImmutableClass("myName",petNames);
        obj.getPetNameList().add("hello"); //copy of getpetNameList add hello
        System.out.println(obj.getPetNameList()); //o/p will be [sj, pj] because we are changing the reference not the value
//obj.getPetNameList always creates a copy.
        //if obj.getNamesList(0=>how you will change this no no setter method
        //can you change petNamesList
    }
//class state of member should not be changed.
}
