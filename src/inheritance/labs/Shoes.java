package inheritance.labs;

public class Shoes {

    private String material;
    private String color;

    public Shoes(String color) {
        this.color = color;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

