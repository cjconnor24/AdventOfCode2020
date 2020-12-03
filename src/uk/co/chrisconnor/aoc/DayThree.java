package uk.co.chrisconnor.aoc;

import java.util.List;

public class DayThree {

    List<String> treeMap;

    public DayThree(String treeMap) {
        this.treeMap = Helper.getStringsFromFile(treeMap);
    }


    public long getPartOneAnswer(int xMoves, int yMoves) {

        int mapHeight = treeMap.size();
        int mapWidth = treeMap.get(0).length();
        int desiredWidth = mapHeight * xMoves;
        int totalTrees = 0;

        int j = 0;
        for (int currentRow = 0; currentRow < mapHeight; currentRow = currentRow + yMoves) {
            String fullRow = repeatRow(treeMap.get(currentRow), (desiredWidth / mapWidth) + 1);
            if (fullRow.charAt(j) == '#') {
                totalTrees++;
            }
            j = j + xMoves;
        }
        return totalTrees;

    }

    public long getPartTwoAnswer() {

        return getPartOneAnswer(1, 1)
                * getPartOneAnswer(3, 1)
                * getPartOneAnswer(5, 1)
                * getPartOneAnswer(7, 1)
                * getPartOneAnswer(1, 2);

    }

    private String repeatRow(String row, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(row);
        }
        return sb.toString();
    }
}
