package Week_01.day_02;

public class PlusOne{
	
	/**
	 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
	 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字
	 */
	public int[] plusOne(int[] digits) {
		for(int i = digits.length; i > = 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newArr = new int[digits.length + 1];
		newArr[0] = 1;
		return newArr;
	}
	
}