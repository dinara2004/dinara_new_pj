package peaksoft;


public class Person {

    private Animal animal;
    private String name;
    private Long age;

    public Person() {
    }

    public Person(Animal animal, String name, Long age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void callAnimal(){
        animal.AnimalPlus();
        animal.AnimalMinus();
    }

    @Override
    public String toString() {
        return "Person - " +
                "animal: " + animal +
                ", name: " + name +
                ", age: " + age;
    }
}
