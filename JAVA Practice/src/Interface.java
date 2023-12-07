// Write a Java program to define an interface compute, with an abstract method 
// Define two classes which implements this compute interface and extend the convert method KB to GB and Euro to Rupees.
// Declare objects for both the classes and demonstrate the conversion from kilobytes to gigabytes and euro to rupees.

interface Compute {

	void convert();
}

class ByteConvert implements Compute {

    int KB;

    ByteConvert(int x){
        KB = x;
    }
    
    public void convert(){
        Double GB = Double.valueOf(KB)/(1024*1024) ;
        System.out.println("In KiloBytes : " + KB);
        System.out.println("In GigaBytes : " + GB);
    }
}

class CurrencyConvert implements Compute {

    int Euro;

    CurrencyConvert(int x){
        Euro = x;
    }

    public void convert(){
        Double INR = Euro * 89.72;
        System.out.println("In Euro : " + Euro);
        System.out.println("In INR : " + INR);
    }
}

public class Interface {
    public static void main(String[] args){

        ByteConvert b1 = new ByteConvert(2000000);

        CurrencyConvert c1 = new CurrencyConvert(56);

        b1.convert();

        c1.convert();
    }
}
