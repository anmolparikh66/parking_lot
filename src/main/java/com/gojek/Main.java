package com.gojek;

import com.gojek.executor.AbstractProcessor;
import com.gojek.executor.FileProcessor;
import com.gojek.executor.InteractiveParkingLotProcessor;

/**
 * Created by Anmol on 17/06/2018.
 */

public class Main {

	public static void main(String[] args) throws Exception {
		
		AbstractProcessor processor = null;
		
		if(args.length >= 1) {
			processor = new FileProcessor(args[0]);
		} else {
			processor = new InteractiveParkingLotProcessor();
		}
		processor.process();
	}

}
