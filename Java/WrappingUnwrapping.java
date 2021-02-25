package Practice;

public class WrappingUnwrapping {
    public static void main(String[] args) {
        //Wrapping-to convert primitive type into wrapper class object
        int a=34;              //int data type
        Integer intobj=a;      //Integer wrapper class

        char c='s';
        Character charobj=c;

        byte b=1;
        Byte byteobj=b;

        System.out.println("Values of Wrapper object(Printing as object)");
        System.out.println(intobj);
        System.out.println(charobj);
        System.out.println(byteobj);

        //UnWrapping-to convert wrapper class object into  primitive type
        int i=intobj;
        char j=charobj;
        byte k=byteobj;

        
        System.out.println(" UnWrapper values(Printing as data type)");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        Integer i1=Integer.valueOf("123");               //return reference of an object of wrapper class  
        System.out.println("i1="+i1);

        double d=Double.parseDouble("4.55664");                //convert string into integer
        System.out.println("d="+d);

        Float floatobj=4.55f;
        float f=floatobj.floatValue();      
        System.out.println("f="+f);

    }
}
