package by.htp.banana;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainBanana{

	public static void main(String[] args) {
		List<Banana> bananas = new LinkedList<Banana>();
		bananas.add(new Banana(4, "normal"));
		bananas.add(new Banana(8, "best"));
		bananas.add(new Banana(8, "good"));
		bananas.add(new Banana(6, "awful"));
		bananas.add(new Banana(5, "awful"));
		bananas.add(new Banana(5, "normal"));
		bananas.add(new Banana(6, "best"));
		bananas.add(new Banana(10, "awful"));
		bananas.add(new Banana(10, "best"));
		bananas.add(new Banana(4, "bad"));
		bananas.add(new Banana(4, "bad"));
		Collections.sort(bananas,new Banana());
		for (Banana b:bananas)
		 System.out.println(b);
		Collections.sort(bananas);
		for (Banana b:bananas)
		 System.out.println(b);

	}

	
}
