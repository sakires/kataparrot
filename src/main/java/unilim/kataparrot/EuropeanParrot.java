package unilim.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot(  double voltage, boolean isNailed) {
		super(ParrotTypeEnum.EUROPEAN);
	}
	@Override
	public double getSpeed() {
		return getBaseSpeed();	
	}
	

}
