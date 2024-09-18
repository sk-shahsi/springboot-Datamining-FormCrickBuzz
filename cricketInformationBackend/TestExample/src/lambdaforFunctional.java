public class lambdaforFunctional {
    public static void main(String[] args) {
        functionalinterface fc=(x,y)->{
            int i = x + y;
            System.out.println(i);
            return i;

        };
        fc.add(10,12);
    }
}
