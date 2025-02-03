import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner celsius_Input = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius = 0;
        System.out.print("Enter temperature in celsius: ");
        celsius = celsius_Input.nextDouble();
        fahrenheit = convertToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit is " + fahrenheit);
        celsius_Input.close();
    }

    public static double convertToFahrenheit ( double celsius){
         DecimalFormat df_obj = new DecimalFormat("#.#");
        df_obj.setRoundingMode(RoundingMode.FLOOR);
        double cel = Double.parseDouble(df_obj.format((9.0 / 5) * celsius + 32));
        return cel;
    }

}
