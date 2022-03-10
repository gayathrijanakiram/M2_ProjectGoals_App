import java.util.Scanner;
public class Utill
{
    public static String enterString(String title)
    {
        System.out.println(title);
        Scanner scan = new Scanner(System.in);
String answer = scan.nextLine();
return answer;
    }
public static String fillUserInfo()
{
    String name = enterString("Enter your name");
    String email = enterString("Enter your e-mail");
    String phone = enterString("Enter your mobile number");
    return "Name:"+name + " E-mail:"+email + " Phone:"+phone;
}
public static int enterInteger(String title)
{
        System.out.println(title);
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        return answer;
}
public static String fillTripInfo()
{
    String location = enterString("Your current Location");
    int passengers =enterInteger("How many passengers will travel");
    String date = enterString("Enter date");
    String requires =enterString("Enter requires: For eg(Snacks-yes , Luggage-yes) ");
    return "Your destination from "+location +" with "+passengers+
            " Passengers and with these requires "+requires+" on "+date+" is ready";
}
}

