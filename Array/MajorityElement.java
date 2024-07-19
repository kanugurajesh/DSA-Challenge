class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int count = n/2;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++) {
            // Assuming map is already defined and nums is an array of integers
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) return entry.getKey();
        }

        return -1;

    }
}
