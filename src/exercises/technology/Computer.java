package exercises.technology;

import java.util.Objects;

public class Computer extends AbstractEntity {
    private String brand;
    private String model;
    private int ram;

    public Computer(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    public int addRam(int number){
        return ram+= ram;
    }
    public String makeBeeDoop(){
        return "BEE DOOP!";
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

    public double getPrice() {
        return ram;
    }

    public void setPrice(double price) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + ram +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.ram, ram) == 0 &&
                brand.equals(computer.brand) &&
                model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ram);
    }
}
