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

    }

}
