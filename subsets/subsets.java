package subsets;
import java.util.*;

public class subsets 
{
	public static void print(int start, int arr[], List<Integer> temp, List<List<Integer>> res)
	{
		res.add(new ArrayList(temp));
		for(int i=start;i<arr.length;i++)
		{
			temp.add(arr[i]);
			print(i+1,arr,temp,res);
			temp.remove(temp.size()-1);
		}
	}
	public static List<List<Integer>> subsets(int arr[])
	{
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		print(0,arr,temp,res);
		return res;
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{1,2,3};
		List<List<Integer>> ans = subsets(arr);
		System.out.println(ans);
	}
}

