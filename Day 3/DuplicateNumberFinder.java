import java.util.HashSet;

public class DuplicateNumberFinder {
    public int findDuplicate(int[] nums) {
        // Using a HashSet to keep track of seen numbers
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            } else {
                seen.add(num);
            }
        }

        // If no duplicate is found, return -1 (or any other appropriate value)
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        DuplicateNumberFinder finder = new DuplicateNumberFinder();
        int duplicate = finder.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}