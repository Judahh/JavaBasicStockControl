package core;

public interface StockManagerAdapter {
	public void setStock(StockAdapter stock);
	
	public void addItem(String name,String category, int quantity);
	
	public void updateData();
	
	public void addItem(ItemAdapter item);
	
	public void removeItem(ItemAdapter item);
	
	public void saveItem(ItemAdapter item);
	
	public StockAdapter getStock();
}
