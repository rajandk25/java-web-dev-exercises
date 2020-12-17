package exercises.technology;

public class SmartPhone extends Computer {

    private int numberOfTwitterFollowers;

    public SmartPhone(String brand, String model, int ram, int numberOfSelfies) {
        super(brand, model, ram);
        this.numberOfTwitterFollowers = numberOfSelfies;
    }

    public void deleteFolloweres(int number){
        if(this.numberOfTwitterFollowers - number < 0){
            System.out.println("You can't delete people who don't exist");
        }
        else {
            this.numberOfTwitterFollowers -= number;
        }
    }



}
