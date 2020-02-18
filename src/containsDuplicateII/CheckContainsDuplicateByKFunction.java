package containsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class CheckContainsDuplicateByKFunction {
	// First way, using hashmap going through the whole list worst case
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			// If index between the duplicates is greater or equal to k
			if(map.containsKey(nums[i]) && i - map.get(nums[i]) >= k){
				return true;
			} else {
				map.put(nums[i], i);
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
