class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola"); //System.out.println("Hola");=System.out.print("Hola\n");

        int v[]=new int[2];  //creem un array de tamany 2
        v[0]=3;v[1]=8;
        //System.out.println(v.lenght); //"syso" + ctrl + space = System.out.println();    ****    ctrl + 7 = comentar automàticament una o múltiples línies
        
        //System.out.println(args[0]);

        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        Complex c1=new Complex(3,5);
        c1.conjugat();
        c1.print();
        Complex c2=new Complex(1,1);
        c1.add(c2);
        c1.print();
    }
}

class Complex {
    double real,imag;
    Complex(double r, double i) {   //Constructor per poder crear un obj de diferents maneres (en funció dels paràmetres)
        real=r;imag=i;
    }

    void conjugat() {
        imag=-imag;
    }

    void print() {
        if(imag<0){
            System.out.println(real + "" + imag + "i");
        }
        else{
            System.out.println(real + "+" + imag + "i");
        }
    }

    void add(Complex c){
        real=real+c.real;
        imag=imag+c.imag;
    }

}