public class Operatori {

    public static void main(String[] args) {
        //Operatori matematici
        System.out.println(10+10);
        System.out.println(100-10);
        System.out.println(20*3);
        System.out.println(100/4);
        System.out.println(7%3);

        //Operatori rationali
        System.out.println(7==7);
        System.out.println(7!=9);
        System.out.println(4+4 < 100);
        System.out.println(8+8 > 10);
        System.out.println(8>=8);
        System.out.println(8<=8);

        //Operatori logici
        System.out.println(7<10 && 100<10);
        System.out.println(7<10 || 100<10);

        System.out.println(!true);

        //Operatori de atribuire
        int numar1 = 5;
        numar1++;
        System.out.println(numar1);

        int numar2 = 8;
        numar2--;
        System.out.println(numar2);

        int numar3 = 10;
        numar3 += 20;
        System.out.println(numar3);
        int numar4 = numar3 + numar2;
        System.out.println(numar4);

        int numar = 10;
        String text = " test";
        double numarDouble = 11.1;
        float numarFloat = 13.4f;
        boolean adevar = true;
        char c = 'C';

        System.out.println("Variabila mea string are valoarea " + text);
        System.out.println("Numarul meu este " + numar);
        System.out.println(numarDouble + " este numarul meu double");
        System.out.println(numarFloat + " este numarul meu float");
        System.out.println("Am declarat un caracter " + c);

    }

}
