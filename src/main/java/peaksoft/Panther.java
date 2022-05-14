package peaksoft;


public class Panther implements Animal {

     private String breed;
     private String color;

    public Panther() {
    }

    public Panther(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void AnimalPlus() {
        System.out.println("Panther is added-init method is working");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("Panther is cancelled-destroy method is working");
    }

    @Override
    public String toString() {
        return "Panther - " +
                "breed: " + breed +
                ", color: " + color;
    }
}
