package converter;

public enum Length {

	meter(1.0000), 
	kilometer(1000.0), 
	centimeter(0.0100), 
	mile(1609.344), 
	foot(0.30480), 
	wa(2.00000),
	AU(149597870700L);
	
	private final double unit;

	private Length(double value) {
		this.unit = value;
	}

	public double getUnit() {
		return unit;
	}
}
