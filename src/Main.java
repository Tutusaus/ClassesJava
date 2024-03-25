public class Main {
    public static void main(String[] args){
        Cotxe c1 = new Cotxe(2,3);
        Cotxe c2 = new Cotxe(4,5);

        System.out.println(c1.n_cotxe);    //->2
        System.out.println(c2.n_cotxe);   //->2
        System.out.println(Cotxe.n_cotxe);     //->2
    }
}