package lexicon.se;

public class ConverterApp {
    static void main() {
        //keep the menu working until the user types "EXIT"
        /*while(true){
            String option= IO.readln();

        }*/
        printMenu();
        IO.println("Choose an option: ");
        //take input from user
        int itemNumber = Integer.parseInt(IO.readln("Choose an option: ").trim());
        boolean wantsToContinue= IO.readln("Continue (yes/no)").trim().equalsIgnoreCase("yes");
        IO.println("");


        switch (itemNumber){
            case 1 ->{

            }
            case 2 ->{

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
