package classwork_27.json_wrapper.wrapper_no_generics;

public class WrapperApp {
    public static void main(String[] args) {

        JsonWrapper wrapper = new JsonWrapper("10");
        System.out.println(wrapper);
        System.out.println("***************************");

        String a = (String) wrapper.getValue();

        System.out.println(a);
    }
}
