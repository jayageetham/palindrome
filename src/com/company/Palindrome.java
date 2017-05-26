package com.company;

import java.util.ArrayList;

/**
 * Class which prints out a combination of strings resulting in a palindrome.
 * The list this class is checking is (Gimli Fili Ilif Ilmig and Mark)
 */
public class Palindrome {

    public static void main(String[] args) {
        ArrayList<String> dwarves = new ArrayList<>();
        dwarves.add("Gimli");
        dwarves.add("Fili");
        dwarves.add("Ilif");
        dwarves.add("Ilmig");
        dwarves.add("Mark");

        new Palindrome().generatePalindrome(dwarves);
    }


    /**
     * Method to generate the combination of palindrome from a given list of strings
     * This method prints out the combination of strings which is a palindrome.
     * @param items List of Strings
     */
    private void generatePalindrome(ArrayList<String> items) {

        for (String refItem:items)
        {
            for (String item:items){
                if ( new StringBuilder(item.toLowerCase()).reverse().toString().equals(refItem.toLowerCase()) ) {
                    System.out.println("Found a palindrome: " + refItem + item);
                    // found a match and there is no need to continue  looking for another match since even if there is another string matching, it will result in same palindrome
                    break;
                }
            }

        }

    }
}
