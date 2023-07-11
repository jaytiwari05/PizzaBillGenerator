public class DeluxPizza extends  Pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}     // to disable the function of adding adding extra cheese or toppings

    @Override
    public void addExtraToppings() {}   // to disable the function of adding adding extra cheese or toppings
}
