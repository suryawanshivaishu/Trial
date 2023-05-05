import java.lang.*;
public class ReverseArray
{
    public static void main(String [] args)
	{
		int [] arr1={9,5,1,8,3};
		int i;
        for(i=0;i<arr1.length;i++)
		{
		 System.out.println(arr1[i]+"");
		}
		System.out.println();
		for(i=arr1.length-1; i>=0;i--)
		{
			System.out.println(arr1[i]+"");
		}
	}
}