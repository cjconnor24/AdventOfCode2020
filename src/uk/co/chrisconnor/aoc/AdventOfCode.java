package uk.co.chrisconnor.aoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventOfCode {

    public static void main(String[] args) {

        Scanner myReader = new Scanner(AdventOfCode.class.getResourceAsStream("day1.txt"));

        List<Integer> inputList = new ArrayList<>();

        while (myReader.hasNextLine()) {
            inputList.add(myReader.nextInt());
        }
        myReader.close();

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {
                if (inputList.get(i) + inputList.get(j) == 2020) {
                    System.out.println("Part 1");
                    System.out.println(inputList.get(i) * inputList.get(j));
                }
            }
        }

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {
                for (int k = j + 1; k < inputList.size(); k++) {
                    if (inputList.get(i) + inputList.get(j) + inputList.get(k) == 2020) {
                        System.out.println("Part 2");
                        System.out.println(inputList.get(i) * inputList.get(j) * inputList.get(k));
                    }
                }
            }
        }
    }

}
