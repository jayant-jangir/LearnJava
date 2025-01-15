package com.BasicPro;
import java.util.ArrayList;

public class Combination {
    public static void main(String[] args) {
        String comb = "";
        String input = "abc";

        ArrayList<String> combinations = combination(comb, input);
        System.out.println(combinations);
    }

    // Combinations
    private static ArrayList<String> combination(String comb, String input) {
        ArrayList<String> combinations = new ArrayList<String>();
        if (input.isEmpty()) {
            combinations.add(comb);
            return combinations;
        }

        combinations.addAll(combination(comb, input.substring(1)));
        combinations.addAll(combination(comb + input.charAt(0), input.substring(1)));

        return combinations;
    }
}
