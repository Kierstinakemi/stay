//*******************************************************************
// Author: Kierstin Matsuda
// PantherID: 5656529
// CLASS: COP 3337 Fall 2016
// SECTION: U09
// ASSIGNMENT ##: 1
// DUE DATE: September 1 2016
//
// I hereby certify that this collective work is my own
// and none of it is the work of any other person or entity
//
//
//*******************************************************************
//comment out package statement below
//package pialgorithm;

/**
 * This program calculates Pi using the Gregory-Leibniz series. It prints
 * the algorithm results along with the java library Pi
 * @author Kierstin
 */
public class PiAlgorithm
{

    /**
     * main method calls calculatePi method to calculate and print pi to six digit accuracy
     * and then print the results along with number of iterations
     * then main calls printPi and the method prints library pi
     * @param args 
     * @author Kierstin
     */
    public static void main(String[] args)
    {
        
        calculatePi();
        printPi();  
        
    }
    
    /**
     * calculatePi method calculates pi to six digit accuracy using an infinite
     * series formula, the loop that continues the formula stops when 
     * the change in addition or subtraction is irrelevant to the first six digits
     * @author Kierstin
     */
    public static void calculatePi(){
        
        double denominator = 3.0;    //   eqn starts with subtracting 1/3
        double iterationAnswer;
        iterationAnswer = 1 - (1 / denominator);    //   eqn starts with 1 - 1/3
        
    
        int iterationCounter = 0;
        double difference = 0.0000001; //   used in while statement
        
        do
        {
            /*
            denominator increases by two in this infinite series formula
            to calculate pi
            */
            denominator += 2;

            
            if (iterationCounter % 2 == 0) 
            {
                iterationAnswer = iterationAnswer + (1 / denominator);
            }
            else
            {
                iterationAnswer = iterationAnswer - (1 / denominator);
            }
            
            iterationCounter ++ ;
          
          /*
          difference variable is to test the change in iteration estimates for pi
          */  
        } while(1 / denominator >= difference);
        
        /*
        iteration answer is only pi divided by 4, to get pi must multiply by 4
        */
        double finalPi = iterationAnswer * 4; 
        
        System.out.println("Iterations to reach six-digit accuracy: " + iterationCounter);
        System.out.println(" ");
        System.out.println("Final calculation of Pi: " + finalPi);
          
    }
    
    /**
     * printPi method prints the java library's Pi to check for algorithm
     * accuracy
     * @author Kierstin
     */
    public static void printPi()
            
    {
        System.out.println("Library Pi: " + Math.PI);
    }
    
}