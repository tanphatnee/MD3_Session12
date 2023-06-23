package baitaptonghop.model;

public class Color extends RootModel{

    private String colorName;

    public Color(int id, String colorName) {
        this.id = id;
        this.colorName = colorName;
    }

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public Color() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;

    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", colorName='" + colorName + '\'' +
                '}';
    }
}
