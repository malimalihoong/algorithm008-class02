
public class MostWater {
	public int mostWater(int[] a) {
		int max = 0;
		for(int i = 0; i < a.length-1; ++i) {
			for(int j = 1; j < a.length; ++j) {
				int area = (j - i) * Math.min(a[i], a[j]);
				max = Math.max(max, area);
			}
		}
		return max;
	}
	
	public int mostWater2(int[] a) {
		int max = 0;
		for(int i = 0, j = a.length-1; i < a.length; ++i) {
			int minHeight = (a[j] < a[i]) ? a[j--]:a[i++];
			int area = (j-i+1)*minHeight;
			max = Math.max(max, area);
		}
		return max;
	}
}