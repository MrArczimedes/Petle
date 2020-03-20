package pl.Petle;

import java.util.Scanner;

public class Main {
    public static void exone() {
        for (int i = 20; i>9;i--) {
            System.out.print(i+" ");
        }
    }
    public static void extwo() {
        int i=20;
        while(i>=10) {
            System.out.print(i+" ");
            i--;
        }
    }
    public static void exthree() {
        for (int i = -10; i<=40; i++) {
            if (i%2 == 0)
            {
                System.out.print(i +" ");
            }
        }
    }
    public static void exfour() {
        int i = -10;
        while (i<=40) {
            if (i%2 == 0)
            {
                System.out.print(i +" ");
            }
            i++;
        }
    }
    public static void exfive(Integer[] i) {
        int sum = 0;
        for (int x = 0; x < i.length; x++) {
            sum += i[x];
        }
        System.out.println(sum);
    }
    public static void exsix(Integer[][] x) {
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Integer[] arraySmall = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Integer[][] arrayBig = new Integer[][]{
                new Integer[]{2, 6, 7, 5,},
                new Integer[]{4, 5, 7, 3, 9, 7},
                new Integer[]{7, 4, 1, 2, 5, 8, 9, 6, 3, 2, 1, 5, 8, 7, 5},
                new Integer[]{1, 2, 3}};
        while (true) {
            System.out.println("\n" +"1.Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.\n" +
                    "2.Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.\n" +
                    "3.Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.\n" +
                    "4.Przerób pętlę z zadania trzeciego na pętlę while.\n" +
                    "5.Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.\n" +
                    "6.Przerób funkcję z zadania piątego tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][].");
            Scanner myScanner = new Scanner(System.in);
            int x = myScanner.nextInt();
            switch (x) {
                case 1:
                    exone();
                    break;
                case 2:
                    extwo();
                    break;
                case 3:
                    exthree();
                    break;
                case 4:
                    exfour();
                    break;
                case 5:
                    exfive(arraySmall);
                    break;
                case 6:
                    exsix(arrayBig);
                    break;
                default:
                    System.out.println("ZAKRES 1-6");
                    break;
            }
        }
    }

    }

