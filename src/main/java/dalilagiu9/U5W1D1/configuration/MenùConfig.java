package dalilagiu9.U5W1D1.configuration;

import dalilagiu9.U5W1D1.entities.Drink;
import dalilagiu9.U5W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenùConfig {

    //BEANS TOPPING:
    @Bean
    public Topping tomatoTopping(){
        return new Topping("Tomato", 322, 1.30);
    }
    @Bean
    public Topping cheeseTopping(){
        return new Topping("Cheese", 426, 2.20);
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

    //
}
