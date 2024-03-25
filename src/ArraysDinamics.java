import java.util.ArrayList;

public class ArraysDinamics{
    public static void main(String[] args){
        ArrayList<Integer> v=new ArrayList<Integer>();
        v.add(new Integer(2));
        v.add(new Integer(40));

        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
}

class Pila<T>{
    //T v[];
    ArrayList<T> v=new ArrayList<T>();
    int top;
    Pila(){ top=0; }
    void push(T d){ }
    T pop(){ return v.get(top--); }
}