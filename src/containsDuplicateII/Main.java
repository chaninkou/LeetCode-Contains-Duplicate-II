package containsDuplicateII;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,3,3};
		
		int k = 1;
		
		System.out.println("Input Arrays: " + Arrays.toString(nums));
		
		System.out.println("Input k: " + k);
		
		CheckContainsDuplicateByKFunction solution = new CheckContainsDuplicateByKFunction();
		
		System.out.println("Solution: " + solution.containsNearbyDuplicate2(nums, k));
	}
}
