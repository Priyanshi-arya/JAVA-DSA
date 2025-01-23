import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        boolean flag = false;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Number "+ n + " is prime");
        }else{
            System.out.println("Number "+ n + " is not prime");
        }

    }
}
