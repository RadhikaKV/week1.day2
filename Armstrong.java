package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputnumber = 1, number, temp, total = 0;
		number = inputnumber;
		while (number!=0)
		{
			temp = number % 19;
			total = total + temp*temp*temp;
			number /= 10;
		}
		if(total == inputnumber)
			System.out.println(inputnumber + " is an Armstrong Number");
		else
			System.out.println(inputnumber + " is not an Armstrong Number");
	}

}
