package Calculator;

import java.util.Scanner;

class Calculation 
{
   
    Scanner sc = new Scanner(System.in);
    public void addition() 
    {
        int num,num1,result=0;
        try
        {
            System.out.println("Enter how many number want to add:");
         num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println("Enter number:"+i);
         num1 = sc.nextInt();
            result=result+num1;
        }
        
        System.out.println("Result: " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void subraction()
    {
        int num1,num2,result;
        try
        {
            System.out.println("Enter number1");
            num1=sc.nextInt();
            System.out.println("Enter number2");
            num2=sc.nextInt();
            result=num1-num2;
            System.out.println("Result: " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void multiplication()
    {
        double num1,result=1;
        int num;
        try
        {
            System.out.println("Enter how many number want to amultiplication:");
         num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println("Enter number:"+i);
             num1 = sc.nextDouble();
             
            result=result*num1;
        }
        System.out.println("Result: " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void division()
    {
        double num1,num2,result=0;
       
        try
        {
           System.out.println("enter number 1");
           num1=sc.nextDouble();
           System.out.println("enter number2");
           num2=sc.nextDouble();
           result=num1/num2;
          System.out.println("Result: " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) 
    {
        
       
            
        
        System.out.println("Welcome to Calculator");
       int n=1,num1,num2, a=0;
       do
       {
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5.exit");

        Scanner t = new Scanner(System.in);
       
        try
        {
             System.out.println("Enter operation number:");
             a = t.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        String res;
        Calculation ca = new Calculation();
        n++;
        switch (a) 
        {
            case 1:
                
                System.out.println("do yo want to continue addition");
                res=t.next();
                if(res.equals("yes"))
                {
                    ca.addition();
                }
                else
                {
                    break;
                }
                
                
                break;
            case 2:
                 System.out.println("do yo want to continue substraction");
                res=t.next();
                if(res.equals("yes"))
                {
                   ca.subraction();
                }
                else
                {
                    break;
                }
                
                break;
            case 3:
                 System.out.println("do yo want to continue multiplication");
                res=t.next();
                if(res.equals("yes"))
                {
                   ca.multiplication();
                }
                else
                {
                    break;
                }
                
                
                break;
            case 4:
                 System.out.println("do yo want to continue division");
                res=t.next();
                if(res.equals("yes"))
                {
                   ca.division();
                }
                else
                {
                    break;
                }
                
                break;
            case 5:n=0;
                break;
            
            default:
                System.out.println("Invalid option or not implemented yet.");
                break;
        }
        
       }
       while(n>0);
        
        
    }
}

