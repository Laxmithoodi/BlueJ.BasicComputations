 

import java.util.Scanner;
import java.lang.*;
public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        
        Integer i = new Integer (value);
        
       String m = Integer.toBinaryString(i);
        
        return m;
    }

    public String printIntegerAsOctal(int value){
        Integer i = new Integer(value);
        
        String m = Integer.toOctalString(i);
        return m;
    }

    public String printIntegerAsHexadecimal(int value){
        Integer i = new Integer(value);
        
        String m = Integer.toHexString(i);
        return m;
    }

    public static void main(String[] args){
        String binary;
        int m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        
        m= s.nextInt();
        
        IntegerPrinter ip = new IntegerPrinter();
        binary = ip.printIntegerAsBinary(m);
        System.out.println("Binary:" + binary);
        
        
        
        
        
        

    }
}
