package containsDuplicateII;

import java.util.HashMap;

public class CheckContainsDuplicateByKFunction {
	// First way, using hashmap going through the whole list worst case
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			int current = nums[i];
			
			if(map.containsKey(current) && i - map.get(current) <= k){
				return true;
			} else {
				map.put(current, i);
			}
		}
		return false;
	}
	
	// Another way of doing it, using sliding window method
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i = 0; i < nums.length; i++){
//			// This will remove the first element in the nums from the set
//			if(i > k){
//				set.remove(nums[i - k - 1]);
//			}
//			
//			// Checking if it contains
//			if(!set.contains(nums[i])){
//				return true;
//			}
//		}
//		
//		// If its here, return false with no duplicate
//		return false;
//	}
}
