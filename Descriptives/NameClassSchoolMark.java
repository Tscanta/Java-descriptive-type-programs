package Descriptives;
import java.util.Scanner;
public class NameClassSchoolMark
{
    public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.print("Enter your name");
String name=in.next();
System.out.println("Enter your class");
int cls=in.nextInt();
System.out.println("Enter your School");
String school=in.next();
System.out.println("Enter your marks in your 1st subject");
int m1=in.nextInt();
System.out.println("Enter your marks in your 2nd subject");
int m2=in.nextInt();
System.out.println("Enter your marks in your 3rd subject");
int m3=in.nextInt();
System.out.println("Enter your marks in your 4th subject");
int m4=in.nextInt();
System.out.println("Enter your marks in your 5th subject");
int m5=in.nextInt();
System.out.println("Enter your marks in your 6th subject");
int m6=in.nextInt();
System.out.println("Enter your marks in your 7th subject");
int m7=in.nextInt();
System.out.println("Enter your marks in your 8th subject");
int m8=in.nextInt();
System.out.println("Enter your marks in your 9th subject");
int m9=in.nextInt();
System.out.println("Enter your marks in your 10th subject");
int m10=in.nextInt();
int total=0;
int remark=0;
double perc=0;
total=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10;
perc=total/1000.0 * 100;
System.out.println("total percentage" +perc);
if (perc >= 40)
{
    System.out.println(name+" you have passed");
}
else
{
    System.out.println(name+" you have failed");
}
}
}
