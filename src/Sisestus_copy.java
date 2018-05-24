class Sisestus_copy implements Output{ // Constructor

    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;
    private double x6;
    private double x7;
    private double x8;
    private double x9;
    private double x10;
    private double x11;

    Sisestus_copy(double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9, double x10, double x11) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.x7 = x7;
        this.x8 = x8;
        this.x9 = x9;
        this.x10 = x10;
        this.x11 = x11;
    }

    double arvutamine() {
        if (!(x4 == 0 || x6 == 0 || x7 == 0 || x8 == 0 || x9 == 0)) {
            return ((Math.pow((Math.pow(x1, x2) - Math.sqrt(x3 / x4)), x5) / x6) / ((x7 / x8) / x9)) + (x10 * x11);
        } else {
            System.out.println("Antud sisendite puhul tulemus puudub.");
            return -1;
        }
    }


    // Siit algab interface'i osa.
    @Override
    public void output(double vastus) {
        if (!(x4 == 0 || x6 == 0 || x7 == 0 || x8 == 0 || x9 == 0)) {
            System.out.println("Vastus on " + vastus);
        } else {
            System.out.println("Antud sisendite puhul tulemus puudub.");
        }
    }
}
