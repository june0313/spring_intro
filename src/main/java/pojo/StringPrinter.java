package pojo;

/**
 * Created by wayne on 2016. 4. 9..
 */
public class StringPrinter implements Printer {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void print(String str) {
		this.buffer.append(str);
	}

	@Override
	public String toString() {
		return this.buffer.toString();
	}
}
