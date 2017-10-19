/*This is a Java program that runs Conway's Game of Life in a modular fashion. This main class runs,
prints and processes the rules and computations of the game which are developed in two dependent classes
namely conwayGame and conwayNeighbor*/

import java.io.*;
import java.util.*;

public class Conway {

	public static void main(String args[])	throws IOException {
      //pre-read file
      File file =	new File(args[0]);
      conwayGame game = new conwayGame(file);

      //print input matrix
      System.out.println("Input Matrix");
      game.printGame();
      
      game.runGame();
      //print resulting matrix
      System.out.println("Resulting Matrix");	  
      game.printGame();
   }
}