package com.example.activitytest8.project2;

public class BookView {
    private String name;
    private String price;
    private String category_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "BookView{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
