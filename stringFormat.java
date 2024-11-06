import java.util.*;
public class stringFormat {
    public static void main(String[] args) {
        int a=10;
        String s=String.format("%d",a);
        System.out.println(s.length());
        Random rand=new Random();
        System.out.println(String.format("%d",rand.nextInt(10000)));

    }    
}
