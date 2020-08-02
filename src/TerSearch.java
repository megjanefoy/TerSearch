/**************************************************************
 Author: Megan Jane Thompson
 Purpose: This program creates an array of integers. It has a
 		  function to search for a given value and returns the 
 		  value's index if found or returns -1 if not found.
**************************************************************/
public class TerSearch {
    /*
     * Main Method
     */
    public static void main(String[] args) { 
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int l = 0;                          //first index
        int r = 9;                          //last index
        int x;                              //value to be found
        int indx;                           //index of value or -1

        x = 8;                              //key is 8
        indx = terSearch(A, l, r, x);       //search call    
        System.out.println("Index of " + x + " is: " + indx); 
  
        x = 15;                             //key is now 15
        indx = terSearch(A, l, r, x);       //search call
        System.out.println("Index of " + x + " is: " + indx); 
    } 
    
    /* This method takes in an array, first index, last index,
     * and the number to be found. It returns the index of the 
     * value or -1 if the value is not contained in the array.
	 * 
	 * @param A  ,the Array of integers.
	 * @param l  ,the beginning index
	 * @param r  ,the ending index
	 * @param x  ,the number to be found
	 * @return   ,returns index of the value
	 */
	public static int terSearch(int[] A, int l, int r, int x) {
		if (r >= l) {  
			//finds the middle element
            int d1 = l + (r - l) / 3;      
            int d2 = r - (r - l) / 3; 
  
            //checks if key is mid
            if (A[d1] == x) {              
                return d1; 
            } 
            if (A[d2] == x) { 
                return d2; 
            } 
  
            //key is not mid, checks region and repeats search
            if (x < A[d1]) { 
                return terSearch(A, l, d1 - 1, x);       //key is between l and d1
            } 
            else if (x > A[d2]) { 
                return terSearch(A, d2 + 1, r, x);       //key is between d2 and r
            } 
            else { 
                return terSearch(A, d1 + 1, d2 - 1, x);  //key is between d1 and d2
            } 
        } 
        return -1;     //the key was not found
    }  
}
