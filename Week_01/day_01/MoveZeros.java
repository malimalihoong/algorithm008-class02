public class Solution {
	/**
	 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
	 */
    public void moveZeroes(int[] nums) {
       int j = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
               nums[j] = nums[i];
               if(j != i){
                   nums[i] = 0;
               }
               j++;
           }
       }
    }
}