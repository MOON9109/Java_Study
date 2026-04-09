package lang.object.poly;

import static java.nio.file.Files.size;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};
        //위 코드와 동일
//        Object[] objects = new Object[3];
//        Object[0]= dog;
//        Object[1]= car;
//        Object[2]= objects;

        size(objects);




    }

    private static void size(Object[] objects) {

        System.out.println("전달된 객체의 수는: "+ objects.length);
    }
}
