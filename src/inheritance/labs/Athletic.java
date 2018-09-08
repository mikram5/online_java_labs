package inheritance.labs;

public class Athletic extends Shoes {

    private String closureType;
    private int weight;

    public Athletic(String color, int weight) {
        super(color);
        this.weight = weight;
    }

    public Athletic(String color, String material) {
        super(color);
        super.setMaterial(material);
    }

    public String getClosureType() {
        return closureType;
    }

    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Athletic{" +
                "closureType='" + closureType + '\'' +
                ", weight=" + weight +
                '}';
    }
}
