package combinationsum3;
import java.util.*;

public class combinationsum3 {
    public static void print(int start, int end, int target, int k, List<Integer> temp, List<List<Integer>> res)
    {
        if(temp.size() == k && target == 0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=end;i++)
        {
            temp.add(i);
            print(i+1,end,target-i,k,temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> combine(int target, int k) 
    {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        print(1,9,target,k,temp,res);
        return res;
    }
    public static void main(String args[])
    {
	int target = 9, k = 3;
	List<List<Integer>> ans = combine(target,k);
	System.out.println(ans);
    }
}
