import java.util.List;

public class MatrixType {
    private List<Integer> lengths;
    private Object type;

    public MatrixType(List<Integer> lengths, Object type) {
        this.lengths = lengths;
        this.type = type;
    }

    public void setLength(List<Integer> length) {
        this.lengths = length;
    }

    public List<Integer> getLength() {
        return lengths;
    }

    @Override
    public String toString() {
        return "MatrixType{" +
                "lengths=" + lengths +
                ", type=" + type +
                '}';
    }
}
