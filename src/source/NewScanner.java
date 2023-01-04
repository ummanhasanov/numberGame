/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

import static bean.Contains.arrayContains;
import java.util.Arrays;
import java.util.Scanner;
import static util.Utils.firstLetterUppercase;

/**
 *
 * @author Umman Hasan
 */
public class NewScanner
{
     public static void greet() {
        final String GAME_NAME = "Rəqəm təxmin etmə";
        System.out.println(GAME_NAME + " oyununa xoş geldin! Oyuna başlamaq istəyirsən?(Hə/Yox)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.trim().toLowerCase().equals("he")) {
            startGame();
        } else {
            sayGoodbye();
        }
    }

    public static void startGame() {
        getUserName();
        getGuesses();
        sayGoodbye();
    }

    private static void getUserName() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Adın nədir?");
        String userName = sc.nextLine();
        System.out.println("Salam " + firstLetterUppercase(userName));
    }

    public static void getGuesses() {
        int secretNumber = 1 + (int) (Math.random() * 20);
        int[] guesses = new int[20];// tahminler arrayi

        System.out.println("Təxminin nədir?");
        Scanner sc2 = new Scanner(System.in);
        int guess = 0;
        int guessCount = 0;
        do {
            guess = sc2.nextInt();
            printGuessResult(secretNumber, guess, guesses);
            guesses[guessCount] = guess;
            guessCount++;
        } while (guess != secretNumber);
        System.out.println("Gizli nömrə:" + secretNumber + " Təxminlərin " + Arrays.toString(guesses));
    }

    public static void sayGoodbye() {
        System.out.println("Sonra görüşərik!");
    }

    public static void printGuessResult(int secretNumber, int guess, int[] guesses) {
        if (arrayContains(guesses, guess)) {
            System.out.println("Bunu daha öncə yazmışdın.");
        }
        if (secretNumber > guess) {
            System.out.println("Yuxarı");
        } else if (secretNumber < guess) {
            System.out.println("Aşağı");
        } else {
            System.out.println("Təbriklər bildin!");
        }
    }

   
}
