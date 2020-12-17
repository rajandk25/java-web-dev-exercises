package exercises.technology;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenova", "yoga", 16);
        Laptop laptop = new Laptop("Apple", "air" ,13, 256);
        SmartPhone smartPhone = new SmartPhone("Samsung", "note", 8, 128);

        laptop.addRam(5);
        System.out.println(laptop.isClunky());
        System.out.println(computer.makeBeeDoop());
        System.out.println(smartPhone.makeBeeDoop());
        smartPhone.deleteFolloweres(200);

        System.out.println(computer.getId());
        System.out.println(laptop.getId());
        System.out.println(smartPhone.getId());

    }
}
