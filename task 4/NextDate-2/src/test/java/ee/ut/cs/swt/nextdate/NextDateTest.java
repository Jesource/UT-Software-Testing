package ee.ut.cs.swt.nextdate;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

public class NextDateTest {
	
	private NextDate trialDate = new NextDate(3,4,1976);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	/*
	 * Test method for 'ee.ut.cs.swt.nextdate.NextDate.run(int, int, int)'
	 */
	
	@Test
	public final void testJuneToJuly(){
		assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
	}
	
	@Test
	public final void testMarchToApril(){
		assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
	}

	@Test
	public final void testDecemberToJanuary(){
		assertEquals("1/1/2002", trialDate.run(12, 31, 2001));
	}

	/**
	 * IC test 1
	 */

	@Test //+1%
	public final void testRun_monthMoreThan12_InvalidDate(){
		assertEquals("invalid Input Date", trialDate.run(40, 2, 2001));
	}

	/**
	 * IC test 2
	 */

	@Test
	public final void testRun_NextDateAfter31stOfJuly_1stOfAugust2002(){
		assertEquals("8/1/2000", trialDate.run(7, 31, 2000));
	}

	/**
	 * IC test 3
	 */

	@Test
	public final void testRun_NextDateAfter31stOfDecember_1stOfTheJanuary2004(){
		assertEquals("1/1/2004", trialDate.run(12, 31, 2003));
	}

	/**
	 * IC test 4
	 */

	@Test //+2%
	public final void testRun_InvalidDate_InvalidInputDate(){
		assertEquals("Invalid Input Date", trialDate.run(11, 31, 2002));
	}

	/**
	 * IC test 5
	 */

	@Test //+12%
	public final void testRun_28thFebruary2015_29thFebruary2015() {
		assertEquals("3/1/2015", trialDate.run(2, 28, 2015));
	}

	/**
	 * IC test 6
	 */

	@Test //8%
	public final void testRun_29thFebruary2016_1stMarch2016() {
		assertEquals("3/1/2016", trialDate.run(2, 29, 2016));
	}

	/**
	 * IC test 7
	 */

	@Test //3%
	public final void testRun_28thFebruary2016_29thFebruary2016() {
		assertEquals("2/29/2016", trialDate.run(2, 28, 2016));
	}

	/**
	 * IC test 8
	 */

	@Test //3%
	public final void testRun_30thFebruary2016_error() {
		assertEquals("Invalid Input Date", trialDate.run(2, 30, 2016));
	}

	/**
	 * IC test 9
	 */

	@Test//9%
	public final void testRun_32ndOfDecember2002_InvalidInputDate() {
		assertEquals("1/1/2003", trialDate.run(12, 32, 2002));
	}

	/**
	 * IC test 10
	 */
	@Test //+35% isLeapYear, some % to isFeabruary
	public final void testLeapYear_LeapCenturyYear_1stOfJanuar2000() {
		assertEquals("3/1/2000", trialDate.run(2, 29, 2000));
	}

}

