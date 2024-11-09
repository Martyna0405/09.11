
import java.util.InputMismatchException;
import java.util.Scanner;


public class Zad {
    public static void main(String[] args) {
//          System.out.println("hello from main");
//        int firstNumber = input("Podaj liczbę rat");
//       int secondNumber= input("Podaj kwotę zakupu: ");
//        int thirdNumber= input("Podaj kwotę zakupu: ");


//        int maximumNumber;
//        int minimumNumber;
//        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
//            maximumNumber = firstNumber;
//        } else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
//            maximumNumber = secondNumber;
//        } else {
//            maximumNumber = thirdNumber;
//        }
//
//        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
//            minimumNumber = firstNumber;
//        } else if (secondNumber < thirdNumber && secondNumber < firstNumber) {
//            minimumNumber = secondNumber;
//        } else {
//            minimumNumber = thirdNumber;
//
//        }


        //KALKULATOR ZADANIE//
//        boolean done= false;
//        while(!done) {
//            try {
//                Scanner input = new Scanner(System.in);
//
//                System.out.print("Prosty kalkulator");
//                System.out.println("----------------");
//
//                int a = inputInt("Podaj pierwsza liczbe: ");
//                String sign=inputString ("Podaj znak działania (+,-,*,/) ");
//                int b =inputnextInt("Podaj druga cyfre ");
//
//                switch (sign) {
//                    case "+":
//                        System.out.println(a + b);
//                        break;
//                    case "-":
//                        System.out.println(a - b);
//                        break;
//                    case "*":
//                        System.out.println(a * b);
//                        break;
//                    case "/":
//                        if ( ==0){
//                        System.out.println(a / b);
//                    }
//                        else{
//                        System.out.println("Nie dzieli się przez zero. Proszę podać inny znak.");
//                    }
//                    break;
//                    default:
//                        System.out.println("Prosimy podać odpowiedni znak");
//                }
//                done = true;
//            }catch(InputMismatchException e){
//                System.out.println("Proszę podać liczbę całkowitą");
//            }
//        }


        int price = inputInt("Podaj cene towaru: ");
        int rate = inputInt("Podaj liczbę rat: ");

        printSeparator();

        if (isParameterIvalid(price, rate)){
            showError();
        }else {
            showResult(price, rate);
        }

            static void printSeparator(){System.out
            static boolean isParameterInvalid(int price, int rate){
            return price < 100 || price > 10000 || rate < 6 || rate > 48;
        }

        private static void showError(){
            System.out.println("Podano błędne dane !!!");
            System.out.println("Cena powinna być w przedziale od 100 zł do 10000zł");
            System.out.println("Liczba rat powinna być w przedziale od 6 do 48");
        }

            public static void showResult(int price, int rate){
                double odsetki = price * getMultiplier;
                double lacznawartosc = price + odsetki;
                double rata = lacznawartosc / rate;

                System.out.println("Odsetki wynoszą: " + odsetki + " zł.");
                System.out.println("Cała kwota wynosi: " + lacznawartosc + " zł.");
                System.out.println("Rata miesięczna wynosi: " + rata + " zł.");
            }

        static double getMultiplier(int rate){
            double multiplier;
            if (rate <= 12) {
                multiplier = 0.025;
            } else if (rate <= 24) {
                multiplier = 0.05;
            } else {
                multiplier = 0.1;
            }

    }

        static String inputString()
//    static int input(String message, int number) {
//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.print(message);
//            return input.nextInt();
//
//        } catch (InputMismatchException e) {
//            System.out.println("Podano złą wartość");
//            return input();
//        }
    }
}