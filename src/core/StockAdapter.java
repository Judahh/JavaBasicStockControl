package core;

import java.util.List;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//
//@ManagedBean(name="stock")
//@SessionScoped
public interface StockAdapter {
	public List<ItemAdapter> getItem();
	public void setItem(List<ItemAdapter> item);
}
