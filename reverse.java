import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        int n=1212;
        int rev=0;
        int i=0;
        while(i<n){
            rev=rev*10+(n%10);
            n=n/10;
        }
            System.out.println(rev);
    }
} 