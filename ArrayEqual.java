// Given an Integer A of size N. In 1 sec you can increase the value of 1 element by 1. Find the minimum
// time in seconds to make all the elements of the array equal.
// arr = {2,4,1,3}
// Observation:- To minimize the time, make all elements eqaul to the maximum element in the array
// Pseudocode:-
// find the maximum element in the array.
// for every element Calculate how much it needs to be increase to reach the maximum.
// sum all those differences and that some = Time.

public class ArrayEqual {
    public static void main(String[] args) {
        int time=0;
        int max = Integer.MIN_VALUE;
        int arr[] = {2,4,1,3};

        // Finding max element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            time += max - arr[i];
        }
        System.out.println("The Minimum time in Seconds to make all the elements of the array equal: "+time);
    }
}
