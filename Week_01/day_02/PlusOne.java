package Week_01.day_02;

public class PlusOne{
	
	/**
	 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
	 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢��������
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