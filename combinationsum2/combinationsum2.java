package combinationsum2;
import java.util.*;

public class combinationsum2
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
        	if(i > start && arr[i] == arr[i-1])
        		continue;
            temp.add(arr[i]);
            print(i+1,arr,target-arr[i],temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> combine(int target, int arr[]) 
    {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        print(0,arr,target,temp,res);
        return res;
    }
    public static void main(String args[])
    {
	int target = 8;
	int arr[] = new int[] {10,1,2,7,6,1,5};
	List<List<Integer>> ans = combine(target,arr);
	System.out.println(ans);
    }
}
