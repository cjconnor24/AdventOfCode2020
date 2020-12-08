package uk.co.chrisconnor.aoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayFour {

    private List<String> passportList;

    public DayFour(String passportFile) {
        this.passportList = Helper.getNewLineSeparatedStringsFromFile(passportFile);
    }


    public int getPartOneAnswer() {

        List<Map<String, String>> validPassports = new ArrayList<>();

        int countpassports = 0;

        for (String passport : passportList) {

            List<String> requiredFields = new ArrayList<>();
            requiredFields.add("byr");
            requiredFields.add("iyr");
            requiredFields.add("eyr");
            requiredFields.add("hgt");
            requiredFields.add("hcl");
            requiredFields.add("ecl");
            requiredFields.add("pid");

            List<String> validationFailures = new ArrayList<>();

            //INDIVIDUAL FIELD
            for (String f : passport.split(" ")) {


                // KEY VALUE PAIR
                String[] fieldSplit = f.split(":");
                if (requiredFields.contains(fieldSplit[0])) {

                    String patternString;
                    Pattern pattern;
                    Matcher matcher;

                    int fieldVal;
                    switch (fieldSplit[0]) {
                        case "byr":
                            fieldVal = Integer.parseInt(fieldSplit[1]);
                            if (!(fieldVal >= 1920 && fieldVal <= 2022)) {
                                validationFailures.add(f);
                            }
                            break;
                        case "iyr":
                            fieldVal = Integer.parseInt(fieldSplit[1]);
                            if (!(fieldVal >= 2010 && fieldVal <= 2020)) {
                                validationFailures.add(f);
                            }
                            break;
                        case "eyr":
                            fieldVal = Integer.parseInt(fieldSplit[1]);
                            if (!(fieldVal >= 2020 && fieldVal <= 2030)) {
                                validationFailures.add(f);
                            }
                            break;
                        case "hgt":
                            patternString = "(\\d+)(cm|in)";
                            pattern = Pattern.compile(patternString);
                            matcher = pattern.matcher(fieldSplit[1]);
                            if (matcher.matches()) {
                                if (matcher.group(2).equals("cm")) {
                                    int cmvalue = Integer.parseInt(matcher.group(1));
                                    if (!(cmvalue >= 150 && cmvalue <= 193)) {
                                        validationFailures.add(f);
                                    }
                                }
                                if (matcher.group(2).equals("in")) {
                                    int invalue = Integer.parseInt(matcher.group(1));
                                    if (!(invalue >= 59 && invalue <= 76)) {
                                        validationFailures.add(f);
                                    }
                                }

                            }
                            break;
                        case "hcl":
                            patternString = "(#)([0-9a-f]{6})";
                            pattern = Pattern.compile(patternString);
                            matcher = pattern.matcher(fieldSplit[1]);
                            if(!matcher.matches()){
                                validationFailures.add(f);
                            }
                            break;
                        case "ecl":
                            patternString = "(amb|blu|brn|gry|grn|hzl|oth)";
                            pattern = Pattern.compile(patternString);
                            matcher = pattern.matcher(fieldSplit[1]);
                            if(!matcher.matches()){
                                validationFailures.add(f);
                            }
                            break;
                        case "pid":
                            patternString = "([0-9]{9})";
                            pattern = Pattern.compile(patternString);
                            matcher = pattern.matcher(fieldSplit[1]);
                            if(!matcher.matches()){
                                validationFailures.add(f);
                            }
                            break;
                    }
                }

                requiredFields.remove(fieldSplit[0]);
            }

            if (requiredFields.size() == 0 && validationFailures.size() ==0) {
                countpassports++;
            }
        }


        return countpassports;
    }


}

