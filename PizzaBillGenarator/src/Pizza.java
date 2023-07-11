public class Pizza {
    private int price;

    private Boolean veg;

    private int basePizzaPrice;
    private int extraCheesePrice = 100;
    private int extraTopingsPrice = 150;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;


    private int carryBagsPrice = 20;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {              // ye veg pizza k liye hai
            this.price = 300;
        } else {
            this.price = 400;       // ye nonveg pizza k liye hai
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
//        System.out.println("Extra Cheese Is added 🧀");
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraTopingsPrice;
//        System.out.println("Extra Toppings Is added 🍕");

    }

    public void takeAway() {
        isOptedForTakeaway = true;
        this.price += carryBagsPrice;
//        System.out.println("Take Away adopted 🛍️");

    }

    public void getBill() {
        String bill= "";
        System.out.println("Pizza 🍕: "+basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra Cheese Is Added 🧀: "+"+"+extraCheesePrice+ "\n";
        }
        if (isExtraToppingsAdded){
            bill += "Extra Toppings Is Added : "+"+"+extraTopingsPrice+ "\n";
        }
        if (isOptedForTakeaway){
            bill += "Take Away 🛍️: "+"+"+carryBagsPrice+ "\n";
        }
        bill += "Total Bill: "+this.price+"/-"+ "\n";
        System.out.println(bill);
    }
}
