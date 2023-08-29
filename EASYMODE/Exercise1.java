import java.util.Set;
import java.util.HashSet;

public class Exercise1 {

    /**
     * Given an integer array nums, return true if any value appears 
     * at least twice in the array, and return false if every element is distinct.
     * 
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * 
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 4, 5}; 
        Exercise1 exercise = new Exercise1();
        System.out.println("Contains duplicates: " + exercise.containsDuplicate(nums));
        System.out.println("Contains duplicates2: " + exercise.containsDuplicate2(nums));
    }    

    // BUCLE FOR
    public boolean containsDuplicate(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i] + " Bucle Externo");
            for(int j=i+1; j<nums.length; j++) {
                System.out.println(nums[j] + " Bucle Interno");
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // BUCLE FOR-EACH
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                System.out.println(num + " Duplicate Number");
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}