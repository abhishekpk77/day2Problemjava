package day2problem;

public class PalindromeNumber {
public static void main(String[] args)
{
	int lastDigit,sum=0,a;
	int Number=545;
	a=Number;
	for( ;a!=0;a=a/10)
	{
		System.out.println("Number"+a);
		lastDigit=a%10;
		System.out.println("Last Digit"+lastDigit);
		System.out.println("Digit"+lastDigit+"was added to sum"+(sum*10));
		sum=(sum*10)+lastDigit;
		a=a/10;
	}
	if(sum==Number)
		System.out.println("Number is palindrome ");
	else
		System.out.println("Number is not palindrome");
	}
}

