package pl.codementors.training;

import java.util.Scanner;


public class DrawTree {
    public static void main(String[] args) {

        System.out.println("Witaj, podaj wysokość drzewka a Ci je narysuje:");
        int heightOfTree = readInputFromUser();
        drawTree(heightOfTree);

    }

    public static int readInputFromUser() {
        int heightOfTree;

        while(true) {
            try {
                Scanner userInput = new Scanner(System.in);
                heightOfTree = userInput.nextInt();
                break;

            }
            catch (java.util.InputMismatchException e) {
            System.out.println("Wpisz liczbę nie literę");
            }
        }
        return  heightOfTree;
    }

    public static void drawTree (int height){


        int numberOfStars = 1;
        int numberOfSpaces = height - 1;

        for (int i = 1;i<=height;i++) {

            printSpaces(numberOfSpaces);
            printStars(numberOfStars);

            System.out.println();
            numberOfStars+=2;
            numberOfSpaces-=1;
        }
    }

    private static void printStars(int stars){

        for(int i = 0; i <stars;i++)
            System.out.print("*");

    }
    private static void printSpaces(int spaces){
        for(int i = 0; i <spaces;i++)
            System.out.print(" ");
    }

}
