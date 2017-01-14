package projectEuler;

public class problem2 {

	
	public static void main(String[] args) {
		
		int result = 0;
		int i = 1;
		int evenSum = 0;
		
		while(result<4000000)
		{
			i++;
			result = Fibonacci(i);
			if(result%2 == 0)evenSum += result;
		}
		result = Fibonacci(i-1);
		if(Fibonacci(i)%2 == 0)evenSum -= result;
		
		System.out.println(evenSum);
		System.out.println(result);
		System.out.println(i);
		
	}
	public static int Fibonacci(int i)
	{
		if(i == 1) return 1;
		else if(i == 2) return 2;
		else{
			int sonuc = Fibonacci(i-1) + Fibonacci(i-2);
			return sonuc;
		}
	}

}
