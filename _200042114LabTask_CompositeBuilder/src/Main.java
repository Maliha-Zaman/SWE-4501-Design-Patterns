public class Main {
    public static void main(String[] args) {

        VillageBuilder squareBrickVillageBuilder = new VillageBuilder()
                .setShape(new Square(10))
                .buildHouse()
                .buildTree("Mango")
                .buildWaterSource("Swimming Pool");

        CompositeComponent squareBrickVillage = squareBrickVillageBuilder.getVillage();


        VillageBuilder circleMudVillageBuilder = new VillageBuilder()
                .setShape(new Circle(8))
                .buildHouse()
                .buildTree("Banana")
                .buildWaterSource("Pond");

        CompositeComponent circleMudVillage = circleMudVillageBuilder.getVillage();


        System.out.println("Square Shaped Brick House:");
        squareBrickVillage.display();

        System.out.println("\nCircle Shaped Mud House:");
        circleMudVillage.display();
    }
}

