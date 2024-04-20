package dalilagiu9.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Drink extends Item{
    //ATTRIBUTES LIST:
    private String name;


    //CONSTRUCTOR:
    public Drink(String name, double calories, double price){
        super(calories,price);
        this.name = name;

    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
