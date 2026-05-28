public class CastingConversoes {
    public static void main(String[] args) {
        int toDouble = 10;
        double toInt = (int) 13.99;
        System.out.println(((double)toDouble));

        Integer test = 10;
        String testString = test.toString();
        System.out.println(test);

        String test2 = "natan";
        Integer test2Converter = Integer.parseInt(test2);
        System.out.println(test2);

        Double test3 = 13.55;
        String test3Convert = test3.toString();
        System.out.println(test3);

        Integer inteiro = 15;
        Double doublee = inteiro.doubleValue();
        System.out.println(inteiro);

    }
}
