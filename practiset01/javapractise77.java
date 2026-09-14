package practiset01;

public class javapractise77 {
    public static void main(String[] args) {
        int nums[] = {110,100,0,3,4,5,1,299,0};
        Solution st = new Solution();
        int ans[] = st.sortArray(nums);
        System.out.print("[");
        for(int i:nums){
            System.out.print(" "+i);
        
            // System.out.print(nums[i]+" ");
        }
        
        System.out.print(" ]");
    }
}


class Solution {

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    int partition(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        int pivotelement = nums[start];
        while (i<j) {
            while(i<end && nums[i] <= pivotelement) {
                i++;
            } 
            while ( nums[j] > pivotelement) {
                j--;
            } 
            if(i<j)
            {
                swap(nums, i, j);
            }
        }
        swap(nums, start, j);

        return j;
    }

    void quicksort(int[] nums, int start, int end) {

        if (start < end) {
            int pivotindex = partition(nums, start, end);
            quicksort(nums, start, pivotindex - 1);
            quicksort(nums, pivotindex + 1, end);
        }
    }

    public int[] sortArray(int[] nums) {

        quicksort(nums, 0, nums.length - 1);
        return nums;

    }
}
