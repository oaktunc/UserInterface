
public class ArrayException {
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3};
		
		System.out.println(a[2]);
		
		try{
		System.out.println(a[4]);
		}
		
		catch(IndexOutOfBoundsException e) {
			System.out.println("Watch the array index!");
		}
	}

}
