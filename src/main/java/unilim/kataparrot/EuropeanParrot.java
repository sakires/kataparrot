package unilim.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot( int numberOfCoconuts, double voltage, boolean isNailed) {
		super(ParrotTypeEnum.EUROPEAN, numberOfCoconuts, voltage, isNailed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSpeed() {
		return getBaseSpeed();
		
	}
}
