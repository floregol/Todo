package control;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class Main {
	public static void main(String[] args) {
		Args argsApp = new Args();
		JCommander.newBuilder().addObject(argsApp).build().parse(args);
		String list_name = argsApp.getList_name();
		System.out.println("todo : " + list_name);
	}
}
