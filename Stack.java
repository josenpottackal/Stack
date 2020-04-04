
/**
* File Name: Stack.java
* Purpose: Implements the stack data type with arrays
* Date: 2020-03-01
* Last modified: 2020-03-01
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class Stack {

    static int stackSize = 5;
    static int topOfStack = -1;
    static int[] stack = new int[stackSize];
    static boolean errorFree = true;
    
/* Checks if Stack is empty             */
/* @return top of Stack if it equals -1 */
/* No side-effects 						*/
/* Referentially transparent 		    */

    public static boolean isEmpty () {
        return topOfStack == -1;
    }
 
/* Checks if Stack is full              	   */
/* @return topOfStack if it equals stackSize-1 */
/* No side-effects 						       */
/* Referentially transparent 		           */

    public static boolean isFull () {
        return topOfStack == stackSize - 1;
    }
    
/* Checks if Stack is error free and empty           */
/* Side-effects - changes global variable topOfStack */
/* Not referentially transparent 		             */

    public static void empty () {
        errorFree = true;
        topOfStack = -1;
    }

/* Looks what is on top           	   				 */
/* @return adds topOfStack to array stack or value 0 */
/* No side-effects 						       		 */
/* Not Referentially transparent 		             */
    
    public static int top () {
		errorFree = ! (isEmpty ()) & errorFree;
	    if (errorFree) {
	        return stack[topOfStack];
		} else	{
			return 0;
		} 
	}

/* Put something on top           	   				 */
/* @param integer Value								 */
/* Side-effects - changes global variable topOfStack */
/* Not Referentially transparent 		             */

    public static void push (int value) {
		errorFree = ! (isFull ()) & errorFree;
	        if (errorFree) {
		    topOfStack = topOfStack + 1;
	            stack[topOfStack] = value;	   
		} 
    }
    
/* Take the top item away           	   			 */
/* Side-effects - changes global variable topOfStack */
/* Not Referentially transparent 		             */

    public static void pop () {
		errorFree = ! (isEmpty ()) & errorFree;
	        if (errorFree) {
		    topOfStack = topOfStack - 1;
		} 
    }
}