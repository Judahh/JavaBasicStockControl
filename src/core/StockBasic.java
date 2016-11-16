package core;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@ManagedBean(name="stock")
@SessionScoped
@Default
@Model
@Named
public class StockBasic implements StockAdapter{
	private List<ItemAdapter> item;

	public StockBasic() {
		item=new ArrayList<>();
	}

	public StockBasic(List<ItemAdapter> item) {
		this.item = item;
	}
	
	public List<ItemAdapter> getItem() {
		return item;
	}

	public void setItem(List<ItemAdapter> item) {
		this.item = item;
	}
}