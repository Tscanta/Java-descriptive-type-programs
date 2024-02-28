package Descriptives;

import java.util.Scanner;
public class ConvertingTemperature
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String t;
    System.out.println("CONVERT TEMPERATURE");
    System.out.println("=============================");
    System.out.println("1. Farheinheit to Celsius");
    System.out.println("2. Celsius to Farheinheit");
    System.out.println("=============================");
    System.out.println("Enter your choice :");
    int c=sc.nextInt();
    switch(c)
    {
        case 1:
            System.out.println("Enter the temperature in Farheinheit:");
            int f=sc.nextInt();
            double cl=5.0/9*(f-32);
            System.out.println("The temperature in celsius= "+cl+"C");
            break;
            case 2:
                System.out.println("Enter the temperature in CELSIUS:");
                double c2=sc.nextInt();
                double f2=1.8*c2+32;
                System.out.println("The temperature in falrenheit= "+f2+"F");
                break;
                default:
                    System.out.println("YOUR CHOICE IS INCORRECT! PLEASE TRY AGAIN");
                }
            }
        }