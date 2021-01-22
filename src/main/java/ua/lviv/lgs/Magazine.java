package ua.lviv.lgs;

public class Magazine {
    private int id;
    private String name_magazines;
    private double price;
    private String description;

    public Magazine(String name_magazines, String description,double price) {
        this.name_magazines = name_magazines;
        this.price = price;
        this.description = description;
    }

    public Magazine(int id, String name_magazines, String description,double price) {
        this.id = id;
        this.name_magazines = name_magazines;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name_magazines;
    }

    public void setName(String name) {
        this.name_magazines = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", name='" + name_magazines + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
