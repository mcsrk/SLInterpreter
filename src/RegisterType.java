import java.util.HashMap;

public class RegisterType {
    private String name;
    private HashMap<String, Object> structure;

    public RegisterType(String name) {
        this.name = name;
        this.structure = new HashMap<>();
    }

    public void addMember(String name, Object type) {
        structure.put(name, type);
    }

    public HashMap getStructure() {
        return structure;
    }

    @Override
    public String toString() {
        return "RegisterType{" +
                "name='" + name + '\'' +
                ", structure=" + structure +
                '}';
    }
}
