import java.util.*;
public class rotateanum {
    public static void main(String[] args) {
        System.out.println("Enter a Number:  ");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        while(temp>0){
        temp = temp/10;
        nod++;
}
    int div=1;
    int mult=1;
    for (int i=1;i<=nod;i++){
        if(i<k){
            div=div*10;
        }else{
            mult=mult*10;
        }
    }
    int q = n/div;
    int r = n%div;
    int rot = r*mult+q;
    System.out.println(rot);
}
}