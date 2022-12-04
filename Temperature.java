import java.util.*;

public class Temperature
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit:- ");
        double temperature = S.nextDouble();

        System.out.print("Enter the wind speed per hour:- ");
        double speed = S.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) +  0.4275 * temperature * Math.pow(speed, 0.16);

        System.out.println("The wind chill index is:- " + windChill);
    }
}