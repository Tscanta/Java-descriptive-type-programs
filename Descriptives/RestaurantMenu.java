package Descriptives;

import java.util.Scanner;
public class RestaurantMenu
{
    public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("MENU");
System.out.println("==================");
System.out.println("DISH & PRICE");
System.out.println("==================");
System.out.println("1. Chiken Rice ~$4");
System.out.println("2. Momo ~$2");
System.out.println("3. Burger ~$3");
System.out.println("4. Pizza ~$7");
System.out.println("5. Noodles ~$10");
System.out.println("6. Sandwhich ~$6");
System.out.println("7. Ice Cream ~$5");
System.out.println("==================");
System.out.println("What do you want to order?");
int odr=in.nextInt();
switch(odr)
{
    case 1:
        System.out.println("Do you want to order Chicken Rice?");
        break;
        case 2:
        System.out.println("Do you want to order Momo?");
        break;
        case 3:
        System.out.println("Do you want to order Burger?");
        break;
        case 4:
        System.out.println("Do you want to order Pizza?");
        break;
        case 5:
        System.out.println("Do you want to order Noodles?");
        break;
        case 6:
        System.out.println("Do you want to order SandWhich?");
        break;
        case 7:
        System.out.println("Do you want to order Ice cream?");
        break;
        default:
            System.out.println("YOUR ORDER IS INVALID!");
        }
        int bill=0;
        if(odr==1)
        bill=4;
        if(odr==2)
        bill=2;
        if(odr==3)
        bill=3;
        if(odr==4)
        bill=7;
        if(odr==5)
        bill=10;
        if(odr==6)
        bill=6;
        if(odr==7)
        bill=5;
            System.out.println("Enter 1 for yes");
            System.out.println("Enter 2 for no");
            int opt=in.nextInt();
            if(opt==1)
            System.out.println("Your order was successfull!.Your bill is ~$"+bill);
            else
            System.out.println("Your order was cancelled.");
        }
    }
            
            
            
        

