/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package javaapplication10;

/**
 *
 * @author apple
 */
import java.util.Arrays;


public class sum_3 {
    public int Closest(int[] nums, int target) {
    int min = Integer.MAX_VALUE;
    int result = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            int diff = Math.abs(sum - target);
            if(diff == 0) return sum;
            if (diff < min) {
                min = diff;
                result = sum;
            }
            if (sum <= target) {
                j++;
            } else {
                k--;
            }
        }
    }
    System.out.println("The sum that is closest to the target is " +result);
    return result;
}
    
    public static void main(String[] args) { 
        sum_3 sum_3 = new sum_3();
        int A[] = { -1, 2, 1, -4 }; 
	int target = 1; 
        
        sum_3.Closest(A, target);
    }
    
}
