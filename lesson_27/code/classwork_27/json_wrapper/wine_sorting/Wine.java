package classwork_27.json_wrapper.wine_sorting;

import java.util.Objects;

public class Wine implements Comparable<Wine> {

    private String type;
    private String title;
    private int age;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wine wine)) return false;
        return age == wine.age && Double.compare(price, wine.price) == 0 && Objects.equals(type, wine.type) && Objects.equals(title, wine.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, age, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wine{");
        sb.append("type='").append(type).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", age=").append(age);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public Wine(String type, String title, int age, double price) {
        this.type = type;
        this.title = title;
        this.age = age;
        this.price = price;


    }

    @Override
    public int compareTo(Wine wine) {
        return - (this.getAge()) - wine.getAge();
    }
}
