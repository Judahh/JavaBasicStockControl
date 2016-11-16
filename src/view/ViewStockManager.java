package view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import core.ItemBasic;
import core.StockBasic;
import core.StockAdapter;
import core.StockManagerAdapter;

@ManagedBean(name="viewStockManager")
@ViewScoped
public class ViewStockManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5842041905574114044L;
	/**
	 * 
	 */

	@Inject private StockManagerAdapter stockManager;
	
	@PostConstruct
	public void postConstruct() {
		updateData();
	}


	public ViewStockManager() {
		super();
//		this.stockManager=new StockManagerBasic(new StockBasic(new ArrayList<>()), new DatabaseStockControl());
	}
	
	public StockAdapter getStock() {
		return stockManager.getStock();
	}

	public void setStock(StockBasic stock) {
		this.stockManager.setStock(stock);
	}
	
	public void updateData() {
		this.stockManager.updateData();
	}
	
	public void addItem(String name,String category, int quantity) {
		stockManager.addItem(name, category, quantity);
	}
	
	public void addItem(ItemBasic item) {
		stockManager.addItem(item);
	}
	
	public void removeItem(ItemBasic item) {//Por algum motivo o xhtml nao entra aqui
		System.out.println("REMOVE KCT");
		updateData();
//		stockManager.removeItem(item);
	}
	
	public void saveItem(ItemBasic item) {//Por algum motivo o xhtml nao entra aqui
		System.out.println("SAVE KCT");
		stockManager.saveItem(item);
	}
}
