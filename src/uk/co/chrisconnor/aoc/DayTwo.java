package uk.co.chrisconnor.aoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayTwo {

    List<String> inputList;

    public DayTwo(String filename) {
        this.inputList = Helper.getStringsFromFile(filename);
    }



    public int getPartOneAnswer(){

        List<String> validPasswords = new ArrayList<>();

        inputList.forEach( iLine -> {

            Map<String, String> properties = extractProperties(iLine);

            int min = Integer.parseInt(properties.get("min"));
            int max = Integer.parseInt(properties.get("max"));
            char letter = properties.get("letter").charAt(0);
            String password = properties.get("password");

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

    private Map<String, String> extractProperties(String input){

        // 2-5 b: sbgqtqcwrkxbqbq
        String regexPattern = "(\\d+)\\-(\\d+)\\s([A-Za-z])\\:\\s(.*)";
        Pattern p = Pattern.compile(regexPattern);

        Matcher m = p.matcher(input);
        Map<String, String> result = new HashMap<>();
        if(m.find()){
            result.put("min", m.group(1));
            result.put("max",m.group(2));
            result.put("letter",m.group(3));
            result.put("password",m.group(4));
        }

        return result;

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
