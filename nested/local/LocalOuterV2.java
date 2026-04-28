package nested.local;

public class LocalOuterV2 {

    private int outInstanceVer =3;

    public void process(int paramVar){

        int localVar= 1;

        class LocalPrinter implements Printer{

            int value =0;


            @Override
            public void print() {
                System.out.println("value="+value);
                System.out.println("lovalVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVer = " + outInstanceVer);

            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();



    }

    public static void main(String[] args) {


        LocalOuterV2 loaclOuter = new LocalOuterV2();
        loaclOuter.process(2);
    }


}
