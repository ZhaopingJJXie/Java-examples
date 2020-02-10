package ocp.functionalInter;

import java.util.function.ObjIntConsumer;
class ConsumerUse {
    public static void main(String []args) {
       ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i);
       System.out.println(charAt.accept("java", 2)); //compilation error
    }
}
