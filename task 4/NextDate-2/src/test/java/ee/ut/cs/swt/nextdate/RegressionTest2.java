import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '#', (int) (byte) 10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(100, (-1), (int) (short) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) 'a', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, 10, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 1, (-1));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 1, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) -1, 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        java.lang.String str11 = nextDate3.run(0, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (-1), (int) (byte) 10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(10, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((-1), 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) '#', (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) ' ', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) 'a', 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, 10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (-1), (int) (byte) -1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.String str31 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (-1), (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (-1), 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) '#', 1, 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run(0, (int) ' ', 1);
        java.lang.String str19 = nextDate3.run(0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 0, 0);
        java.lang.String str23 = nextDate3.run(1, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) 'a', (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) '4', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 1, (int) '4');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) (short) 100);
        java.lang.String str19 = nextDate3.run(0, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(100, 0, 10);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run(0, 1, (int) (byte) 100);
        java.lang.String str31 = nextDate3.run((int) (short) -1, (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, 100);
        java.lang.String str7 = nextDate3.run((int) '4', 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 1, 100);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 0, 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 100, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run(0, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, 100);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, 100);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, 100);
        java.lang.String str7 = nextDate3.run(10, 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 10);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 100, 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run(1, 1, (int) 'a');
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 10, (int) (short) 10);
        java.lang.String str27 = nextDate3.run((int) '#', 10, (int) (byte) -1);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (-1), 10);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 100, (int) '#');
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', (int) '4');
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) 'a');
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) '#', (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (short) 1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) 'a', (int) (short) 10);
        java.lang.String str23 = nextDate3.run((-1), (int) (short) 10, (int) (short) 10);
        java.lang.String str27 = nextDate3.run((int) (byte) 1, (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 1, 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run(0, (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((-1), (int) 'a', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run(10, (int) ' ', 100);
        java.lang.String str11 = nextDate3.run(0, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', (int) (short) 1);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, 1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (byte) -1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (-1), 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) 'a', (int) (short) 10);
        java.lang.String str23 = nextDate3.run((-1), (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 1, 10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '#', 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, (int) 'a');
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', 10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((-1), 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(10, 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, 100);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (-1), (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 10, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) -1, 100);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (-1));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run(100, (int) (byte) 100, 1);
        java.lang.String str15 = nextDate3.run(0, (int) '#', 10);
        java.lang.String str19 = nextDate3.run(100, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (byte) 0, (int) '#');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, 1);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (-1));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) ' ', (int) '4');
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, 10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (-1), (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (byte) -1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, 0);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 1, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(100, (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((-1), 1, (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, 10);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 100, 100);
        java.lang.String str11 = nextDate3.run(100, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '#', (int) '#');
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.String str27 = nextDate3.run(10, 0, (int) (short) 0);
        java.lang.String str31 = nextDate3.run((int) (short) -1, (int) (byte) 100, (int) '#');
        java.lang.String str35 = nextDate3.run((int) (short) 1, 1, 0);
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 1, (int) '4');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) (short) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (short) 100, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) '#');
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) (short) 100);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) (byte) 10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) (short) 0, 0, (int) (short) 0);
        java.lang.String str31 = nextDate3.run(100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, 10);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '#', 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (byte) 1);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, (-1));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (byte) 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (short) 1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) ' ', (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (short) -1, (-1));
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) ' ', (int) ' ');
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (-1));
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) ' ', (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), 0);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 1, 10);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) ' ', (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) ' ', 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '4', (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (-1));
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (-1), (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) '4');
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((-1), 0, 100);
        java.lang.String str11 = nextDate3.run(1, (-1), (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) '4', (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, (int) (short) -1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run(100, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', 1);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (short) 100, 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) 'a', (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 1, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 100, 0);
        java.lang.String str7 = nextDate3.run(1, 100, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 1, 1);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 100, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 100, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) '4', 0, 100);
        java.lang.String str35 = nextDate3.run((int) (short) 1, (int) (short) -1, (int) (byte) 100);
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (-1), 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (-1));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (short) 100, 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 1, 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) -1, 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 100, 100);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, 100);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.String str15 = nextDate3.run(1, (int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) ' ', (int) 'a');
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 0);
        java.lang.String str11 = nextDate3.run(100, 0, 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (-1), 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 100, (int) (byte) 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) '#');
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(10, 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (short) 1, (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', 100);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) ' ', (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) -1, 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 10, 100);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '#', (int) (byte) 100);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) ' ', 10, (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (byte) -1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(10, 10, (-1));
        java.lang.String str19 = nextDate3.run((int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run(0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, 0);
        java.lang.String str7 = nextDate3.run(1, (int) 'a', (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, (int) 'a');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', 100);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) '#');
        java.lang.String str15 = nextDate3.run(10, (int) '#', 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 10, (int) (short) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) '4', (int) ' ');
        java.lang.String str27 = nextDate3.run(10, (-1), 100);
        java.lang.String str31 = nextDate3.run((int) 'a', (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '4', 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) (short) 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (short) 10);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) '#');
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run(0, 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, 1);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '#', (-1));
        java.lang.String str7 = nextDate3.run((int) (short) 10, 10, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) -1, 10);
        java.lang.String str11 = nextDate3.run(10, 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', (int) (short) -1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.String str15 = nextDate3.run(0, 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) -1, 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', (int) ' ');
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) ' ');
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 100, (int) '#');
        java.lang.String str11 = nextDate3.run(0, 10, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) 'a');
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) '#', (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(100, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (short) -1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 100, (int) (short) 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(100, (int) (short) 100, (int) (byte) -1);
        java.lang.String str27 = nextDate3.run((int) (short) -1, 10, (int) 'a');
        java.lang.String str31 = nextDate3.run((int) (byte) 100, 1, 0);
        java.lang.String str35 = nextDate3.run(100, (int) '4', (int) (byte) 10);
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) '4', (int) (short) 1, (int) ' ');
        java.lang.String str27 = nextDate3.run((int) (byte) 10, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, (int) ' ');
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, 0);
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, (-1));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, (-1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) '#');
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 10, 0);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 100, (int) (short) 10);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(1, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, 0);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) ' ', 0);
        java.lang.String str11 = nextDate3.run(100, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) ' ', 100);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (byte) 100, 1);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 1, 100);
        java.lang.String str19 = nextDate3.run(10, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 10, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(100, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 1, 0);
        java.lang.String str23 = nextDate3.run((int) '#', (int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) '4');
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) '4', (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 1, (int) ' ');
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) '#');
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), (int) (byte) 100);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((-1), 1, (-1));
        java.lang.String str15 = nextDate3.run(100, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, (int) (byte) 1);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 1, (int) ' ');
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) '#');
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, 1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', 0, 0);
        java.lang.String str19 = nextDate3.run(100, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', 0, 0);
        java.lang.String str19 = nextDate3.run(0, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((-1), (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (short) -1, (int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, 100);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '#', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), (int) (byte) 1);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) 'a');
        java.lang.String str7 = nextDate3.run((-1), (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (short) 10, (int) (short) 1);
        java.lang.String str15 = nextDate3.run(100, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 10, (int) (short) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) '4', (int) ' ');
        java.lang.String str27 = nextDate3.run(0, (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run(10, 100, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) 'a', (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(100, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, 10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 1, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.String str31 = nextDate3.run((int) (byte) 0, 0, (int) (short) -1);
        java.lang.String str35 = nextDate3.run((int) (short) 0, (int) ' ', (int) (byte) 10);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, (-1));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, (int) '4');
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) -1, 100);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', (int) '4');
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, (int) '4');
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run(10, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) ' ');
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) -1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) '#');
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', 0);
        java.lang.String str7 = nextDate3.run(0, (-1), 10);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (short) 100, 0);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 100, (int) (short) -1);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 100, 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) '4', 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '#', (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) ' ', (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (short) -1, (-1));
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) ' ', (int) ' ');
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run((int) (short) 1, 1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 1, 100);
        java.lang.String str7 = nextDate3.run(100, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '#', (int) '4');
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) '#');
        java.lang.String str11 = nextDate3.run((int) ' ', (int) '4', (-1));
        java.lang.String str15 = nextDate3.run(1, 0, (int) '4');
        java.lang.String str19 = nextDate3.run(0, (int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', (int) ' ');
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }
}

