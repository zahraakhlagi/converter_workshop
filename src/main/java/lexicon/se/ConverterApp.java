package lexicon.se;

public class ConverterApp {
    static void main() {

        Convert convert= new Convert();

        printMenu();
        //take input from user
        int itemNumber = Integer.parseInt(IO.readln("Choose an option: ").trim());
        boolean wantsToContinue= IO.readln("Continue (yes/no)").trim().equalsIgnoreCase("yes");
        IO.println("");


        switch (itemNumber){
            case 1 ->{
                IO.println("--- Temperature Converter ---");
                IO.println("Convert: ");
                IO.println("1. Celsius to Fahrenheit");
                IO.println("2. Fahrenheit to Celsius");
                int tempChoice = Integer.parseInt(IO.readln("Your choice: "));
                if(tempChoice == 1){
                    convert.celsius = Integer.parseInt(IO.readln("Enter temperature in Celsius: ").trim());
                    double celsiusToFahrenheit=convert.celsiusToFahrenheit();
                    IO.println(celsiusToFahrenheit);
                }else if (tempChoice==2){
                    convert.fahrenheit = Integer.parseInt(IO.readln("Enter temperature in Fahrenheit: ").trim());
                    double fahrenheitToCelsius= convert.fahrenheitToCelsius();
                    IO.println(fahrenheitToCelsius);
                }

            }
            case 2 ->{
                IO.println("--- Currency Converter ---");
                IO.println("Convert:");
                IO.println("1. SEK to USD");
                IO.println("2. SEK to EUR");

                int currencyChoice = Integer.parseInt(
                        IO.readln("Your choice: ").trim()
                );

                double sek = Double.parseDouble(
                        IO.readln("Enter amount in SEK: ").trim()
                );

                if (currencyChoice == 1) {
                    double usd = sek / 10.87;
                    IO.println(String.format("%.2f SEK = %.2f USD", sek, usd));
                } else if (currencyChoice == 2) {
                    double eur = sek / 11.32;
                    IO.println(String.format("%.2f SEK = %.2f EUR", sek, eur));
                } else {
                    IO.println("Invalid choice.");
                }
            }
            case 3 ->{

            }
            case 4 ->{

            }
            default -> {

            }
        }

    };

    static void printMenu(){
        IO.println("==============================");
        IO.println("LEXICON CONVERTER APP");
        IO.println("==============================");
        IO.println(String.format("%d. %-17s",1,"Temperature Converter" ));
        IO.println(String.format("%d. %-17s",2, "Currency Converter" ));
        IO.println(String.format("%d. %-17s",3, "BMI Calculator"));
        IO.println(String.format("%d. %-17s",4,"Exit"));
        IO.println("==============================");
    }

}
