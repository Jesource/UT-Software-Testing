import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 1, (-1));
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (int) (byte) 10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 100, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, (int) '4');
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(10, (int) (byte) -1, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) '4', 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (byte) 1, (int) '4');
        java.lang.String str15 = nextDate3.run((int) '#', (int) ' ', 0);
        java.lang.String str19 = nextDate3.run(10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) -1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str15 = nextDate3.run(10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run(0, 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) (short) 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (-1), 10);
        java.lang.String str19 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run(1, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), 100);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) (byte) 10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) -1, 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, 1);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) -1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run(100, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) '#');
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, (int) 'a');
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (short) 100, (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (-1), 1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) ' ', 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, 100);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 1, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) '#', (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', 0);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run(0, (int) '4', 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, 10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, (int) '#');
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (byte) 10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, (-1));
        java.lang.String str7 = nextDate3.run(10, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '4', (int) '4');
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, 10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, (int) (short) 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) '4', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run(10, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '#', 1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) '#');
        java.lang.String str15 = nextDate3.run(1, (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 100, 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, 0);
        java.lang.String str7 = nextDate3.run(100, (int) (short) -1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, 100);
        java.lang.String str15 = nextDate3.run((int) (short) -1, 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) (byte) -1, 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(0, (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) '4', (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 1, (int) (byte) 10);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (short) 100, (-1), (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run(1, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (byte) 100, 0);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, (int) (short) 100);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 1, (-1));
        java.lang.String str11 = nextDate3.run((-1), (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) 'a', 10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(10, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) '4');
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) (short) 100, 0);
        java.lang.String str11 = nextDate3.run((int) '4', 100, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) ' ', 0, (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) (short) 10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 0, 10);
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) ' ', 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) ' ', 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 10, (-1));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) -1, 100);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) (short) 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) 'a', (int) '#');
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) ' ', (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, (-1));
        java.lang.String str11 = nextDate3.run((int) (short) -1, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', (int) 'a');
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (-1), 10);
        java.lang.String str7 = nextDate3.run((int) '4', (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 10, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, 100);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (-1), (int) ' ');
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 10, 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, 100);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run(100, (int) (byte) 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (-1));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run(10, (int) ' ', 100);
        java.lang.String str11 = nextDate3.run(0, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) '4', 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 100, (int) (short) -1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '4', (int) (short) 10);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '4', 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 1, 100);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, 1);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), (int) (short) 100);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) -1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '4', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) 'a', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) 'a', 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, 1);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) 'a', (int) (short) 10);
        java.lang.String str23 = nextDate3.run((int) (byte) -1, (int) 'a', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) '#');
        java.lang.String str7 = nextDate3.run(0, 100, 10);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) '#', (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 0, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(100, 0, 10);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', 0);
        java.lang.String str15 = nextDate3.run((int) (short) 100, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '4', (int) (short) 1);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 1, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 100, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) 'a', 0);
        java.lang.String str11 = nextDate3.run(0, 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((-1), 1, (-1));
        java.lang.String str15 = nextDate3.run(100, (int) (short) 10, (-1));
        java.lang.String str19 = nextDate3.run((-1), (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 100, (int) (byte) 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), 1);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 1, 10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) 'a');
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, 0);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (short) -1, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (short) 1);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, 100);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 10, (int) '#');
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) 'a', 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, (int) ' ');
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 100, (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(10, 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, 1);
        java.lang.String str7 = nextDate3.run(100, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(0, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 0, 1);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 10, 100);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) (byte) 1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 10, (-1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 1, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) '#', 100);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, 0);
        java.lang.String str7 = nextDate3.run(1, (int) 'a', (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (short) 0, (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 100, (int) (short) 10);
        java.lang.String str19 = nextDate3.run(1, (int) ' ', (int) (byte) 0);
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '4', (int) ' ');
        java.lang.String str11 = nextDate3.run((-1), (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 1, (int) (short) 100);
        java.lang.String str15 = nextDate3.run(0, (int) (short) -1, (-1));
        java.lang.String str19 = nextDate3.run(10, (int) (short) -1, (int) '#');
        java.lang.String str23 = nextDate3.run(0, (int) ' ', (int) (short) -1);
        java.lang.String str27 = nextDate3.run((int) (byte) 1, (-1), 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) ' ', 10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 10, 10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, 10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', (int) (short) 0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '4', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '#', 1);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), (int) (byte) -1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run(10, 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) '4', (int) (short) 10, (-1));
        java.lang.String str19 = nextDate3.run(100, (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (-1), (int) (byte) 10);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run(0, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, 100);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 10, (int) '4');
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) (short) 0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (-1));
        java.lang.String str15 = nextDate3.run(100, 10, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(100, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (-1), 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) -1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 0, 1);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) -1, (int) '4');
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(10, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), 0);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run(0, (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (byte) 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '#', 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), (int) '#');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) 100);
        java.lang.String str27 = nextDate3.run((int) (short) 0, (-1), 10);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 1, 10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 10);
        java.lang.String str7 = nextDate3.run(0, 1, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 1, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) ' ', (int) (short) 1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 1, 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 10, (int) (short) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) '4', (int) ' ');
        java.lang.String str27 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) -1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', (int) (short) 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (-1), (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) '4', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) '4', 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.String str27 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str31 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', (int) (short) 10);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) (short) 0, 0, (int) (short) 0);
        java.lang.String str31 = nextDate3.run((int) (short) 0, (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, (-1));
        java.lang.String str11 = nextDate3.run(10, 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', 0);
        java.lang.String str7 = nextDate3.run(0, (int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 1, 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) 'a', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(1, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 10, 1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((-1), 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', (int) (short) 10);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '4', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 10, (int) ' ');
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) -1, 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', (int) (short) 10);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '4', (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) '#', (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 0, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) ' ', (int) '4');
        java.lang.String str15 = nextDate3.run((int) '#', (int) '#', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) ' ', (int) '#');
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) (short) 10);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 100);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) 'a', (int) (short) -1);
        java.lang.String str15 = nextDate3.run(0, 10, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(10, (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (-1));
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, (int) 'a');
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) (short) 10);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) (short) 1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) (short) 100);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) '4', 0, 100);
        java.lang.String str35 = nextDate3.run(1, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass36 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "invalid Input Date" + "'", str35, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', 1);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 1, 100);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) -1, 10);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) ' ', (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (short) -1, (-1));
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run(0, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), (int) (byte) 10);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 100, (int) '#');
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, 1);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) 'a');
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run(10, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 100, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str27 = nextDate3.run((int) (byte) 1, (int) '4', 1);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) 'a', 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (-1));
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) -1, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) 'a', (int) '#');
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 10, (int) '#');
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 10, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }
}

