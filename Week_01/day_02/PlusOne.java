package Week_01.day_02;

public class PlusOne{
	
	/**
	 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
	 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢��������
	 */
	public int[] plusOne(int[] digits) {
		for(int i = digits.length; i > = 0; i--) {
			digits[i]++;
			digits[i] %= 10;
			if(digits[i] != 0) {
				return digits;
			}
		}
		digits = new int[++digits.length];
		digits[0] = 1;
		return digits;
	}
	
}