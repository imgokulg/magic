package com.gsk;

public class BasicMath {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		try{
			print(reverseDigits(1234));
			print(checkPalindrome(1221));
			print(gcd(16,32));
			print(isArmStrongNumber(153));
		} catch(Exception | Error e){
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		System.out.println(((endTime - startTime)/ 1_000_000_000)+" seconds");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static boolean checkPalindrome(int number) {
		return number == reverseDigits(number);
	}

	public static int reverseDigits(int number) {;
		int reverse = 0;
		while(number!=0) {
			reverse = (reverse * 10) + (number % 10);
			number /= 10;
		}
		return reverse;
	}
	
       	public static boolean isArmStrongNumber(int number) {;
		int temp = number;
		int reverse = 0;
                while(number!=0) {
			int rem = number % 10;
                        reverse += (rem * rem * rem);
                        number /= 10;
                }
                return reverse == temp;
        }

	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
