import java.util.Scanner;
public class Pelendrom{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
           
        }
        System.out.println("original no:="+original);
        System.out.println("Reverse:="+rev);
         if(rev==original){
                System.out.println("it is pelendrom");
            }else{
                System.out.println("not pelendrom");
            }
        
    }
}