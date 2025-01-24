import java.util.*;
public class studentMarks {
    public static void main(String[] args) {
        Scanner snc= new Scanner (System.in);
        System.out.println("Enter student marks:  ");
        int n = snc.nextInt();
        if (n > 90) {
             
            System.out.println("Exellent");
        }
        if (n >= 80 && n<=90) {
            System.out.println("Good");
        }
        if (n >= 70 && n<=80) {
            System.out.println("Fair");
        }
        if (n >= 60 && n<=70) {
            System.out.println("Meet Expectations");
        }
        if (n <= 60){
             System.out.println("Below par"); 
        }
    }
    
}
