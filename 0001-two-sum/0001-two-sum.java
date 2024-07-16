class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++)
        {
            int currentValue = nums[i];
            if (map.containsKey(target - currentValue))
            {
                result[0] = map.get(target - currentValue);
                result[1] = i;
                return result;
            }
            map.put(currentValue, i);
        }
        return result;
    }
}