import java.util.ArrayList;
import java.util.List;

class CompositeComponent implements VillageComponent {
    private List<VillageComponent> components = new ArrayList<>();

    public void addComponent(VillageComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        for (VillageComponent component : components) {
            component.display();
        }
    }
}
