package lexicon.se;

public class Convert {
    final double C_RATIO = 9.0 / 5.0;
    final int OFFSET = 32;
    final double F_RATIO = 5.0 / 9.0;

    String itemNumber;
    boolean wantsToContinue;
    int unitOption;
    double celsius;
    double fahrenheit;

    //Celsius → Fahrenheit: F = C * 9.0 / 5.0 + 32
    double celsiusToFahrenheit(){

       return fahrenheit = celsius * C_RATIO + OFFSET;
    }

    //Fahrenheit → Celsius: C = (F - 32) * 5.0 / 9.0
    double fahrenheitToCelsius(){
        return celsius = (fahrenheit - OFFSET) * F_RATIO;
    }

}
