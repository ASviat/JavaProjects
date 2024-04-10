public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }


    public void doKitchenWork() {
        if (brewMaster.isHasWorkToDo()) brewMaster.brewCoffee();
        if (dishWasher.isHasWorkToDo()) dishWasher.doDishes();
        if (iceBox.isHasWorkToDo()) iceBox.orderFood();
    }

    public void setKitchenState(boolean coffeeMakerFlag, boolean dishWasherFlag, boolean fridgeFlag) {
        brewMaster.setHasWorkToDo(coffeeMakerFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
