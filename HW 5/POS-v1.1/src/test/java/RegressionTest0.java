import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        shoppingCart5.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.lang.Class<?> wildcardClass2 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        soldItem20.setPrice((double) 'a');
        shoppingCart5.addItem(soldItem20);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double30 = stockItem29.getPrice();
        double double31 = stockItem29.getPrice();
        stockItem29.setDescription("");
        stockItem29.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem37 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem29, (int) (short) 100);
        double double38 = soldItem37.getSum();
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart5.addItem(soldItem37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Long.equals(Object)\" because the return value of \"ee.ut.math.tvt.salessystem.dataobjects.SoldItem.getId()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        java.lang.String str16 = soldItem13.toString();
        java.lang.Long long17 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        java.lang.Class<?> wildcardClass3 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.cancelCurrentPurchase();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        double double29 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 9700.0d + "'", double29 == 9700.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        int int11 = stockItem7.getQuantity();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        stockItem22.setPrice(10.0d);
        stockItem22.setDescription("StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "SoldItem{id=null, name='hi!'}", (double) (short) 100, (int) (short) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        java.lang.Class<?> wildcardClass16 = soldItem15.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        java.lang.String str51 = soldItem14.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str51, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        int int7 = stockItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        java.lang.Class<?> wildcardClass16 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        soldItem0.setPrice((double) 100.0f);
        java.lang.Class<?> wildcardClass5 = soldItem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '#');
        soldItem7.setQuantity((java.lang.Integer) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        stockItem5.setQuantity((int) 'a');
        stockItem5.setPrice((double) 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setPrice((double) ' ');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getSum();
        shoppingCart3.addItem(soldItem17);
        shoppingCart3.submitCurrentPurchase();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem5.setName("");
        java.lang.String str8 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=null, name='null'}", "StockItem{id=null, name='null'}", (double) (short) 1, 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        soldItem22.setPrice((double) 'a');
        java.lang.String str25 = soldItem22.toString();
        shoppingCart5.addItem(soldItem22);
        double double27 = soldItem22.getSum();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 9700.0d + "'", double27 == 9700.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.Class<?> wildcardClass29 = stockItem22.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        java.lang.Class<?> wildcardClass14 = stockItem9.getClass();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        double double51 = stockItem39.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=null, name='hi!'}", "StockItem{id=null, name='null'}", (double) (short) 10, (int) '#');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "SoldItem{id=null, name='hi!'}", "", 10.0d, 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        shoppingCart5.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str9 = stockItem8.getDescription();
        stockItem8.setQuantity(10);
        stockItem8.setQuantity((int) (byte) 0);
        stockItem8.setQuantity((int) 'a');
        inMemorySalesSystemDAO0.saveStockItem(stockItem8);
        java.lang.String str17 = stockItem8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str17, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) (byte) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        stockItem21.setQuantity((int) (byte) 1);
        stockItem21.setQuantity(1);
        int int27 = stockItem21.getQuantity();
        double double28 = stockItem21.getPrice();
        int int29 = stockItem21.getQuantity();
        soldItem13.setStockItem(stockItem21);
        soldItem13.setName("SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        soldItem13.setPrice(100.0d);
        double double17 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10000.0d + "'", double17 == 10000.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        java.lang.String str17 = soldItem14.getName();
        java.lang.String str18 = soldItem14.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double13 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 10);
        java.lang.String str16 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str16, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=null, name='hi!'}", "SoldItem{id=1, name='null'}", 0.0d, (int) (byte) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) (short) 0);
        double double18 = soldItem13.getPrice();
        java.lang.Long long19 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        soldItem13.setPrice(100.0d);
        double double17 = soldItem13.getPrice();
        double double18 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10000.0d + "'", double18 == 10000.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        java.lang.String str10 = stockItem5.getDescription();
        stockItem5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        org.junit.Assert.assertNull(stockItem5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart11 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) (short) 0);
        soldItem13.setQuantity((java.lang.Integer) 32);
        java.lang.Long long20 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setQuantity(1);
        stockItem5.setQuantity(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "StockItem{id=0, name='hi!'}", (double) 10, 1);
        stockItem5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        stockItem24.setId((java.lang.Long) 0L);
        java.lang.String str28 = stockItem24.getName();
        stockItem24.setDescription("StockItem{id=0, name='hi!'}");
        stockItem24.setQuantity((int) '4');
        stockItem24.setName("hi!");
        soldItem14.setStockItem(stockItem24);
        double double36 = stockItem24.getPrice();
        stockItem24.setName("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        java.lang.Class<?> wildcardClass4 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        soldItem13.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "SoldItem{id=1, name='null'}", "SoldItem{id=1, name='null'}", (double) '#', (int) 'a');
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO13 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO13.rollbackTransaction();
        inMemorySalesSystemDAO13.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        inMemorySalesSystemDAO13.saveSoldItem(soldItem16);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart18 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart18.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart18.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart18.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double28 = stockItem27.getPrice();
        double double29 = stockItem27.getPrice();
        stockItem27.setDescription("");
        stockItem27.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem35 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem27, (int) (short) 100);
        soldItem35.setPrice((double) 'a');
        java.lang.String str38 = soldItem35.toString();
        shoppingCart18.addItem(soldItem35);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem45 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double46 = stockItem45.getPrice();
        stockItem45.setQuantity((int) (byte) 1);
        stockItem45.setQuantity(1);
        int int51 = stockItem45.getQuantity();
        soldItem35.setStockItem(stockItem45);
        java.lang.String str53 = stockItem45.getDescription();
        inMemorySalesSystemDAO0.saveStockItem(stockItem45);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList55 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNotNull(soldItemList19);
        org.junit.Assert.assertNotNull(soldItemList20);
        org.junit.Assert.assertNotNull(soldItemList21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str38, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(stockItemList55);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem24.setName("");
        soldItem14.setStockItem(stockItem24);
        java.lang.String str28 = stockItem24.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "StockItem{id=1, name=''}" + "'", str28, "StockItem{id=1, name=''}");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=null, name='null'}", "SoldItem{id=1, name='null'}", 100.0d, (int) 'a');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem(10L);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(stockItem15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        stockItem5.setDescription("SoldItem{id=1, name='null'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertNotNull(stockItemList5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double13 = stockItem5.getPrice();
        stockItem5.setDescription("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        stockItem12.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem12);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setQuantity(1);
        stockItem5.setQuantity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        double double17 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = soldItem13.getStockItem();
        java.lang.String str19 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setQuantity((java.lang.Integer) 97);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        java.lang.String str16 = soldItem13.toString();
        java.lang.String str17 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str17, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem39, (int) (short) 0);
        java.lang.Class<?> wildcardClass55 = soldItem54.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        java.lang.Class<?> wildcardClass5 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(stockItemList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        double double33 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-97.0d) + "'", double33 == (-97.0d));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double21 = stockItem20.getPrice();
        int int22 = stockItem20.getQuantity();
        double double23 = stockItem20.getPrice();
        soldItem13.setStockItem(stockItem20);
        java.lang.String str25 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        double double17 = soldItem13.getSum();
        soldItem13.setPrice(10000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        java.lang.Class<?> wildcardClass5 = stockItemList4.getClass();
        org.junit.Assert.assertNotNull(stockItemList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "SoldItem{id=1, name='hi!'}", (double) 100.0f, 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        stockItem5.setName("hi!");
        stockItem5.setPrice((double) (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        double double29 = soldItem24.getSum();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 9700.0d + "'", double29 == 9700.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        double double21 = soldItem20.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem20);
        soldItem20.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double31 = stockItem30.getPrice();
        stockItem30.setId((java.lang.Long) 0L);
        java.lang.String str34 = stockItem30.getName();
        stockItem30.setDescription("StockItem{id=0, name='hi!'}");
        stockItem30.setQuantity((int) '4');
        stockItem30.setName("hi!");
        soldItem20.setStockItem(stockItem30);
        java.lang.String str42 = soldItem20.getName();
        double double43 = soldItem20.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem20);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = inMemorySalesSystemDAO0.findStockItem(1L);
        java.lang.Class<?> wildcardClass47 = stockItem46.getClass();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 10);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        stockItem0.setQuantity((-1));
        int int3 = stockItem0.getQuantity();
        stockItem0.setPrice((double) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        java.lang.String str8 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        int int26 = stockItem24.getQuantity();
        double double27 = stockItem24.getPrice();
        stockItem24.setQuantity(1);
        stockItem24.setName("StockItem{id=0, name='hi!'}");
        soldItem14.setStockItem(stockItem24);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = soldItem14.getStockItem();
        soldItem14.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem33);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        java.lang.String str1 = soldItem0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SoldItem{id=null, name='null'}" + "'", str1, "SoldItem{id=null, name='null'}");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double12 = stockItem11.getPrice();
        double double13 = stockItem11.getPrice();
        stockItem11.setDescription("");
        stockItem11.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem11, (int) (short) 100);
        double double20 = soldItem19.getPrice();
        java.lang.String str21 = soldItem19.getName();
        soldItem19.setPrice((double) 1);
        java.lang.String str24 = soldItem19.toString();
        shoppingCart5.addItem(soldItem19);
        soldItem19.setPrice((-97.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str24, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 10);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        double double16 = soldItem15.getSum();
        soldItem15.setName("StockItem{id=null, name='null'}");
        java.lang.Long long19 = soldItem15.getId();
        double double20 = soldItem15.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        soldItem22.setPrice((double) 'a');
        java.lang.String str25 = soldItem22.toString();
        shoppingCart5.addItem(soldItem22);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem32 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double33 = stockItem32.getPrice();
        stockItem32.setQuantity((int) (byte) 1);
        stockItem32.setQuantity(1);
        int int38 = stockItem32.getQuantity();
        soldItem22.setStockItem(stockItem32);
        java.lang.String str40 = stockItem32.getDescription();
        stockItem32.setPrice((double) (byte) -1);
        java.lang.String str43 = stockItem32.getName();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        java.lang.Long long16 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        java.lang.String str26 = stockItem22.getName();
        stockItem22.setDescription("StockItem{id=0, name='hi!'}");
        stockItem22.setQuantity((int) '4');
        java.lang.String str31 = stockItem22.getName();
        soldItem13.setStockItem(stockItem22);
        soldItem13.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getSum();
        shoppingCart3.addItem(soldItem17);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = soldItem17.getStockItem();
        java.lang.String str21 = soldItem17.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setId((java.lang.Long) 1L);
        int int12 = stockItem5.getQuantity();
        stockItem5.setQuantity((int) '#');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setDescription("hi!");
        double double11 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        soldItem12.setName("SoldItem{id=null, name='null'}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem11, 10);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        stockItem5.setQuantity((int) 'a');
        stockItem5.setName("");
        int int15 = stockItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        double double9 = stockItem5.getPrice();
        double double10 = stockItem5.getPrice();
        stockItem5.setName("SoldItem{id=null, name='null'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        double double19 = soldItem14.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setName("StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        stockItem24.setId((java.lang.Long) 0L);
        java.lang.String str28 = stockItem24.getName();
        stockItem24.setDescription("StockItem{id=0, name='hi!'}");
        stockItem24.setQuantity((int) '4');
        stockItem24.setName("hi!");
        soldItem14.setStockItem(stockItem24);
        soldItem14.setId((java.lang.Long) 1L);
        double double38 = soldItem14.getSum();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        int int14 = stockItem5.getQuantity();
        stockItem5.setPrice(97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 100);
        org.junit.Assert.assertNull(stockItem15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.toString();
        java.lang.Class<?> wildcardClass7 = stockItem5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str6, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        int int37 = stockItem35.getQuantity();
        double double38 = stockItem35.getPrice();
        stockItem35.setQuantity(1);
        stockItem35.setName("StockItem{id=null, name='null'}");
        soldItem13.setStockItem(stockItem35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", (double) 100L, (int) (short) 100);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=null, name='hi!'}", "StockItem{id=1, name=''}", 0.0d, (int) (byte) 100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem39, (int) (short) 0);
        java.lang.String str55 = soldItem54.toString();
        soldItem54.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str55, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        stockItem24.setId((java.lang.Long) 0L);
        java.lang.String str28 = stockItem24.getName();
        stockItem24.setDescription("StockItem{id=0, name='hi!'}");
        stockItem24.setQuantity((int) '4');
        stockItem24.setName("hi!");
        soldItem14.setStockItem(stockItem24);
        soldItem14.setId((java.lang.Long) 1L);
        soldItem14.setName("hi!");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem40 = soldItem14.getStockItem();
        int int41 = stockItem40.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(stockItem40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int20 = stockItem19.getQuantity();
        double double21 = stockItem19.getPrice();
        java.lang.String str22 = stockItem19.getDescription();
        inMemorySalesSystemDAO0.saveStockItem(stockItem19);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str22, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList13 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = soldItem2.getStockItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertNull(stockItem9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        stockItem24.setId((java.lang.Long) 0L);
        java.lang.String str28 = stockItem24.getName();
        stockItem24.setDescription("StockItem{id=0, name='hi!'}");
        stockItem24.setQuantity((int) '4');
        stockItem24.setName("hi!");
        soldItem14.setStockItem(stockItem24);
        double double36 = stockItem24.getPrice();
        stockItem24.setPrice((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        soldItem12.setName("SoldItem{id=1, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        soldItem12.setPrice((double) 1L);
        double double15 = soldItem12.getPrice();
        double double16 = soldItem12.getSum();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        double double17 = soldItem14.getPrice();
        soldItem14.setName("");
        double double20 = soldItem14.getSum();
        java.lang.String str21 = soldItem14.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SoldItem{id=null, name=''}" + "'", str21, "SoldItem{id=null, name=''}");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        java.lang.String str8 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str8, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setDescription("hi!");
        java.lang.String str11 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        java.lang.String str1 = stockItem0.toString();
        java.lang.String str2 = stockItem0.getDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "StockItem{id=null, name='null'}" + "'", str1, "StockItem{id=null, name='null'}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        stockItem22.setPrice(10.0d);
        stockItem22.setPrice((double) '#');
        java.lang.String str35 = stockItem22.toString();
        stockItem22.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str35, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "StockItem{id=0, name='hi!'}", (double) 10, 1);
        stockItem5.setName("");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ee.ut.math.tvt.salessystem.dataobjects.StockItem.getName()\" because \"stockItem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        soldItem13.setPrice(100.0d);
        soldItem13.setQuantity((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.lang.Class<?> wildcardClass8 = soldItemList7.getClass();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str14 = stockItem5.getDescription();
        java.lang.Class<?> wildcardClass15 = stockItem5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        stockItem22.setPrice(10.0d);
        stockItem22.setPrice((double) '#');
        stockItem22.setName("SoldItem{id=null, name='hi!'}");
        double double37 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = soldItem24.getStockItem();
        java.lang.Class<?> wildcardClass30 = soldItem24.getClass();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNull(stockItem5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        double double16 = soldItem15.getSum();
        soldItem15.setName("StockItem{id=null, name='null'}");
        java.lang.Long long19 = soldItem15.getId();
        java.lang.String str20 = soldItem15.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SoldItem{id=null, name='StockItem{id=null, name='null'}'}" + "'", str20, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setQuantity(1);
        int int11 = stockItem5.getQuantity();
        stockItem5.setName("");
        java.lang.String str14 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        java.lang.String str27 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double12 = stockItem11.getPrice();
        double double13 = stockItem11.getPrice();
        stockItem11.setDescription("");
        stockItem11.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem11, (int) (short) 100);
        soldItem19.setPrice((double) 'a');
        java.lang.String str22 = soldItem19.toString();
        soldItem19.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem19);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem18);
        java.lang.String str21 = soldItem18.getName();
        soldItem18.setQuantity((java.lang.Integer) 10);
        shoppingCart3.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList25 = shoppingCart3.getAll();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(soldItemList25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 5200.0d, (int) (short) 100);
        stockItem5.setPrice((double) 100);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", (double) (byte) 1, 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "", "StockItem{id=1, name=''}", (double) 32, 97);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        double double32 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setDescription("SoldItem{id=null, name='hi!'}");
        stockItem5.setPrice((double) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=1, name='null'}", "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", (double) 10L, (int) (byte) 1);
        java.lang.String str6 = stockItem5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=0, name='SoldItem{id=1, name='null'}'}" + "'", str6, "StockItem{id=0, name='SoldItem{id=1, name='null'}'}");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem(100L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 100);
        org.junit.Assert.assertNull(stockItem5);
        org.junit.Assert.assertNull(stockItem7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        java.lang.String str8 = soldItem7.toString();
        soldItem7.setName("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=null, name='StockItem{id=null, name='null'}'}" + "'", str8, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setPrice((double) (byte) 100);
        java.lang.Class<?> wildcardClass14 = stockItem5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        shoppingCart5.cancelCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        java.lang.Class<?> wildcardClass10 = shoppingCart5.getClass();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        java.lang.Class<?> wildcardClass33 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getName();
        stockItem5.setDescription("hi!");
        int int9 = stockItem5.getQuantity();
        java.lang.String str10 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNotNull(stockItemList3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        java.lang.String str1 = stockItem0.toString();
        stockItem0.setId((java.lang.Long) 100L);
        double double4 = stockItem0.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "StockItem{id=null, name='null'}" + "'", str1, "StockItem{id=null, name='null'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem5);
        org.junit.Assert.assertNotNull(stockItemList4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setQuantity((int) (short) 10);
        java.lang.String str16 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str16, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setName("StockItem{id=null, name='null'}");
        stockItem5.setName("SoldItem{id=1, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        shoppingCart2.submitCurrentPurchase();
        shoppingCart2.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        double double18 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        java.lang.String str8 = soldItem7.toString();
        double double9 = soldItem7.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=null, name='StockItem{id=null, name='null'}'}" + "'", str8, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        double double17 = soldItem13.getSum();
        soldItem13.setPrice((double) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        soldItem20.setPrice((double) 'a');
        shoppingCart5.addItem(soldItem20);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO24 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double31 = stockItem30.getPrice();
        double double32 = stockItem30.getPrice();
        stockItem30.setDescription("");
        stockItem30.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem38 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem30, (int) (short) 100);
        double double39 = soldItem38.getPrice();
        inMemorySalesSystemDAO24.saveSoldItem(soldItem38);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double47 = stockItem46.getPrice();
        double double48 = stockItem46.getPrice();
        stockItem46.setDescription("");
        stockItem46.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem46, (int) (short) 100);
        soldItem54.setPrice((double) 'a');
        java.lang.String str57 = soldItem54.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem63 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double64 = stockItem63.getPrice();
        double double65 = stockItem63.getPrice();
        stockItem63.setDescription("");
        stockItem63.setQuantity((int) (short) 10);
        stockItem63.setId((java.lang.Long) 10L);
        int int72 = stockItem63.getQuantity();
        soldItem54.setStockItem(stockItem63);
        soldItem38.setStockItem(stockItem63);
        stockItem63.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem78 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem63, (int) (short) 0);
        java.lang.Long long79 = soldItem78.getId();
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart5.addItem(soldItem78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Long.equals(Object)\" because the return value of \"ee.ut.math.tvt.salessystem.dataobjects.SoldItem.getId()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str57, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNull(long79);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem24.setName("");
        soldItem14.setStockItem(stockItem24);
        stockItem24.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem13.getStockItem();
        java.lang.Long long28 = soldItem13.getId();
        double double29 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        shoppingCart5.addItem(soldItem21);
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        java.lang.String str53 = stockItem39.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        java.lang.String str8 = stockItem5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=100, name='StockItem{id=null, name='null'}'}" + "'", str8, "StockItem{id=100, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "SoldItem{id=1, name='null'}", (double) (short) 10, 10);
        java.lang.String str6 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str6, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setDescription("SoldItem{id=null, name='hi!'}");
        stockItem5.setId((java.lang.Long) 100L);
        java.lang.String str18 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StockItem{id=100, name='hi!'}" + "'", str18, "StockItem{id=100, name='hi!'}");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        stockItem0.setQuantity((-1));
        int int3 = stockItem0.getQuantity();
        java.lang.String str4 = stockItem0.getDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        soldItem17.setQuantity((java.lang.Integer) (-1));
        soldItem17.setId((java.lang.Long) 0L);
        java.lang.String str22 = soldItem17.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        double double30 = stockItem28.getPrice();
        stockItem28.setDescription("");
        stockItem28.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem36 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem28, (int) (short) 100);
        double double37 = soldItem36.getPrice();
        java.lang.String str38 = soldItem36.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem44 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double45 = stockItem44.getPrice();
        double double46 = stockItem44.getPrice();
        stockItem44.setDescription("hi!");
        soldItem36.setStockItem(stockItem44);
        stockItem44.setId((java.lang.Long) 10L);
        stockItem44.setQuantity((int) (short) 1);
        soldItem17.setStockItem(stockItem44);
        soldItem17.setPrice((double) (-1L));
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem57 = soldItem17.getStockItem();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str22, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem57);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem13.getStockItem();
        java.lang.Long long28 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = soldItem13.getStockItem();
        java.lang.String str30 = stockItem29.getName();
        double double31 = stockItem29.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(stockItem29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}", "SoldItem{id=1, name='null'}", 10000.0d, 0);
        stockItem5.setQuantity(97);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        double double13 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "SoldItem{id=1, name='null'}", "SoldItem{id=1, name='hi!'}", (double) ' ', 97);
        java.lang.String str6 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str6, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        double double16 = soldItem15.getSum();
        soldItem15.setName("StockItem{id=null, name='null'}");
        soldItem15.setName("SoldItem{id=1, name='hi!'}");
        soldItem15.setPrice((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        stockItem5.setPrice((double) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        soldItem16.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass19 = soldItem16.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        stockItem24.setId((java.lang.Long) 0L);
        java.lang.String str28 = stockItem24.getName();
        stockItem24.setDescription("StockItem{id=0, name='hi!'}");
        stockItem24.setQuantity((int) '4');
        stockItem24.setName("hi!");
        soldItem14.setStockItem(stockItem24);
        soldItem14.setId((java.lang.Long) 1L);
        soldItem14.setName("hi!");
        double double40 = soldItem14.getPrice();
        java.lang.String str41 = soldItem14.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "Lays chips", "StockItem{id=0, name='SoldItem{id=1, name='null'}'}", (double) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        inMemorySalesSystemDAO0.rollbackTransaction();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "hi!", "StockItem{id=1, name=''}", (double) 0L, (int) (byte) 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        double double17 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 9700.0d + "'", double17 == 9700.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem((long) 10);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNull(stockItem5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO13 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO13.rollbackTransaction();
        inMemorySalesSystemDAO13.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        inMemorySalesSystemDAO13.saveSoldItem(soldItem16);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart18 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart18.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart18.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart18.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double28 = stockItem27.getPrice();
        double double29 = stockItem27.getPrice();
        stockItem27.setDescription("");
        stockItem27.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem35 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem27, (int) (short) 100);
        soldItem35.setPrice((double) 'a');
        java.lang.String str38 = soldItem35.toString();
        shoppingCart18.addItem(soldItem35);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem45 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double46 = stockItem45.getPrice();
        stockItem45.setQuantity((int) (byte) 1);
        stockItem45.setQuantity(1);
        int int51 = stockItem45.getQuantity();
        soldItem35.setStockItem(stockItem45);
        java.lang.String str53 = stockItem45.getDescription();
        inMemorySalesSystemDAO0.saveStockItem(stockItem45);
        java.lang.Class<?> wildcardClass55 = stockItem45.getClass();
        org.junit.Assert.assertNotNull(soldItemList19);
        org.junit.Assert.assertNotNull(soldItemList20);
        org.junit.Assert.assertNotNull(soldItemList21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str38, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        java.lang.String str12 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        java.lang.Class<?> wildcardClass29 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setQuantity((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass3 = soldItem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = inMemorySalesSystemDAO0.findStockItem((long) (byte) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = null;
        inMemorySalesSystemDAO0.saveStockItem(stockItem14);
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart17 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNull(stockItem13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem3.setId((java.lang.Long) 1L);
        soldItem3.setPrice((double) 100.0f);
        soldItem3.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = inMemorySalesSystemDAO0.findStockItem((long) 10);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart5.getAll();
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=null, name='null'}", "SoldItem{id=null, name='null'}", (double) 1.0f, 97);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getPrice();
        java.lang.String str19 = soldItem17.getName();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem17);
        soldItem17.setQuantity((java.lang.Integer) 1);
        double double23 = soldItem17.getSum();
        java.lang.String str24 = soldItem17.getName();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        stockItem24.setId((java.lang.Long) 0L);
        java.lang.String str28 = stockItem24.getName();
        stockItem24.setDescription("StockItem{id=0, name='hi!'}");
        stockItem24.setQuantity((int) '4');
        stockItem24.setName("hi!");
        soldItem14.setStockItem(stockItem24);
        java.lang.String str36 = soldItem14.getName();
        java.lang.String str37 = soldItem14.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        java.lang.Class<?> wildcardClass14 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO29 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        double double37 = stockItem35.getPrice();
        stockItem35.setDescription("");
        stockItem35.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem35, (int) (short) 100);
        double double44 = soldItem43.getPrice();
        inMemorySalesSystemDAO29.saveSoldItem(soldItem43);
        soldItem43.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem53 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem53.setName("");
        soldItem43.setStockItem(stockItem53);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem43);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem60 = inMemorySalesSystemDAO0.findStockItem((-1L));
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNull(stockItem60);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setQuantity((java.lang.Integer) 97);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = soldItem2.getStockItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertNull(stockItem11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        shoppingCart2.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart2.getAll();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "SoldItem{id=1, name='hi!'}", "hi!", (-1.0d), 32);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem((long) (short) 0);
        org.junit.Assert.assertNull(stockItem8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setQuantity((java.lang.Integer) 1);
        soldItem0.setId((java.lang.Long) 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", "SoldItem{id=null, name='hi!'}", (double) (byte) -1, (int) '#');
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        stockItem5.setPrice((double) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        int int17 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        stockItem5.setQuantity((int) (byte) 10);
        double double13 = stockItem5.getPrice();
        stockItem5.setPrice((-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        double double21 = soldItem20.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem20);
        soldItem20.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double31 = stockItem30.getPrice();
        stockItem30.setId((java.lang.Long) 0L);
        java.lang.String str34 = stockItem30.getName();
        stockItem30.setDescription("StockItem{id=0, name='hi!'}");
        stockItem30.setQuantity((int) '4');
        stockItem30.setName("hi!");
        soldItem20.setStockItem(stockItem30);
        java.lang.String str42 = soldItem20.getName();
        double double43 = soldItem20.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem20);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = inMemorySalesSystemDAO0.findStockItem(1L);
        java.lang.String str47 = stockItem46.getName();
        java.lang.String str48 = stockItem46.getName();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Lays chips" + "'", str47, "Lays chips");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Lays chips" + "'", str48, "Lays chips");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=100, name='StockItem{id=null, name='null'}'}", "StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}", 5200.0d, (int) (byte) -1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '#');
        stockItem5.setDescription("SoldItem{id=1, name='hi!'}");
        java.lang.String str10 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str10, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        stockItem16.setQuantity((int) (byte) 1);
        stockItem16.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (byte) -1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem16);
        stockItem16.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "SoldItem{id=1, name='null'}", "StockItem{id=0, name='SoldItem{id=1, name='null'}'}", (double) 'a', (int) (short) 1);
        stockItem5.setName("");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem5.setName("");
        stockItem5.setQuantity((-1));
        double double10 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "SoldItem{id=1, name='hi!'}", "StockItem{id=0, name='hi!'}", (double) 0.0f, (int) (byte) 100);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO29 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        double double37 = stockItem35.getPrice();
        stockItem35.setDescription("");
        stockItem35.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem35, (int) (short) 100);
        double double44 = soldItem43.getPrice();
        inMemorySalesSystemDAO29.saveSoldItem(soldItem43);
        soldItem43.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem53 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem53.setName("");
        soldItem43.setStockItem(stockItem53);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem43);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList59 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem65 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int66 = stockItem65.getQuantity();
        double double67 = stockItem65.getPrice();
        java.lang.String str68 = stockItem65.getDescription();
        inMemorySalesSystemDAO0.saveStockItem(stockItem65);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str68, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        int int14 = stockItem5.getQuantity();
        java.lang.String str15 = stockItem5.getDescription();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str18 = stockItem5.getName();
        java.lang.String str19 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str19, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) -1);
        java.lang.String str17 = stockItem7.getName();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNull(stockItem3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        stockItem22.setPrice(10.0d);
        stockItem22.setPrice((double) '#');
        int int35 = stockItem22.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        shoppingCart5.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem9.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = soldItem9.getStockItem();
        soldItem9.setPrice(0.0d);
        shoppingCart5.addItem(soldItem9);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        double double19 = stockItem17.getPrice();
        stockItem17.setDescription("");
        stockItem17.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem25 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, (int) (short) 100);
        double double26 = soldItem25.getPrice();
        java.lang.String str27 = soldItem25.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double34 = stockItem33.getPrice();
        double double35 = stockItem33.getPrice();
        stockItem33.setDescription("hi!");
        soldItem25.setStockItem(stockItem33);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = soldItem25.getStockItem();
        java.lang.Long long40 = soldItem25.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem41 = soldItem25.getStockItem();
        inMemorySalesSystemDAO0.saveStockItem(stockItem41);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem39);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNotNull(stockItem41);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=10, name='hi!'}", "SoldItem{id=null, name='null'}", (double) 10.0f, (int) (short) 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=1, name='null'}", "StockItem{id=0, name='SoldItem{id=1, name='null'}'}", (double) 0.0f, 32);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem32 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (byte) 1);
        java.lang.Long long33 = soldItem32.getId();
        java.lang.String str34 = soldItem32.toString();
        soldItem32.setName("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(long33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str34, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int6 = stockItem5.getQuantity();
        double double7 = stockItem5.getPrice();
        java.lang.String str8 = stockItem5.getDescription();
        stockItem5.setDescription("SoldItem{id=1, name='null'}");
        stockItem5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str8, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem3.setId((java.lang.Long) 1L);
        soldItem3.setPrice((double) 100.0f);
        soldItem3.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = inMemorySalesSystemDAO0.findStockItem(0L);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart13 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO11 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        double double19 = stockItem17.getPrice();
        stockItem17.setDescription("");
        stockItem17.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem25 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, (int) (short) 100);
        double double26 = soldItem25.getPrice();
        inMemorySalesSystemDAO11.saveSoldItem(soldItem25);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double34 = stockItem33.getPrice();
        stockItem33.setQuantity((int) (byte) 1);
        stockItem33.setPrice((double) ' ');
        stockItem33.setQuantity((int) (byte) 10);
        soldItem25.setStockItem(stockItem33);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem33, (int) (byte) 1);
        java.lang.Long long44 = soldItem43.getId();
        shoppingCart5.addItem(soldItem43);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(long44);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        shoppingCart2.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem1 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem1.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = soldItem1.getStockItem();
        soldItem1.setName("hi!");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        stockItem13.setId((java.lang.Long) 10L);
        int int22 = stockItem13.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem13);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart2.addItem(soldItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ee.ut.math.tvt.salessystem.dataobjects.SoldItem.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setQuantity((int) (short) 10);
        java.lang.String str16 = stockItem5.getName();
        int int17 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "SoldItem{id=null, name='hi!'}", (double) 'a', 97);
        double double6 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = soldItem2.getStockItem();
        soldItem2.setPrice((double) 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertNull(stockItem11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        java.lang.String str1 = soldItem0.getName();
        java.lang.Integer int2 = soldItem0.getQuantity();
        soldItem0.setName("StockItem{id=1, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart9.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        soldItem17.setQuantity((java.lang.Integer) (-1));
        soldItem17.setId((java.lang.Long) 0L);
        java.lang.String str22 = soldItem17.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        double double30 = stockItem28.getPrice();
        stockItem28.setDescription("");
        stockItem28.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem36 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem28, (int) (short) 100);
        double double37 = soldItem36.getPrice();
        java.lang.String str38 = soldItem36.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem44 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double45 = stockItem44.getPrice();
        double double46 = stockItem44.getPrice();
        stockItem44.setDescription("hi!");
        soldItem36.setStockItem(stockItem44);
        stockItem44.setId((java.lang.Long) 10L);
        stockItem44.setQuantity((int) (short) 1);
        soldItem17.setStockItem(stockItem44);
        soldItem17.setQuantity((java.lang.Integer) 10);
        double double57 = soldItem17.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str22, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=1, name='hi!'}", "SoldItem{id=1, name='hi!'}", (double) 1, (int) (short) 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setName("");
        stockItem7.setQuantity((int) '4');
        stockItem7.setPrice((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setName("");
        java.lang.String str13 = stockItem7.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StockItem{id=0, name=''}" + "'", str13, "StockItem{id=0, name=''}");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        soldItem2.setPrice((double) 97);
        double double13 = soldItem2.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem38 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int39 = stockItem38.getQuantity();
        java.lang.String str40 = stockItem38.getName();
        stockItem38.setPrice((double) (short) 1);
        soldItem13.setStockItem(stockItem38);
        soldItem13.setQuantity((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StockItem{id=null, name='null'}" + "'", str40, "StockItem{id=null, name='null'}");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        stockItem0.setQuantity((-1));
        int int3 = stockItem0.getQuantity();
        int int4 = stockItem0.getQuantity();
        stockItem0.setName("hi!");
        java.lang.Long long7 = stockItem0.getId();
        java.lang.String str8 = stockItem0.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        soldItem13.setPrice(9700.0d);
        java.lang.Class<?> wildcardClass19 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem24.setName("");
        soldItem14.setStockItem(stockItem24);
        stockItem24.setPrice((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setQuantity((int) (short) 10);
        java.lang.String str16 = stockItem5.getName();
        java.lang.String str17 = stockItem5.getName();
        double double18 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO6.rollbackTransaction();
        inMemorySalesSystemDAO6.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        inMemorySalesSystemDAO6.saveSoldItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList11 = inMemorySalesSystemDAO6.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        double double27 = soldItem26.getPrice();
        inMemorySalesSystemDAO12.saveSoldItem(soldItem26);
        soldItem26.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        stockItem36.setId((java.lang.Long) 0L);
        java.lang.String str40 = stockItem36.getName();
        stockItem36.setDescription("StockItem{id=0, name='hi!'}");
        stockItem36.setQuantity((int) '4');
        stockItem36.setName("hi!");
        soldItem26.setStockItem(stockItem36);
        java.lang.String str48 = soldItem26.getName();
        double double49 = soldItem26.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem26);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem52 = inMemorySalesSystemDAO6.findStockItem(1L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem52);
        stockItem52.setPrice((double) 0.0f);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO7 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        inMemorySalesSystemDAO7.saveSoldItem(soldItem21);
        soldItem21.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        stockItem31.setId((java.lang.Long) 0L);
        java.lang.String str35 = stockItem31.getName();
        stockItem31.setDescription("StockItem{id=0, name='hi!'}");
        stockItem31.setQuantity((int) '4');
        stockItem31.setName("hi!");
        soldItem21.setStockItem(stockItem31);
        java.lang.String str43 = soldItem21.getName();
        shoppingCart5.addItem(soldItem21);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem50 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double51 = stockItem50.getPrice();
        stockItem50.setId((java.lang.Long) 0L);
        java.lang.String str54 = stockItem50.getName();
        stockItem50.setDescription("StockItem{id=0, name='hi!'}");
        stockItem50.setQuantity((int) '4');
        stockItem50.setName("StockItem{id=null, name='null'}");
        soldItem21.setStockItem(stockItem50);
        stockItem50.setName("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem38 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int39 = stockItem38.getQuantity();
        java.lang.String str40 = stockItem38.getName();
        stockItem38.setPrice((double) (short) 1);
        soldItem13.setStockItem(stockItem38);
        java.lang.String str44 = stockItem38.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StockItem{id=null, name='null'}" + "'", str40, "StockItem{id=null, name='null'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "StockItem{id=100, name='StockItem{id=null, name='null'}'}" + "'", str44, "StockItem{id=100, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        java.lang.String str13 = stockItem9.getName();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        java.lang.String str11 = soldItem2.toString();
        soldItem2.setName("SoldItem{id=1, name='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str11, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "SoldItem{id=null, name='hi!'}", (double) 100L, (int) 'a');
        java.lang.String str6 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str6, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        soldItem22.setPrice((double) 'a');
        java.lang.String str25 = soldItem22.toString();
        shoppingCart5.addItem(soldItem22);
        java.lang.String str27 = soldItem22.toString();
        soldItem22.setPrice((double) (short) 100);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str27, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        stockItem21.setId((java.lang.Long) 10L);
        java.lang.String str29 = stockItem21.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getName();
        java.lang.String str7 = stockItem5.getDescription();
        stockItem5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO7 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        inMemorySalesSystemDAO7.saveSoldItem(soldItem21);
        soldItem21.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        stockItem31.setId((java.lang.Long) 0L);
        java.lang.String str35 = stockItem31.getName();
        stockItem31.setDescription("StockItem{id=0, name='hi!'}");
        stockItem31.setQuantity((int) '4');
        stockItem31.setName("hi!");
        soldItem21.setStockItem(stockItem31);
        java.lang.String str43 = soldItem21.getName();
        shoppingCart5.addItem(soldItem21);
        java.lang.String str45 = soldItem21.toString();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "SoldItem{id=0, name='hi!'}" + "'", str45, "SoldItem{id=0, name='hi!'}");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        soldItem13.setQuantity((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        java.lang.String str14 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str14, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        soldItem20.setPrice((double) 'a');
        shoppingCart5.addItem(soldItem20);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList24 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList25 = shoppingCart5.getAll();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(soldItemList24);
        org.junit.Assert.assertNotNull(soldItemList25);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = inMemorySalesSystemDAO0.findStockItem((long) 'a');
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(stockItem13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        soldItem24.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        java.lang.String str33 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = soldItem13.getStockItem();
        stockItem34.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(stockItem34);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getSum();
        shoppingCart3.addItem(soldItem17);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart3.getAll();
        java.lang.Class<?> wildcardClass21 = soldItemList20.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(soldItemList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem(0L);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem18);
        soldItem18.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        int int30 = stockItem28.getQuantity();
        double double31 = stockItem28.getPrice();
        stockItem28.setQuantity(1);
        stockItem28.setName("StockItem{id=0, name='hi!'}");
        soldItem18.setStockItem(stockItem28);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList38 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList38);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem21.setId((java.lang.Long) 10L);
        soldItem13.setStockItem(stockItem21);
        double double25 = soldItem13.getSum();
        soldItem13.setPrice((double) 10.0f);
        soldItem13.setPrice((double) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO29 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        double double37 = stockItem35.getPrice();
        stockItem35.setDescription("");
        stockItem35.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem35, (int) (short) 100);
        double double44 = soldItem43.getPrice();
        inMemorySalesSystemDAO29.saveSoldItem(soldItem43);
        soldItem43.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem53 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem53.setName("");
        soldItem43.setStockItem(stockItem53);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem43);
        java.lang.String str58 = soldItem43.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem59 = soldItem43.getStockItem();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(stockItem59);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        soldItem13.setName("StockItem{id=null, name='null'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        int int14 = stockItem5.getQuantity();
        java.lang.String str15 = stockItem5.getDescription();
        java.lang.String str16 = stockItem5.getName();
        java.lang.String str17 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO29 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        double double37 = stockItem35.getPrice();
        stockItem35.setDescription("");
        stockItem35.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem35, (int) (short) 100);
        double double44 = soldItem43.getPrice();
        inMemorySalesSystemDAO29.saveSoldItem(soldItem43);
        soldItem43.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem53 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem53.setName("");
        soldItem43.setStockItem(stockItem53);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem43);
        java.lang.String str58 = soldItem43.getName();
        soldItem43.setName("StockItem{id=0, name='SoldItem{id=1, name='null'}'}");
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        soldItem13.setId((java.lang.Long) 0L);
        java.lang.String str18 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=0, name='hi!'}" + "'", str18, "SoldItem{id=0, name='hi!'}");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        java.lang.String str33 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = soldItem13.getStockItem();
        java.lang.String str35 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(stockItem34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str35, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem((long) (short) 1);
        stockItem8.setQuantity((int) ' ');
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItem8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        java.lang.String str11 = soldItem2.toString();
        java.lang.Class<?> wildcardClass12 = soldItem2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str11, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = soldItem16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=100, name='StockItem{id=null, name='null'}'}", "SoldItem{id=1, name='hi!'}", (double) (-1), (int) (byte) 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        java.lang.String str12 = stockItem5.toString();
        java.lang.String str13 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int6 = stockItem5.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem1 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem1.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = soldItem1.getStockItem();
        soldItem1.setName("hi!");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
        double double8 = soldItem1.getPrice();
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        double double21 = soldItem20.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem20);
        soldItem20.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double31 = stockItem30.getPrice();
        stockItem30.setId((java.lang.Long) 0L);
        java.lang.String str34 = stockItem30.getName();
        stockItem30.setDescription("StockItem{id=0, name='hi!'}");
        stockItem30.setQuantity((int) '4');
        stockItem30.setName("hi!");
        soldItem20.setStockItem(stockItem30);
        java.lang.String str42 = soldItem20.getName();
        double double43 = soldItem20.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem20);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = inMemorySalesSystemDAO0.findStockItem(1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem52 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double53 = stockItem52.getPrice();
        double double54 = stockItem52.getPrice();
        stockItem52.setDescription("");
        stockItem52.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem60 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem52, (int) (short) 100);
        double double61 = soldItem60.getPrice();
        java.lang.String str62 = soldItem60.getName();
        soldItem60.setPrice((double) (short) 0);
        double double65 = soldItem60.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem60);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem67 = soldItem60.getStockItem();
        stockItem67.setName("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem46);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem67);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        java.lang.Long long18 = soldItem17.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getPrice();
        java.lang.String str19 = soldItem17.getName();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem17);
        soldItem17.setQuantity((java.lang.Integer) 1);
        soldItem17.setId((java.lang.Long) 1L);
        java.lang.String str25 = soldItem17.getName();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem3.setId((java.lang.Long) 1L);
        soldItem3.setPrice((double) 100.0f);
        soldItem3.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        double double25 = soldItem24.getPrice();
        java.lang.String str26 = soldItem24.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem32 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double33 = stockItem32.getPrice();
        double double34 = stockItem32.getPrice();
        stockItem32.setDescription("hi!");
        soldItem24.setStockItem(stockItem32);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem39 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem39.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem42 = soldItem39.getStockItem();
        soldItem39.setName("hi!");
        java.lang.String str45 = soldItem39.toString();
        double double46 = soldItem39.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem39);
        double double48 = soldItem39.getPrice();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(stockItem42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str45, "SoldItem{id=1, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setName("StockItem{id=null, name='null'}");
        double double12 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        java.lang.String str6 = soldItem2.toString();
        soldItem2.setName("StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str6, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO29 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        double double37 = stockItem35.getPrice();
        stockItem35.setDescription("");
        stockItem35.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem35, (int) (short) 100);
        double double44 = soldItem43.getPrice();
        inMemorySalesSystemDAO29.saveSoldItem(soldItem43);
        soldItem43.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem53 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem53.setName("");
        soldItem43.setStockItem(stockItem53);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem43);
        java.lang.String str58 = soldItem43.getName();
        double double59 = soldItem43.getSum();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        java.lang.Class<?> wildcardClass16 = stockItem15.getClass();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        soldItem13.setPrice(9700.0d);
        soldItem13.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem18);
        java.lang.String str21 = soldItem18.getName();
        soldItem18.setQuantity((java.lang.Integer) 10);
        shoppingCart3.addItem(soldItem18);
        soldItem18.setName("StockItem{id=100, name='hi!'}");
        soldItem18.setQuantity((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart14.submitCurrentPurchase();
        shoppingCart14.cancelCurrentPurchase();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem13.getStockItem();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = null;
        soldItem13.setStockItem(stockItem28);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart12.cancelCurrentPurchase();
        shoppingCart12.submitCurrentPurchase();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        stockItem5.setQuantity(0);
        double double10 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double8 = soldItem7.getPrice();
        double double9 = soldItem7.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int6 = stockItem5.getQuantity();
        stockItem5.setPrice((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setDescription("hi!");
        stockItem5.setName("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        double double21 = soldItem20.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem20);
        soldItem20.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double31 = stockItem30.getPrice();
        stockItem30.setId((java.lang.Long) 0L);
        java.lang.String str34 = stockItem30.getName();
        stockItem30.setDescription("StockItem{id=0, name='hi!'}");
        stockItem30.setQuantity((int) '4');
        stockItem30.setName("hi!");
        soldItem20.setStockItem(stockItem30);
        java.lang.String str42 = soldItem20.getName();
        double double43 = soldItem20.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem20);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = inMemorySalesSystemDAO0.findStockItem(1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem52 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double53 = stockItem52.getPrice();
        double double54 = stockItem52.getPrice();
        stockItem52.setDescription("");
        stockItem52.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem60 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem52, (int) (short) 100);
        double double61 = soldItem60.getPrice();
        java.lang.String str62 = soldItem60.getName();
        soldItem60.setPrice((double) (short) 0);
        double double65 = soldItem60.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem60);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem46);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        soldItem13.setQuantity((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=100, name='StockItem{id=null, name='null'}'}", "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", (double) (-1L), (int) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 100);
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        soldItem22.setName("hi!");
        shoppingCart5.addItem(soldItem22);
        soldItem22.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass28 = soldItem22.getClass();
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        shoppingCart5.addItem(soldItem21);
        java.lang.Long long24 = soldItem21.getId();
        java.lang.String str25 = soldItem21.toString();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", "StockItem{id=0, name='hi!'}", 100.0d, 0);
        java.lang.String str6 = stockItem5.getName();
        java.lang.String str7 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str6, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str7, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        double double13 = soldItem12.getSum();
        double double14 = soldItem12.getPrice();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5200.0d + "'", double13 == 5200.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem32 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (byte) 1);
        soldItem32.setName("StockItem{id=100, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        double double17 = soldItem13.getSum();
        soldItem13.setName("SoldItem{id=1, name='hi!'}");
        double double20 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=1, name=''}", "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", 32.0d, 32);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setName("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        stockItem7.setName("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        stockItem7.setDescription("SoldItem{id=1, name='null'}");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.cancelCurrentPurchase();
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double12 = stockItem11.getPrice();
        double double13 = stockItem11.getPrice();
        stockItem11.setDescription("");
        stockItem11.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem11, (int) (short) 100);
        soldItem19.setPrice((double) 'a');
        java.lang.String str22 = soldItem19.toString();
        soldItem19.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem19);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(stockItem27);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart2.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem18);
        soldItem18.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        stockItem28.setId((java.lang.Long) 0L);
        java.lang.String str32 = stockItem28.getName();
        stockItem28.setDescription("StockItem{id=0, name='hi!'}");
        stockItem28.setQuantity((int) '4');
        stockItem28.setName("hi!");
        soldItem18.setStockItem(stockItem28);
        soldItem18.setId((java.lang.Long) 1L);
        soldItem18.setName("hi!");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem44 = soldItem18.getStockItem();
        shoppingCart2.addItem(soldItem18);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = soldItem18.getStockItem();
        stockItem46.setQuantity((int) '#');
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stockItem44);
        org.junit.Assert.assertNotNull(stockItem46);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setId((java.lang.Long) 1L);
        double double12 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem21.setId((java.lang.Long) 10L);
        soldItem13.setStockItem(stockItem21);
        double double25 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        double double33 = stockItem31.getPrice();
        java.lang.String str34 = stockItem31.getName();
        double double35 = stockItem31.getPrice();
        soldItem13.setStockItem(stockItem31);
        int int37 = stockItem31.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart12.cancelCurrentPurchase();
        shoppingCart12.cancelCurrentPurchase();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) -1);
        soldItem16.setPrice((double) 1.0f);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem(0L);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO5 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO5.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO5.findStockItem((long) (short) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        inMemorySalesSystemDAO5.saveStockItem(stockItem14);
        int int18 = stockItem14.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem14);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNull(stockItem8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setName("");
        java.lang.String str13 = stockItem7.getName();
        stockItem7.setName("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        stockItem5.setPrice((double) 10L);
        stockItem5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        soldItem17.setQuantity((java.lang.Integer) (-1));
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem25 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "StockItem{id=100, name='StockItem{id=null, name='null'}'}", (-97.0d), 32);
        soldItem17.setStockItem(stockItem25);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        stockItem5.setName("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        int int8 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        double double51 = soldItem14.getPrice();
        soldItem14.setPrice((-1.0d));
        java.lang.Long long54 = soldItem14.getId();
        java.lang.Long long55 = soldItem14.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNull(long54);
        org.junit.Assert.assertNull(long55);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO8 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO8.rollbackTransaction();
        inMemorySalesSystemDAO8.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart11 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO8);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        double double27 = soldItem26.getPrice();
        inMemorySalesSystemDAO12.saveSoldItem(soldItem26);
        java.lang.String str29 = soldItem26.getName();
        soldItem26.setQuantity((java.lang.Integer) 10);
        shoppingCart11.addItem(soldItem26);
        soldItem26.setQuantity((java.lang.Integer) 97);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem26);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem37 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(stockItem37);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem(0L);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem18);
        soldItem18.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        int int30 = stockItem28.getQuantity();
        double double31 = stockItem28.getPrice();
        stockItem28.setQuantity(1);
        stockItem28.setName("StockItem{id=0, name='hi!'}");
        soldItem18.setStockItem(stockItem28);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO38 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO38.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem45 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double46 = stockItem45.getPrice();
        int int47 = stockItem45.getQuantity();
        inMemorySalesSystemDAO38.saveStockItem(stockItem45);
        stockItem45.setName("");
        java.lang.String str51 = stockItem45.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem45);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) (short) 0);
        soldItem13.setQuantity((java.lang.Integer) 32);
        double double20 = soldItem13.getPrice();
        java.lang.Long long21 = soldItem13.getId();
        double double22 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart3.getAll();
        shoppingCart3.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass6 = shoppingCart3.getClass();
        org.junit.Assert.assertNotNull(soldItemList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart3.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = soldItem13.getStockItem();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = soldItem13.getStockItem();
        stockItem31.setQuantity((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(stockItem30);
        org.junit.Assert.assertNotNull(stockItem31);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        java.lang.String str53 = stockItem39.getName();
        java.lang.Class<?> wildcardClass54 = stockItem39.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        java.lang.Integer int6 = soldItem2.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = soldItem2.getStockItem();
        java.lang.String str8 = soldItem2.toString();
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(stockItem7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = inMemorySalesSystemDAO0.findStockItem((long) (short) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = inMemorySalesSystemDAO0.findStockItem(100L);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNull(stockItem7);
        org.junit.Assert.assertNull(stockItem9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        double double29 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double9 = stockItem8.getPrice();
        double double10 = stockItem8.getPrice();
        java.lang.String str11 = stockItem8.getName();
        double double12 = stockItem8.getPrice();
        stockItem8.setDescription("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        soldItem0.setStockItem(stockItem8);
        java.lang.String str16 = soldItem0.getName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 10);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 10);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(stockItem12);
        org.junit.Assert.assertNull(stockItem14);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem(0L);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = inMemorySalesSystemDAO0.findStockItem(100L);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertNull(stockItem6);
        org.junit.Assert.assertNotNull(stockItemList7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO10 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        double double25 = soldItem24.getPrice();
        inMemorySalesSystemDAO10.saveSoldItem(soldItem24);
        soldItem24.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double35 = stockItem34.getPrice();
        stockItem34.setId((java.lang.Long) 0L);
        java.lang.String str38 = stockItem34.getName();
        stockItem34.setDescription("StockItem{id=0, name='hi!'}");
        stockItem34.setQuantity((int) '4');
        stockItem34.setName("hi!");
        soldItem24.setStockItem(stockItem34);
        java.lang.String str46 = soldItem24.getName();
        shoppingCart5.addItem(soldItem24);
        soldItem24.setPrice((double) 0L);
        java.lang.String str50 = soldItem24.getName();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", "", 0.0d, 100);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO7 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        inMemorySalesSystemDAO7.saveSoldItem(soldItem21);
        soldItem21.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        stockItem31.setId((java.lang.Long) 0L);
        java.lang.String str35 = stockItem31.getName();
        stockItem31.setDescription("StockItem{id=0, name='hi!'}");
        stockItem31.setQuantity((int) '4');
        stockItem31.setName("hi!");
        soldItem21.setStockItem(stockItem31);
        java.lang.String str43 = soldItem21.getName();
        shoppingCart5.addItem(soldItem21);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem50 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double51 = stockItem50.getPrice();
        stockItem50.setId((java.lang.Long) 0L);
        java.lang.String str54 = stockItem50.getName();
        stockItem50.setDescription("StockItem{id=0, name='hi!'}");
        stockItem50.setQuantity((int) '4');
        stockItem50.setName("StockItem{id=null, name='null'}");
        soldItem21.setStockItem(stockItem50);
        java.lang.String str62 = soldItem21.getName();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart7.getAll();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) -1);
        soldItem17.setQuantity((java.lang.Integer) (-1));
        soldItem17.setId((java.lang.Long) 0L);
        java.lang.String str22 = soldItem17.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        double double30 = stockItem28.getPrice();
        stockItem28.setDescription("");
        stockItem28.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem36 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem28, (int) (short) 100);
        double double37 = soldItem36.getPrice();
        java.lang.String str38 = soldItem36.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem44 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double45 = stockItem44.getPrice();
        double double46 = stockItem44.getPrice();
        stockItem44.setDescription("hi!");
        soldItem36.setStockItem(stockItem44);
        stockItem44.setId((java.lang.Long) 10L);
        stockItem44.setQuantity((int) (short) 1);
        soldItem17.setStockItem(stockItem44);
        soldItem17.setPrice((double) (-1L));
        soldItem17.setPrice((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str22, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem5.setQuantity((int) 'a');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 97);
        java.lang.String str10 = soldItem9.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str10, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        double double16 = stockItem15.getPrice();
        stockItem15.setDescription("SoldItem{id=1, name='hi!'}");
        java.lang.String str19 = stockItem15.toString();
        stockItem15.setQuantity(100);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str19, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getSum();
        java.lang.Long long15 = soldItem13.getId();
        soldItem13.setName("StockItem{id=10, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        double double31 = stockItem22.getPrice();
        double double32 = stockItem22.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 32.0d + "'", double32 == 32.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        soldItem15.setName("StockItem{id=null, name='null'}");
        soldItem15.setQuantity((java.lang.Integer) 32);
        java.lang.String str20 = soldItem15.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SoldItem{id=null, name='StockItem{id=null, name='null'}'}" + "'", str20, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart7.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart7.getAll();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        soldItem14.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem24 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double25 = stockItem24.getPrice();
        int int26 = stockItem24.getQuantity();
        double double27 = stockItem24.getPrice();
        stockItem24.setQuantity(1);
        stockItem24.setName("StockItem{id=0, name='hi!'}");
        soldItem14.setStockItem(stockItem24);
        stockItem24.setQuantity((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart3.getAll();
        shoppingCart3.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart3.getAll();
        shoppingCart3.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList4);
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.rollbackTransaction();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart3.getAll();
        shoppingCart3.cancelCurrentPurchase();
        shoppingCart3.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        shoppingCart5.addItem(soldItem21);
        java.lang.Long long24 = soldItem21.getId();
        soldItem21.setName("SoldItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem32 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double33 = stockItem32.getPrice();
        double double34 = stockItem32.getPrice();
        stockItem32.setDescription("");
        stockItem32.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem40 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem32, (int) (short) 100);
        double double41 = soldItem40.getPrice();
        java.lang.String str42 = soldItem40.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem48 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double49 = stockItem48.getPrice();
        double double50 = stockItem48.getPrice();
        stockItem48.setDescription("hi!");
        soldItem40.setStockItem(stockItem48);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem54 = soldItem40.getStockItem();
        java.lang.Long long55 = soldItem40.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem56 = soldItem40.getStockItem();
        stockItem56.setName("");
        stockItem56.setId((java.lang.Long) 10L);
        soldItem21.setStockItem(stockItem56);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem54);
        org.junit.Assert.assertNull(long55);
        org.junit.Assert.assertNotNull(stockItem56);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int6 = stockItem5.getQuantity();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("SoldItem{id=1, name='hi!'}");
        int int10 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '#');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = soldItem9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO15 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO15.rollbackTransaction();
        inMemorySalesSystemDAO15.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        inMemorySalesSystemDAO15.saveSoldItem(soldItem18);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart20 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart20.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double28 = stockItem27.getPrice();
        double double29 = stockItem27.getPrice();
        stockItem27.setDescription("");
        stockItem27.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem35 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem27, (int) (short) 100);
        soldItem35.setPrice((double) 'a');
        shoppingCart20.addItem(soldItem35);
        double double39 = soldItem35.getPrice();
        soldItem35.setQuantity((java.lang.Integer) 100);
        shoppingCart14.addItem(soldItem35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(soldItemList21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        double double11 = stockItem7.getPrice();
        double double12 = stockItem7.getPrice();
        stockItem7.setQuantity((int) '#');
        java.lang.String str15 = stockItem7.getName();
        java.lang.String str16 = stockItem7.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str16, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        soldItem13.setPrice((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        java.lang.String str16 = soldItem13.toString();
        soldItem13.setId((java.lang.Long) 1L);
        java.lang.String str19 = soldItem13.getName();
        double double20 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9700.0d + "'", double20 == 9700.0d);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem13.getStockItem();
        java.lang.Long long28 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = soldItem13.getStockItem();
        java.lang.String str30 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(stockItem29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str30, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (byte) -1);
        org.junit.Assert.assertNull(stockItem3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        java.lang.String str31 = soldItem14.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        double double17 = soldItem13.getPrice();
        java.lang.String str18 = soldItem13.toString();
        soldItem13.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        stockItem5.setQuantity((int) 'a');
        stockItem5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) 1);
        java.lang.String str18 = soldItem13.toString();
        java.lang.String str19 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        java.lang.Long long17 = soldItem13.getId();
        double double18 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=10, name='hi!'}", "StockItem{id=null, name='null'}", (double) (short) -1, (int) '#');
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        soldItem24.setPrice((double) 'a');
        shoppingCart9.addItem(soldItem24);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO29 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart30 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO29);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList31 = inMemorySalesSystemDAO29.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList32 = inMemorySalesSystemDAO29.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO33 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO33.rollbackTransaction();
        inMemorySalesSystemDAO33.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem36 = null;
        inMemorySalesSystemDAO33.saveSoldItem(soldItem36);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart38 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO33);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList39 = shoppingCart38.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem45 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double46 = stockItem45.getPrice();
        double double47 = stockItem45.getPrice();
        stockItem45.setDescription("");
        stockItem45.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem53 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem45, (int) (short) 100);
        soldItem53.setPrice((double) 'a');
        shoppingCart38.addItem(soldItem53);
        inMemorySalesSystemDAO29.saveSoldItem(soldItem53);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO58 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem64 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double65 = stockItem64.getPrice();
        double double66 = stockItem64.getPrice();
        stockItem64.setDescription("");
        stockItem64.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem72 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem64, (int) (short) 100);
        double double73 = soldItem72.getPrice();
        inMemorySalesSystemDAO58.saveSoldItem(soldItem72);
        soldItem72.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem82 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem82.setName("");
        soldItem72.setStockItem(stockItem82);
        inMemorySalesSystemDAO29.saveSoldItem(soldItem72);
        java.lang.String str87 = soldItem72.getName();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem72);
        java.lang.String str89 = soldItem72.toString();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList31);
        org.junit.Assert.assertNotNull(stockItemList32);
        org.junit.Assert.assertNotNull(soldItemList39);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "SoldItem{id=0, name='hi!'}" + "'", str89, "SoldItem{id=0, name='hi!'}");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        int int14 = stockItem5.getQuantity();
        java.lang.String str15 = stockItem5.getDescription();
        java.lang.String str16 = stockItem5.toString();
        java.lang.Class<?> wildcardClass17 = stockItem5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=10, name='hi!'}" + "'", str16, "StockItem{id=10, name='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart2.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem18);
        soldItem18.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        stockItem28.setId((java.lang.Long) 0L);
        java.lang.String str32 = stockItem28.getName();
        stockItem28.setDescription("StockItem{id=0, name='hi!'}");
        stockItem28.setQuantity((int) '4');
        stockItem28.setName("hi!");
        soldItem18.setStockItem(stockItem28);
        soldItem18.setId((java.lang.Long) 1L);
        soldItem18.setName("hi!");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem44 = soldItem18.getStockItem();
        shoppingCart2.addItem(soldItem18);
        soldItem18.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem53 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem55 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem53, (int) '#');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem57 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem53, (int) (byte) 10);
        stockItem53.setQuantity((int) (byte) 10);
        soldItem18.setStockItem(stockItem53);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stockItem44);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        double double16 = stockItem15.getPrice();
        java.lang.String str17 = stockItem15.getName();
        stockItem15.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = inMemorySalesSystemDAO0.findStockItem((long) (short) 100);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart18 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart18.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart18.getAll();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertNull(stockItem17);
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart3.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        java.lang.String str20 = soldItem18.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double27 = stockItem26.getPrice();
        double double28 = stockItem26.getPrice();
        stockItem26.setDescription("hi!");
        soldItem18.setStockItem(stockItem26);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem32 = soldItem18.getStockItem();
        java.lang.Long long33 = soldItem18.getId();
        soldItem18.setPrice(10000.0d);
        shoppingCart3.addItem(soldItem18);
        org.junit.Assert.assertNotNull(soldItemList4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem32);
        org.junit.Assert.assertNull(long33);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart5.getAll();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        stockItem22.setPrice(10.0d);
        stockItem22.setDescription("StockItem{id=10, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        stockItem5.setQuantity((int) 'a');
        stockItem5.setName("");
        stockItem5.setDescription("SoldItem{id=1, name='hi!'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        java.lang.Class<?> wildcardClass19 = soldItem18.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        shoppingCart5.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO9 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart10 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList11 = inMemorySalesSystemDAO9.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList12 = inMemorySalesSystemDAO9.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO13 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO13.rollbackTransaction();
        inMemorySalesSystemDAO13.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        inMemorySalesSystemDAO13.saveSoldItem(soldItem16);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart18 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart18.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem25 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double26 = stockItem25.getPrice();
        double double27 = stockItem25.getPrice();
        stockItem25.setDescription("");
        stockItem25.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem33 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem25, (int) (short) 100);
        soldItem33.setPrice((double) 'a');
        shoppingCart18.addItem(soldItem33);
        inMemorySalesSystemDAO9.saveSoldItem(soldItem33);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO38 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart39 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO38);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList40 = inMemorySalesSystemDAO38.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList41 = inMemorySalesSystemDAO38.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO42 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO42.rollbackTransaction();
        inMemorySalesSystemDAO42.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem45 = null;
        inMemorySalesSystemDAO42.saveSoldItem(soldItem45);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart47 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO42);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList48 = shoppingCart47.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem54 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double55 = stockItem54.getPrice();
        double double56 = stockItem54.getPrice();
        stockItem54.setDescription("");
        stockItem54.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem62 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem54, (int) (short) 100);
        soldItem62.setPrice((double) 'a');
        shoppingCart47.addItem(soldItem62);
        inMemorySalesSystemDAO38.saveSoldItem(soldItem62);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO67 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem73 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double74 = stockItem73.getPrice();
        double double75 = stockItem73.getPrice();
        stockItem73.setDescription("");
        stockItem73.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem81 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem73, (int) (short) 100);
        double double82 = soldItem81.getPrice();
        inMemorySalesSystemDAO67.saveSoldItem(soldItem81);
        soldItem81.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem91 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem91.setName("");
        soldItem81.setStockItem(stockItem91);
        inMemorySalesSystemDAO38.saveSoldItem(soldItem81);
        java.lang.String str96 = soldItem81.getName();
        inMemorySalesSystemDAO9.saveSoldItem(soldItem81);
        shoppingCart5.addItem(soldItem81);
        shoppingCart5.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(stockItemList11);
        org.junit.Assert.assertNotNull(stockItemList12);
        org.junit.Assert.assertNotNull(soldItemList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList40);
        org.junit.Assert.assertNotNull(stockItemList41);
        org.junit.Assert.assertNotNull(soldItemList48);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) (short) 0);
        java.lang.String str18 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getPrice();
        java.lang.String str19 = soldItem17.getName();
        soldItem17.setPrice((double) (short) 0);
        soldItem17.setQuantity((java.lang.Integer) 32);
        double double24 = soldItem17.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem17);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.toString();
        java.lang.Class<?> wildcardClass17 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        java.lang.String str27 = soldItem13.toString();
        java.lang.String str28 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str27, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem(10L);
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        int int14 = stockItem5.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        shoppingCart5.addItem(soldItem21);
        soldItem21.setPrice((double) (byte) 100);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        soldItem20.setPrice((double) 'a');
        shoppingCart5.addItem(soldItem20);
        double double24 = soldItem20.getPrice();
        soldItem20.setQuantity((java.lang.Integer) 100);
        double double27 = soldItem20.getPrice();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = soldItem20.getStockItem();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(stockItem28);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart14.getAll();
        shoppingCart14.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart4.getAll();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        soldItem22.setName("hi!");
        shoppingCart5.addItem(soldItem22);
        soldItem22.setId((java.lang.Long) 1L);
        java.lang.String str28 = soldItem22.toString();
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str28, "SoldItem{id=1, name='hi!'}");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("hi!");
        soldItem13.setStockItem(stockItem21);
        stockItem21.setId((java.lang.Long) 10L);
        stockItem21.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 5200.0d, (int) (short) 100);
        inMemorySalesSystemDAO0.saveStockItem(stockItem16);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = inMemorySalesSystemDAO0.findStockItem((long) 52);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO20 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double27 = stockItem26.getPrice();
        double double28 = stockItem26.getPrice();
        stockItem26.setDescription("");
        stockItem26.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem34 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem26, (int) (short) 100);
        double double35 = soldItem34.getPrice();
        inMemorySalesSystemDAO20.saveSoldItem(soldItem34);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem42 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double43 = stockItem42.getPrice();
        double double44 = stockItem42.getPrice();
        stockItem42.setDescription("");
        stockItem42.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem50 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem42, (int) (short) 100);
        soldItem50.setPrice((double) 'a');
        java.lang.String str53 = soldItem50.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem59 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double60 = stockItem59.getPrice();
        double double61 = stockItem59.getPrice();
        stockItem59.setDescription("");
        stockItem59.setQuantity((int) (short) 10);
        stockItem59.setId((java.lang.Long) 10L);
        int int68 = stockItem59.getQuantity();
        soldItem50.setStockItem(stockItem59);
        soldItem34.setStockItem(stockItem59);
        stockItem59.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem74 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem59, (int) (short) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem59);
        org.junit.Assert.assertNull(stockItem19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str53, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        soldItem13.setPrice((double) (short) 100);
        java.lang.Long long35 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNull(long35);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        int int9 = stockItem5.getQuantity();
        java.lang.String str10 = stockItem5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str10, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem3.setId((java.lang.Long) 1L);
        soldItem3.setPrice((double) 100.0f);
        soldItem3.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList11 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", "StockItem{id=0, name='hi!'}", 100.0d, 0);
        java.lang.String str18 = stockItem17.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem17);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(stockItemList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str18, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO14 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO14.rollbackTransaction();
        inMemorySalesSystemDAO14.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList17 = inMemorySalesSystemDAO14.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem23 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double24 = stockItem23.getPrice();
        double double25 = stockItem23.getPrice();
        stockItem23.setDescription("");
        stockItem23.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem31 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem23, (int) (short) 100);
        double double32 = soldItem31.getPrice();
        java.lang.String str33 = soldItem31.getName();
        inMemorySalesSystemDAO14.saveSoldItem(soldItem31);
        soldItem31.setQuantity((java.lang.Integer) 1);
        double double37 = soldItem31.getSum();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem31);
        java.lang.Class<?> wildcardClass39 = soldItem31.getClass();
        org.junit.Assert.assertNotNull(stockItemList17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart12.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart12.getAll();
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart12 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        soldItem13.setPrice((-100.0d));
        java.lang.Long long19 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        stockItem5.setId((java.lang.Long) (-1L));
        stockItem5.setDescription("StockItem{id=0, name='SoldItem{id=1, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart9.getAll();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str22 = stockItem21.getDescription();
        stockItem21.setQuantity(10);
        stockItem21.setQuantity((int) (byte) 0);
        stockItem21.setQuantity((int) 'a');
        stockItem21.setName("");
        stockItem21.setDescription("SoldItem{id=1, name='hi!'}");
        soldItem13.setStockItem(stockItem21);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str15, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        soldItem15.setName("StockItem{id=null, name='null'}");
        soldItem15.setQuantity((java.lang.Integer) 97);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = null;
        soldItem15.setStockItem(stockItem20);
        soldItem15.setQuantity((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "StockItem{id=100, name='null'}", (double) 100, (int) (byte) 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO10 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        double double25 = soldItem24.getPrice();
        inMemorySalesSystemDAO10.saveSoldItem(soldItem24);
        soldItem24.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double35 = stockItem34.getPrice();
        stockItem34.setId((java.lang.Long) 0L);
        java.lang.String str38 = stockItem34.getName();
        stockItem34.setDescription("StockItem{id=0, name='hi!'}");
        stockItem34.setQuantity((int) '4');
        stockItem34.setName("hi!");
        soldItem24.setStockItem(stockItem34);
        java.lang.String str46 = soldItem24.getName();
        shoppingCart5.addItem(soldItem24);
        soldItem24.setName("StockItem{id=1, name='hi!'}");
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = soldItem12.getStockItem();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem13);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO10 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        double double25 = soldItem24.getPrice();
        inMemorySalesSystemDAO10.saveSoldItem(soldItem24);
        soldItem24.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double35 = stockItem34.getPrice();
        stockItem34.setId((java.lang.Long) 0L);
        java.lang.String str38 = stockItem34.getName();
        stockItem34.setDescription("StockItem{id=0, name='hi!'}");
        stockItem34.setQuantity((int) '4');
        stockItem34.setName("hi!");
        soldItem24.setStockItem(stockItem34);
        java.lang.String str46 = soldItem24.getName();
        shoppingCart5.addItem(soldItem24);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList48 = shoppingCart5.getAll();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(soldItemList48);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setId((java.lang.Long) 0L);
        stockItem22.setDescription("hi!");
        soldItem13.setStockItem(stockItem22);
        java.lang.String str29 = soldItem13.toString();
        soldItem13.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long32 = soldItem13.getId();
        java.lang.String str33 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        double double17 = soldItem13.getSum();
        soldItem13.setQuantity((java.lang.Integer) 52);
        java.lang.Class<?> wildcardClass20 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        stockItem16.setQuantity((int) (byte) 1);
        stockItem16.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (byte) -1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem16);
        java.lang.String str25 = stockItem16.getName();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "SoldItem{id=null, name=''}", "StockItem{id=10, name='hi!'}", 5200.0d, 32);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        double double17 = soldItem14.getPrice();
        soldItem14.setName("");
        java.lang.Long long20 = soldItem14.getId();
        java.lang.Class<?> wildcardClass21 = soldItem14.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        soldItem13.setId((java.lang.Long) 0L);
        soldItem13.setQuantity((java.lang.Integer) (-1));
        double double20 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        soldItem13.setPrice(100.0d);
        soldItem13.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO19 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem25 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double26 = stockItem25.getPrice();
        double double27 = stockItem25.getPrice();
        stockItem25.setDescription("");
        stockItem25.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem33 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem25, (int) (short) 100);
        double double34 = soldItem33.getPrice();
        inMemorySalesSystemDAO19.saveSoldItem(soldItem33);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem41 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double42 = stockItem41.getPrice();
        double double43 = stockItem41.getPrice();
        stockItem41.setDescription("");
        stockItem41.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem49 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem41, (int) (short) 100);
        soldItem49.setPrice((double) 'a');
        java.lang.String str52 = soldItem49.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem58 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double59 = stockItem58.getPrice();
        double double60 = stockItem58.getPrice();
        stockItem58.setDescription("");
        stockItem58.setQuantity((int) (short) 10);
        stockItem58.setId((java.lang.Long) 10L);
        int int67 = stockItem58.getQuantity();
        soldItem49.setStockItem(stockItem58);
        soldItem33.setStockItem(stockItem58);
        stockItem58.setId((java.lang.Long) 1L);
        java.lang.String str72 = stockItem58.getName();
        soldItem13.setStockItem(stockItem58);
        stockItem58.setPrice(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str52, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=1, name='hi!'}", "StockItem{id=100, name='null'}", (double) 100L, (int) (short) -1);
        int int6 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        java.lang.Integer int6 = soldItem2.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = soldItem2.getStockItem();
        java.lang.String str8 = soldItem2.getName();
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(stockItem7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        int int13 = stockItem9.getQuantity();
        stockItem9.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = inMemorySalesSystemDAO0.findStockItem((long) 97);
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertNull(stockItem6);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        stockItem5.setPrice((double) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        double double17 = soldItem16.getSum();
        double double18 = soldItem16.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10000.0d + "'", double17 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double21 = stockItem20.getPrice();
        int int22 = stockItem20.getQuantity();
        double double23 = stockItem20.getPrice();
        soldItem13.setStockItem(stockItem20);
        soldItem13.setQuantity((java.lang.Integer) 0);
        soldItem13.setName("SoldItem{id=1, name='null'}");
        double double29 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNotNull(stockItemList7);
        org.junit.Assert.assertNull(stockItem9);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "SoldItem{id=1, name='null'}", (double) (short) 10, 10);
        int int6 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        stockItem9.setId((java.lang.Long) 0L);
        java.lang.String str13 = stockItem9.toString();
        stockItem9.setQuantity((int) '4');
        java.lang.String str16 = stockItem9.toString();
        stockItem9.setPrice((double) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, 100);
        double double21 = soldItem20.getSum();
        shoppingCart2.addItem(soldItem20);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str13, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str16, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10000.0d + "'", double21 == 10000.0d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList8 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNotNull(stockItemList8);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = inMemorySalesSystemDAO0.findStockItem((long) 97);
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNull(stockItem10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart7.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=100, name='hi!'}", "StockItem{id=100, name='null'}", 97.0d, (int) (short) 1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        java.lang.String str11 = soldItem2.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = soldItem2.getStockItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str11, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double9 = stockItem8.getPrice();
        double double10 = stockItem8.getPrice();
        java.lang.String str11 = stockItem8.getName();
        double double12 = stockItem8.getPrice();
        stockItem8.setDescription("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        soldItem0.setStockItem(stockItem8);
        java.lang.Integer int16 = soldItem0.getQuantity();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=0, name='SoldItem{id=1, name='null'}'}", "SoldItem{id=null, name='null'}", (double) '#', 10);
        stockItem5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        double double17 = soldItem13.getPrice();
        java.lang.String str18 = soldItem13.toString();
        double double19 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        double double6 = soldItem2.getPrice();
        soldItem2.setName("StockItem{id=null, name='null'}");
        java.lang.Integer int9 = soldItem2.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = soldItem2.getStockItem();
        soldItem2.setQuantity((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(stockItem10);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.rollbackTransaction();
        inMemorySalesSystemDAO4.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        inMemorySalesSystemDAO4.saveSoldItem(soldItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO4);
        shoppingCart9.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO11 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        double double19 = stockItem17.getPrice();
        stockItem17.setDescription("");
        stockItem17.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem25 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, (int) (short) 100);
        double double26 = soldItem25.getPrice();
        inMemorySalesSystemDAO11.saveSoldItem(soldItem25);
        soldItem25.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        stockItem35.setId((java.lang.Long) 0L);
        java.lang.String str39 = stockItem35.getName();
        stockItem35.setDescription("StockItem{id=0, name='hi!'}");
        stockItem35.setQuantity((int) '4');
        stockItem35.setName("hi!");
        soldItem25.setStockItem(stockItem35);
        java.lang.String str47 = soldItem25.getName();
        shoppingCart9.addItem(soldItem25);
        soldItem25.setQuantity((java.lang.Integer) 32);
        shoppingCart2.addItem(soldItem25);
        shoppingCart2.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        stockItem5.setQuantity((int) (byte) 10);
        int int13 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO6.rollbackTransaction();
        inMemorySalesSystemDAO6.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        inMemorySalesSystemDAO6.saveSoldItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList11 = inMemorySalesSystemDAO6.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        double double27 = soldItem26.getPrice();
        inMemorySalesSystemDAO12.saveSoldItem(soldItem26);
        soldItem26.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        stockItem36.setId((java.lang.Long) 0L);
        java.lang.String str40 = stockItem36.getName();
        stockItem36.setDescription("StockItem{id=0, name='hi!'}");
        stockItem36.setQuantity((int) '4');
        stockItem36.setName("hi!");
        soldItem26.setStockItem(stockItem36);
        java.lang.String str48 = soldItem26.getName();
        double double49 = soldItem26.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem26);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem52 = inMemorySalesSystemDAO6.findStockItem(1L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem52);
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem56 = inMemorySalesSystemDAO0.findStockItem((long) '4');
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem52);
        org.junit.Assert.assertNull(stockItem56);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setDescription("SoldItem{id=null, name='hi!'}");
        java.lang.String str16 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) '#');
        soldItem13.setStockItem(stockItem22);
        stockItem22.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        soldItem22.setPrice((double) 'a');
        java.lang.String str25 = soldItem22.toString();
        shoppingCart5.addItem(soldItem22);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem32 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double33 = stockItem32.getPrice();
        stockItem32.setQuantity((int) (byte) 1);
        stockItem32.setQuantity(1);
        int int38 = stockItem32.getQuantity();
        soldItem22.setStockItem(stockItem32);
        java.lang.String str40 = stockItem32.getDescription();
        double double41 = stockItem32.getPrice();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getPrice();
        java.lang.String str19 = soldItem17.getName();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem17);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double27 = stockItem26.getPrice();
        double double28 = stockItem26.getPrice();
        stockItem26.setDescription("");
        stockItem26.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem34 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem26, (int) (short) 100);
        soldItem34.setPrice((double) 'a');
        double double37 = soldItem34.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem43 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double44 = stockItem43.getPrice();
        stockItem43.setId((java.lang.Long) 0L);
        stockItem43.setDescription("hi!");
        soldItem34.setStockItem(stockItem43);
        java.lang.String str50 = soldItem34.toString();
        soldItem34.setQuantity((java.lang.Integer) (-1));
        java.lang.Long long53 = soldItem34.getId();
        java.lang.String str54 = soldItem34.toString();
        java.lang.String str55 = soldItem34.getName();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem34);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart57 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart57.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 9700.0d + "'", double37 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str50, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str54, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double8 = soldItem7.getPrice();
        double double9 = soldItem7.getSum();
        java.lang.Long long10 = soldItem7.getId();
        java.lang.Long long11 = soldItem7.getId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = soldItem13.getStockItem();
        java.lang.String str15 = stockItem14.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        java.lang.String str12 = stockItem10.getDescription();
        java.lang.String str13 = stockItem10.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "", "SoldItem{id=1, name='null'}", (double) (byte) 10, 97);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 32);
        java.lang.String str8 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        java.lang.String str17 = soldItem14.getName();
        double double18 = soldItem14.getSum();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        stockItem13.setId((java.lang.Long) 10L);
        int int22 = stockItem13.getQuantity();
        java.lang.String str23 = stockItem13.getDescription();
        java.lang.String str24 = stockItem13.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem13);
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem9.setId((java.lang.Long) 10L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList13 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = inMemorySalesSystemDAO0.findStockItem((long) (byte) -1);
        org.junit.Assert.assertNotNull(stockItemList13);
        org.junit.Assert.assertNull(stockItem16);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO5 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO5.rollbackTransaction();
        inMemorySalesSystemDAO5.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        inMemorySalesSystemDAO5.saveSoldItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList10 = inMemorySalesSystemDAO5.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList11 = inMemorySalesSystemDAO5.findStockItems();
        inMemorySalesSystemDAO5.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        double double27 = soldItem26.getPrice();
        java.lang.String str28 = soldItem26.getName();
        soldItem26.setPrice((double) (short) 0);
        soldItem26.setQuantity((java.lang.Integer) 32);
        double double33 = soldItem26.getPrice();
        soldItem26.setPrice((double) 1L);
        inMemorySalesSystemDAO5.saveSoldItem(soldItem26);
        shoppingCart4.addItem(soldItem26);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList38 = shoppingCart4.getAll();
        org.junit.Assert.assertNotNull(stockItemList10);
        org.junit.Assert.assertNotNull(stockItemList11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(soldItemList38);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        java.lang.String str17 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 32);
        stockItem5.setDescription("StockItem{id=10, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        java.lang.String str16 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        stockItem22.setQuantity((int) (byte) 1);
        stockItem22.setPrice((double) ' ');
        stockItem22.setQuantity((int) (byte) 10);
        soldItem14.setStockItem(stockItem22);
        stockItem22.setPrice(10.0d);
        stockItem22.setPrice((double) '#');
        java.lang.String str35 = stockItem22.getName();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem37 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO9 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double16 = stockItem15.getPrice();
        double double17 = stockItem15.getPrice();
        stockItem15.setDescription("");
        stockItem15.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem15, (int) (short) 100);
        double double24 = soldItem23.getPrice();
        inMemorySalesSystemDAO9.saveSoldItem(soldItem23);
        soldItem23.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double34 = stockItem33.getPrice();
        stockItem33.setId((java.lang.Long) 0L);
        java.lang.String str37 = stockItem33.getName();
        stockItem33.setDescription("StockItem{id=0, name='hi!'}");
        stockItem33.setQuantity((int) '4');
        stockItem33.setName("hi!");
        soldItem23.setStockItem(stockItem33);
        soldItem23.setId((java.lang.Long) 1L);
        shoppingCart5.addItem(soldItem23);
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setQuantity(100);
        java.lang.String str18 = stockItem5.toString();
        stockItem5.setQuantity(10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str18, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        stockItem0.setPrice((double) (-1));
        stockItem0.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "StockItem{id=100, name='StockItem{id=null, name='null'}'}", (-97.0d), 32);
        java.lang.String str6 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}" + "'", str6, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        double double9 = stockItem5.getPrice();
        double double10 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.toString();
        java.lang.String str7 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str6, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setName("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        stockItem7.setPrice((double) (-1));
        stockItem7.setPrice((double) 1.0f);
        java.lang.String str19 = stockItem7.getName();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SoldItem{id=0, name='StockItem{id=null, name='null'}'}" + "'", str19, "SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = inMemorySalesSystemDAO0.findStockItem((long) (short) 100);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart18 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = inMemorySalesSystemDAO0.findStockItem((long) 1);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertNull(stockItem17);
        org.junit.Assert.assertNotNull(stockItem20);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setName("");
        stockItem7.setQuantity((int) '4');
        stockItem7.setDescription("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem39, (int) (short) 0);
        java.lang.String str55 = stockItem39.getDescription();
        java.lang.String str56 = stockItem39.getDescription();
        stockItem39.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNotNull(stockItemList4);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        soldItem12.setPrice((double) 1L);
        double double15 = soldItem12.getPrice();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = soldItem12.getStockItem();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(stockItem16);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO7 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        inMemorySalesSystemDAO7.saveSoldItem(soldItem21);
        soldItem21.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        stockItem31.setId((java.lang.Long) 0L);
        java.lang.String str35 = stockItem31.getName();
        stockItem31.setDescription("StockItem{id=0, name='hi!'}");
        stockItem31.setQuantity((int) '4');
        stockItem31.setName("hi!");
        soldItem21.setStockItem(stockItem31);
        java.lang.String str43 = soldItem21.getName();
        shoppingCart5.addItem(soldItem21);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList45 = shoppingCart5.getAll();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(soldItemList45);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 5200.0d, (int) (short) 100);
        inMemorySalesSystemDAO0.saveStockItem(stockItem16);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = inMemorySalesSystemDAO0.findStockItem((long) 52);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = inMemorySalesSystemDAO0.findStockItem((long) '#');
        org.junit.Assert.assertNull(stockItem19);
        org.junit.Assert.assertNull(stockItem21);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setId((java.lang.Long) 1L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double21 = stockItem20.getPrice();
        int int22 = stockItem20.getQuantity();
        double double23 = stockItem20.getPrice();
        soldItem13.setStockItem(stockItem20);
        soldItem13.setQuantity((java.lang.Integer) 0);
        soldItem13.setName("SoldItem{id=1, name='null'}");
        java.lang.Long long29 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(long29);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 0);
        stockItem5.setDescription("StockItem{id=null, name='null'}");
        int int16 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO8 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO8.rollbackTransaction();
        inMemorySalesSystemDAO8.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart11 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO8);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        double double27 = soldItem26.getPrice();
        inMemorySalesSystemDAO12.saveSoldItem(soldItem26);
        java.lang.String str29 = soldItem26.getName();
        soldItem26.setQuantity((java.lang.Integer) 10);
        shoppingCart11.addItem(soldItem26);
        soldItem26.setQuantity((java.lang.Integer) 97);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem26);
        java.lang.Class<?> wildcardClass36 = soldItem26.getClass();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        stockItem5.setPrice(9700.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem21.setId((java.lang.Long) 10L);
        soldItem13.setStockItem(stockItem21);
        double double25 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        double double33 = stockItem31.getPrice();
        java.lang.String str34 = stockItem31.getName();
        double double35 = stockItem31.getPrice();
        soldItem13.setStockItem(stockItem31);
        java.lang.String str37 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double13 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 10);
        double double16 = stockItem5.getPrice();
        stockItem5.setDescription("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        stockItem5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        soldItem2.setName("SoldItem{id=null, name='hi!'}");
        java.lang.String str10 = soldItem2.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str10, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem39, (int) (short) 0);
        stockItem39.setDescription("StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        stockItem39.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO5 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO5.rollbackTransaction();
        inMemorySalesSystemDAO5.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        inMemorySalesSystemDAO5.saveSoldItem(soldItem8);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart10 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO5);
        shoppingCart10.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart10.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart10.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        double double21 = stockItem19.getPrice();
        stockItem19.setDescription("");
        stockItem19.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem19, (int) (short) 100);
        soldItem27.setName("hi!");
        shoppingCart10.addItem(soldItem27);
        java.lang.Long long31 = soldItem27.getId();
        double double32 = soldItem27.getSum();
        shoppingCart4.addItem(soldItem27);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList12);
        org.junit.Assert.assertNotNull(soldItemList13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "", "SoldItem{id=1, name='null'}", (double) (byte) 10, 97);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '#');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 10);
        stockItem5.setQuantity((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = stockItem5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        double double31 = soldItem30.getPrice();
        java.lang.String str32 = soldItem30.getName();
        java.lang.String str33 = soldItem30.getName();
        double double34 = soldItem30.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = soldItem30.getStockItem();
        soldItem30.setQuantity((java.lang.Integer) 97);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem30);
        double double39 = soldItem30.getSum();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 10);
        double double8 = soldItem2.getPrice();
        soldItem2.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setQuantity((java.lang.Integer) 1);
        double double3 = soldItem0.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        java.lang.String str16 = soldItem15.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        soldItem15.setStockItem(stockItem22);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "SoldItem{id=null, name='StockItem{id=null, name='null'}'}", (double) 97, (int) 'a');
        int int6 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem30 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (short) 100);
        soldItem30.setPrice((double) 'a');
        java.lang.String str33 = soldItem30.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem39 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double40 = stockItem39.getPrice();
        double double41 = stockItem39.getPrice();
        stockItem39.setDescription("");
        stockItem39.setQuantity((int) (short) 10);
        stockItem39.setId((java.lang.Long) 10L);
        int int48 = stockItem39.getQuantity();
        soldItem30.setStockItem(stockItem39);
        soldItem14.setStockItem(stockItem39);
        stockItem39.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem39, (int) (short) 0);
        soldItem54.setQuantity((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        double double17 = soldItem14.getPrice();
        soldItem14.setName("");
        soldItem14.setId((java.lang.Long) (-1L));
        double double22 = soldItem14.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        soldItem15.setName("StockItem{id=null, name='null'}");
        soldItem15.setQuantity((java.lang.Integer) 97);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = null;
        soldItem15.setStockItem(stockItem20);
        java.lang.Class<?> wildcardClass22 = soldItem15.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = inMemorySalesSystemDAO0.findStockItem((long) 'a');
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        java.lang.String str23 = soldItem21.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double30 = stockItem29.getPrice();
        double double31 = stockItem29.getPrice();
        stockItem29.setDescription("hi!");
        soldItem21.setStockItem(stockItem29);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = soldItem21.getStockItem();
        java.lang.Long long36 = soldItem21.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem37 = soldItem21.getStockItem();
        java.lang.String str38 = stockItem37.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem37);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart40 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem46 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double47 = stockItem46.getPrice();
        double double48 = stockItem46.getPrice();
        stockItem46.setDescription("");
        stockItem46.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem54 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem46, (int) (short) 100);
        soldItem54.setPrice((double) 'a');
        inMemorySalesSystemDAO0.saveSoldItem(soldItem54);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem63 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double64 = stockItem63.getPrice();
        stockItem63.setId((java.lang.Long) 0L);
        stockItem63.setQuantity((int) (byte) 0);
        int int69 = stockItem63.getQuantity();
        stockItem63.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem73 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem63, 100);
        double double74 = soldItem73.getSum();
        soldItem73.setName("StockItem{id=null, name='null'}");
        soldItem73.setName("SoldItem{id=1, name='hi!'}");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem73);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNull(stockItem7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem35);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(stockItem37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart3.cancelCurrentPurchase();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart2.getAll();
        shoppingCart2.cancelCurrentPurchase();
        shoppingCart2.cancelCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem12);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart14.getAll();
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setPrice((double) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=100, name='StockItem{id=null, name='null'}'}", "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", (double) (-1L), (int) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 100);
        java.lang.String str8 = stockItem5.getName();
        stockItem5.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=100, name='StockItem{id=null, name='null'}'}" + "'", str8, "StockItem{id=100, name='StockItem{id=null, name='null'}'}");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) 1);
        double double18 = soldItem13.getSum();
        soldItem13.setPrice(52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList7);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO6.rollbackTransaction();
        inMemorySalesSystemDAO6.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        inMemorySalesSystemDAO6.saveSoldItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList11 = inMemorySalesSystemDAO6.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        double double27 = soldItem26.getPrice();
        inMemorySalesSystemDAO12.saveSoldItem(soldItem26);
        soldItem26.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        stockItem36.setId((java.lang.Long) 0L);
        java.lang.String str40 = stockItem36.getName();
        stockItem36.setDescription("StockItem{id=0, name='hi!'}");
        stockItem36.setQuantity((int) '4');
        stockItem36.setName("hi!");
        soldItem26.setStockItem(stockItem36);
        java.lang.String str48 = soldItem26.getName();
        double double49 = soldItem26.getPrice();
        inMemorySalesSystemDAO6.saveSoldItem(soldItem26);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem52 = inMemorySalesSystemDAO6.findStockItem(1L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem52);
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem52);
    }
}

