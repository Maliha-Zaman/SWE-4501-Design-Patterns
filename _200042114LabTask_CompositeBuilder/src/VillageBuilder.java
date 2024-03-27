public class VillageBuilder {
    private Shape shape;
    private House house;
    private Tree tree;
    private WaterSource waterSource;

    public VillageBuilder setShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    public VillageBuilder buildHouse() {

        house = new House(shape);
        return this;
    }

    public VillageBuilder buildTree(String type) {

        tree = new Tree(type);
        return this;
    }

    public VillageBuilder buildWaterSource(String type) {

        waterSource = new WaterSource(type);
        return this;
    }

    public CompositeComponent getVillage() {
        CompositeComponent village = new CompositeComponent();
        village.addComponent(house);
        village.addComponent(tree);
        village.addComponent(waterSource);
        return village;
    }
}
