package combinations;
import java.util.*;

public class combinations 
{
    public static void print(int start, int n, int k, List<Integer> temp, List<List<Integer>> res)
    {
        if(temp.size() == k)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            print(i+1,n,k,temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> combine(int n, int k) 
    {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        print(1,n,k,temp,res);
        return res;
    }
    public static void main(String args[])
    {
	int n = 4, k = 2;
	List<List<Integer>> ans = combine(n,k);
	System.out.println(ans);
    }
}
