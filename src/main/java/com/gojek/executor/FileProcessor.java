package com.gojek.executor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Anmol on 17/06/2018.
 */

public class FileProcessor extends AbstractProcessor {

	String filePath = null;

	public FileProcessor(String filePath) {
		this.filePath = filePath;
	}

	public void process() throws Exception {
		File inputFile = new File(filePath);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		String line;
		while ((line = br.readLine()) != null) {
			validateAndProcess(line);
		}
	}

}
