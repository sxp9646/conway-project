/**
* This is a Java class is exclusively for neighbor assessment. The decision to modularize neighbor
* checking into an independent class is scalability. In the event that the requirements are subject
* to unique forms of matracies including but not limited to complex numbers, conjugates etc. knowing
* the layout of the matrix based on neighbor position will be vital to expand the implementation.
*
* @author  Suhail Prasathong
* @version 1.0
* @since   2017-10-16 
*/

import java.io.*;
import java.util.*;

public class conwayNeighbor {

      conwayNeighbor(){
   }

   /* isExist tells the program if a value exists in a given cell in the NxN matrix */
   public boolean isExist(int i,int j,int n) {
      boolean flag = false;
      if (i >= 0 && i < n && j >= 0 && j < n) {
         flag = true;
      }
      return flag;
   }

   /* countNeighbor counts the number of cells that are live */
   public int countNeighbor(int [][]a,int i,int j){
      int count=0;
      int rows=a.length;
      for(int ii = i-1; ii <= i+1; ii++) {
         for(int jj = j-1; jj <= j+1; jj++) {
            if(ii == i && jj == j)
               continue;
      
         if(isExist(ii,jj,rows) && a[ii][jj] == 1)
            count++;
         }
      }
      return count;
   }
}