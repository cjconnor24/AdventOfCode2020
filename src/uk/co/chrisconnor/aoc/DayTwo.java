package uk.co.chrisconnor.aoc;

import java.util.ArrayList;
import java.util.List;

public class DayTwo {

    List<String> inputList;

    public DayTwo(String filename) {
        this.inputList = Helper.getStringsFromFile(filename);
    }

    public int getPartOneAnswer(){

        List<String> validPasswords = new ArrayList<>();

        inputList.forEach( iLine -> {

            String[] components = iLine.split(" ");

            int min = Integer.parseInt(components[0].split("-")[0]);
            int max = Integer.parseInt(components[0].split("-")[1]);
            char letter = components[1].split(":")[0].charAt(0);
            String password = components[2];

            int charCount = 0;
            for(int i = 0; i < password.length(); i++){

                if(password.charAt(i)==letter){
                    charCount++;
                }

            }

            if(charCount >= min && charCount <= max){
                validPasswords.add(password);
            }
        });

        return validPasswords.size();

    }

    public int getPartTwoAnswer(){

        List<String> validPasswords = new ArrayList<>();

        inputList.forEach( iLine -> {

            String[] components = iLine.split(" ");
            String[] positions = components[0].split("-");
            char letter = components[1].split(":")[0].charAt(0);
            String password = components[2];

            int charCount = 0;
            for (String s : positions) {

                int position = Integer.parseInt(s);

                if (password.charAt(position - 1) == letter) {
                    charCount++;
                }

            }

            if(charCount == 1){
                validPasswords.add(password);
            }

        });

        return validPasswords.size();

    }



}
