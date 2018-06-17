package com.gojek;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.gojek.executor.AbstractProcessor;
import com.gojek.executor.InteractiveParkingLotProcessor;

public class InteractiveProcessorTest {

	static AbstractProcessor processor = null;

	@BeforeClass
	public static void setUp() throws Exception {
		processor = new InteractiveParkingLotProcessor();
		processor.validateAndProcess("create_parking_lot 6");
	}

	@Test
	public void testCreateProcess() {
		try {
			processor.validateAndProcess("create_parking_lot 6");
		} catch (Exception e) {
			fail("Creation of parking slot failed");
		}
	}
	
	@Test
	public void testPark() {
		try {
			processor.validateAndProcess("park Mh14-111 White");
		} catch (Exception e) {
			fail("Creation of parking slot failed");
		}
	}

	@Test
	public void testGetStatus() {
		try {
			processor.validateAndProcess("status");
		} catch (Exception e) {
			fail("Fetching status functioanlity failed");
		}
	}

	@Test
	public void testGetSlotsByColor() {
		try {
			processor.validateAndProcess("slot_numbers_for_cars_with_colour White");
		} catch (Exception e) {
			fail("slot_numbers_for_cars_with_colour functionality failed");
		}
	}

	@Test
	public void testGetRegNoByColor() {
		try {
			processor.validateAndProcess("registration_numbers_for_cars_with_colour White");
		} catch (Exception e) {
			fail("registration_numbers_for_cars_with_colour functionality failed");
		}
	}

	@Test
	public void testSlotByRegNo() {
		try {
			processor.validateAndProcess("registration_numbers_for_cars_with_colour 1234");
		} catch (Exception e) {
			fail("registration_numbers_for_cars_with_colour functionality failed");
		}
	}

}
