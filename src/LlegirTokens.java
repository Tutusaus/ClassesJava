import java.io.StreamTokenizer;

public class LlegirTokens {
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        st.nextToken();
        while(st.ttype!=StreamTokenizer.TT_EOF){
            if (st.ttype==StreamTokenizer.TT_WORD)
                System.out.println("Paraula:"+st.sval);
            if (st.ttype==StreamTokenizer.TT_NUMBER)
                System.out.println("Num:"+st.nval);
            st.nextToken();
        }
    }
}