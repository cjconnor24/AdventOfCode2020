package uk.co.chrisconnor.aoc;

import java.util.List;

public class DayFour {

    private List<String> passportList;

    public DayFour(String passportFile) {
        this.passportList = Helper.getNewLineSeparatedStringsFromFile(passportFile);
    }



}
