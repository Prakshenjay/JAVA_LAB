// 9.	Write a java program to illustrate the concept of packages and interfaces in java.

interface Compute
{
	void convert();
}

class ByteConvert implements Compute
{
    int KB;

    ByteConvert(int x)
    {
        KB = x;
    }
    
    public void convert()
    {
        Double GB = Double.valueOf(KB)/(1024*1024) ;
        System.out.println("In KiloBytes : " + KB);
        System.out.println("In GigaBytes : " + GB);
    }
}

class CurrencyConvert implements Compute {

    int Euro;

    CurrencyConvert(int x)
    {
        Euro = x;
    }

    public void convert()
    {
        Double INR = Euro * 89.72;
        System.out.println("In Euro : " + Euro);
        System.out.println("In INR : " + INR);
    }
}

public class EXP_9 {
    public static void main(String[] args){

        ByteConvert b1 = new ByteConvert(2000000);

        CurrencyConvert c1 = new CurrencyConvert(56);

        b1.convert();

        c1.convert();
    }
}
