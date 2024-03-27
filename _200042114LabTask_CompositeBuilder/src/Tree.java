import java.util.List;

public class Tree implements  VillageComponent {
    private String type;

    public Tree(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Tree: " + type);
    }
}
