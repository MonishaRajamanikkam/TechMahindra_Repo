package tm;
import java.util.Arrays;
public class PrimitiveAndRferenceVariable {
	public static void main(String[]args) {
		int[]arr= {12,4,124};//Reference variable
		int input=12;//primitive variable
		System.out.println("Before calling the method:");
		System.out.println(input);//Print the primitive variable value before calling the method
		System.out.println(Arrays.toString(arr));//print the reference variable value before calling the method
		print(input,arr);//call the method and pass the variables
		System.out.println("After calling the method:");
		System.out.println(input);//Print the primitive variable value after calling the method
		System.out.println(Arrays.toString(arr));//print the reference variable value after calling the method
	}
	//called method to receive the passed variables
	public static void print(int input,int[]arrays) {
		arrays[1]=37;//change the array value
		input++;//change the integer value
	}
	}


