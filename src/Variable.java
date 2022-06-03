public class Variable<T> {
    private T value;
    private Object type;

    public Variable(Object type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "value=" + value +
                ", type=" + type +
                '}';
    }
}
