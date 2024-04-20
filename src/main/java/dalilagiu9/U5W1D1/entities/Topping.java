package dalilagiu9.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Topping extends Item{
    private String name;

    //CONSTRUCTOR:

    public Topping(String name, double calories, double price){
        super(calories, price);
        this.name = name;
    }

}
