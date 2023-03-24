
import java.util.Scanner;
public class DartGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfHits = 0;
        System.out.println("DART GAME!");
        System.out.println("Enter the number of the darts to be thrown : ");
        int numberOfDarts = input.nextInt();
        int totalA, totalB, totalC, totalD, totalE, totalF, totalUndecided;
        totalA = 0;
        totalB = 0;
        totalC = 0;
        totalD = 0;
        totalE = 0;
        totalF = 0;
        totalUndecided = 0;
        double percentage1, percentage2, percentage3, percentage4, percentage5, percentage6,percentage7;


        for (int i = 0; i < numberOfDarts; i++) {
            double x = (Math.random() * 2 -1);
            x =  (Math.round(x * 10.0)/10.0);
            double y = (Math.random() * 2 - 1);
            y=  (Math.round(y * 10.0)/10.0);
            System.out.println("Coordinates : " + "(" + x + " , " + y + ")");

            if (x > 0 && y > 0 && x + y < 1) {
                System.out.println("Region : A");
                totalA++;

            } else if (x > 0 && y > 0 && x + y > 1) {
                System.out.println("Region : B");
                totalB++;

            } else if (x < 0 && y > 0) {
                System.out.println("Region : C");
                totalC++;

            } else if (x < 0 && y < 0 && x < y) {
                System.out.println("Region : D");
                totalD++;

            } else if (x < 0 && y < 0 && x > y) {
                System.out.println("Region : E");
                totalE++;

            } else if (x > 0 && y < 0){
                System.out.println("Region : F");
                totalF++;

            } else if (x - y == 0) {
                System.out.println("Region : Undecided");
                totalUndecided++;

            } else if (x > 0 && y == 0) {
                System.out.println("Region : Undecided");
                totalUndecided++;

            } else if (x < 0 && y == 0) {
                System.out.println("Region : Undecided");
                totalUndecided++;

            } else if (x == 0 && y < 0) {
                System.out.println("Region : Undecided");
                totalUndecided++;

            } else if (x == 0 && y > 0) {
                System.out.println("Region : Undecided");
                totalUndecided++;

            } else if (x + y == 1) {
                System.out.println("Region : Undecided");
                totalUndecided++;

            } else {
                System.out.println("Region : error");


                numberOfHits++;


            }
        }
        percentage1 =(double) (totalA * 100) / numberOfDarts;
        percentage2 = (double) (totalB * 100) / numberOfDarts;
        percentage3 = (double)(totalC * 100) / numberOfDarts;
        percentage4 = (double)(totalD * 100) / numberOfDarts;
        percentage5 = (double)(totalE * 100) / numberOfDarts;
        percentage6 = (double) (totalF * 100) / numberOfDarts;
        percentage7 = (double) (totalUndecided * 100) / numberOfDarts;

        System.out.println("A: " + totalA + " darts " + "(" + percentage1 + "%)"  );
        System.out.println("B: " + totalB + " darts " + "(" +percentage2  + "% )" );
        System.out.println("C: " + totalC + " darts " + "(" + percentage3 + "% )" );
        System.out.println("D: " + totalD + " darts " + "(" +percentage4+ "% )" );
        System.out.println("E: " + totalE + " darts " + "(" +percentage5 + "% )" );
        System.out.println("F: " + totalF + " darts " + "(" +percentage6 + "% )" );
        System.out.println("Undecided: " + totalUndecided + " darts " + "(" +percentage7 + "% )" );



    }}

