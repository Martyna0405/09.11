import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Zadanie 3");


        // W sklepie ze sprzetem AGD oferowana jest sprzedaz ratlana.
        // Program umożliwiający wyliczanie wysokości miesiecznej raty.
        //Dane wejściowe
        //   cena towaru (od 100 zł do 10 tys)   liczba rat (od 6 do 48)
        // kredyt oprocentowany od 6-12 wynosi 2.5% od 13-24 wy 5%  od 25-48 10%
        // Program powinien sprawdzać czy podane dane mieszczą się w określonych zakresach
        // a w przypadku błędu pytac uzytkownika o podanie innych danych

//        Scanner input = new Scanner(System.in);
//        System.out.print("Podaj cene towaru: ");
//        int price=input.nextInt();
//        System.out.print("Podaj liczbę rat: ");
//        int rate = input.nextInt();
//        input.close();
//        System.out.println("----------------");
//
//        if (price >= 100 && price <= 10000) {
//            if (rate >= 5 && rate <= 12) {
//                System.out.println("Miesięczna rata wynosi: " + price * 2.5);
//            } else if (rate >= 13 && rate <= 24) {
//                System.out.println("Miesięczna rata wynosi: " + price * 5);
//            } else if (rate >= 25 && rate <= 48) {
//                System.out.println("Miesięczna rata wynosi: " + price * 10);
//            } else {
//                System.out.println("Błędna ilość rat. Spróbuj jeszcze raz.");
//            }
//        }
//            else{
//                System.out.println("Błędna kwota. Spróbuj jeszcze raz.");
//            }
                            //      INNNA (Prawidłowa hihi) WERSJA OD WYKLADOWCY  //
//        Scanner input = new Scanner(System.in);
//        System.out.print("Podaj cene towaru: ");
//        int price=input.nextInt();
//        System.out.print("Podaj liczbę rat: ");
//        int rate = input.nextInt();
//        input.close();
//        System.out.println("----------------");
//
//        if (price < 100 || price > 10000 || rate <6 || rate> 48){
//            System.out.println("Podano błędne dane !!!");
//            System.out.println("Cena powinna być w przedziale od 100 zł do 10000zł");
//            System.out.println("Liczba rat powinna być w przedziale od 6 do 48");
//        }
//        else {
//            double multiplier;
//            if (rate <= 12) {
//                multiplier = 0.025;
//            } else if (rate <= 24) {
//                multiplier = 0.05;
//            } else {
//                multiplier = 0.1;
//            }
//
//            double odsetki = price * multiplier;
//            double lacznawartosc = price + odsetki;
//            double rata = lacznawartosc / rate;
//
//
//            System.out.println("Odsetki wynoszą: " + odsetki + " zł.");
//            System.out.println("Cała kwota wynosi: " + lacznawartosc + " zł.");
//            System.out.println("Rata miesięczna wynosi: " + rata + " zł.");
//        }
                            //KALKULATOR ZADANIE//
//        boolean done= false;
//        while(!done) {
//            try {
//                Scanner input = new Scanner(System.in);
//
//                System.out.println("Prosty kalkulator");
//                System.out.println("----------------");
//
//                System.out.print("Podaj pierwszą cyfrę");
//                int first = input.nextInt();
//                System.out.print("Podaj znak działania (+,-,*,/) ");
//                String sign = input.next();
//                System.out.print("Podaj druga cyfre ");
//                int second = input.nextInt();
//                input.close();
//
//                switch (sign) {
//                    case "+":
//                        System.out.println(first + second);
//                        break;
//                    case "-":
//                        System.out.println(first - second);
//                        break;
//                    case "*":
//                        System.out.println(first * second);
//                        break;
//                    case "/":
//                        if ( == 0){
//                        System.out.println(first / second);
//                    }
//                        else{
//                        System.out.println("Nie dzieli się przez zero. Proszę podać inny znak.");
//                    }
//                        break;
//                    default:
//                        System.out.println("Prosimy podać odpowiedni znak");
//                }
//                done = true;
//        catch(InputMismatchException exception){
//                    System.out.println("Proszę podać liczbę całkowitą");
//                }
//            }
//        }


        }
    }

