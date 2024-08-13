package classwork_27.json_wrapper.wrapper_withgenercs;

public class JsonWrapper <T>{


    private T value;


    public JsonWrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ value: " + value + "}";
    }

}
