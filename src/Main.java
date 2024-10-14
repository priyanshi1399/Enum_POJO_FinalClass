import java.awt.geom.CubicCurve2D;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Common function which is used
        -values()
        -Ordinal()
        -valueOf()
        -name()
         */
 /*Normal EnumClass
        //1. Usage of Values() and ordinal()
        for (SampleEnum sample : SampleEnum.values()) {//Internally java.lang.EnumClass in this class this method is present
            //this returns an array of constant. and access by class name(static) //SampleEnum[]
            System.out.println(sample.ordinal());
            //there are default value assigned from 0 to..that is ordinal, MONDAY,TUESDAY... is sample.
        }

        //2.usage of ValueOf() and name()
        SampleEnum enumVariable=SampleEnum.valueOf("FRIDAY"); //pass a string it match with the constants so it will return me the enumsampleobject
        System.out.println(enumVariable.name());*/


        /*CustomEnumClass*/

        CustomEnum sampleVariable=CustomEnum.getEnumValue(107);
        System.out.println(sampleVariable.getComment());
    }
}