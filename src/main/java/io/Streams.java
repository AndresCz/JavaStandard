package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}
	}

}
