package unilim.kataparrot;



public class Parrot {

	private ParrotTypeEnum type;
	private int numberOfCoconuts = 0;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = _type;
		this.setNumberOfCoconuts(numberOfCoconuts);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
			//return getBaseSpeed();
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
			//return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	protected double getLoadFactor() {
		return 9.0;
	}

	protected double getBaseSpeed() {
		return 12.0;
	}

	protected int getNumberOfCoconuts() {
		return numberOfCoconuts;
	}

	protected void setNumberOfCoconuts(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}

}