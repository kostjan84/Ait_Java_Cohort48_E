package classwork_27.json_wrapper.wrapper_withgenercs;

public class WrapperApp {
    public static void main(String[] args) {

        JsonWrapper<String> wrapper = new JsonWrapper<>("10");
        System.out.println(wrapper.toString());
        System.out.println(wrapper);

        System.out.println("______________________________________");


        int a = Integer.parseInt(wrapper.getValue());
        System.out.println(a * 30);

        JsonWrapper<Integer> numWrapper = new JsonWrapper<>(10);
        System.out.println(numWrapper.toString());

        System.out.println(numWrapper.getValue());
        System.out.println(numWrapper.getValue() * 7);

    }
}
