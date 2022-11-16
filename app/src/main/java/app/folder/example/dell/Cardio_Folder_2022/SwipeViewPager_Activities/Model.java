package app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities;


public class Model {

    private int image;
    private int image1;
    private String title;
    private String desc;

    public Model(int image, int image1, String desc) {
        this.image = image;
        this.image1 = image1;
        this.title = title;
        this.desc = desc;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void getDesc(String desc) {
        this.desc = desc;
    }
}
