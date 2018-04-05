import java.util.Scanner;
public class AVERAGEARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in 4 numbers");
int [] array = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
int sum = 0;
for(int i = 0; i<=array.length-1;i++) {
	sum = sum + array[i]; 
}
System.out.println(sum/array.length);
	}

}
