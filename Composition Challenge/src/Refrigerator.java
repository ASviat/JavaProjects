public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo)
            System.out.println("No milk in a fridge detected. I'll order some.");
        hasWorkToDo = false;
    }
}
