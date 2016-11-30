package StructuralDesignpatterns.DecrotorPattern;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// In this example we decorate  our file with hierachhy of classes and add decrations to our file object s



public class DecoratorEveryDayDemo {

	
	public static void main(String[] args) throws IOException {
		File file=new File("./output.txt");
		file.createNewFile();
		OutputStream ostream=(OutputStream)new FileOutputStream(file);
		DataOutputStream dataOutputStream=new DataOutputStream(ostream);
		dataOutputStream.writeChars("hello world");
		dataOutputStream.close();
		ostream.close();
	
	}
}
