package main;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import reader.LowerCaseInputStream;

public class Main {

	public static void main(String args[]) {

		int c;
		File testFile = new File("etc/test.txt");
		if (!testFile.exists()) {
			System.err.println("File " + testFile.getAbsolutePath() + " doesnt exist");
			return;
		}

		try {
			InputStreamReader defaultInputStream = new InputStreamReader(new BufferedInputStream(new FileInputStream(testFile.getAbsoluteFile())));
			InputStream customInputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(testFile.getAbsoluteFile())));

			System.out.println("\n ### Default Input Stream ### ");
			while ((c = defaultInputStream.read()) >= 0) {
				System.out.print((char) c);
			}

			System.out.println("\n\n ### Custom Input Stream ### ");
			while ((c = customInputStream.read()) >= 0) {
				System.out.print((char) c);
			}

			defaultInputStream.close();
			customInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
