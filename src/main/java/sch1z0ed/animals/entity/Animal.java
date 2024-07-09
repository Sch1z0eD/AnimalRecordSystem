package sch1z0ed.animals.entity;


// Класс, представляющий животное со свойствами веса, роста и типа
public class Animal implements IAnimal {
    private String weight;
    private String height;
    private String type;

    public Animal(String weight, String height, String type) {
        this.weight = weight.toUpperCase();
        this.height = height.toUpperCase();
        this.type = type.toUpperCase();
    }

    @Override
    public String getWeight() {
        return weight;
    }

    @Override
    public String getHeight() {
        return height;
    }

    @Override
    public String getType() {
        return type;
    }
}