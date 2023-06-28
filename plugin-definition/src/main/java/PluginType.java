import java.util.Objects;

public class PluginType {

    String name;

    String version;

    Class clazz;

    public PluginType(String name, String version, Class clazz) {
        this.name = name;
        this.version = version;
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PluginType that = (PluginType) o;
        return Objects.equals(name, that.name) && Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version);
    }

    @Override
    public String toString() {
        return "[name='" + name + '\'' +
                ", version='" + version + '\'' +
                ']';
    }
}
