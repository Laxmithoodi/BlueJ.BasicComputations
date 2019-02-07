 
import java.util.*;

public class ShortCalculator {
   public static void main(String[] args){
        { 
            
            Short a,b,sum,diff,pro,quo,rem;
            Scanner input= new Scanner(System.in);
            System.out.printf("\nEnter first number");
            a=input.nextShort();
            System.out.printf("\nEnter second number");
            b=input.nextShort();

            sum=(short)(a+b);
            diff=(short)(a-b);
            pro=(short)(a*b);
            quo=(short)(a/b);
            rem=(short)(a%b);
            
            System.out.printf("\nSum is %d",sum);
            System.out.printf("\nDifference is :%d",diff);
            System.out.printf("\nProduct is :%d",pro);
            System.out.printf("\nQuotient is :%d",quo);
            System.out.printf("\nThe remainder is :%d",rem);
        }
    }
}
