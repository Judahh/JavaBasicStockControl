package core;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

import core.persistence.PersistentDataManagerAdapter;
import java.util.Date;
import javax.money.MonetaryAmount;

@Default
@Model
@Named
public class StockManagerBasic implements StockManagerAdapter {

    @Inject
    private StockAdapter stock;
    @Inject
    @Named("DatabaseStockControl")
    private PersistentDataManagerAdapter persistentDataManagerAdapter;

    public StockManagerBasic() {
//		this.stock=new StockBasic(new ArrayList<>());
//		this.persistentDataManagerAdapter=new DatabaseStockControl();
    }

    public StockManagerBasic(StockAdapter stock, PersistentDataManagerAdapter persistentDataManager) {
        this.stock = stock;
        this.persistentDataManagerAdapter = persistentDataManager;
    }

    @Override
    public StockAdapter getStock() {
        return stock;
    }

    @Override
    public void setStock(StockAdapter stock) {
        persistentDataManagerAdapter.clearItemList();
        stock.getItem().stream().forEach((item) -> {
            persistentDataManagerAdapter.insertItem(item);
        });
        updateData();
    }

    public void addItem(String name,
            String category,
            int quantity,
            String brand,
            Date expirationDate,
            String size,
            MonetaryAmount price) {
        ItemAdapter item = new ItemBasic(name, category, quantity, brand, expirationDate, size, price);
        persistentDataManagerAdapter.insertItem(item);
        updateData();
    }

    @Override
    public void updateData() {
        stock.setItem(persistentDataManagerAdapter.getItemList());
    }

    @Override
    public void addItem(ItemAdapter item) {
        persistentDataManagerAdapter.insertItem(item);
        updateData();
    }

    @Override
    public void removeItem(ItemAdapter item) {
        persistentDataManagerAdapter.removeItem(item);
//		System.out.println("REMOVEEEEE");
        updateData();
    }

    @Override
    public void saveItem(ItemAdapter item) {
        persistentDataManagerAdapter.updateItem(item);
        updateData();
    }

    @Override
    public void addItem(String name, String category, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
