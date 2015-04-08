package wordpryamid;

import javax.swing.*;

/**
 * @title WordPryamid
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 7-Apr-2015 12:34:10 PM
 * @purpose The purpose of this program is to create a pyramid out of words
 */
public class WordPryamid {

    static int counter;//setup counter for spaces

    public static void main(String[] args) {
        String word;
        word = JOptionPane.showInputDialog("Input a word.");//get a word
        pyramid(word);
    }

    private static void pyramid(String word) {
        for (int i = 0; i < counter; i++) {//output spaces
            System.out.print(" ");
        }
        counter++;
        System.out.println(word);//recursion
        if (word.length() > 2) {
            word = word.substring(1, word.length() - 1);//calculate new word
            pyramid(word);
        }

    }

}
