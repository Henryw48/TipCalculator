import java.util.*;
    public class TipCalculator {
        public static void main(String[] args) {
            Scanner bill = new Scanner(System.in);
            Scanner tip = new Scanner(System.in);
            Scanner person = new Scanner(System.in);

            System.out.println("Bill :");
            double b = bill.nextDouble();
            System.out.println("Tip % : ");
            double t = tip.nextDouble() / 100;
            System.out.println("Number of People : ");
            int n = person.nextInt();

            double totaltip = b * t;
            double tipperperson = totaltip / n;
            double totalbill = b + totaltip;
            double totalbillperperson = totalbill / n;

            System.out.println("The total tip amount is: $ "+totaltip);
            System.out.println("The total bill including tip is: $ "+totalbill);
            System.out.println("The tip per person is: $ "+tipperperson);
            System.out.println("The total bill per person is: $ "+totalbillperperson);
        }
    }