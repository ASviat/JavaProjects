public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println(wall.getArea());

        Wall wall2 = new Wall();
        System.out.println(wall2.getArea());

        Wall wall3 = new Wall(-1, 5);
        System.out.println(wall3.getArea());
    }
}
