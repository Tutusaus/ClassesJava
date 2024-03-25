import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepcions {
    public static void main(String[] args){
        f();
    }
    static void f() {
        try{
            FileInputStream fis=new FileInputStream("f.txt");
            Scanner sc=new Scanner(fis);
            String s=sc.nextLine();
            System.out.println(s);
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("ERRORRR!!!!!!!!!");
        }
    }
}