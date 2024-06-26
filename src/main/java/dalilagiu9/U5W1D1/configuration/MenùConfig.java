package dalilagiu9.U5W1D1.configuration;

import dalilagiu9.U5W1D1.entities.Drink;
import dalilagiu9.U5W1D1.entities.Menù;
import dalilagiu9.U5W1D1.entities.Pizza;
import dalilagiu9.U5W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenùConfig {

    //BEANS TOPPING:
    @Bean
    public Topping tomatoTopping(){
        return new Topping("Tomato", 648, 1.30);
    }
    @Bean
    public Topping cheeseTopping(){
        return new Topping("Cheese", 752, 2.20);
    }
    @Bean
    public Topping hamTopping(){
        return new Topping("Ham", 156.8, 3.43);
    }
    @Bean
    public Topping pineappleTopping(){
        return new Topping("Pineapple", 36.7, 2.67);
    }
    @Bean
    public Topping salamiTopping(){
        return new Topping("Salami", 238.2, 3.78);
    }

    //BEANS DRINK:
    @Bean
    public Drink waterDrink(){
        return new Drink("Water", 0, 0.50);
    }
    @Bean
    public Drink cocaColaDrink(){
        return new Drink("Coca-Cola", 325.5, 2.56);
    }
    @Bean
    public Drink beerDrink(){
        return new Drink("Beer", 456.9, 3.78);
    }

    //BEANS PIZZA:
    @Bean
    public Pizza margheritaPizza(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(tomatoTopping());
        toppingList.add(cheeseTopping());
        return new Pizza("Margherita Pizza", toppingList);
    }
    @Bean
    public Pizza hawaiianPizza(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(tomatoTopping());
        toppingList.add(cheeseTopping());
        toppingList.add(hamTopping());
        toppingList.add(pineappleTopping());
        return new Pizza("Hawaiian Pizza", toppingList);
    }
    @Bean
    public Pizza salamiPizza(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(tomatoTopping());
        toppingList.add(cheeseTopping());
        toppingList.add(salamiTopping());
        return new Pizza("Salami Pizza", toppingList);
    }

    //BEAN MENÚ:
    @Bean
    public Menù menùBean(){
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();
        List<Pizza> pizzaList = new ArrayList<>();

        drinkList.add(waterDrink());
        drinkList.add(cocaColaDrink());
        drinkList.add(beerDrink());

        toppingList.add(tomatoTopping());
        toppingList.add(cheeseTopping());
        toppingList.add(hamTopping());
        toppingList.add(pineappleTopping());
        toppingList.add(salamiTopping());

        pizzaList.add(margheritaPizza());
        pizzaList.add(hawaiianPizza());
        pizzaList.add(salamiPizza());

        return new Menù(pizzaList, drinkList, toppingList);
    }
}
