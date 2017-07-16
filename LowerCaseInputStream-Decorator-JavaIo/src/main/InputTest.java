package main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import decorator.LowerCaseInputStream;

public class InputTest {
	public static void main(String[] args) {
		try (InputStream in =
				new LowerCaseInputStream(
						new BufferedInputStream(
								new FileInputStream("test.txt")))){
			int c;
			while ((c = in.read()) >= 0)
				System.out.print((char) c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
