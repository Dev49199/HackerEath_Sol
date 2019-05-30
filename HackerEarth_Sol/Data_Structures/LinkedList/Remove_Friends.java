// Problem Source:
//https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/practice-problems/algorithm/remove-friends-5/description/

// hackerearth's remove Friends problem

//Solution of the problem

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tCase = Integer.parseInt(br.readLine());
		while(tCase>0)
		{
			String[] in1 = br.readLine().split(" ");
			int n = Integer.parseInt(in1[0]);
			int k = Integer.parseInt(in1[1]);
			String[] in2 = br.readLine().split(" ");
			int j=1;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int first = Integer.parseInt(in2[0]);
			arr.add(first);

			while(k>0)
			{
				int element = Integer.parseInt(in2[j]);
				arr.add(element);
				while(arr.size()>1 && arr.get(arr.size()-2)<element && k>0)
				{
					arr.remove(arr.size()-2);
					k--;
				}
				j++;
			}

			for(int p = j;p<n;p++)
			{
				arr.add(Integer.parseInt(in2[p]));
			}

			for(j=0;j<arr.size();j++)
			{
				System.out.print(arr.get(j)+" ");
			}
			System.out.println();
			tCase--;
		}
	}
}