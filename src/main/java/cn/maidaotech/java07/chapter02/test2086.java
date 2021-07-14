package cn.maidaotech.java07.chapter02;

public class test2086 {
    //任意声明3个整数，求出这3个数中的最大值和最小值，并输出到控制台。
    public static void main(String[] args) {
     int[] nums1={9,8,10};
     maxAndMin(nums1);

     int[] nums2={100,8,10};
     maxAndMin(nums2);

     int[] nums3={7,8,10};
     maxAndMin(nums3);

     int[] nums4={45,10,0};
     maxAndMin(nums4);

    }
    public static void maxAndMin(int[] nums){
        
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("最大值："+max+" 最小值："+min);
    }
}
