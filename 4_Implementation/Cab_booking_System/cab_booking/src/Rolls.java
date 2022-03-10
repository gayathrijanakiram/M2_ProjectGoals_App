import jdk.jshell.execution.Util;

import java.util.LinkedList;
import java.util.Scanner;

public class Rolls
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Welcome to 'ZARA' Cars" +"\nYour ride your Choice");
        System.out.println("---------------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        String nationality = Utill.enterString("Please tell us you are Foreign or Native");
        String services = "1.Find rides"+"\n2.Offer ride"+"\n3.About us"+"\n0.Quit";
while (true)
{
    if (nationality.equalsIgnoreCase("Foreign"))
    {
        String information = Utill.enterString("Enter your passport id");
        int strLen = information.length();
        System.out.println("Checking passport id for " + information );
        Thread.sleep(5000);
        if(strLen < 8)
        {
            System.out.println("Please Enter the correct Passport Number...");
            continue;
        }
        else
        {
            System.out.println(" \n <<.....Process Successfully Completed.....>>");
        }

    }
    else if (nationality.equalsIgnoreCase("Native"))
    {

    } else
    {
        System.out.println("Invalid Operation...");
    }


    System.out.println(services);

//System.out.println("Please Choose one of the operation");
    int menu = scan.nextInt();
    if (menu == 1)
    {
        Service.menu1();
    } else if (menu == 2)
    {
        Service.menu2();
    }
else if (menu == 3)
{
        Service.menu3();
        break;
    }
else if (menu == 0)
{
        System.out.println("Quitting from the Application");
        break;
    }
else
{
        System.out.println("Invalid operation");
        continue;
    }
}
    }
}
