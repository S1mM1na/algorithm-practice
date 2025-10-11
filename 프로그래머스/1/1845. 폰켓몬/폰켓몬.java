import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> types = new HashSet<>();
        for(int num : nums) {
            types.add(num);
        }
        
        int maxSelect = nums.length / 2;
        
        return Math.min(types.size(), maxSelect);
    }
}