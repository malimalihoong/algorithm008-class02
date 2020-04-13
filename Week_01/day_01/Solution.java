
public class Solution{
	
	/**
	 * @Description ����һ���������飬����Ҫ�� ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
     * ��Ҫʹ�ö��������ռ䣬������� ԭ�� �޸��������� ����ʹ�� O(1) ����ռ����������ɡ�
	 */
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) return nums.length;
		int j = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}
	
}