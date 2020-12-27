package ru.geekbrains.Home.Lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x;

        Scanner repeat = new Scanner(System.in);
        int r;

        Scanner Word = new Scanner(System.in);
        String o="apple";


        String[] words = {"apple","orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] c = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        String[] c1 = {"a", "b","c", "d", "e", "f", "g", "h", "p", "m", "z", "n", "k", "u", "t"};
        Random randWords = new Random();
        int rw = randWords.nextInt(25);
        String answer = words[rw];
        do {
            for(int y=0;y<14;y++){
                System.out.println("Угадайте загаданное слово");
                c1[y]= scan.next();
                o=c1[y];
                if (c1[y].intern() == words[rw]) {
                    System.out.println("Поздравляю!Вы угадали загаданное слово");
                    break;
                } else {
                    for (int j = 0; j < c1[y].length() - 1 && j < words[rw].length() - 1; j++) {
                        if (c1[y].charAt(j) == answer.charAt(j)) {
                            c[j] = c1[y].charAt(j);
                        }
                    }
                    System.out.println("Вы не угадали, подсказка: совпали буквы");
                    String str = String.valueOf(c);
                    System.out.println(str);
                }
            }
        }while(o.intern() != words[rw]);
    }
}
