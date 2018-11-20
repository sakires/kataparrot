package unilim.kataparrot;

public class AfricanParrot extends Parrot
{

	public AfricanParrot( int numberOfCoconuts, double voltage, boolean isNailed) {
		super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());

		
	}
}
