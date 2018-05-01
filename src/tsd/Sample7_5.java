package tsd;

import java.io.EOFException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Sample7_5 {
	public void somemethod() throws IOException{}
}

class Sample7_5_1 extends Sample7_5{
	public void somemethod() throws IOException{}
}

class Sample7_5_2 extends Sample7_5{
	public void somemethod() {}
}

class Sample7_5_3 extends Sample7_5{
	public void somemethod() throws EOFException, FileSystemNotFoundException{}
}

class Sample7_5_4 extends Sample7_5{
	public void somemethod() throws ClassNotFoundException{}
}

class Sample7_5_5 extends Sample7_5{
	public void somemethod() throws Exception{}
}

class Sample7_5_6 extends Sample7_5{
	public void somemethod() throws IOException, ClassNotFoundException{}
}

class Sample7_5_7 extends Sample7_5{
	public void somemethod() throws RuntimeException{}
}