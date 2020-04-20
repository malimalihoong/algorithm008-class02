public class TwoSum {
	public int[] twoSum(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < a.lenth; i++) {
			int val = target - a[i];
			if(map.containsKey(val)) {
				return new int[] {i, map.get(val)};
			}
			map.put(a[i], i);
		}
		return new int[] {};
	}
}