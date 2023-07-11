public class Main {
    public static void main(String[] args) {
        // Base Pizza
//        Pizza basePizza  = new Pizza( true);
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

        // Delux Pizza
        DeluxPizza dp = new DeluxPizza(true);

        dp.takeAway();
        dp.getBill();

        }
    }
