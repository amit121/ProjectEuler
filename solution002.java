class solution2{
	public static void main(String[] args){
		int prev1 =0;
		int prev2 = 1;
		int sum = 0;
		for(int i = 0; prev1<4000000 && prev2<4000000; i++){ //iteration used to find values of fibonacci sequence
			int save = prev1;
			prev1 = prev2;
			prev2 = save + prev2;
			if(prev1 % 2 == 0){
				sum = sum + prev1;
			}
		}
		System.out.println(sum);
	}
}
