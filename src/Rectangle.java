import java.util.ArrayList;

abstract class Figura{  //NO ES PODEN CREAR OBJECTES D'UNA CLASSE ABSTRACTA
    int x,y;
    abstract double area();
    Figura(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Rectangle extends Figura{
    int ample,alt;

    Rectangle(int x, int y, int ample, int alt){
        super(x, y);
        this.ample=ample;
        this.alt=alt;
    }
    double area(){
        return ample*alt;
    }
}

class Cercle extends Figura{
    int r;

    public Cercle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    double area(){
        return Math.PI*r*r;
    }
}

class Figures{
    public static void main(String[] args){
        /* Rectangle r[]=new Rectangle[3];
        Cercle c[]=new Cercle[3];
        r[0]=new Rectangle(10,10,20,30);
        c[0]=new Cercle(40,40,3);
        //ETC...
        for(int i=0;i<r.lenght;i++){    //peta pk r.length=3 però només tinc una figura creada
            System.out.println(r[i].area());
        }
        for(int i=0;i<c.lenght;i++){
            System.out.println(c[i].area());
        } */
        //Figura f[]=new Figura[3];
        ArrayList<Figura> f=new ArrayList<Figura>();
        /* f[0]=new Rectangle(10,10,20,30);
        f[1]=new Cercle(40,40,3);
        f[2]=new Cercle(60,40,5);

        for(int i=0;i<f.length;i++){    //peta pk f.length=2 però només tinc una figura creada
            System.out.println(f[i].area());
        } */
        f.add(new Rectangle(10,10,20,30));
        f.add(new Cercle(40,40,3));
        f.add(new Cercle(40,40,5));
        for(int i=0;i<f.size();i++){
            System.out.println(f.get(i).area());
        }
        for(Figura fig:f){
            System.out.println(fig.area());
        }
    }
}
