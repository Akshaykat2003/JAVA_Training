//all pairs whose sum is given number
import java.util.*;
class pairSum
{

public static void main(String[] args)
{
	int[] arr = {1,2,3,4,5,6};
	int sum = 6;
	
	List<List<Integer>> result = findSum(arr,sum);
	System.out.println("Pairs found: " + sum + " " + result);
	
	
}

public static List<List<Integer>> findSum(int[] arr,int sum)
{
	List<List<Integer>> pairs = new ArrayList<>();
	
	int left = 0;
	int right = arr.length-1;
	
	while(left<right)
	{
		int currentSum = arr[left] + arr[right];
		if(currentSum == sum)
		{
			List<Integer> pair = new ArrayList<>();
			pair.add(arr[left]);
			pair.add(arr[right]);
			pairs.add(pair);
			left++;
			right--;
		}
		else if(currentSum<sum)
		{
			left++;
		}
		else{
			right--;
		}
	}
	return pairs;
}
}