package dalilagiu9.U5W1D1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Item {
    //ATTRIBUTES LIST:
    protected double calories;
    protected double price;

    //CONSTRUCTOR:
    public Item(double calories, double price){
        this.calories = calories;
        this.price = price;
    }
}
