package dalilagiu9.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Drink extends Item{
    //ATTRIBUTES LIST:
    private String name;


    //CONSTRUCTOR:
    public Drink(String name, double calories, double price){
        super(calories,price);
        this.name = name;

    }
}
