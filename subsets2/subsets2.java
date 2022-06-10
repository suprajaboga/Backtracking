package subsets2;
import java.util.*;

public class subsets2 
{
	public static void print(int start, int arr[], List<Integer> temp, List<List<Integer>> res)
	{
		res.add(new ArrayList(temp));
		for(int i=start;i<arr.length;i++)
		{
			if(i > start && arr[i] == arr[i-1])
				continue;
			temp.add(arr[i]);
			print(i+1,arr,temp,res);
			temp.remove(temp.size()-1);
		}
	}
	public static List<List<Integer>> subsets(int arr[])
	{
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);
		print(0,arr,temp,res);
		return res;
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{2,1,2};
		List<List<Integer>> ans = subsets(arr);
		System.out.println(ans);
	}
}
