package com.epam.rd.autotasks.sequence;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> maxAverage = new ArrayList<>();

        for (int i = 0, zero; (zero = scanner.nextInt()) !=0 ; i++) {
            maxAverage.add(zero);
        }

        return Collections.max(maxAverage);
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
