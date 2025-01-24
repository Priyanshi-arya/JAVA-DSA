import java.util.*;
public class countdigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number for digit count: ");
        int n = scn.nextInt();
        int dig=0;
        while(n!=0){
            n = n / 10;
            dig++;
        }
    System.out.println(dig);

    }
    
}
