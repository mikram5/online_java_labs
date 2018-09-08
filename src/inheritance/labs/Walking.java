package inheritance.labs;

public class Walking extends Athletic {

    private String brand;
    private String model;

    public Walking (String color, int weight, String model, String brand) {
        super(color, weight);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void replaceLaces(String color) {
        System.out.println("replacing laces with new " + color + " laces");
    }

    public void replaceLaces(String color1, String color2) {
        System.out.println("replacing laces with new " + color1 + " and " + color2 + " laces");
    }

    @Override
    public String toString() {
        return "Walking{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
