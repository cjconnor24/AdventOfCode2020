package uk.co.chrisconnor.aoc;

public class AdventOfCode {

    public static void main(String[] args) {

        DayOne dayOne = new DayOne("day1.txt");
        System.out.println("Day One Answers");
        System.out.println("---------------");

        System.out.format("Answer part one:\t%d\n", dayOne.getPartOneAnswer());
        System.out.format("Answer part two:\t%d\n", dayOne.getPartTwoAnswer());

    }

}
