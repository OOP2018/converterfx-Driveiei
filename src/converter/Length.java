package converter;

/**
 * Length is a enum class with a fixed set of static instances for Length units.
 * 
 * @author Kornphon Noiprasert
 */
public enum Length {
	/** enum members */
	meter(1.0000), 
	kilometer(1000.0), 
	centimeter(0.0100), 
	mile(1609.344), 
	foot(0.30480), 
	wa(2.00000),
	AU(149597870700L);
	
	 // attributes of the enum members
	private final double unit;

	/**
	 * Initialize the unit(value) of the length.
	 * */
	private Length(double value) {
		this.unit = value;
	}
	
	/**
	 * Get the unit of length.
	 * 
	 * @return the length's unit.
	 */
	public double getUnit() {
		return unit;
	}
}
