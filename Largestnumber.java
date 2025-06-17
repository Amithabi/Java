import java.util.*;
public class Largestnumber
{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
        if(a>=b)
        {
        if(a>c){
            System.out.println(a+ "is a greater");
        }
        else if(c>a){
            System.out.println(c+ "is a greater");
        }
        else{
            System.out.print(a);
            }
        }
        else if(b>=a)
        {
            if(b>c){
                System.out.println(b+ "is a greater");
            }
            else if(c>b){
                System.out.println(c+ "is a greater");
            }
            else{
                System.out.print(b);
            }
        }
        else{
            System.out.println(c+ "is a greater");
        }
    }
}