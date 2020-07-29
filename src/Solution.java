import java.util.Arrays;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays


public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        //Solution1:
        // my code starts here
        int n = a.length;
        int[] new_array = new int[n];
        for (int old_index=0; old_index<n; old_index++){
            // calculate the right rotation instead of left.
            // If the new index excedd the length of the array,
            // modulus will give the the new index needed.
            int new_index = (old_index + (n-d)) % n;
            new_array[new_index] = a [old_index];
        }
        return new_array;
// my code ends here


        // Solution 2:
// my code starts here
//        int size = a.length;
//        int[] newArr = new int[size];
//
//        int new_index=0;
//        int move_index = d;
//        while (move_index<size){
//            newArr[new_index] = a[move_index];
//            new_index++;
//            move_index++;
//        }
//
////        System.out.println(new_index);
//
//        int old_front_index=0;
//        while(old_front_index<d){
//            newArr[new_index]=a[old_front_index];
//            new_index++;
//            old_front_index++;
//        }
//        return newArr;
// my code ends here

    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int d = 4;
        System.out.println(Arrays.toString(rotLeft(a,d)));
        // Another way to print an array
//        for(int x : rotLeft(a,d)){
//            System.out.println(x);
//        }
    }


}



