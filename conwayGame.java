/**
* This is a Java class that takes in a matrix line from the NxN matrix located in the test file.
* The class decides which cell lives or dies based on the conditional requirements of the game. It 
* then populates that information.
*
* @author  Suhail Prasathong
* @version 1.0
* @since   2017-10-16 
*/


import java.io.*;
import java.util.*;

public class conwayGame {

   private int[][] matrix;
   private int size;

   conwayGame(){
   }

   conwayGame(File input) throws IOException{
      initGame(input);
   }

   /* initGame initializes the game by processing the input */
   public void initGame(File input) throws IOException{
      //pre-read
      Scanner in = new Scanner (input);

      size = 0;
      while(in.hasNext()) {
         ++size;
         in.next();
      }
      //System.out.println(size);
      String[] strArr = new String[size];

      matrix = new int[size][size];

      in.close();
      
      // read in the data
      in = new Scanner (input);
      for(int i = 0; i < size; ++i) {
         strArr[i] = in.next();
         char[] charArr = strArr[i].toCharArray();

         for(int j = 0; j < charArr.length; ++j) {
            matrix[i][j] = Character.getNumericValue(charArr[j]);
         }
      }
      in.close();
   }

   /* runGame keeps track of live cells and determines which cells live or die */
   public void runGame(){
      conwayNeighbor cell = new conwayNeighbor();
      int count=0;

      int[][] outputArray = new int[size][size];
      for(int i=0;i<size;i++) {
         for(int j=0;j<size;j++) {
            count=cell.countNeighbor(matrix, i, j);
            if(matrix[i][j]==1 && count<2)
               outputArray[i][j]=0;
            else if(matrix[i][j]==1 && (count==2 || count==3))
               outputArray[i][j]=1;
            else if(matrix[i][j]==1 && count>3)
               outputArray[i][j]=0;
            else if(matrix[i][j]==0 && count==3)
               outputArray[i][j]=1;
         }
      }
      matrix = outputArray;
   }
   
   /* printGame prints the results of the matrix after it has been manipulated */
   public void printGame(){
      for(int i=0;i<size;i++) {
         for(int j=0;j<size;j++) {
            System.out.print(" "+matrix[i][j]);
         }
         System.out.println();
      }
   }
}