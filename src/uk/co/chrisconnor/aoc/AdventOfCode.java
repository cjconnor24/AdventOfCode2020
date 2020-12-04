package uk.co.chrisconnor.aoc;

public class AdventOfCode {

    public static void main(String[] args) {

        System.out.println("---------------");
        System.out.println("Day One Answers");
        System.out.println("---------------");
        DayOne dayOne = new DayOne("day1.txt");
        System.out.format("Answer part one:\t%d\n", dayOne.getPartOneAnswer());
        System.out.format("Answer part two:\t%d\n", dayOne.getPartTwoAnswer());

        System.out.println("---------------");
        System.out.println("Day Two Answers");
        System.out.println("---------------");
        DayTwo dayTwo = new DayTwo("day2.txt");
        System.out.format("Answer part one:\t%d\n", dayTwo.getPartOneAnswer());
        System.out.format("Answer part two:\t%d\n", dayTwo.getPartTwoAnswer());


        System.out.println("---------------");
        System.out.println("Day Three Answers");
        System.out.println("---------------");
        DayThree dayThree = new DayThree("day3.txt");


        System.out.format("Working part two:\t%d, %d, %d, %d, %d\n",
                dayThree.getPartOneAnswer(1, 1),
                dayThree.getPartOneAnswer(3, 1),
                dayThree.getPartOneAnswer(5, 1),
                dayThree.getPartOneAnswer(7, 1),
                dayThree.getPartOneAnswer(1, 2)
        );

        System.out.format("Part two answer:\t%d",dayThree.getPartTwoAnswer());

        System.out.println(Helper.getNewLineSeparatedStringsFromFile("day4test.txt"));


    }

}
