class solution10{
	public static void main(String[] args){
		int count = 1; //start the counter at 1
		int num = 2; //first prime number is 2
		long sum = 0;
		while(count>=1){
			if(isPrime(num)){
				sum += num;
				if(num > 2000000){ //when the num is > 2000000
					System.out.println(count+": "+num+" "+sum);
					break; // stop the search
				}
				count++; // if a prime, increase the counter
			}
			num++;
		}
	}
	
	public static boolean isPrime(int num){ // method to find the prime number
		for(int i = 2; i<num; i++){
			if(num % i == 0){ // if the number is divisible 
				return false; // not prime
			}
		}
		return true; // prime
	}
}
