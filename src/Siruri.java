public class Siruri {

    public static void main(String[] args) {

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Lungimea sirului txt este: " + txt.length());

        String txt2 = "Imi place Java";
        System.out.println(txt2.toUpperCase());   // afiseaza "IMI PLACE JAVA"
        System.out.println(txt2.toLowerCase());   // afiseaza "imi place java"

        String txt3 = "Indicati unde se afla cuvantul 'Java'!";
        System.out.println(txt3.indexOf("Java")); // afiseaza 32

        String x = "10";
        String y = "20";
        String z = x + y;   // z o sa fie 1020 (un Sir)
        System.out.println(z);
    }

}
