package unilim.kataparrot;

public class NorwegianBlueParrot extends Parrot{
	private double voltage;
	private boolean isNailed;
	
	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE);
		this.voltage=voltage;
		this.isNailed = isNailed;
		
	}
	
	@Override
	public double getSpeed() {
		return (isNailed()) ? 0 : getBaseSpeed(getVoltage());
	
	}
	private double getVoltage() {
		return voltage;
	}

	public boolean isNailed() {
		return isNailed;
	}

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}
}
