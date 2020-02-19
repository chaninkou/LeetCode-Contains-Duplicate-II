package containsDuplicateII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		
		for(int right = 0; right < nums.length; right++){
			// This will remove the element that is at the limit of k
			// its the left side of the sliding window
			if(right > k){
				int left = right - k - 1;
				set.remove(nums[left]);
			}
			
			// add will return false when its already in hashset
			if(!set.add(nums[right])){
				return true;
			}
		}
		
		// If its here, return false with no duplicate
		return false;
	}
}
