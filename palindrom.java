// Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш

import java.util.Scanner;
public class palindrom {
    // public static void main (String[] args) {
    //     Scanner iScanner = new Scanner (System.in);
    //     System.out.printf("Введите слово: ");
    //     String s = iScanner.nextLine();
    //     iScanner.close();
    //     int count = 0;
    //     for (int i = 0; i < s.length()/2; i++) {
    //         if (s.charAt(i)!=s.charAt((s.length()) - i-1)) {
    //             count=count-1;
    //         }
    //         else {
    //             count=count+1;
    //         }
    //     }
    //     if (count==s.length()/2) {
    //         System.out.println("Слово <" + s + "> палиндром");
    //     }
    //     else {
    //         System.out.println("Слово <" + s + "> не палиндром");
    //     }
    // }
    public static void main (String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите слово: ");
        String s = iScanner.nextLine();
        iScanner.close();
        if (palindrom_check(s)) {
            System.out.println("Слово <" + s + "> палиндром");
        } else {
            System.out.println("Слово <" + s + "> не палиндром");
        }
    }

    public static boolean palindrom_check(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt((s.length()) - i-1)) {
                return false;
            }
        }
        return true;
    }
}
        
        
        
        // int count = 0;
        // for (int i = 0; i < s.length()/2; i++) {
        //     if (s.charAt(i)!=s.charAt((s.length()) - i-1)) {
        //         count=count-1;
        //     }
        //     else {
        //         count=count+1;
        //     }
        // }
        // if (count==s.length()/2) {
        //     System.out.println("Слово <" + s + "> палиндром");
        // }
        // else {
        //     System.out.println("Слово <" + s + "> не палиндром");
        // }
    // }
// }