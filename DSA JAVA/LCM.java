import java.util.*;
public class LCM{
    public static void main(String[] args) {
        System.out.println("Enter two Numbers:  ");
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2 !=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gdc=n2;
        int lcm= (on1 * on2)/gdc;
        System.out.println(gdc);
        System.out.println(lcm);
    }
   
}
