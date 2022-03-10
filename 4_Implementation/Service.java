import java.util.LinkedList;

public class Service {


public static void menu1() throws InterruptedException
{
    String info =  Utill.fillUserInfo();
    System.out.println(info);
    System.out.println("Welcome......");
    String city = Utill.enterString("Where do you want to go...");
    String toUpperCity = city.toUpperCase();
    System.out.println("Checking destination for "+toUpperCity);
    Thread.sleep(5000);
    Cities cities = new Cities();
    LinkedList<String> list = cities.getList();
    if(list.contains(toUpperCity))
    {
        System.out.println("There are available trips for "+toUpperCity+"...");
        String tripInfo = Utill.fillTripInfo();
        System.out.println(tripInfo);
    }
    else
    {
        System.out.println("There are no availability....\nHere are some available cities");
        Cities cities2 = new Cities();
        LinkedList<String > list1 = cities2.getList();
        for(String s: list1)
        {
            System.out.println(s);
        }
    }
}
public static void menu2()
{
    String info = Utill.fillUserInfo();
    System.out.println(info);
    String carType = Utill.enterString("Which type of car you offer");
    String placeFrom = Utill.enterString("Enter your Destination place");
    String placeTo = Utill.enterString("Enter your current location");
    int capacity = Utill.enterInteger("Enter the number of people you can carry");
    String requires = Utill.enterString("Enter your requires..(For eg: Snacks-yes,Pet-no, Luggage-Yes)");
    System.out.println("Car type "+carType+" from "+placeFrom+" To "+placeTo+" with "
            +capacity+" passengers "+" with requires "+requires+" is ready");

}
public static void menu3()
{
    System.out.println("======================================================================================================");
    System.out.println("This is an Application Model for Booking Vehicles for travelling purpose"+
            "\nHere you can book the vehicles at your need "+
            "\nThe main purpose of the Application is to be User-Friendly for the users and choose their ride at their choice "+
            "\nThe Available Cities for Travelling is \n *COIMBATORE \n *GANDHIPURAM \n *THUDIYALUR \n *PERIYANAIKENPALAYAM "
            +"\n *KARAMADAI \n *TEACHERS COLONY \n *METTUPALAYAM "+
            "\nSoon we will be covering most of the Cities."+"\nThank You for using the Application");
    System.out.println("======================================================================================================");

}
