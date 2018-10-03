package labfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This class has a method that performs various DNA manipulations.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Janyl Jumadinova
 */

public class ManipulateDna {

  /** The main entry point for ManipulateDNA.
   *  The method reads in user's input as a DNA string.
   *  It then finds the complement and performs random mutations.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string in upper case
    
    // Step Two: Compute the complement of the DNA String
    
    // Step Three: Insert a randomly chosen DNA letter into the DNA String at a random position
   
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
   
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
   
    // Step Six: Display a final thank you message
   
  }

}
