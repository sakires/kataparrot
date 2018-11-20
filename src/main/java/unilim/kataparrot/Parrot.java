package unilim.kataparrot;



public abstract class Parrot {

	@SuppressWarnings("unused")
	private ParrotTypeEnum type;
	


	public Parrot(ParrotTypeEnum _type) {
		this.type = _type;

	}

	public abstract double getSpeed();
	
	protected double getBaseSpeed() {
		return 12.0;
	}
}