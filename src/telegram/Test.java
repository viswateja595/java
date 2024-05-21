package telegram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

@FunctionalInterface
interface A{
	void show();
}

//class B implements A{
//	public void show()
//	{
//		System.out.println("Show Method");
//	}
//}

public class Test {
	public static void main(String[] args) {
		
//		A obj=() -> System.out.println("In Anonymous Inner Class -> Lambda Expression");
//		obj.show();
		
		
		List<Integer> list=Arrays.asList(2,7,4,5,9,1);
		int result=list.stream()
		.filter(n->n%2==1)
		.map(t ->  t*2)
		.reduce(0,(c,e)->c+e);
		System.out.println(result);
		
	}
}
