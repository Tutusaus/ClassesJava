public class Proces extends Thread {
    int id;
    Proces(int id) {
        this.id=id;
    }
    public void run() {
        for(int i=1;i<=200;i++){
            System.out.println("El proces "+id+" mostra el "+i);
        }
    }
    public static void main(String[] args) {
        Proces p1=new Proces(1);
        Proces p2=new Proces(2);
        Proces p3=new Proces(3);
        p3.setPriority(MAX_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
    }
}