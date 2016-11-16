package core;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.money.MonetaryAmount;

@ManagedBean(name = "item")
@SessionScoped
public class ItemBasic implements ItemAdapter {

    private int identifier;
    private String name;
    private int quantity;
    private String category;
    private String brand;
    private Date expirationDate;
    private String size;
    private MonetaryAmount price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MonetaryAmount getPrice() {
        return price;
    }

    public void setPrice(MonetaryAmount price) {
        this.price = price;
    }

    public ItemBasic() {
        super();
        this.identifier = 0;
    }

    public ItemBasic(String name,
            String category,
            int quantity,
            String brand,
            Date expirationDate,
            String size,
            MonetaryAmount price) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.size = size;
        this.price = price;
        this.identifier = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}
