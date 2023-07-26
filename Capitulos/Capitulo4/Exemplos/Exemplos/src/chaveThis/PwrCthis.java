package chaveThis;

public class PwrCthis {

    double b;
    int e;
    double val;

    PwrCthis(double b, int e) {
        val = 1;
        if ( e == 0) return;
        for (; e> 0; e--) val = val *b

    }

    double get_pwr() {
        return val;

//        return  this.val  outra forma de usar this 
    }

    class DemorPwr {
        public static void main(String[] args) {
            PwrCthis x = new PwrCthis(4.0, 2);
            PwrCthis y = new PwrCthis(4.0, 2);
            PwrCthis z = new PwrCthis(4.0, 2);

            System.out.println(x.b + "raised to the" + x.e + "power is " + x.get_pwr());

            System.out.println(y.b + "raised to the" + y.e + "power is " + y.get_pwr());

            System.out.println(z.b + "raised to the" + z.e + "power is " + z.get_pwr());
        }
    }

}
