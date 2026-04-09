package enumeration.ref1;




public class DiscountService {

    public int discount(ClassGrade classGrade, int price){


        return price* classGrade.getDiscountPercent() /100; //Inline Variable 단축키 존재

    }
}
