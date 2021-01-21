package app;

import java.util.List;

public   class Print {
	public static <T> void print(List<T> list ) {
		for(int i = 0; i<list.size(); i++) {
//			System.out.println("---------------------------------------------------------------");
			System.out.println((i+1)+" "+list.get(i).toString());
			System.out.println("---------------------------------------------------------------");
		}
		
	}

}
