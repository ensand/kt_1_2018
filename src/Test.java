public class Test {

    public static void main(String[] args) {
        double c;

        Sisestus_copy a = new Sisestus_copy(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        Output b = new Sisestus_copy(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        c = a.arvutamine();

        System.out.println(a.arvutamine());
        b.output(c);
    }
}
