package lang.wrapper;

import com.sun.jdi.Value;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value =7;
        Integer boxedValue = value; // value of 를 안써도 박싱됨, 오토 박싱

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // intValue 안써도 언박싱됨, 오토 언박싱

        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue = " + boxedValue);

    }
}
