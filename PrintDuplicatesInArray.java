package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = arr.length;
		System.out.println("length of the array is:" + "" + length);
		int count;
		for(int j=0; j< length-1; j++)
		{//14
			count=0;
			for(int i=j+1; i< length;i++)
		{
			if(arr[i]==arr[j])
			{ 
				count++;
			}

		}
		
		if(count>0)
		{
			System.out.println("Duplicate elements in array:" + "" +arr[j]);
		}
		
		}
	}

}
