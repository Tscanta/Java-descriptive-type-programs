package Descriptives;
import java.util.Scanner;
public class FarheinheitCelsius
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    double value=0;
    System.out.println("Enter the elements of degree Farheinheit");
    for(int i=0;i<5;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Converting farheinheit to celsius");
    System.out.println(" ");
    for(int i=0;i<5;i++)
    {
        value=5.0/9*(a[i]-32);
        System.out.println("Conversion of farheinheit to celsius: "+value+".c");
    }
}
}