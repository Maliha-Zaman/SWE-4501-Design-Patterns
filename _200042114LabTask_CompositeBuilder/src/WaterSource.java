import java.util.List;

public class WaterSource implements VillageComponent
{
    private String type;

    public WaterSource(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("watersource: " + type);
    }
}
