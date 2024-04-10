public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo)
            System.out.println("Coffee maker turns on.");
        hasWorkToDo = false;
    }
}
