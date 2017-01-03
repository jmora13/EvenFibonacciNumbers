/*By considering the terms in the Fibonacci sequence whose values do 
 * not exceed four million, find the sum of the even-valued terms.*/
public class EvenFibonacciNumbers {
	public static void main(String[] args){
	int x = 0;
	int y = 1;
	int sum = 0;
	int temp = 0;
	while(sum < 4000000){
		if(sum % 2 ==0){
			temp += sum;	
			}
		sum = x + y;
		x = y;
		y= sum;
	System.out.println(temp);
		}
	}
}
