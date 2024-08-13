package classwork_27.json_wrapper.wrapper_no_generics;

public class JsonWrapper {


    //format JSON{ " field1 (name) " : value = value("Kostja")
    //                                }

    private Object value;

    public JsonWrapper(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
     return "{ value: " + value + "}";
    }
}
