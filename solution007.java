class solution7{
	public static void main(String[] args){
		int count = 1; //start the counter at 1
		int num = 2; //first prime number is 2
		while(count>=1){
			if(isPrime(num)){
				if(count == 10001){ //when the count is 10001
					System.out.println(count+": "+num); // the prime number is printed
					break; // stop the search
				}
				count++; // if a prime is increase the counter
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
