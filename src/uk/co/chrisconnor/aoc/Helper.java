package uk.co.chrisconnor.aoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {


    public static List<Integer> getNumbersFromFile(String filename) {

        Scanner myReader = new Scanner(AdventOfCode.class.getResourceAsStream(filename));

        List<Integer> inputList = new ArrayList<>();
        while (myReader.hasNextLine()) {
            inputList.add(myReader.nextInt());
        }
        myReader.close();

        return inputList;

    }

    public static List<String> getStringsFromFile(String filename) {

        Scanner myReader = new Scanner(AdventOfCode.class.getResourceAsStream(filename));

        List<String> inputList = new ArrayList<>();
        while (myReader.hasNextLine()) {
            inputList.add(myReader.nextLine());
        }
        myReader.close();

        return inputList;

    }


}
