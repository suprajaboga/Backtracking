package combinationsum;
import java.util.*;

public class combinationsum 
{
    public static void print(int start, int arr[], int target, List<Integer> temp, List<List<Integer>> res)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0)
        	return;
        for(int i=start;i<arr.length;i++)
        {
            temp.add(arr[i]);
            print(i,arr,target-arr[i],temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> combine(int target, int arr[]) 
    {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        print(0,arr,target,temp,res);
        return res;
    }
    public static void main(String args[])
    {
	int target = 8;
	int arr[] = new int[] {2,3,5};
	List<List<Integer>> ans = combine(target,arr);
	System.out.println(ans);
    }
}
