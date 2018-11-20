package unilim.kataparrot;

public class AfricanParrot extends Parrot
{
	private int numberOfCoconuts ;
	
	public AfricanParrot( int numberOfCoconuts, double voltage, boolean isNailed) {
		super(ParrotTypeEnum.AFRICAN, voltage, isNailed);
		this.numberOfCoconuts=numberOfCoconuts;
	}
	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
	
	}

	public int getNumberOfCoconuts() {
		return numberOfCoconuts;
	}
	protected double getLoadFactor() {
		return 9.0;
	}

}
