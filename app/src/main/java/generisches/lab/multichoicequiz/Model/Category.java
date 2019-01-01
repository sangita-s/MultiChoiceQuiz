package generisches.lab.multichoicequiz.Model;

public class Category {
    private int id;
    private String name, image;

    public Category(int pId, String pName, String pImage) {
        id = pId;
        name = pName;
        image = pImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String pImage) {
        image = pImage;
    }
}
