 class SolutionDayThree{
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int subtractProductAndSum(int n) {
        int sum = 0, che = 1, temp = 0;
       while(n != 0){
           temp = n%10;
           sum += temp;
           che *= temp;
           n /= 10;
       }
       return che - sum;
    }   
}