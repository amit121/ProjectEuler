class solution6{
	public static void main(String[] args){
		int sum1 = 0; //variable for sum of squares
		int sum2 = 0; //variable for square of the sums
		for(int i=1; i<=100; i++){
			sum1 += (int)Math.pow(i,2); //find sum of squares
			sum2 += i; // find sum of numbers
		}
		sum2 = (int)Math.pow(sum2,2); //square of the sums
		System.out.println(sum2-sum1); //difference between the sum of the squares and the square of the sums
	}
}
