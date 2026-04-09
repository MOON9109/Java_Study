package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //Split()
        String[] SplitStr = str.split(",");
        for (String s : SplitStr) {
            System.out.println(s);
        }

        String joinStr = "";
//        for (String string : SplitStr) {
//            joinStr = joinStr + string + '-';
//
//
//        }

        for (int i=0; i< SplitStr.length;i++){
            String string = SplitStr[i];
            joinStr = joinStr + string;

            if (i!= SplitStr.length-1){
                joinStr = joinStr+ "-";
            }
        }

        System.out.println(joinStr);


        String JoinedStr = String.join("-","A","B","C");
        System.out.println("연결된 문자열:" + JoinedStr);

        String result = String.join("-",SplitStr);
        System.out.println("result:"+ result);


    }

}