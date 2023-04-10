//1. WAP to find the duplicates present in an array.
public class duplicates {

	public static void main(String[] args) {
		int [] ar= {10,20,30,40,20,50,30,60,60};
		
		System.out.println("duplicate elements in array are: ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+ " ");
				}
			}
		}

	}

}