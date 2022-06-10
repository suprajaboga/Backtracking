package generateparanthesis;

import java.util.*;

public class generateparanthesis 
{
	public static void findAll(String current, int open, int close, List<String> result, int n)
	{
		if(current.length() == 2*n)
		{
			if(result.contains(current))
				return;
			else
			{
				result.add(current);
				return;
			}
		}
		if(open < n)
			findAll(current+"(", open+1, close, result, n);
		if(close < open)
			findAll(current+")", open, close+1, result, n);
	}
	public static List<String> generateParanthesis(int n)
	{
		List<String> res = new ArrayList<>();
		findAll("(",1,0,res,n);
		return res;
	}
	public static void main(String args[])
	{
		int n = 3;
		List<String> ans = generateParanthesis(n);
		System.out.println(ans);
	}
}
