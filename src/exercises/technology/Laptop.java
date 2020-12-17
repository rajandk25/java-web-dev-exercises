package exercises.technology;

public class Laptop extends Computer {

    private int screenSize;

    public Laptop(String brand, String model, int ram, int screenSize) {

        super(brand, model, ram);
        this.screenSize = screenSize;
    }
    public boolean isClunky(){
       return this.screenSize > 15;

    }

}
