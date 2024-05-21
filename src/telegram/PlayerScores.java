package telegram;

import java.util.ArrayList;
import java.util.List;

public class PlayerScores {
	public static List<Integer> reverse(List<Integer> list)
	{
		List<Integer> sort=new ArrayList<>();
		for (int i = list.size()-1; i >=0; i--) {
			sort.add(list.get(i));
		}
		return sort;
	}
	
	public static void score(List<Integer> list)
	{
		int score1=0,score2=0;
		if(list.size()>2) {
		for (int i = 0; i < 2; i++) {
			if(i%2==0) {
				score1=score1+list.get(i);
				list.remove(i);
			}	
			else
				score2=score2+list.get(i);
				list.remove(i);
		}
		reverse(list);
		}
		System.out.println(score1+" "+score2);
	}
	
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(3);
		list.add(5);
		System.out.println(list);
		System.out.println(reverse(list));
		score(list);
		
	}
}
