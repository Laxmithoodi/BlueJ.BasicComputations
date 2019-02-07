 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        
        BigInteger fact = BigInteger.valueOf(1);
    for (int i = 1; i <= value; i++)
        fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }

}
