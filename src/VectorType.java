public class VectorType {
    private Integer length;
    private Object type;

    public VectorType(Integer length, Object type) {
        this.length = length;
        this.type = type;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "VectorType{" +
                "length=" + length +
                ", type=" + type +
                '}';
    }
}
