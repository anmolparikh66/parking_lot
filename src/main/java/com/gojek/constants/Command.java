package com.gojek.constants;

/**
 * Created by Anmol on 17/06/2018.
 */

public enum Command {
    CREATE("create_parking_lot"),
    PARK("park"),
    LEAVE("leave"),
    STATUS("status"),
    FETCH_CARE_FROM_COLOR("registration_numbers_for_cars_with_colour"),
    FETCH_SLOT_FROM_COLOR("slot_numbers_for_cars_with_colour"),
    FETCH_SLOT_FROM_REG_NO("slot_number_for_registration_number");
    
    private final String name;  
	
	private Command(String s) {
        name = s;
    }
	
	public static Command findByName(String abbr){
	    for(Command c : values()){
	        if( c.toString().equals(abbr)){
	            return c;
	        }
	    }
	    return null;
	}
	
	public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
       return name;
    }
    
    public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if( c != null && string != null ) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
            }
        }
        return null;
    }
}
