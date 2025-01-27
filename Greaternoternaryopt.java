import java.util.Scanner;
class Greaternoternaryopt{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int greatest=(a>c)?((a>c)?a:c):((b>c)?b:c);
System.out.println("the greatset number is:"+greatest);

}
}
