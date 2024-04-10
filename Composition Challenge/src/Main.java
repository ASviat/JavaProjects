public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();
        System.out.println("\nOr separate progressing:");
        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        smartKitchen.getDishWasher().setHasWorkToDo(false);
        smartKitchen.getIceBox().setHasWorkToDo(true);
        smartKitchen.doKitchenWork();

    }
}
