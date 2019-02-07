 
import java.util.Scanner;

public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int normalized1= (angle % 360 + 360)%360;
        
        return normalized1;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int normalized2 = Math.floorMod(integer, 360);
        return normalized2;
    }

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int angle = scan.nextInt();
        NormalizeAngle na = new NormalizeAngle();
        
        
        
        System.out.println(na.normalizeValueUsingModulo(angle));
        System.out.println(na.normalizeValueUsingFloorMod(angle));
        
    }
}
