import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = soldItem2.getSum();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        java.lang.Integer int6 = soldItem2.getQuantity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = soldItem2.getSum();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem31 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 100L, "StockItem{id=null, name='null'}", "StockItem{id=0, name='hi!'}", 100.0d, (int) (byte) 100);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem33 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem31, (int) (byte) -1);
        java.lang.String str34 = soldItem33.toString();
        double double35 = soldItem33.getPrice();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart3.addItem(soldItem33);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        double double18 = soldItem17.getSum();
        java.lang.Integer int19 = soldItem17.getQuantity();
        shoppingCart2.addItem(soldItem17);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO21 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO21.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem23.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO21.saveSoldItem(soldItem23);
        java.lang.String str27 = soldItem23.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart2.addItem(soldItem23);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        java.lang.String str6 = soldItem2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = soldItem2.getSum();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO0.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem2.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem2);
        double double6 = soldItem2.getPrice();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = soldItem2.getSum();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        inMemorySalesSystemDAO0.rollbackTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem3.setId((java.lang.Long) 1L);
        soldItem3.setPrice((double) 100.0f);
        soldItem3.setId((java.lang.Long) 0L);
        inMemorySalesSystemDAO0.saveSoldItem(soldItem3);
        java.lang.Long long11 = soldItem3.getId();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem17 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double18 = stockItem17.getPrice();
        double double19 = stockItem17.getPrice();
        stockItem17.setDescription("");
        stockItem17.setQuantity((int) (short) 10);
        stockItem17.setId((java.lang.Long) 10L);
        int int26 = stockItem17.getQuantity();
        java.lang.String str27 = stockItem17.getDescription();
        stockItem17.setName("SoldItem{id=1, name='null'}");
        soldItem3.setStockItem(stockItem17);
        soldItem3.setPrice((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double33 = soldItem3.getSum();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO4 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO4.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem11 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double12 = stockItem11.getPrice();
        int int13 = stockItem11.getQuantity();
        inMemorySalesSystemDAO4.saveStockItem(stockItem11);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem16 = inMemorySalesSystemDAO4.findStockItem((long) (byte) 10);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO17 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem23 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double24 = stockItem23.getPrice();
        double double25 = stockItem23.getPrice();
        stockItem23.setDescription("");
        stockItem23.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem31 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem23, (int) (short) 100);
        double double32 = soldItem31.getPrice();
        inMemorySalesSystemDAO17.saveSoldItem(soldItem31);
        soldItem31.setId((java.lang.Long) 0L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem41 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double42 = stockItem41.getPrice();
        stockItem41.setId((java.lang.Long) 0L);
        java.lang.String str45 = stockItem41.getName();
        stockItem41.setDescription("StockItem{id=0, name='hi!'}");
        stockItem41.setQuantity((int) '4');
        stockItem41.setName("hi!");
        soldItem31.setStockItem(stockItem41);
        soldItem31.setId((java.lang.Long) 1L);
        java.lang.Long long55 = soldItem31.getId();
        inMemorySalesSystemDAO4.saveSoldItem(soldItem31);
        shoppingCart2.addItem(soldItem31);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList58 = shoppingCart2.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem59 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem59.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem62 = soldItem59.getStockItem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart2.addItem(soldItem59);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        soldItem17.setPrice((double) (byte) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem25 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double26 = stockItem25.getPrice();
        stockItem25.setQuantity((int) (byte) 1);
        stockItem25.setQuantity(1);
        int int31 = stockItem25.getQuantity();
        double double32 = stockItem25.getPrice();
        int int33 = stockItem25.getQuantity();
        soldItem17.setStockItem(stockItem25);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem40 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double41 = stockItem40.getPrice();
        stockItem40.setQuantity((int) (byte) 1);
        stockItem40.setPrice((double) ' ');
        stockItem40.setQuantity((int) (byte) 10);
        java.lang.Long long48 = stockItem40.getId();
        soldItem17.setStockItem(stockItem40);
        shoppingCart2.addItem(soldItem17);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem51 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem51.setId((java.lang.Long) 1L);
        soldItem51.setPrice((double) 100.0f);
        double double56 = soldItem51.getPrice();
        java.lang.Integer int57 = soldItem51.getQuantity();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart2.addItem(soldItem51);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.StockItem> stockItemList1 = inMemorySalesSystemDAO0.findStockItems();
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart2 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart((ee.ut.math.tvt.salessystem.dao.SalesSystemDAO) inMemorySalesSystemDAO0);
        shoppingCart2.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem9 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double10 = stockItem9.getPrice();
        double double11 = stockItem9.getPrice();
        stockItem9.setDescription("");
        stockItem9.setQuantity((int) (short) 10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem(stockItem9, (int) (short) 100);
        soldItem17.setPrice((double) (byte) 0);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem25 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double26 = stockItem25.getPrice();
        stockItem25.setQuantity((int) (byte) 1);
        stockItem25.setQuantity(1);
        int int31 = stockItem25.getQuantity();
        double double32 = stockItem25.getPrice();
        int int33 = stockItem25.getQuantity();
        soldItem17.setStockItem(stockItem25);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem40 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) 0L, "hi!", "", (double) 0L, (int) 'a');
        double double41 = stockItem40.getPrice();
        stockItem40.setQuantity((int) (byte) 1);
        stockItem40.setPrice((double) ' ');
        stockItem40.setQuantity((int) (byte) 10);
        java.lang.Long long48 = stockItem40.getId();
        soldItem17.setStockItem(stockItem40);
        shoppingCart2.addItem(soldItem17);
        ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO inMemorySalesSystemDAO51 = new ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO();
        inMemorySalesSystemDAO51.beginTransaction();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem53 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem53.setId((java.lang.Long) 1L);
        inMemorySalesSystemDAO51.saveSoldItem(soldItem53);
        double double57 = soldItem53.getPrice();
        soldItem53.setPrice(32.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart2.addItem(soldItem53);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem0 = new ee.ut.math.tvt.salessystem.dataobjects.SoldItem();
        soldItem0.setId((java.lang.Long) 1L);
        ee.ut.math.tvt.salessystem.dataobjects.StockItem stockItem8 = new ee.ut.math.tvt.salessystem.dataobjects.StockItem((java.lang.Long) (-1L), "StockItem{id=100, name='StockItem{id=0, name='hi!'}'}", "StockItem{id=100, name='StockItem{id=null, name='null'}'}", (-97.0d), 32);
        stockItem8.setPrice(0.0d);
        soldItem0.setStockItem(stockItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = soldItem0.getSum();
    }
}

