public class Car {

    private String name;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String name, String color) {

        this.name = name;
        this.color = color;
    }
}
