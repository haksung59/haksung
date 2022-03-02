package kr.re.kitri.streamdemo;

public class Dish {
    private String name;
    private boolean isVegeterian;
    private int calrories;
    private String type;

    public Dish() {}
    public Dish(String name, boolean isVegeterian, int calrories, String type) {
        this.name = name;
        this.isVegeterian = isVegeterian;
        this.calrories = calrories;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public boolean isVegeterian() {
        return isVegeterian;
    }
    public int getCalrories() {
        return calrories;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", isVegeterian=" + isVegeterian +
                ", calrories=" + calrories +
                ", type='" + type + '\'' +
                '}';
    }
}
