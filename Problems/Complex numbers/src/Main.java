class Complex {
    double real;
    double image;

//    public Complex(double real, double image) {
//        this.real = real;
//        this.image = image;
//    }

    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}