import java .util.Scanner;
class Float{
public static void main(String[]args){
System.out.println("enter the float no :");
Scanner sc=new Scanner(System.in);
float a=sc.nextFloat(); 
float b=sc.nextFloat();
int x= Math.round(a*100);
int y= Math.round(b*100);
System.out.println(x);
System.out.println(y);
if(x==y){
System.out.println("Float values are equal");
}
else{
System.out.println("Float values are not equal");
}
}
}