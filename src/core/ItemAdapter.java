package core;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//
//@ManagedBean(name="item")
//@SessionScoped
public interface ItemAdapter {
	public String getName();

	public void setName(String name);

	public int getQuantity();

	public void setQuantity(int quantity);

	public String getCategory();

	public void setCategory(String category);

	public int getIdentifier();

	public void setIdentifier(int identifier);
}
