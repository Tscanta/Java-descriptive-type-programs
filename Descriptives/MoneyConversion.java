package Descriptives;

//MONEY CONVERSION
import java.util.Scanner;
public class MoneyConversion
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int rp;
    double dllr=0;
    double yen=0;
    double eu=0;
    double rb=0;
    System.out.println("Enter the amount in INR ₹");
    rp=sc.nextInt();
    dllr=rp*76.52;
    yen=rp*0.58;
    eu=rp*80.68;
    rb=rp*1.07;
    System.out.println("============================================");
    System.out.println("Conversion of INR ₹ into");
    System.out.println("============================================");
    System.out.println("Press 1. to convert INR(₹) to DOLLARS($)");
    System.out.println("Press 2. to convert INR(₹) to YEN(¥)");
    System.out.println("Press 3. to convert INR(₹) to EURO(€)");
    System.out.println("Press 4. to convert INR(₹) to RUBLE(₽)");
    System.out.println("============================================");
    int opt=sc.nextInt();
    switch(opt)
    {
case 1:
    System.out.println("The amount in DOLLARS $"+dllr);
    System.out.println("============================================");
    break;
case 2:
    System.out.println("The amount in YEN ¥"+yen);
    System.out.println("============================================");

    break;
case 3:
    System.out.println("The amount in EURO €"+eu);
    System.out.println("============================================");
    break;
case 4:
    System.out.println("The amount in RUBLE ₽"+rb);
    System.out.println("============================================");
    break;
default:
    System.out.println("Your choice is invalid");
    System.out.println("============================================");
}
}
}

    

