package pojo;

/**
 * Created by wayne on 2016. 4. 9..
 */
public class ConsolePrinter implements Printer {
	@Override
	public void print(String str) {
		System.out.println(str);
	}
}
