package Descriptives;

import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int opt,opt2;
        int aopt,aopt2;
        int add=a+b;
        int sub=a-b;
        double mult=a*b;
        double div=a/b;
        int sqrA=add*add;
        int sqrS=sub*sub;
        int cbeA=add*add*add;
        int cbeS=sub*sub*sub;
        System.out.println("=================================");
        System.out.println("Press 1. for Addition");
        System.out.println("Press 2. for Subtraction");
        System.out.println("Press 3. for Multiplication");
        System.out.println("Press 4. for Division");
        System.out.println("=================================");
        System.out.println("Press 5. for Additional Options");
        System.out.println("=================================");
        opt=sc.nextInt();
        switch(opt)
        {
            case 1:
                System.out.println("= "+a+"+"+b);
                System.out.println("= "+add);
                break;
            case 2:
                    System.out.println("= "+a+"-"+b);
                System.out.println("= "+sub);
                break;
            case 3:
                System.out.println("= "+a+"*"+b);
                System.out.println("= "+mult);
                break;
            case 4:
                System.out.println("= "+a+"/"+b);
                System.out.println("= "+div);
                break;
            case 5:
                System.out.println("================================================================");
                System.out.println("ADDITIONAL OPTIONS");
                System.out.println("================================================================");
                System.out.println("Press 1. to find the SQUARE of the SUM of "+a+" and "+b);
                System.out.println("Press 2. to find the SQUARE of the DIFFERENCE of "+a+" and "+b);
                System.out.println(" ");
                System.out.println("Press 3. to find the CUBE of the SUM of "+a+" and "+b);
                System.out.println("Press 4. to find the CUBE of the DIFFERENCE of "+a+" and "+b);
                System.out.println("================================================================");
                System.out.println("Press 5. to return");
                System.out.println("================================================================");
                aopt=sc.nextInt();
                switch(aopt)
                {
            case 1:
                System.out.println("================================================================");
                System.out.println("The SUM of the value= "+add);
                System.out.println("The SQUARE of "+add+"= "+sqrA);
                System.out.println("================================================================");
                break;
            case 2:
                System.out.println("================================================================");
                System.out.println("The DIFFERENCE of the value= "+sub);
                System.out.println("The SQUARE of "+sub+"= "+sqrS);
                System.out.println("================================================================");
                break;
            case 3:
                System.out.println("================================================================");
                System.out.println("The SUM of the value= "+sub);
                System.out.println("The CUBE of "+add+"= "+cbeA);
                System.out.println("================================================================");
                break;
            case 4:
                System.out.println("================================================================");
                System.out.println("The DIFFERENCE of the value= "+sub);
                System.out.println("The CUBE of "+sub+"= "+cbeS);
                System.out.println("================================================================");
                break;
            case 5:
               System.out.println("================================================================");
               System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
               System.out.println("YOU HAVE RETURNED TO THE PREVIOUS OPTIONS");
               System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
               System.out.println("================================================================");
               System.out.println("Press 1. for Addition");
               System.out.println("Press 2. for Subtraction");
               System.out.println("Press 3. for Multiplication");
               System.out.println("Press 4. for Division");
               System.out.println("================================================================");
               System.out.println("Press 5. for Additional Options");
               System.out.println("================================================================");
               opt2=sc.nextInt();
               switch(opt2)
               {
            case 1:
                System.out.println("= "+a+"+"+b);
                System.out.println("= "+add);
                break;
            case 2:
                    System.out.println("= "+a+"-"+b);
                System.out.println("= "+sub);
                break;
            case 3:
                System.out.println("= "+a+"*"+b);
                System.out.println("= "+mult);
                break;
            case 4:
                System.out.println("= "+a+"/"+b);
                System.out.println("= "+div);
                break;
            case 5:
                System.out.println("================================================================");
                System.out.println("ADDITIONAL OPTIONS");
                System.out.println("================================================================");
                System.out.println("Press 1. to find the SQUARE of the SUM of "+a+" and "+b);
                System.out.println("Press 2. to find the SQUARE of the DIFFERENCE of "+a+" and "+b);
                System.out.println(" ");
                System.out.println("Press 3. to find the CUBE of the SUM of "+a+" and "+b);
                System.out.println("Press 4. to find the CUBE of the DIFFERENCE of "+a+" and "+b);
                System.out.println("================================================================");
                System.out.println("Press 5. to return");
                System.out.println("================================================================");
                aopt2=sc.nextInt();
                switch(aopt2)
                {
            case 1:
                System.out.println("================================================================");
                System.out.println("The SUM of the value= "+add);
                System.out.println("The SQUARE of "+add+"= "+sqrA);
                System.out.println("================================================================");
                break;
            case 2:
                System.out.println("================================================================");
                System.out.println("The DIFFERENCE of the value= "+sub);
                System.out.println("The SQUARE of "+sub+"= "+sqrS);
                System.out.println("================================================================");
                break;
            case 3:
                System.out.println("================================================================");
                System.out.println("The SUM of the value= "+sub);
                System.out.println("The CUBE of "+add+"= "+cbeA);
                System.out.println("================================================================");
                break;
            case 4:
                System.out.println("================================================================");
                System.out.println("The DIFFERENCE of the value= "+sub);
                System.out.println("The CUBE of "+sub+"= "+cbeS);
                System.out.println("================================================================");
                break;
            case 5:
               System.out.println("================================================================");
               System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
               System.out.println("YOU CANNOT RETURN AGAIN");
               System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
               System.out.println("================================================================");
            }
        }
    }
}
}
}



                
                
                    
                

