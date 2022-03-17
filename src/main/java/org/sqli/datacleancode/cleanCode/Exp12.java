package org.sqli.datacleancode.cleanCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * parallelStream : it can lead to incorrect results and unpredictable behavior
 *
 */
public class Exp12 {

    static int totaleven = 0;

    public static void main(String[] args) {

        List<Integer> randomList = generateInts();

        long s1 = System.currentTimeMillis();
        randomList.stream().filter(e -> e % 2 == 0).forEach(e -> count());
        long e1 = System.currentTimeMillis();
        printInfos(s1, e1);

        totaleven = 0;

        long s2 = System.currentTimeMillis();
        randomList.parallelStream().filter(e -> e % 2 == 0).forEach(e -> count());
        long e2 = System.currentTimeMillis();
        printInfos(s2, e2);
    }

    private static void printInfos(long s2, long e2) {
        System.out.println("Even: " + totaleven);
        System.out.println("Time : " + (e2 - s2) + "ms");
    }

    private static List<Integer> generateInts() {
        List<Integer> randomList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            int r = rnd.nextInt(500000);
            randomList.add(r);
        }
        return randomList;
    }

    public static void count() {
        totaleven++;
    }
}
