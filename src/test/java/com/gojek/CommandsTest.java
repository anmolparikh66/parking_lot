package com.gojek;

import static org.junit.Assert.assertTrue;

import com.gojek.constants.Command;

public class CommandsTest {
	
    public void testCommandNegative() throws Exception {
    	Command command = Command.findByName("create_parking_lot----null");
    	assertTrue(command == null);
    }
    
    
    public void testCommandPositive() throws Exception {
    	Command command = Command.findByName("create_parking_lot");
    	assertTrue(command != null);
    }
}