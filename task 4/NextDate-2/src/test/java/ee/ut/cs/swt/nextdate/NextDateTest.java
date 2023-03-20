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
	 * IC tests
	 */

	/**
	 * IC test 1
	 */

	@Test
	public final void testRun_28thFebruary2015_29thFebruary2015() {
		assertEquals("3/1/2015", trialDate.run(2, 28, 2015));
	}

	/**
	 * IC test 2
	 */

	//Bug #1 TODO
	@Test
	public final void testRun_NextDateAfter31stOfJuly_1stOfAugust2002(){
		assertEquals("8/1/2000", trialDate.run(7, 31, 2000));
	}

	/**
	 * IC test 3
	 */

	//Bug #2 TODO
	@Test
	public final void testRun_NextDateAfter31stOfDecember_1stOfTheJanuary2004(){
		assertEquals("1/1/2004", trialDate.run(12, 31, 2003));
	}

	/**
	 * IC test 4
	 */

	@Test
	public final void testRun_29thFebruary2016_1stMarch2016() {
		assertEquals("3/1/2016", trialDate.run(2, 29, 2016));
	}

	/**
	 * IC test 5
	 */

	@Test
	public final void testRun_30thFebruary2016_error() {
		assertEquals("Invalid Input Date", trialDate.run(2, 30, 2016));
	}

	/**
	 * IC test 6
	 */

	//Bug#3 TODO
	@Test
	public final void test_99thDecember2004_invalidInputDate() {
		assertEquals("Invalid Input Date", trialDate.run(12, 99, 2004));
	}

	/**
	 * IC test 7
	 */

	@Test
	public final void testLeapYear_LeapCenturyYear_1stOfJanuar2000() {
		assertEquals("3/1/2000", trialDate.run(2, 29, 2000));
	}

	/**
	 * IC test 8
	 */
	//Bug#4 TODO
	@Test
	public final void testRun_1stOfJanuary2008_invalidInputDate() {
		assertEquals("invalid Input Date", trialDate.run(1, 32, 2008));
	}

	/**
	 * IC test 9
	 */

	@Test //checks isLeapYear
	public final void testRun_28thOfFebruary1900_1stOfMarch1900() {
		assertEquals("3/1/1900", trialDate.run(2, 28, 1900));
	}

	/**
	 * IC test 10
	 */

	@Test
	public final void testRun_30DayMonth_11thOfApril1986() {
		assertEquals("4/12/1900", trialDate.run(4, 11, 1986));
	}

	/**
	 Branch Coverage Tests:
	 */
	@Test
	public final void testRun_jan15th2001_jan16th2001() {	// This test covers l37
		assertEquals("1/16/2001", trialDate.run(1, 15, 2001));
	}

	@Test
	public final void testRun_apr15th2001_apr16th2001() {	// This test covers l47
		assertEquals("4/16/2001", trialDate.run(4, 15, 2001));
	}

	@Test
	public final void testRun_dec31st2021_invalidNextYear() {	// This test covers l66
		assertEquals("Invalid Next Year", trialDate.run(12, 31, 2021));;
	}

	@Test
	public final void testRun_Feb20th2002_Feb21st2002() {	// This test covers l76
		assertEquals("2/21/2002", trialDate.run(2, 20, 2002));
	}

	@Test
	public final void testRun_Feb29th2001_invalidInputDate() {	// This test covers l92
		assertEquals("Invalid Input Date", trialDate.run(2, 29, 2001));
	}

	@Test
	public final void testRun_monthMoreThan12_InvalidDate(){
		assertEquals("invalid Input Date", trialDate.run(40, 2, 2001));
	}

	@Test
	public final void testRun_InvalidDate_InvalidInputDate(){
		assertEquals("Invalid Input Date", trialDate.run(11, 31, 2002));
	}

	@Test
	public final void testRun_28thFebruary2016_29thFebruary2016() {
		assertEquals("2/29/2016", trialDate.run(2, 28, 2016));
	}

	@Test
	public final void testRun_31stOfNovember1210_1stOfDecember1210() {
		assertEquals("invalid Input Date", trialDate.run(11, 31, 1210));
	}

	@Test
	public final void testRun_InvalidDay_InvalidInput() {
		assertEquals("invalid Input Date", trialDate.run(2, 0, 2006));
	}

	@Test
	public final void testRun_montheLessThan1_InvalidInput() {
		assertEquals("invalid Input Date", trialDate.run(0, 15, 2013));
	}

	@Test
	public final void testRun_yearMoreThan2021_InvalidInput() {
		assertEquals("invalid Input Date", trialDate.run(3, 20, 2023));
	}

	@Test
	public final void testRun_32ndOfDecember2021_InvalidInput() {
		assertEquals("Invalid Next Year", trialDate.run(12, 32, 2021));
	}

	@Test
	public final void testRun_22ndOfOctober2020_23rdOfOctober2020() {
		assertEquals("10/23/2020", trialDate.run(10, 22, 2020));
	}

	@Test
	public final void testRun_5thOfMay2000_6thOfMay2000() {
		assertEquals("5/6/2000", trialDate.run(5, 5, 2000));
	}

	@Test
	public final void testRun_28thOfApril2000_29thOfApril2000() {
		assertEquals("4/29/2000", trialDate.run(4, 28, 2000));
	}

	@Test
	public final void testRun_23rdOfNovember2001_24thOfNovember2001() {
		assertEquals("11/24/2001", trialDate.run(11, 23, 2001));
	}

	@Test
	public final void testRun_3rdOfSeptember2003_4thOfSeptember2003() {
		assertEquals("9/4/2001", trialDate.run(9, 3, 2001));
	}
	// F94 = F78 + F86 + F94
	// F94 = 1801 <= year <= 2021 + February + day > 28		+ day !=29 + day <= 29
	// Summary: 28 < day < 29 + February	-	not possible to cover last branch
}
