package ss17.excercise.product_manager_save_to_binary_files.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private int price;
    private String manufacturers;
    private String describe;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, int price, String manufacturers, String describe) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.manufacturers = manufacturers;
        this.describe = describe;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return  "ID=" + idProduct +
                ", Product Name='" + nameProduct + '\'' +
                ", Price=" + price +
                ", manufacturers='" + manufacturers + '\'' +
                ", describe='" + describe + '\'';
    }
}
