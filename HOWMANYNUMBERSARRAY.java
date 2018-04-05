
public class HOWMANYNUMBERSARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {5,6,14,8,10};
int x = 0;
int z = 0;
for(int i = 0; i < array.length;i++) {
	if(array[i]%2==0) {
		x++;
	}else if(array[i]%2==1){
		z++;
	}
		
	
}System.out.println(x);
System.out.println(z);
	}

}
