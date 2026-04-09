package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {


        int iterations = 1_000_000_000; //반복 횟수 설정, 10억
        long startTime, endTime;

        long sumPrimitive =0 ;
        startTime = System.currentTimeMillis();
        for (int i=0 ; i< iterations ; i++){

            sumPrimitive= sumPrimitive+ i;

        }
        endTime= System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("실행시간 = " + (endTime-startTime)+"ms");

        //래퍼 클래스 사용

        Long sumWrapper =0L ;
        startTime = System.currentTimeMillis();
        for (int i=0 ; i< iterations ; i++){

            sumWrapper= sumWrapper+ i; //오토박싱 발생

        }
        endTime= System.currentTimeMillis();

        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("Wrapper 실행시간 = " + (endTime-startTime)+"ms");
    }
}
