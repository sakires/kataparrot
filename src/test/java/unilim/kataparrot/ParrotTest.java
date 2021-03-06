package unilim.kataparrot;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParrotTest {


	@Test
	public void getSpeedOfEuropeanParrot() {
		EuropeanParrot parrot = new EuropeanParrot( 0, false);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_One_Coconut() {
		AfricanParrot parrot = new AfricanParrot( 1, 0, false);
		assertEquals(3.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		AfricanParrot parrot = new AfricanParrot( 2, 0, false);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		AfricanParrot parrot = new AfricanParrot( 0, 0, false);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_nailed() {
		NorwegianBlueParrot parrot = new NorwegianBlueParrot(0, true);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed() {
		NorwegianBlueParrot parrot = new NorwegianBlueParrot( 1.5, false);
		assertEquals(18.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		NorwegianBlueParrot parrot = new NorwegianBlueParrot(  4, false);
		assertEquals(24.0, parrot.getSpeed(), 0.0);
	}

}
