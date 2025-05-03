package org.example;

public class Testing {
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,2,2,3,3,4,5};
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(index);
    }
}
