import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run(10, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(100, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(100, (int) (short) 100, (int) (byte) -1);
        java.lang.String str27 = nextDate3.run((int) (short) -1, 10, (int) 'a');
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) -1, 100);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) 'a', 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run(0, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 1, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(100, 0, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 1, 1, (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) '#');
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) '4', (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) '4', 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 1, 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', 0, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) ' ');
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), (-1));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run(100, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 100, (int) (short) 100);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) (byte) 100, (int) (short) -1, (int) (short) 10);
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) ' ', (int) '#');
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(0, (int) '4', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 10, (int) (short) 10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 1, (int) (short) 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.String str31 = nextDate3.run((int) (short) 1, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) '#');
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) 'a', 0);
        java.lang.String str7 = nextDate3.run(0, 100, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) 'a');
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.String str27 = nextDate3.run(10, 0, (int) (short) 0);
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (byte) 10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (byte) 0, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) '4');
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 100, 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) 100);
        java.lang.String str27 = nextDate3.run((int) (short) 0, (-1), 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) -1, 10);
        java.lang.String str11 = nextDate3.run(10, 0, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run(10, (int) '4', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (-1));
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) '4', 0, 100);
        java.lang.String str35 = nextDate3.run(1, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "invalid Input Date" + "'", str35, "invalid Input Date");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (short) 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 100, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (short) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) '4');
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 100);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 1, (int) '#');
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(100, (-1), (int) (short) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) 'a', 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, 100);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', (int) 'a');
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (-1), (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) (short) 1, (int) (short) -1);
        java.lang.String str23 = nextDate3.run((-1), (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (short) 100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) -1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(1, 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', 0, 0);
        java.lang.String str19 = nextDate3.run((int) (short) -1, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) (short) -1, 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 10, (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 10, 100);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) (short) -1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, 10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, 10, (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) '#');
        java.lang.String str7 = nextDate3.run(0, 100, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (byte) 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(100, (int) (short) 100, (int) (byte) -1);
        java.lang.String str27 = nextDate3.run((int) (short) -1, 10, (int) 'a');
        java.lang.String str31 = nextDate3.run((int) (byte) 100, 1, 0);
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 1, 10);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (-1), 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (-1), (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 100, (int) (byte) 10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(0, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(10, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '4', 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(10, 10, (-1));
        java.lang.String str19 = nextDate3.run((int) (short) 0, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) 'a', (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '#', (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) 'a', (int) (short) -1);
        java.lang.String str15 = nextDate3.run(0, 10, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '#', 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', 100);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 100, (int) '4');
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (byte) -1);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) '#');
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(10, 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (-1));
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (byte) 10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 1, 0);
        java.lang.String str7 = nextDate3.run(10, (int) '4', 100);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 1);
        java.lang.String str23 = nextDate3.run((int) '#', (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(0, 100, (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 0, 10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '#', (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(10, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) 'a', 0, 1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 100, 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '#', 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (int) (short) 100);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(1, 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) 'a', 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) -1, (int) ' ');
        java.lang.String str23 = nextDate3.run(10, 0, 0);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (-1), 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) '4', 0, 100);
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 100, 100);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) '4', 0, 100);
        java.lang.String str35 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "invalid Input Date" + "'", str35, "invalid Input Date");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run(100, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 10, (int) (short) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) '4', (int) ' ');
        java.lang.String str27 = nextDate3.run(1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) 'a', (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 1, 0);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) ' ', (int) '4');
        java.lang.String str27 = nextDate3.run((int) (short) 100, (int) (byte) -1, 0);
        java.lang.String str31 = nextDate3.run(0, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run(100, (int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (short) -1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (-1), (int) (short) 10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (-1), (int) (short) 1);
        java.lang.String str7 = nextDate3.run(1, 0, 1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (-1), 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) -1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, 10, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 100, (int) (short) 100);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str11 = nextDate3.run(1, 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', (int) (short) 10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, 10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) '4');
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) 100);
        java.lang.String str27 = nextDate3.run((int) (short) -1, (int) '#', 1);
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) (byte) 1);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) ' ', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) 'a', (int) (short) -1, (int) '4');
        java.lang.String str23 = nextDate3.run((int) ' ', 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) (byte) 10, (int) '4', (int) (short) 10);
        java.lang.String str27 = nextDate3.run((int) '#', 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) ' ', (int) '4');
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (int) (short) -1, (int) ' ');
        java.lang.String str23 = nextDate3.run((-1), 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, (int) '4');
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(1, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, (int) (short) -1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 10, (int) ' ');
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, (-1));
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '4', 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 10, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(10, 10, (-1));
        java.lang.String str19 = nextDate3.run((int) (short) -1, (int) (short) -1, 10);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) 'a', 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) ' ', 0);
        java.lang.String str7 = nextDate3.run((-1), 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 10, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, (int) (byte) 100);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) '#');
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(100, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '4', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 1, 1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((-1), 0, 100);
        java.lang.String str11 = nextDate3.run(1, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) 'a');
        java.lang.String str7 = nextDate3.run(100, 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) 'a', (int) (short) -1);
        java.lang.String str15 = nextDate3.run(0, 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 1, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (short) 100, (-1), (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run(0, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '4', (int) (byte) -1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '4', 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) '4', (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(1, (int) '4', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) 'a', 0, 1);
        java.lang.String str23 = nextDate3.run(0, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 1, (int) (short) 100);
        java.lang.String str15 = nextDate3.run(0, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) 'a', 1);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }
}

