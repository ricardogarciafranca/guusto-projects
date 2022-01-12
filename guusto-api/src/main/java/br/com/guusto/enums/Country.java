package br.com.guusto.enums;

public enum Country {
	USA, CAN;
	
	
	public static Country fromValue(String str) {
		
		for(Country country: Country.values()) {			
			if(country.name().equals(str)) {
				return country;
			}			
		}
		
		return null;		
		
	}
	
}
