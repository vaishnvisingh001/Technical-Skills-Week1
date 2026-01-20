package ARRAYS;
import java.util.*;

// given number of array count no. of elements having atleast 1 element greater than itself.
// e.g., => [1,2,3,4,-5,-6,-1]
// Observation:- for every max element there won't be any element greater than itself.
// Scenario 2 :- [5,5,5,5] => in this case Count = 0 (when all elements are equal then none of then 
// is greater than itself)

// PseudoCode:-
// 1-Iterate and find the max element from the array.
// 2-Iterate and get the no. of elements that are != max.
// 3-Increment the counter.

public class CountEle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count=0;
        int max = Integer.MAX_VALUE;
        int arr[] = {1,2,3,4,-5,-6};

        // Finding max element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // count elements
        for(int i=0;i<arr.length;i++){
            if(arr[i] != max){
                count ++;
            }
        }
        // finally printing th value of count 
        System.out.println("No. of elements having atleast 1 element greater than itself" + count);
    }
}