package uk.co.chrisconnor.aoc;

import java.util.List;

public class DayOne {

    private List<Integer> inputList;

    public DayOne(String inputList) {
        this.inputList = Helper.getNumbersFromFile(inputList);
    }

    public Integer getPartOneAnswer() {

        Integer answer = null;

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {
                if (inputList.get(i) + inputList.get(j) == 2020) {
                    answer = inputList.get(i) * inputList.get(j);
                }
            }
        }

        return answer;

    }

    public Integer getPartTwoAnswer() {

        Integer answer = null;

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {
                for (int k = j + 1; k < inputList.size(); k++) {
                    if (inputList.get(i) + inputList.get(j) + inputList.get(k) == 2020) {
                        answer = inputList.get(i) * inputList.get(j) * inputList.get(k);
                    }
                }
            }
        }

        return answer;

    }


}
