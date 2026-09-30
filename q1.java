
    import java.util.Scanner;
    public class q1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        do{
            if(n%10==7){
                count++;
            }
            n=n/10;
        }while(n>0);
        System.out.println("Total no of 7:="+count);
    }
}

