//CLASSE 2

/* import java.io.DataInputStream;
import java.io.FileInputStream; */
import java.util.Scanner;

public class LlegirTeclat {
    public static void main(String[] args) throws Exception{
        /* FileInputStream fis=new FileInputStream("f.txt");
        DataInputStream dis=new DataInputStream(fis);  //System.in
        String s=dis.readLine();
        System.out.println("Has entrat: " + s); */

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        sc.close();

        System.out.println("Suma es: "+ i+j);
        System.out.println("Log es: " + Math.log(i+j));
    }
}
