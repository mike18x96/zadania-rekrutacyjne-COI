package pl.COI.zadanie9pierwsza_wersja;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad9 {

    public static boolean check(ArrayList<String> listA, ArrayList<String> listB) {
        listA.removeAll(listB);
        if (listA.size() == 0) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> split(String word) {
        String[] splitMe = word.split("(?!^)");
        ArrayList<String> splitList = new ArrayList<String>();
        for (int i = 0; i < splitMe.length; i++) {
            splitList.add(splitMe[i]);
        }
        System.out.println(splitList);
        return splitList;
    }

    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("First word: ");
        String input1 = scan.nextLine();
        System.out.print("\nSecond word: ");
        String input2 = scan.nextLine();

        if (check(split(input1), split(input2))) {
            System.out.println("Letters are the same");
        } else {
            System.out.println("Contains different letters");
        }
        scan.close();
    }

}