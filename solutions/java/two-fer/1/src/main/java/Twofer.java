import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        return (Objects.isNull(name) || name.isEmpty())
                ? "One for you, one for me."
                : "One for " + name + ", one for me.";
    }
}
