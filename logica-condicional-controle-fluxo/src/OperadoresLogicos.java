public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));

        System.out.println("b1 || b3: " + (b2 || b3));
        System.out.println("b1 || b4: " + (b1 || b4));

        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b4 ^ b1: " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20.0f;
        float f2 = 50.0f;

        System.out.println("((i1 + i2) < (f1 - f2)) && true " + (((i1 + i2) < (f1 - f2)) && true));
        System.out.println("((i1 > i2) < (f1 < f2)) || true " + (((i1 > i2) || (f1 < f2)) || true));


    }
}
