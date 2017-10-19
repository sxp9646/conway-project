Author: Suhail Prasathong
Program: Conway's Game of Life
Language implemented: Java

Welcome to my Conway's Game of Life implementation. This program takes an input parameter (filepath)
through the terminal and generates a matrix based output.

Input: txt file containing NxN matrix
Output: Conway's Game of Life rules applied, resulting matrix.
Predefined test cases are included and labeled as game1.txt, game2.txt, game3.txt and game4.txt

Operation:

First, compile the program in terminal using the following notations:
** javac Conway.java conwayGame.java conwayNeighbor.java

Then, run the program as follows:
** java Conway game1.txt


Modularity Justification:
First, the main class should do no computations and should simply execute functions. This
makes the main class clean, readable and easy to scale. 

Second, the conwayGame class exists to incorporate all game executions. While there is a counter
argument that it might not be the best approach for scale, it is the most optimal for reference
between functions and more importantly, personally, it helps readability.

Lastly, The decision to modularize neighbor checking into an independent class is scalability. 
In the event that the requirements are subject to unique forms of matracies including 
but not limited to complex numbers, conjugates etc. knowing the layout of the matrix 
based on neighbor position will be vital to expand the implementation.