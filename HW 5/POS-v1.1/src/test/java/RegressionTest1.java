import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "SoldItem{id=1, name='null'}", "", (double) 100, (int) '#');
        stockItem5.setName("StockItem{id=100, name='null'}");
        stockItem5.setName("StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart11 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = inMemorySalesSystemDAO0.findStockItem((long) ' ');
        org.junit.Assert.assertNull(stockItem13);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        soldItem14.setId((java.lang.Long) 0L);
        java.lang.String str20 = soldItem14.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        java.lang.String str35 = stockItem22.getDescription();
        stockItem22.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO27 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO27.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double35 = stockItem34.getPrice();
        int int36 = stockItem34.getQuantity();
        inMemorySalesSystemDAO27.saveStockItem(stockItem34);
        double double38 = stockItem34.getPrice();
        double double39 = stockItem34.getPrice();
        java.lang.String str40 = stockItem34.getDescription();
        soldItem20.setStockItem(stockItem34);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem5.setQuantity((-1));
        java.lang.String str8 = stockItem5.toString();
        stockItem5.setName("StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}" + "'", str8, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem15, (int) (short) 1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = soldItem18.getStockItem();
        stockItem19.setName("hi!");
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem19);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        double double6 = soldItem2.getPrice();
        soldItem2.setPrice(32.0d);
        java.lang.Integer int9 = soldItem2.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart4.getAll();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setDescription("");
        java.lang.String str11 = stockItem5.toString();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) ' ');
        double double14 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str11, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        soldItem15.setName("StockItem{id=null, name='null'}");
        soldItem15.setPrice((-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart2.getAll();
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem20.setQuantity((-1));
        inMemorySalesSystemDAO0.saveStockItem(stockItem20);
        java.lang.String str24 = stockItem20.toString();
        int int25 = stockItem20.getQuantity();
        stockItem20.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}" + "'", str24, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        soldItem18.setId((java.lang.Long) 0L);
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
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList27 = shoppingCart5.getAll();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(soldItemList27);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart14.submitCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO16 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart17 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO16);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem23 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str24 = stockItem23.getDescription();
        stockItem23.setQuantity(10);
        stockItem23.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO16.saveStockItem(stockItem23);
        inMemorySalesSystemDAO16.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem36.setQuantity((-1));
        inMemorySalesSystemDAO16.saveStockItem(stockItem36);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO40 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO40.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem42 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem42.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO40.saveSoldItem(soldItem42);
        double double46 = soldItem42.getPrice();
        soldItem42.setPrice(32.0d);
        inMemorySalesSystemDAO16.saveSoldItem(soldItem42);
        shoppingCart14.addItem(soldItem42);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("");
        stockItem21.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem29 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem21, (int) (short) 100);
        double double30 = soldItem29.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        int int38 = stockItem36.getQuantity();
        double double39 = stockItem36.getPrice();
        soldItem29.setStockItem(stockItem36);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem29);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList42 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart43 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList42);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double30 = stockItem29.getPrice();
        double double31 = stockItem29.getPrice();
        stockItem29.setDescription("");
        stockItem29.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem37 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem29, (int) (short) 100);
        double double38 = soldItem37.getPrice();
        java.lang.String str39 = soldItem37.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem45 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double46 = stockItem45.getPrice();
        double double47 = stockItem45.getPrice();
        stockItem45.setDescription("hi!");
        soldItem37.setStockItem(stockItem45);
        stockItem45.setDescription("");
        int int53 = stockItem45.getQuantity();
        soldItem21.setStockItem(stockItem45);
        soldItem21.setQuantity((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        soldItem15.setName("StockItem{id=null, name='null'}");
        soldItem15.setQuantity((java.lang.Integer) 97);
        soldItem15.setQuantity((java.lang.Integer) 32);
        java.lang.String str22 = soldItem15.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "StockItem{id=null, name='null'}" + "'", str22, "StockItem{id=null, name='null'}");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        stockItem36.setId((java.lang.Long) 0L);
        java.lang.String str40 = stockItem36.toString();
        java.lang.String str41 = stockItem36.getDescription();
        soldItem13.setStockItem(stockItem36);
        soldItem13.setQuantity((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(stockItem30);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str40, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        java.lang.String str14 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str14, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart14.cancelCurrentPurchase();
        shoppingCart14.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        java.lang.Long long26 = soldItem22.getId();
        soldItem22.setName("StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}");
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long26);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        int int19 = stockItem18.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        int int19 = stockItem15.getQuantity();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=100, name='null'}", "StockItem{id=10, name='hi!'}", (double) (short) 1, (int) (short) 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 5200.0d, (int) (short) 100);
        inMemorySalesSystemDAO0.saveStockItem(stockItem16);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = inMemorySalesSystemDAO0.findStockItem((long) '#');
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = inMemorySalesSystemDAO0.findStockItem((long) '#');
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList22 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNull(stockItem19);
        org.junit.Assert.assertNull(stockItem21);
        org.junit.Assert.assertNotNull(stockItemList22);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem((long) (short) 1);
        stockItem8.setQuantity((int) (short) 100);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItem8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart4.addItem(soldItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ee.ut.math.tvt.salessystem.dataobjects.SoldItem.getName()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stockItemList3);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        int int33 = stockItem24.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart4.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart4.getAll();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = inMemorySalesSystemDAO0.findStockItem((long) (short) 1);
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertNotNull(stockItem6);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        shoppingCart2.submitCurrentPurchase();
        shoppingCart2.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO6.rollbackTransaction();
        inMemorySalesSystemDAO6.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        inMemorySalesSystemDAO6.saveSoldItem(soldItem9);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart11 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart11.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double19 = stockItem18.getPrice();
        double double20 = stockItem18.getPrice();
        stockItem18.setDescription("");
        stockItem18.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem26 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, (int) (short) 100);
        soldItem26.setPrice((double) 'a');
        shoppingCart11.addItem(soldItem26);
        shoppingCart2.addItem(soldItem26);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        soldItem13.setName("");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        stockItem21.setQuantity((-1));
        int int24 = stockItem21.getQuantity();
        soldItem13.setStockItem(stockItem21);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem((long) (short) 100);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = inMemorySalesSystemDAO0.findStockItem((long) 'a');
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNull(stockItem8);
        org.junit.Assert.assertNull(stockItem10);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        double double16 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        soldItem13.setName("StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}");
        soldItem13.setPrice(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=100, name='hi!'}", "hi!", 10000.0d, (int) (short) -1);
        java.lang.String str6 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=100, name='hi!'}" + "'", str6, "StockItem{id=100, name='hi!'}");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        soldItem14.setQuantity((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = inMemorySalesSystemDAO0.findStockItem(0L);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        soldItem13.setPrice(9700.0d);
        double double19 = soldItem13.getPrice();
        java.lang.String str20 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9700.0d + "'", double19 == 9700.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str20, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        stockItem5.setQuantity((-1));
        int int8 = stockItem5.getQuantity();
        stockItem5.setQuantity((int) (short) 100);
        inMemorySalesSystemDAO0.saveStockItem(stockItem5);
        org.junit.Assert.assertNotNull(stockItemList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        java.lang.String str51 = stockItem39.getName();
        double double52 = stockItem39.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList3);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        stockItem15.setDescription("Lays chips");
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str19, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO5 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO5.rollbackTransaction();
        inMemorySalesSystemDAO5.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList8 = inMemorySalesSystemDAO5.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        stockItem14.setDescription("");
        stockItem14.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem14, (int) (short) 100);
        double double23 = soldItem22.getPrice();
        java.lang.String str24 = soldItem22.getName();
        inMemorySalesSystemDAO5.saveSoldItem(soldItem22);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem22);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart27 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 1);
        org.junit.Assert.assertNotNull(stockItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(stockItem29);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = inMemorySalesSystemDAO0.findStockItem((long) ' ');
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertNull(stockItem17);
        org.junit.Assert.assertNull(stockItem20);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = soldItem14.getStockItem();
        stockItem22.setName("StockItem{id=0, name=''}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem22);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        soldItem14.setPrice(52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
        soldItem17.setQuantity((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem3.setId((java.lang.Long) 1L);
        soldItem3.setPrice((double) 100.0f);
        soldItem3.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = inMemorySalesSystemDAO0.findStockItem(0L);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList15 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("");
        stockItem21.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem29 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem21, (int) (short) 100);
        soldItem29.setPrice((double) 'a');
        double double32 = soldItem29.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem38 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem40 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem38, (int) '#');
        soldItem29.setStockItem(stockItem38);
        inMemorySalesSystemDAO0.saveStockItem(stockItem38);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem12);
        org.junit.Assert.assertNotNull(stockItemList15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 9700.0d + "'", double32 == 9700.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        java.lang.String str51 = stockItem39.getName();
        stockItem39.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setDescription("");
        java.lang.String str11 = stockItem5.toString();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = null;
        soldItem13.setStockItem(stockItem14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str11, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem55 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem55.setId((java.lang.Long) 1L);
        soldItem55.setPrice((double) 100.0f);
        soldItem55.setId((java.lang.Long) 0L);
        java.lang.Integer int62 = soldItem55.getQuantity();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem55);
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
        org.junit.Assert.assertNull(int62);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        java.lang.String str17 = stockItem16.toString();
        stockItem16.setId((java.lang.Long) 100L);
        soldItem15.setStockItem(stockItem16);
        stockItem16.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StockItem{id=null, name='null'}" + "'", str17, "StockItem{id=null, name='null'}");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 1);
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItem3);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        soldItem13.setQuantity((java.lang.Integer) 32);
        java.lang.Long long19 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = soldItem2.getStockItem();
        org.junit.Assert.assertNull(stockItem6);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "SoldItem{id=0, name='hi!'}", "StockItem{id=1, name='hi!'}", 32.0d, (int) (short) 100);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        double double21 = soldItem14.getSum();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int6 = stockItem5.getQuantity();
        java.lang.Class<?> wildcardClass7 = stockItem5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = soldItem13.getStockItem();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem16);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        soldItem13.setPrice((double) 1L);
        java.lang.Long long27 = soldItem13.getId();
        java.lang.Class<?> wildcardClass28 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int6 = stockItem5.getQuantity();
        double double7 = stockItem5.getPrice();
        java.lang.String str8 = stockItem5.getDescription();
        stockItem5.setName("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str8, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        org.junit.Assert.assertNull(stockItem5);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        soldItem13.setPrice((double) 1L);
        java.lang.Long long27 = soldItem13.getId();
        java.lang.String str28 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str28, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", (double) 0, 97);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem0 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem();
        java.lang.String str1 = stockItem0.toString();
        stockItem0.setId((java.lang.Long) 100L);
        java.lang.String str4 = stockItem0.toString();
        java.lang.String str5 = stockItem0.getDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "StockItem{id=null, name='null'}" + "'", str1, "StockItem{id=null, name='null'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StockItem{id=100, name='null'}" + "'", str4, "StockItem{id=100, name='null'}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "SoldItem{id=0, name='null'}", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", (double) (byte) 10, 1);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=1, name='null'}", "SoldItem{id=0, name='StockItem{id=null, name='null'}'}", (double) 10L, (int) (byte) 1);
        stockItem5.setQuantity(1);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=null, name='null'}", "Lays chips", (double) 1, (int) (short) -1);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        int int14 = stockItem5.getQuantity();
        java.lang.String str15 = stockItem5.getDescription();
        java.lang.String str16 = stockItem5.getName();
        int int17 = stockItem5.getQuantity();
        int int18 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=100, name='StockItem{id=null, name='null'}'}", "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", (double) (-1L), (int) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem8, (int) (byte) 100);
        double double11 = soldItem10.getSum();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem10);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        java.lang.Class<?> wildcardClass3 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        soldItem13.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        stockItem35.setQuantity((int) (byte) 1);
        stockItem35.setQuantity(1);
        int int41 = stockItem35.getQuantity();
        int int42 = stockItem35.getQuantity();
        java.lang.String str43 = stockItem35.getDescription();
        soldItem13.setStockItem(stockItem35);
        java.lang.String str45 = stockItem35.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str27, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str45, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        java.lang.String str16 = soldItem13.toString();
        java.lang.Long long17 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        java.lang.String str39 = soldItem31.toString();
        soldItem31.setPrice((double) (byte) 1);
        java.lang.String str42 = soldItem31.toString();
        org.junit.Assert.assertNotNull(stockItemList17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str39, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str42, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        int int33 = stockItem22.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int6 = stockItem5.getQuantity();
        java.lang.String str7 = stockItem5.getName();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StockItem{id=null, name='null'}" + "'", str7, "StockItem{id=null, name='null'}");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setQuantity((int) (byte) 0);
        stockItem7.setId((java.lang.Long) 100L);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = soldItem14.getStockItem();
        java.lang.String str18 = soldItem14.toString();
        double double19 = soldItem14.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        int int13 = stockItem9.getQuantity();
        stockItem9.setDescription("StockItem{id=null, name='null'}");
        stockItem9.setQuantity(32);
        java.lang.String str18 = stockItem9.toString();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str18, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart4.submitCurrentPurchase();
        shoppingCart4.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO7 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart8 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str15 = stockItem14.getDescription();
        stockItem14.setQuantity(10);
        stockItem14.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO7.saveStockItem(stockItem14);
        inMemorySalesSystemDAO7.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem27.setQuantity((-1));
        inMemorySalesSystemDAO7.saveStockItem(stockItem27);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        stockItem36.setId((java.lang.Long) 0L);
        java.lang.String str40 = stockItem36.getName();
        stockItem36.setDescription("StockItem{id=0, name='hi!'}");
        double double43 = stockItem36.getPrice();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem45 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem36, 1);
        inMemorySalesSystemDAO7.saveSoldItem(soldItem45);
        double double47 = soldItem45.getSum();
        shoppingCart4.addItem(soldItem45);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str11 = stockItem10.getDescription();
        stockItem10.setQuantity(10);
        stockItem10.setQuantity((int) (byte) 0);
        stockItem10.setQuantity((int) 'a');
        stockItem10.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList21 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem23 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 0);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stockItemList21);
        org.junit.Assert.assertNotNull(stockItem23);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        soldItem13.setPrice(9700.0d);
        double double19 = soldItem13.getPrice();
        soldItem13.setQuantity((java.lang.Integer) 1);
        java.lang.String str22 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9700.0d + "'", double19 == 9700.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        double double21 = stockItem19.getPrice();
        stockItem19.setDescription("");
        stockItem19.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem19, (int) (short) 100);
        double double28 = soldItem27.getPrice();
        java.lang.String str29 = soldItem27.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "StockItem{id=0, name='hi!'}", (double) 10, 1);
        soldItem27.setStockItem(stockItem35);
        java.lang.String str37 = stockItem35.getDescription();
        inMemorySalesSystemDAO0.saveStockItem(stockItem35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str37, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(stockItemList3);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        stockItem20.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setName("StockItem{id=null, name='null'}");
        stockItem5.setPrice((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        stockItem50.setQuantity(0);
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
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        double double25 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList13 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList13);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setQuantity(100);
        java.lang.String str18 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem15, (int) (short) 1);
        soldItem18.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.lang.Class<?> wildcardClass6 = shoppingCart5.getClass();
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart3.submitCurrentPurchase();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        double double15 = stockItem13.getPrice();
        stockItem13.setDescription("");
        stockItem13.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem13, (int) (short) 100);
        double double22 = soldItem21.getPrice();
        java.lang.String str23 = soldItem21.getName();
        soldItem21.setPrice((double) (short) 0);
        soldItem21.setQuantity((java.lang.Integer) 32);
        double double28 = soldItem21.getPrice();
        soldItem21.setPrice((double) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem21);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        java.lang.Long long17 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = soldItem13.getStockItem();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, 0);
        double double21 = soldItem20.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setName("StockItem{id=null, name='null'}");
        stockItem5.setQuantity((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = stockItem5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "SoldItem{id=1, name='null'}", "SoldItem{id=1, name='hi!'}", (double) ' ', 97);
        java.lang.String str6 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str6, "SoldItem{id=1, name='hi!'}");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = soldItem0.getStockItem();
        soldItem0.setPrice(0.0d);
        java.lang.String str6 = soldItem0.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        stockItem12.setId((java.lang.Long) 0L);
        java.lang.String str16 = stockItem12.toString();
        stockItem12.setQuantity((int) '4');
        java.lang.String str19 = stockItem12.toString();
        java.lang.String str20 = stockItem12.getName();
        java.lang.String str21 = stockItem12.toString();
        stockItem12.setQuantity(97);
        stockItem12.setName("SoldItem{id=null, name=''}");
        soldItem0.setStockItem(stockItem12);
        soldItem0.setId((java.lang.Long) 0L);
        soldItem0.setPrice(9700.0d);
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str6, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str16, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str19, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str21, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        shoppingCart13.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "StockItem{id=100, name='StockItem{id=null, name='null'}'}", (-97.0d), 32);
        stockItem5.setPrice(0.0d);
        stockItem5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "StockItem{id=0, name='hi!'}", (double) 10, 1);
        soldItem13.setStockItem(stockItem21);
        soldItem13.setId((java.lang.Long) 0L);
        java.lang.String str25 = soldItem13.toString();
        soldItem13.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=0, name='hi!'}" + "'", str25, "SoldItem{id=0, name='hi!'}");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        stockItem9.setId((java.lang.Long) 0L);
        java.lang.String str13 = stockItem9.getName();
        stockItem9.setDescription("StockItem{id=0, name='hi!'}");
        double double16 = stockItem9.getPrice();
        stockItem9.setDescription("SoldItem{id=null, name='null'}");
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = inMemorySalesSystemDAO0.findStockItem((long) 10);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(stockItem21);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = inMemorySalesSystemDAO0.findStockItem((long) 'a');
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList17 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList18 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList19 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(stockItem16);
        org.junit.Assert.assertNotNull(stockItemList17);
        org.junit.Assert.assertNotNull(stockItemList18);
        org.junit.Assert.assertNotNull(stockItemList19);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        inMemorySalesSystemDAO0.saveStockItem(stockItem19);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart21 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        java.lang.String str6 = stockItem5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem5.setQuantity((int) 'a');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 97);
        java.lang.Long long10 = soldItem9.getId();
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.getDescription();
        java.lang.String str7 = stockItem5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}" + "'", str7, "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        java.lang.String str40 = stockItem32.toString();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str40, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setDescription("");
        java.lang.String str11 = stockItem5.toString();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) ' ');
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        int int16 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str11, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 10);
        java.lang.String str8 = soldItem2.getName();
        soldItem2.setPrice(0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart5.getAll();
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
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
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        soldItem43.setName("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        soldItem13.setId((java.lang.Long) 100L);
        java.lang.String str27 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SoldItem{id=100, name='hi!'}" + "'", str27, "SoldItem{id=100, name='hi!'}");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem((long) (short) -1);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        stockItem10.setQuantity((int) (byte) 1);
        double double14 = stockItem10.getPrice();
        double double15 = stockItem10.getPrice();
        int int16 = stockItem10.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNull(stockItem13);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        java.lang.Long long55 = soldItem54.getId();
        double double56 = soldItem54.getPrice();
        java.lang.String str57 = soldItem54.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNull(long55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str57, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) (-1L));
        double double14 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
        stockItem33.setQuantity((int) (short) 1);
        stockItem33.setQuantity(97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem33);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = inMemorySalesSystemDAO0.findStockItem((-1L));
        org.junit.Assert.assertNull(stockItem13);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=1, name='null'}", "SoldItem{id=null, name='StockItem{id=null, name='null'}'}", (double) 0L, 97);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNotNull(stockItemList7);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "SoldItem{id=1, name='SoldItem{id=null, name='hi!'}'}", "StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}", (-100.0d), 1);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        soldItem14.setId((java.lang.Long) 100L);
        java.lang.String str54 = soldItem14.getName();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 97);
        double double11 = soldItem10.getPrice();
        java.lang.Class<?> wildcardClass12 = soldItem10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        soldItem18.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem26.setId((java.lang.Long) 10L);
        soldItem18.setStockItem(stockItem26);
        soldItem18.setPrice((double) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        double double33 = soldItem18.getPrice();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = inMemorySalesSystemDAO0.findStockItem((long) (byte) -1);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList15 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNull(stockItem13);
        org.junit.Assert.assertNotNull(stockItemList15);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "", "SoldItem{id=1, name='null'}", (double) (byte) 10, 97);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 32);
        int int8 = stockItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        soldItem14.setName("StockItem{id=100, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(long20);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart3.getAll();
        shoppingCart3.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart3.getAll();
        shoppingCart3.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart3.getAll();
        org.junit.Assert.assertNotNull(soldItemList4);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem45 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double46 = stockItem45.getPrice();
        stockItem45.setId((java.lang.Long) 0L);
        java.lang.String str49 = stockItem45.toString();
        stockItem45.setQuantity((int) '4');
        java.lang.String str52 = stockItem45.toString();
        java.lang.String str53 = stockItem45.getName();
        java.lang.String str54 = stockItem45.toString();
        stockItem45.setQuantity(97);
        stockItem45.setName("SoldItem{id=null, name=''}");
        inMemorySalesSystemDAO0.saveStockItem(stockItem45);
        inMemorySalesSystemDAO0.commitTransaction();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str49, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str52, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str54, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart15 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        soldItem13.setId((java.lang.Long) 100L);
        soldItem13.setName("SoldItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        java.lang.String str16 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        stockItem22.setId((java.lang.Long) 10L);
        int int31 = stockItem22.getQuantity();
        soldItem13.setStockItem(stockItem22);
        double double33 = stockItem22.getPrice();
        stockItem22.setPrice(100.0d);
        java.lang.String str36 = stockItem22.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double14 = stockItem13.getPrice();
        stockItem13.setId((java.lang.Long) 0L);
        java.lang.String str17 = stockItem13.toString();
        stockItem13.setQuantity((int) '4');
        java.lang.String str20 = stockItem13.toString();
        stockItem13.setPrice((double) (byte) 100);
        stockItem13.setQuantity((int) (byte) 1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem13);
        org.junit.Assert.assertNotNull(stockItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str17, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str20, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) 1);
        java.lang.Long long18 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        stockItem5.setPrice((double) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        stockItem5.setPrice(52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
        java.lang.String str34 = soldItem13.getName();
        java.lang.String str35 = soldItem13.getName();
        soldItem13.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        java.lang.Long long17 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem23 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double24 = stockItem23.getPrice();
        stockItem23.setId((java.lang.Long) 10L);
        soldItem13.setStockItem(stockItem23);
        java.lang.String str28 = stockItem23.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "StockItem{id=10, name='hi!'}" + "'", str28, "StockItem{id=10, name='hi!'}");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        stockItem5.setQuantity((int) 'a');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 97);
        double double10 = soldItem9.getSum();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3395.0d + "'", double10 == 3395.0d);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
        stockItem24.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
        java.lang.String str55 = soldItem14.toString();
        soldItem14.setId((java.lang.Long) (-1L));
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str55, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("");
        stockItem21.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem29 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem21, (int) (short) 100);
        double double30 = soldItem29.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        int int38 = stockItem36.getQuantity();
        double double39 = stockItem36.getPrice();
        soldItem29.setStockItem(stockItem36);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem29);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList42 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO43 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem49 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double50 = stockItem49.getPrice();
        double double51 = stockItem49.getPrice();
        stockItem49.setDescription("");
        stockItem49.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem57 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem49, (int) (short) 100);
        double double58 = soldItem57.getPrice();
        inMemorySalesSystemDAO43.saveSoldItem(soldItem57);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem65 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double66 = stockItem65.getPrice();
        stockItem65.setQuantity((int) (byte) 1);
        stockItem65.setPrice((double) ' ');
        stockItem65.setQuantity((int) (byte) 10);
        soldItem57.setStockItem(stockItem65);
        double double74 = soldItem57.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem57);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList76 = inMemorySalesSystemDAO0.findStockItems();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList42);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList76);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        shoppingCart5.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart5.getAll();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        soldItem13.setPrice(100.0d);
        soldItem13.setQuantity((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
        double double47 = soldItem18.getPrice();
        java.lang.String str48 = soldItem18.getName();
        java.lang.Class<?> wildcardClass49 = soldItem18.getClass();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stockItem44);
        org.junit.Assert.assertNotNull(stockItem46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.toString();
        java.lang.Long long16 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str15, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart15 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem12);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        stockItem5.setDescription("SoldItem{id=1, name='null'}");
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        java.lang.String str10 = stockItem5.toString();
        stockItem5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str10, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=0, name='SoldItem{id=1, name='null'}'}", "SoldItem{id=null, name='null'}", (double) '#', 10);
        stockItem5.setId((java.lang.Long) 0L);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        soldItem0.setPrice((double) 100.0f);
        java.lang.String str5 = soldItem0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str5, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "StockItem{id=100, name='StockItem{id=null, name='null'}'}", "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", (double) (-1L), (int) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 100);
        stockItem5.setQuantity(97);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart4.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO6 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO6.rollbackTransaction();
        inMemorySalesSystemDAO6.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        inMemorySalesSystemDAO6.saveSoldItem(soldItem9);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart11 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart11.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart11.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        double double21 = stockItem19.getPrice();
        stockItem19.setDescription("");
        stockItem19.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem19, (int) (short) 100);
        double double28 = soldItem27.getPrice();
        shoppingCart11.addItem(soldItem27);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double36 = stockItem35.getPrice();
        double double37 = stockItem35.getPrice();
        stockItem35.setDescription("");
        stockItem35.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem43 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem35, (int) (short) 100);
        double double44 = soldItem43.getPrice();
        java.lang.String str45 = soldItem43.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem51 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double52 = stockItem51.getPrice();
        double double53 = stockItem51.getPrice();
        stockItem51.setDescription("hi!");
        soldItem43.setStockItem(stockItem51);
        stockItem51.setDescription("");
        int int59 = stockItem51.getQuantity();
        soldItem27.setStockItem(stockItem51);
        shoppingCart4.addItem(soldItem27);
        shoppingCart4.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList12);
        org.junit.Assert.assertNotNull(soldItemList13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList4);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        int int9 = stockItem5.getQuantity();
        double double10 = stockItem5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        java.lang.String str57 = stockItem39.toString();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem59 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem39, (int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "StockItem{id=1, name='hi!'}" + "'", str57, "StockItem{id=1, name='hi!'}");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        int int9 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 10L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 0);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = inMemorySalesSystemDAO0.findStockItem((long) (short) 0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart8 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertNull(stockItem7);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        stockItem5.setId((java.lang.Long) 10L);
        int int14 = stockItem5.getQuantity();
        java.lang.String str15 = stockItem5.getDescription();
        java.lang.String str16 = stockItem5.getName();
        int int17 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
        java.lang.String str19 = stockItem5.getName();
        double double20 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
        stockItem21.setName("SoldItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.submitCurrentPurchase();
        shoppingCart2.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
        java.lang.Long long26 = soldItem22.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem22.getStockItem();
        int int28 = stockItem27.getQuantity();
        stockItem27.setName("StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        java.lang.Long long16 = soldItem13.getId();
        java.lang.String str17 = soldItem13.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = soldItem13.getStockItem();
        stockItem18.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(stockItem18);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 5200.0d, (int) (short) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 97);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "StockItem{id=100, name='StockItem{id=null, name='null'}'}", (-97.0d), 32);
        stockItem8.setPrice(0.0d);
        soldItem0.setStockItem(stockItem8);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        double double19 = stockItem17.getPrice();
        stockItem17.setDescription("");
        stockItem17.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem25 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, (int) (short) 100);
        soldItem25.setQuantity((java.lang.Integer) 0);
        double double28 = soldItem25.getSum();
        java.lang.Long long29 = soldItem25.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem30 = soldItem25.getStockItem();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem32 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem30, 0);
        soldItem0.setStockItem(stockItem30);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNotNull(stockItem30);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        stockItem17.setId((java.lang.Long) 0L);
        stockItem17.setQuantity((int) (byte) 0);
        int int23 = stockItem17.getQuantity();
        stockItem17.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, 100);
        soldItem27.setName("StockItem{id=null, name='null'}");
        soldItem27.setQuantity((java.lang.Integer) 32);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem27);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = inMemorySalesSystemDAO0.findStockItem(0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = inMemorySalesSystemDAO0.findStockItem((long) (short) 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(stockItem34);
        org.junit.Assert.assertNull(stockItem36);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem9.setId((java.lang.Long) 10L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList13 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO15 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO15.rollbackTransaction();
        inMemorySalesSystemDAO15.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        inMemorySalesSystemDAO15.saveSoldItem(soldItem18);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart20 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO15);
        shoppingCart20.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart20.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList23 = shoppingCart20.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double30 = stockItem29.getPrice();
        double double31 = stockItem29.getPrice();
        stockItem29.setDescription("");
        stockItem29.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem37 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem29, (int) (short) 100);
        soldItem37.setName("hi!");
        shoppingCart20.addItem(soldItem37);
        java.lang.Long long41 = soldItem37.getId();
        double double42 = soldItem37.getSum();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem37);
        org.junit.Assert.assertNotNull(stockItemList13);
        org.junit.Assert.assertNotNull(soldItemList22);
        org.junit.Assert.assertNotNull(soldItemList23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "hi!", (double) 32, (int) (byte) 10);
        stockItem5.setDescription("SoldItem{id=1, name='SoldItem{id=null, name='hi!'}'}");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO48 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem54 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double55 = stockItem54.getPrice();
        double double56 = stockItem54.getPrice();
        stockItem54.setDescription("");
        stockItem54.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem62 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem54, (int) (short) 100);
        double double63 = soldItem62.getPrice();
        inMemorySalesSystemDAO48.saveSoldItem(soldItem62);
        double double65 = soldItem62.getPrice();
        soldItem62.setName("");
        soldItem62.setId((java.lang.Long) (-1L));
        soldItem62.setName("StockItem{id=1, name=''}");
        double double72 = soldItem62.getPrice();
        soldItem62.setPrice((double) 1L);
        shoppingCart5.addItem(soldItem62);
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "hi!", "StockItem{id=0, name='hi!'}", (-1.0d), (int) '4');
        double double6 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double8 = soldItem7.getPrice();
        soldItem7.setQuantity((java.lang.Integer) 1);
        double double11 = soldItem7.getPrice();
        soldItem7.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO14 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList15 = inMemorySalesSystemDAO14.findStockItems();
        inMemorySalesSystemDAO14.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = inMemorySalesSystemDAO14.findStockItem((-1L));
        inMemorySalesSystemDAO14.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO20 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO20.rollbackTransaction();
        inMemorySalesSystemDAO20.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = null;
        inMemorySalesSystemDAO20.saveSoldItem(soldItem23);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList25 = inMemorySalesSystemDAO20.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO26 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem32 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double33 = stockItem32.getPrice();
        double double34 = stockItem32.getPrice();
        stockItem32.setDescription("");
        stockItem32.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem40 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem32, (int) (short) 100);
        double double41 = soldItem40.getPrice();
        inMemorySalesSystemDAO26.saveSoldItem(soldItem40);
        soldItem40.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem50 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double51 = stockItem50.getPrice();
        stockItem50.setId((java.lang.Long) 0L);
        java.lang.String str54 = stockItem50.getName();
        stockItem50.setDescription("StockItem{id=0, name='hi!'}");
        stockItem50.setQuantity((int) '4');
        stockItem50.setName("hi!");
        soldItem40.setStockItem(stockItem50);
        java.lang.String str62 = soldItem40.getName();
        double double63 = soldItem40.getPrice();
        inMemorySalesSystemDAO20.saveSoldItem(soldItem40);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem66 = inMemorySalesSystemDAO20.findStockItem(1L);
        inMemorySalesSystemDAO14.saveStockItem(stockItem66);
        soldItem7.setStockItem(stockItem66);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem69 = soldItem7.getStockItem();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(stockItemList15);
        org.junit.Assert.assertNull(stockItem18);
        org.junit.Assert.assertNotNull(stockItemList25);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem66);
        org.junit.Assert.assertNotNull(stockItem69);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
        stockItem24.setQuantity(100);
        java.lang.String str35 = stockItem24.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem5);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        stockItem27.setDescription("SoldItem{id=1, name='null'}");
        java.lang.String str30 = stockItem27.toString();
        stockItem27.setDescription("StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str30, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        stockItem9.setId((java.lang.Long) 0L);
        java.lang.String str13 = stockItem9.getName();
        stockItem9.setDescription("StockItem{id=0, name='hi!'}");
        double double16 = stockItem9.getPrice();
        stockItem9.setDescription("SoldItem{id=null, name='null'}");
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double27 = stockItem26.getPrice();
        stockItem26.setId((java.lang.Long) 0L);
        stockItem26.setQuantity((int) (byte) 0);
        int int32 = stockItem26.getQuantity();
        stockItem26.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem26);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        java.lang.String str14 = stockItem5.getName();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 0);
        java.lang.String str17 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str17, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        double double16 = soldItem13.getSum();
        soldItem13.setPrice(9700.0d);
        double double19 = soldItem13.getPrice();
        soldItem13.setQuantity((java.lang.Integer) 1);
        soldItem13.setQuantity((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9700.0d + "'", double19 == 9700.0d);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        soldItem0.setPrice((double) 100.0f);
        double double5 = soldItem0.getPrice();
        java.lang.Integer int6 = soldItem0.getQuantity();
        double double7 = soldItem0.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
        java.lang.String str43 = stockItem32.getDescription();
        stockItem32.setQuantity(0);
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str25, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        soldItem13.setPrice(100.0d);
        soldItem13.setId((java.lang.Long) 1L);
        java.lang.String str19 = soldItem13.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str19, "SoldItem{id=1, name='hi!'}");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        java.lang.Long long17 = soldItem13.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem18 = soldItem13.getStockItem();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem18, 0);
        java.lang.String str21 = stockItem18.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        double double19 = stockItem17.getPrice();
        stockItem17.setDescription("");
        stockItem17.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem25 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, (int) (short) 100);
        double double26 = soldItem25.getPrice();
        java.lang.String str27 = soldItem25.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "StockItem{id=0, name='hi!'}", (double) 10, 1);
        soldItem25.setStockItem(stockItem33);
        soldItem25.setId((java.lang.Long) 0L);
        java.lang.String str37 = soldItem25.toString();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem25);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "SoldItem{id=0, name='hi!'}" + "'", str37, "SoldItem{id=0, name='hi!'}");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        int int6 = stockItem5.getQuantity();
        double double7 = stockItem5.getPrice();
        java.lang.String str8 = stockItem5.getDescription();
        double double9 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str8, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = inMemorySalesSystemDAO0.findStockItem((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(stockItem13);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        shoppingCart5.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart5.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
        java.lang.Long long26 = soldItem22.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem22.getStockItem();
        stockItem27.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNotNull(stockItem27);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
        soldItem14.setQuantity((java.lang.Integer) 10);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = soldItem14.getStockItem();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(stockItem20);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
        java.lang.Long long55 = soldItem54.getId();
        soldItem54.setQuantity((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNull(long55);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        soldItem12.setPrice((double) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem20 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str21 = stockItem20.getDescription();
        stockItem20.setQuantity(10);
        stockItem20.setId((java.lang.Long) 0L);
        soldItem12.setStockItem(stockItem20);
        java.lang.Class<?> wildcardClass27 = stockItem20.getClass();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        soldItem13.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = soldItem2.getStockItem();
        java.lang.String str12 = soldItem2.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertNull(stockItem11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double7 = stockItem6.getPrice();
        double double8 = stockItem6.getPrice();
        stockItem6.setDescription("");
        stockItem6.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem6, (int) (short) 100);
        double double15 = soldItem14.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = soldItem14.getStockItem();
        java.lang.String str18 = soldItem14.toString();
        soldItem14.setQuantity((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str18, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart14.cancelCurrentPurchase();
        shoppingCart14.submitCurrentPurchase();
        shoppingCart14.submitCurrentPurchase();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "Lays chips", "SoldItem{id=null, name='hi!'}", 97.0d, (-1));
        stockItem5.setQuantity((int) '4');
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 5200.0d, (int) (short) 100);
        inMemorySalesSystemDAO0.saveStockItem(stockItem16);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = inMemorySalesSystemDAO0.findStockItem((long) '#');
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = inMemorySalesSystemDAO0.findStockItem((long) '#');
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem23 = inMemorySalesSystemDAO0.findStockItem((long) 1);
        int int24 = stockItem23.getQuantity();
        org.junit.Assert.assertNull(stockItem19);
        org.junit.Assert.assertNull(stockItem21);
        org.junit.Assert.assertNotNull(stockItem23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((long) (-1));
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str11 = stockItem10.getDescription();
        stockItem10.setQuantity(10);
        stockItem10.setQuantity((int) (byte) 0);
        stockItem10.setQuantity((int) 'a');
        stockItem10.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        stockItem10.setQuantity(0);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO39 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO39.rollbackTransaction();
        inMemorySalesSystemDAO39.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart42 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO39);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO43 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem49 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double50 = stockItem49.getPrice();
        double double51 = stockItem49.getPrice();
        stockItem49.setDescription("");
        stockItem49.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem57 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem49, (int) (short) 100);
        double double58 = soldItem57.getPrice();
        inMemorySalesSystemDAO43.saveSoldItem(soldItem57);
        java.lang.String str60 = soldItem57.getName();
        soldItem57.setQuantity((java.lang.Integer) 10);
        shoppingCart42.addItem(soldItem57);
        soldItem57.setName("StockItem{id=100, name='hi!'}");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem57);
        java.lang.String str67 = soldItem57.getName();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "StockItem{id=100, name='hi!'}" + "'", str67, "StockItem{id=100, name='hi!'}");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
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
        soldItem13.setQuantity((java.lang.Integer) 97);
        soldItem13.setName("StockItem{id=1, name='StockItem{id=0, name='hi!'}'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(stockItem29);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (byte) 0);
        int int11 = stockItem5.getQuantity();
        stockItem5.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, 100);
        java.lang.String str16 = soldItem15.toString();
        java.lang.Long long17 = soldItem15.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = soldItem0.getStockItem();
        soldItem0.setPrice(0.0d);
        java.lang.String str6 = soldItem0.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        stockItem12.setId((java.lang.Long) 0L);
        java.lang.String str16 = stockItem12.toString();
        stockItem12.setQuantity((int) '4');
        java.lang.String str19 = stockItem12.toString();
        java.lang.String str20 = stockItem12.getName();
        java.lang.String str21 = stockItem12.toString();
        stockItem12.setQuantity(97);
        stockItem12.setName("SoldItem{id=null, name=''}");
        soldItem0.setStockItem(stockItem12);
        soldItem0.setId((java.lang.Long) 0L);
        soldItem0.setPrice((double) 'a');
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str6, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str16, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str19, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str21, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
        stockItem29.setName("");
        stockItem29.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(stockItem29);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
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
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart7 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
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
        java.lang.String str25 = stockItem16.getDescription();
        java.lang.String str26 = stockItem16.toString();
        int int27 = stockItem16.getQuantity();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str26, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem29 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double30 = stockItem29.getPrice();
        stockItem29.setId((java.lang.Long) 0L);
        java.lang.String str33 = stockItem29.toString();
        java.lang.String str34 = stockItem29.getDescription();
        soldItem17.setStockItem(stockItem29);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem41 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double42 = stockItem41.getPrice();
        double double43 = stockItem41.getPrice();
        stockItem41.setDescription("");
        stockItem41.setQuantity((int) (short) 10);
        stockItem41.setId((java.lang.Long) 10L);
        int int50 = stockItem41.getQuantity();
        java.lang.String str51 = stockItem41.getDescription();
        stockItem41.setName("SoldItem{id=1, name='null'}");
        soldItem17.setStockItem(stockItem41);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem56 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem41, (int) (short) 0);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str33, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
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
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
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
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem(1L);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItem8);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        stockItem5.setQuantity((int) 'a');
        stockItem5.setName("");
        stockItem5.setDescription("SoldItem{id=1, name='hi!'}");
        java.lang.Class<?> wildcardClass17 = stockItem5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = inMemorySalesSystemDAO0.findStockItem((long) 'a');
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList17 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = inMemorySalesSystemDAO0.findStockItem((long) 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(stockItem16);
        org.junit.Assert.assertNotNull(stockItemList17);
        org.junit.Assert.assertNull(stockItem19);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem13 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name='hi!'}", "SoldItem{id=null, name=''}", (double) (short) 1, (int) (byte) 100);
        inMemorySalesSystemDAO0.saveStockItem(stockItem13);
        org.junit.Assert.assertNotNull(stockItemList7);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, (int) (short) 100);
        stockItem7.setName("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        stockItem7.setPrice((double) (-1));
        stockItem7.setPrice((double) 1.0f);
        double double19 = stockItem7.getPrice();
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        stockItem19.setId((java.lang.Long) 0L);
        java.lang.String str23 = stockItem19.toString();
        stockItem19.setQuantity((int) '4');
        java.lang.String str26 = stockItem19.toString();
        java.lang.String str27 = stockItem19.getName();
        java.lang.String str28 = stockItem19.toString();
        java.lang.String str29 = stockItem19.getDescription();
        java.lang.String str30 = stockItem19.getDescription();
        inMemorySalesSystemDAO0.saveStockItem(stockItem19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str23, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str26, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str28, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        java.lang.String str6 = stockItem5.toString();
        stockItem5.setPrice(9700.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}" + "'", str6, "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        double double15 = soldItem13.getPrice();
        java.lang.String str16 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem((long) (short) 100);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
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
        java.lang.String str38 = stockItem32.toString();
        inMemorySalesSystemDAO0.saveStockItem(stockItem32);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNull(stockItem8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str38, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=1, name=''}", "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", 10.0d, 97);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        double double12 = stockItem5.getPrice();
        stockItem5.setName("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
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
        java.lang.String str31 = stockItem29.getDescription();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
        java.lang.Long long56 = soldItem54.getId();
        java.lang.String str57 = soldItem54.toString();
        double double58 = soldItem54.getSum();
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
        org.junit.Assert.assertNull(long56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str57, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        stockItem15.setPrice((-1.0d));
        stockItem15.setDescription("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem15, (int) (short) 0);
        java.lang.String str22 = soldItem21.getName();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
        soldItem13.setQuantity((java.lang.Integer) 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double12 = stockItem11.getPrice();
        stockItem11.setQuantity((int) (byte) 1);
        stockItem11.setQuantity(1);
        stockItem11.setDescription("StockItem{id=null, name='null'}");
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart14.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem16.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = soldItem16.getStockItem();
        soldItem16.setName("hi!");
        soldItem16.setName("StockItem{id=0, name='SoldItem{id=1, name='null'}'}");
        shoppingCart14.addItem(soldItem16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(stockItem19);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        java.lang.Class<?> wildcardClass6 = inMemorySalesSystemDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setQuantity((java.lang.Integer) 0);
        double double16 = soldItem13.getSum();
        double double17 = soldItem13.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.commitTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        soldItem18.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem26.setId((java.lang.Long) 10L);
        soldItem18.setStockItem(stockItem26);
        soldItem18.setPrice((double) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem38 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double39 = stockItem38.getPrice();
        stockItem38.setId((java.lang.Long) 0L);
        stockItem38.setQuantity((int) (byte) 0);
        int int44 = stockItem38.getQuantity();
        stockItem38.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem48 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem38, 100);
        soldItem18.setStockItem(stockItem38);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '#');
        double double8 = soldItem7.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
        soldItem20.setId((java.lang.Long) 0L);
        soldItem20.setName("SoldItem{id=null, name=''}");
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
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
        stockItem21.setDescription("");
        stockItem21.setPrice((double) 52);
        java.lang.String str31 = stockItem21.getDescription();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem33 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem21, 52);
        double double34 = soldItem33.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2704.0d + "'", double34 == 2704.0d);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=1, name='hi!'}", "StockItem{id=100, name='hi!'}", (double) 10L, (int) (byte) 100);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double13 = stockItem12.getPrice();
        double double14 = stockItem12.getPrice();
        stockItem12.setDescription("");
        stockItem12.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem12, (int) (short) 100);
        double double21 = soldItem20.getPrice();
        java.lang.String str22 = soldItem20.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem28 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double29 = stockItem28.getPrice();
        double double30 = stockItem28.getPrice();
        stockItem28.setDescription("hi!");
        soldItem20.setStockItem(stockItem28);
        java.lang.String str34 = soldItem20.toString();
        java.lang.Long long35 = soldItem20.getId();
        double double36 = soldItem20.getSum();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem20);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str34, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
        shoppingCart18.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertNull(stockItem17);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
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
        soldItem13.setQuantity((java.lang.Integer) 97);
        double double21 = soldItem13.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = soldItem13.getStockItem();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem22);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        java.lang.String str13 = stockItem5.getName();
        java.lang.String str14 = stockItem5.toString();
        java.lang.String str15 = stockItem5.getDescription();
        java.lang.String str16 = stockItem5.getDescription();
        java.lang.String str17 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str14, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList8 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO10 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double17 = stockItem16.getPrice();
        double double18 = stockItem16.getPrice();
        stockItem16.setDescription("");
        stockItem16.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem16, (int) (short) 100);
        double double25 = soldItem24.getPrice();
        inMemorySalesSystemDAO10.saveSoldItem(soldItem24);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = soldItem24.getStockItem();
        java.lang.String str28 = soldItem24.toString();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem24);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNotNull(stockItemList8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str28, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 1);
        java.lang.String str8 = soldItem2.toString();
        soldItem2.setPrice((double) 100L);
        soldItem2.setPrice((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem1 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem1.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = soldItem1.getStockItem();
        soldItem1.setName("hi!");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
        soldItem1.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(stockItem4);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setPrice((double) 'a');
        java.lang.String str16 = soldItem13.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem22 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double23 = stockItem22.getPrice();
        double double24 = stockItem22.getPrice();
        stockItem22.setDescription("");
        stockItem22.setQuantity((int) (short) 10);
        stockItem22.setId((java.lang.Long) 10L);
        int int31 = stockItem22.getQuantity();
        soldItem13.setStockItem(stockItem22);
        java.lang.String str33 = soldItem13.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = inMemorySalesSystemDAO0.findStockItem((-1L));
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNull(stockItem5);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO5 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList7 = inMemorySalesSystemDAO5.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList8 = inMemorySalesSystemDAO5.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart9 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO5);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart10 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO5);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem12 = inMemorySalesSystemDAO5.findStockItem((long) (short) 1);
        stockItem12.setQuantity(1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem12);
        org.junit.Assert.assertNotNull(stockItemList7);
        org.junit.Assert.assertNotNull(stockItemList8);
        org.junit.Assert.assertNotNull(stockItem12);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getName();
        stockItem5.setDescription("hi!");
        int int9 = stockItem5.getQuantity();
        java.lang.String str10 = stockItem5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str10, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double8 = soldItem7.getPrice();
        soldItem7.setQuantity((java.lang.Integer) 1);
        double double11 = soldItem7.getPrice();
        soldItem7.setPrice((double) ' ');
        soldItem7.setName("SoldItem{id=null, name='null'}");
        soldItem7.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
        double double21 = soldItem14.getPrice();
        java.lang.String str22 = soldItem14.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        java.lang.String str8 = soldItem7.toString();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double15 = stockItem14.getPrice();
        double double16 = stockItem14.getPrice();
        java.lang.String str17 = stockItem14.getName();
        stockItem14.setQuantity(97);
        soldItem7.setStockItem(stockItem14);
        stockItem14.setQuantity((int) (short) -1);
        double double23 = stockItem14.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=null, name='StockItem{id=null, name='null'}'}" + "'", str8, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=1, name='StockItem{id=0, name='hi!'}'}", "StockItem{id=0, name='SoldItem{id=null, name='hi!'}'}", 0.0d, 97);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        stockItem5.setQuantity((int) (byte) 10);
        double double13 = stockItem5.getPrice();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem6);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = soldItem15.getStockItem();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem21);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList4 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        stockItem10.setId((java.lang.Long) 0L);
        java.lang.String str14 = stockItem10.getName();
        stockItem10.setDescription("StockItem{id=0, name='hi!'}");
        double double17 = stockItem10.getPrice();
        stockItem10.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem10);
        org.junit.Assert.assertNotNull(stockItemList4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "SoldItem{id=null, name=''}", (double) 32, (int) (byte) 1);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
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
        double double30 = soldItem24.getSum();
        java.lang.String str31 = soldItem24.getName();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertNotNull(soldItemList10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 9700.0d + "'", double30 == 9700.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
        soldItem13.setQuantity((java.lang.Integer) 97);
        java.lang.String str21 = soldItem13.getName();
        java.lang.Long long22 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(long22);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setId((java.lang.Long) 1L);
        stockItem5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem13.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = soldItem13.getStockItem();
        soldItem13.setName("hi!");
        java.lang.String str19 = soldItem13.toString();
        double double20 = soldItem13.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem13);
        org.junit.Assert.assertNull(stockItem16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str19, "SoldItem{id=1, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "", "SoldItem{id=1, name='null'}", (double) (byte) 10, 97);
        java.lang.String str6 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str6, "SoldItem{id=1, name='null'}");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        soldItem2.setQuantity((java.lang.Integer) 10);
        double double8 = soldItem2.getPrice();
        soldItem2.setQuantity((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem48 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem54 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double55 = stockItem54.getPrice();
        stockItem54.setId((java.lang.Long) 0L);
        stockItem54.setQuantity((int) (byte) 0);
        int int60 = stockItem54.getQuantity();
        stockItem54.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem64 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem54, 100);
        soldItem64.setName("StockItem{id=null, name='null'}");
        soldItem64.setQuantity((java.lang.Integer) 97);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem69 = null;
        soldItem64.setStockItem(stockItem69);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem64);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem77 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double78 = stockItem77.getPrice();
        double double79 = stockItem77.getPrice();
        stockItem77.setDescription("");
        stockItem77.setQuantity((int) (short) 10);
        stockItem77.setId((java.lang.Long) 10L);
        int int86 = stockItem77.getQuantity();
        java.lang.String str87 = stockItem77.getDescription();
        stockItem77.setId((java.lang.Long) 0L);
        java.lang.String str90 = stockItem77.getName();
        java.lang.String str91 = stockItem77.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem77);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart93 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart93.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem46);
        org.junit.Assert.assertNotNull(stockItem48);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        java.lang.String str12 = stockItem5.toString();
        stockItem5.setId((java.lang.Long) 100L);
        java.lang.String str15 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str15, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
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
        stockItem21.setDescription("");
        stockItem21.setQuantity((int) (byte) 1);
        double double31 = stockItem21.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO3 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO3.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem5.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO3.saveSoldItem(soldItem5);
        soldItem5.setPrice((double) '4');
        soldItem5.setName("StockItem{id=1, name=''}");
        shoppingCart2.addItem(soldItem5);
        java.lang.String str14 = soldItem5.getName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StockItem{id=1, name=''}" + "'", str14, "StockItem{id=1, name=''}");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
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
        soldItem13.setQuantity((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        soldItem13.setPrice((double) (short) 0);
        soldItem13.setPrice((double) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str20 = stockItem19.toString();
        inMemorySalesSystemDAO0.saveStockItem(stockItem19);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "", "SoldItem{id=null, name='StockItem{id=null, name='null'}'}", 97.0d, (-1));
        inMemorySalesSystemDAO0.saveStockItem(stockItem27);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str20, "StockItem{id=0, name='hi!'}");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem35 = null;
        soldItem13.setStockItem(stockItem35);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO37 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart38 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO37);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem44 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem44.setName("");
        inMemorySalesSystemDAO37.saveStockItem(stockItem44);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem49 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem44, (int) (short) 100);
        soldItem49.setPrice((double) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem57 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str58 = stockItem57.getDescription();
        stockItem57.setQuantity(10);
        stockItem57.setId((java.lang.Long) 0L);
        soldItem49.setStockItem(stockItem57);
        double double64 = stockItem57.getPrice();
        soldItem13.setStockItem(stockItem57);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9700.0d + "'", double16 == 9700.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str29, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str33, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertNotNull(stockItem34);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
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
        int int38 = stockItem22.getQuantity();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem40 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem22, (int) (byte) 100);
        soldItem40.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
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
        java.lang.Class<?> wildcardClass20 = soldItem13.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str16, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
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
        soldItem13.setPrice((double) (short) 0);
        soldItem13.setName("SoldItem{id=null, name='null'}");
        double double22 = soldItem13.getSum();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        stockItem7.setName("");
        stockItem7.setQuantity((int) '4');
        stockItem7.setQuantity((int) (short) 0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem7, 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double12 = stockItem11.getPrice();
        double double13 = stockItem11.getPrice();
        stockItem11.setDescription("");
        stockItem11.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem11, (int) (short) 100);
        double double20 = soldItem19.getPrice();
        java.lang.String str21 = soldItem19.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem27 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double28 = stockItem27.getPrice();
        double double29 = stockItem27.getPrice();
        stockItem27.setDescription("hi!");
        soldItem19.setStockItem(stockItem27);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = soldItem19.getStockItem();
        stockItem33.setDescription("SoldItem{id=1, name='null'}");
        stockItem33.setQuantity((int) (short) 1);
        inMemorySalesSystemDAO0.saveStockItem(stockItem33);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart39 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem33);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setQuantity(1);
        stockItem5.setName("StockItem{id=0, name='hi!'}");
        java.lang.String str13 = stockItem5.getDescription();
        stockItem5.setPrice((double) (byte) 1);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setQuantity(1);
        stockItem5.setName("StockItem{id=null, name='null'}");
        stockItem5.setName("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
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
        java.lang.String str25 = stockItem20.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList5 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList6 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = inMemorySalesSystemDAO0.findStockItem((long) (short) 100);
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.beginTransaction();
        org.junit.Assert.assertNotNull(stockItemList5);
        org.junit.Assert.assertNotNull(stockItemList6);
        org.junit.Assert.assertNull(stockItem8);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
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
        soldItem20.setQuantity((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass27 = soldItem20.getClass();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = inMemorySalesSystemDAO0.findStockItem((-1L));
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        int int12 = stockItem11.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList15 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem16);
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(stockItemList15);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
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
        double double26 = soldItem19.getSum();
        soldItem19.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 9700.0d + "'", double26 == 9700.0d);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList46 = shoppingCart2.getAll();
        shoppingCart2.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(stockItemList1);
        org.junit.Assert.assertNotNull(soldItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stockItem44);
        org.junit.Assert.assertNotNull(soldItemList46);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setQuantity(10);
        stockItem5.setQuantity((int) (byte) 0);
        stockItem5.setQuantity((int) 'a');
        stockItem5.setName("");
        stockItem5.setDescription("SoldItem{id=1, name='hi!'}");
        stockItem5.setName("SoldItem{id=0, name='StockItem{id=null, name='null'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "Lays chips", "SoldItem{id=null, name='hi!'}", 97.0d, (-1));
        java.lang.String str6 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str6, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
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
        double double26 = stockItem24.getPrice();
        stockItem24.setDescription("");
        stockItem24.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem32 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem24, (int) (short) 100);
        soldItem14.setStockItem(stockItem24);
        soldItem14.setName("StockItem{id=100, name='null'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        inMemorySalesSystemDAO0.rollbackTransaction();
        org.junit.Assert.assertNotNull(stockItemList2);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("hi!");
        stockItem5.setQuantity((-1));
        stockItem5.setPrice((double) (short) 10);
        java.lang.String str20 = stockItem5.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
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
        java.lang.String str26 = soldItem13.getName();
        java.lang.Long long27 = soldItem13.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
        java.lang.Class<?> wildcardClass30 = stockItem29.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stockItem27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(stockItem29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
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
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO39 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO39.rollbackTransaction();
        inMemorySalesSystemDAO39.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart42 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO39);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO43 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem49 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double50 = stockItem49.getPrice();
        double double51 = stockItem49.getPrice();
        stockItem49.setDescription("");
        stockItem49.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem57 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem49, (int) (short) 100);
        double double58 = soldItem57.getPrice();
        inMemorySalesSystemDAO43.saveSoldItem(soldItem57);
        java.lang.String str60 = soldItem57.getName();
        soldItem57.setQuantity((java.lang.Integer) 10);
        shoppingCart42.addItem(soldItem57);
        soldItem57.setName("StockItem{id=100, name='hi!'}");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem57);
        inMemorySalesSystemDAO0.rollbackTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList68 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(stockItemList68);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setDescription("SoldItem{id=null, name='hi!'}");
        stockItem5.setId((java.lang.Long) 100L);
        stockItem5.setDescription("SoldItem{id=null, name='hi!'}");
        double double20 = stockItem5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
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
        soldItem14.setName("SoldItem{id=100, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart5 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart5.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart5.getAll();
        shoppingCart5.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart5.getAll();
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart6 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart6.cancelCurrentPurchase();
        shoppingCart6.submitCurrentPurchase();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        int int7 = stockItem5.getQuantity();
        double double8 = stockItem5.getPrice();
        stockItem5.setDescription("");
        java.lang.String str11 = stockItem5.toString();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) 100);
        double double14 = stockItem5.getPrice();
        java.lang.String str15 = stockItem5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str11, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=0, name=''}", "SoldItem{id=1, name='hi!'}", (double) (short) -1, (int) ' ');
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        soldItem13.setName("hi!");
        soldItem13.setId((java.lang.Long) 0L);
        soldItem13.setName("StockItem{id=10, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=0, name='hi!'}", "hi!", (double) '#', (-1));
        java.lang.String str6 = stockItem5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}" + "'", str6, "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem(0L);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem6 = inMemorySalesSystemDAO0.findStockItem((long) 100);
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertNull(stockItem6);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.toString();
        stockItem5.setQuantity((int) '4');
        java.lang.String str12 = stockItem5.toString();
        java.lang.String str13 = stockItem5.getName();
        java.lang.String str14 = stockItem5.toString();
        java.lang.String str15 = stockItem5.getDescription();
        stockItem5.setDescription("SoldItem{id=1, name='hi!'}");
        stockItem5.setId((java.lang.Long) 100L);
        stockItem5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str9, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str12, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StockItem{id=0, name='hi!'}" + "'", str14, "StockItem{id=0, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "SoldItem{id=null, name='StockItem{id=null, name='null'}'}", "SoldItem{id=1, name='null'}", 10000.0d, 0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) '4');
        stockItem5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart4.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart4.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart4.getAll();
        shoppingCart4.submitCurrentPurchase();
        org.junit.Assert.assertNotNull(soldItemList6);
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        java.lang.String str9 = stockItem5.getName();
        stockItem5.setDescription("StockItem{id=0, name='hi!'}");
        stockItem5.setQuantity((int) '4');
        stockItem5.setName("hi!");
        stockItem5.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO12.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        int int21 = stockItem19.getQuantity();
        inMemorySalesSystemDAO12.saveStockItem(stockItem19);
        stockItem19.setName("");
        java.lang.String str25 = stockItem19.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem19);
        int int27 = stockItem19.getQuantity();
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "SoldItem{id=null, name='hi!'}", "StockItem{id=1, name=''}", (double) (-1L), (int) 'a');
        java.lang.String str6 = stockItem5.toString();
        java.lang.String str7 = stockItem5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StockItem{id=1, name='SoldItem{id=null, name='hi!'}'}" + "'", str6, "StockItem{id=1, name='SoldItem{id=null, name='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StockItem{id=1, name=''}" + "'", str7, "StockItem{id=1, name=''}");
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        double double21 = stockItem19.getPrice();
        stockItem19.setDescription("");
        stockItem19.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem19, (int) (short) 100);
        double double28 = soldItem27.getPrice();
        soldItem27.setPrice(100.0d);
        soldItem27.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem27);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
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
        shoppingCart5.cancelCurrentPurchase();
        shoppingCart5.submitCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList50 = shoppingCart5.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList50);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
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
        double double25 = soldItem17.getSum();
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = inMemorySalesSystemDAO0.findStockItem((long) ' ');
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList15 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO16 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO16.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem18.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO16.saveSoldItem(soldItem18);
        soldItem18.setQuantity((java.lang.Integer) 1);
        soldItem18.setPrice((double) (byte) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = soldItem18.getStockItem();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart28 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        org.junit.Assert.assertNull(stockItem14);
        org.junit.Assert.assertNotNull(stockItemList15);
        org.junit.Assert.assertNull(stockItem26);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double32 = stockItem31.getPrice();
        double double33 = stockItem31.getPrice();
        stockItem31.setDescription("");
        stockItem31.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem39 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem31, (int) (short) 100);
        soldItem39.setQuantity((java.lang.Integer) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem47 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "StockItem{id=0, name='hi!'}", "", (double) (byte) 0, (int) ' ');
        stockItem47.setId((java.lang.Long) 10L);
        soldItem39.setStockItem(stockItem47);
        java.lang.Long long51 = soldItem39.getId();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem39);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO53 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart54 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO53);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem60 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem60.setName("");
        inMemorySalesSystemDAO53.saveStockItem(stockItem60);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem65 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem60, (int) (short) 100);
        stockItem60.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveStockItem(stockItem60);
        org.junit.Assert.assertNotNull(stockItemList7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(long51);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart15 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart15.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart15.getAll();
        shoppingCart15.cancelCurrentPurchase();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem1 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem1.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem4 = soldItem1.getStockItem();
        soldItem1.setName("hi!");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
        java.lang.String str8 = soldItem1.getName();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = soldItem1.getStockItem();
        org.junit.Assert.assertNull(stockItem4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(stockItem9);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO12 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO12.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double20 = stockItem19.getPrice();
        int int21 = stockItem19.getQuantity();
        inMemorySalesSystemDAO12.saveStockItem(stockItem19);
        stockItem19.setName("");
        java.lang.String str25 = stockItem19.getName();
        inMemorySalesSystemDAO0.saveStockItem(stockItem19);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = null;
        inMemorySalesSystemDAO0.saveSoldItem(soldItem27);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double8 = stockItem7.getPrice();
        int int9 = stockItem7.getQuantity();
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        double double11 = stockItem7.getPrice();
        double double12 = stockItem7.getPrice();
        int int13 = stockItem7.getQuantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str8 = stockItem7.getDescription();
        stockItem7.setQuantity(10);
        stockItem7.setQuantity((int) (byte) 0);
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart14 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart15 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        java.lang.String str17 = soldItem16.getName();
        shoppingCart15.addItem(soldItem16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem14 = inMemorySalesSystemDAO0.findStockItem((long) ' ');
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList15 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO16 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO16.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem18.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO16.saveSoldItem(soldItem18);
        soldItem18.setQuantity((java.lang.Integer) 1);
        soldItem18.setPrice((double) (byte) -1);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem26 = soldItem18.getStockItem();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem33 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double34 = stockItem33.getPrice();
        stockItem33.setId((java.lang.Long) 0L);
        java.lang.String str37 = stockItem33.getName();
        stockItem33.setDescription("StockItem{id=0, name='hi!'}");
        stockItem33.setQuantity((int) '4');
        stockItem33.setName("StockItem{id=null, name='null'}");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem45 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem33, (int) (short) -1);
        stockItem33.setPrice((double) 10L);
        soldItem18.setStockItem(stockItem33);
        org.junit.Assert.assertNull(stockItem14);
        org.junit.Assert.assertNotNull(stockItemList15);
        org.junit.Assert.assertNull(stockItem26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
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
        stockItem24.setId((java.lang.Long) 100L);
        java.lang.String str38 = stockItem24.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "StockItem{id=100, name='hi!'}" + "'", str38, "StockItem{id=100, name='hi!'}");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem7 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 1L, "hi!", "", (double) '4', (int) (byte) -1);
        stockItem7.setName("");
        inMemorySalesSystemDAO0.saveStockItem(stockItem7);
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        stockItem17.setId((java.lang.Long) 0L);
        stockItem17.setQuantity((int) (byte) 0);
        int int23 = stockItem17.getQuantity();
        stockItem17.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem27 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem17, 100);
        soldItem27.setName("StockItem{id=null, name='null'}");
        soldItem27.setQuantity((java.lang.Integer) 32);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem27);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem34 = inMemorySalesSystemDAO0.findStockItem((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(stockItem34);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.rollbackTransaction();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart3 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart4 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart4.submitCurrentPurchase();
        shoppingCart4.cancelCurrentPurchase();
        shoppingCart4.cancelCurrentPurchase();
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
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
        soldItem14.setPrice(97.0d);
        java.lang.Class<?> wildcardClass54 = soldItem14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        stockItem5.setDescription("SoldItem{id=1, name='null'}");
        java.lang.String str8 = stockItem5.getDescription();
        double double9 = stockItem5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SoldItem{id=1, name='null'}" + "'", str8, "SoldItem{id=1, name='null'}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
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
        soldItem14.setId((java.lang.Long) 10L);
        soldItem14.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
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
        java.lang.String str26 = soldItem19.toString();
        java.lang.String str27 = soldItem19.toString();
        double double28 = soldItem19.getSum();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str26, "SoldItem{id=1, name='hi!'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SoldItem{id=1, name='hi!'}" + "'", str27, "SoldItem{id=1, name='hi!'}");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 9700.0d + "'", double28 == 9700.0d);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setId((java.lang.Long) 0L);
        stockItem5.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem10 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double11 = stockItem10.getPrice();
        double double12 = stockItem10.getPrice();
        stockItem10.setDescription("");
        stockItem10.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem10, (int) (short) 100);
        double double19 = soldItem18.getPrice();
        soldItem18.setPrice(100.0d);
        double double22 = soldItem18.getPrice();
        java.lang.String str23 = soldItem18.getName();
        java.lang.Long long24 = soldItem18.getId();
        soldItem18.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem18);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(long24);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        soldItem0.setPrice((double) 100.0f);
        soldItem0.setId((java.lang.Long) 0L);
        java.lang.String str7 = soldItem0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SoldItem{id=0, name='null'}" + "'", str7, "SoldItem{id=0, name='null'}");
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem3 = soldItem0.getStockItem();
        soldItem0.setName("hi!");
        java.lang.String str6 = soldItem0.getName();
        org.junit.Assert.assertNull(stockItem3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
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
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem60 = inMemorySalesSystemDAO0.findStockItem((long) '4');
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
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
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
        soldItem22.setPrice((double) 100);
        org.junit.Assert.assertNotNull(soldItemList7);
        org.junit.Assert.assertNotNull(soldItemList8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "SoldItem{id=null, name='hi!'}", "", (double) (-1L), (int) (byte) 1);
        java.lang.String str6 = stockItem5.getDescription();
        stockItem5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 10L, "StockItem{id=1, name='SoldItem{id=null, name='hi!'}'}", "StockItem{id=null, name='null'}", (double) 100L, (int) (byte) 0);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList2 = inMemorySalesSystemDAO0.findStockItems();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList3 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        java.lang.String str10 = stockItem9.getDescription();
        stockItem9.setQuantity(10);
        inMemorySalesSystemDAO0.saveStockItem(stockItem9);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem15 = inMemorySalesSystemDAO0.findStockItem((long) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem21 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double22 = stockItem21.getPrice();
        double double23 = stockItem21.getPrice();
        stockItem21.setDescription("");
        stockItem21.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem29 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem21, (int) (short) 100);
        double double30 = soldItem29.getSum();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem36 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double37 = stockItem36.getPrice();
        int int38 = stockItem36.getQuantity();
        double double39 = stockItem36.getPrice();
        soldItem29.setStockItem(stockItem36);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem29);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList42 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO43 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem49 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double50 = stockItem49.getPrice();
        double double51 = stockItem49.getPrice();
        stockItem49.setDescription("");
        stockItem49.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem57 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem49, (int) (short) 100);
        double double58 = soldItem57.getPrice();
        inMemorySalesSystemDAO43.saveSoldItem(soldItem57);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem65 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double66 = stockItem65.getPrice();
        stockItem65.setQuantity((int) (byte) 1);
        stockItem65.setPrice((double) ' ');
        stockItem65.setQuantity((int) (byte) 10);
        soldItem57.setStockItem(stockItem65);
        double double74 = soldItem57.getPrice();
        inMemorySalesSystemDAO0.saveSoldItem(soldItem57);
        inMemorySalesSystemDAO0.commitTransaction();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO77 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO77.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem79 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem79.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO77.saveSoldItem(soldItem79);
        soldItem79.setPrice((double) '4');
        soldItem79.setName("StockItem{id=1, name=''}");
        inMemorySalesSystemDAO0.saveSoldItem(soldItem79);
        org.junit.Assert.assertNotNull(stockItemList2);
        org.junit.Assert.assertNotNull(stockItemList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stockItem15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(stockItemList42);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
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
        stockItem24.setId((java.lang.Long) 100L);
        double double38 = stockItem24.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double13 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 10);
        double double16 = stockItem5.getPrice();
        stockItem5.setDescription("SoldItem{id=null, name='StockItem{id=null, name='null'}'}");
        stockItem5.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
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
        soldItem19.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SoldItem{id=null, name='hi!'}" + "'", str22, "SoldItem{id=null, name='hi!'}");
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        stockItem5.setQuantity((int) (byte) 1);
        stockItem5.setPrice((double) ' ');
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (byte) -1);
        double double13 = stockItem5.getPrice();
        stockItem5.setName("StockItem{id=10, name='hi!'}");
        java.lang.String str16 = stockItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StockItem{id=0, name='StockItem{id=10, name='hi!'}'}" + "'", str16, "StockItem{id=0, name='StockItem{id=10, name='hi!'}'}");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem5 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double6 = stockItem5.getPrice();
        double double7 = stockItem5.getPrice();
        stockItem5.setDescription("");
        stockItem5.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem5, (int) (short) 100);
        double double14 = soldItem13.getPrice();
        java.lang.String str15 = soldItem13.getName();
        java.lang.String str16 = soldItem13.getName();
        soldItem13.setPrice((double) 1.0f);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem19 = soldItem13.getStockItem();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(stockItem19);
    }
}

