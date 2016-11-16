package core.persistence;

import java.util.List;

import core.ItemAdapter;

public interface PersistentDataManagerAdapter {
	public void updateItem(ItemAdapter item);

	public List<ItemAdapter> getItemList();
	
	public void clearItemList();

	public void insertItem(ItemAdapter item);

	public void removeItem(ItemAdapter item);
}
