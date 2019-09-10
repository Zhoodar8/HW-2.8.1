import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Box<Integer, Double> box1 = new Box<>(10, 2.0D);

        Box<Float, Float> box2 = new Box<>(2.2F, 12.2F);
        System.out.println(addiotion(box1,box2));
        System.out.println(multiplication(box1,box2));

    }






        public static Number addiotion (Box < ? extends Number , ?  extends Number > box1 , Box<? extends Number , ? extends  Number> bb2  ){

        return box1.getMoney().intValue()+box1.getMoney().doubleValue() +
                bb2.getMoney().floatValue() + bb2.getBank().floatValue(); }

        public static Number multiplication (Box < ? extends Number, ? extends Number > box1 , Box<? extends Number , ? extends Number>box2){
        return box1.getMoney().intValue()*box1.getBank().doubleValue() *
                box2.getBank().floatValue() * box2.getMoney().floatValue(); }


}
