import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        final int NUM_LEITORES = 3;
        final int NUM_ESCRITORES = 3;

        final List<Leitores> listaLeitores = new ArrayList<Leitores>();
        final List<Escritores> listaEscritores = new ArrayList<Escritores>();


        for (int i = 0; i < NUM_LEITORES; i++) {
            String nomeDoLeitor = "Leitor " + (i + 1);
            Leitores leitor = new Leitores(livro, nomeDoLeitor);
            listaLeitores.add(leitor);
            new Thread(leitor).start();

           
        }

        for (int i = 0; i < NUM_ESCRITORES; i++) {
            String nomeDoEscritor = "Escritor " + (i + 1);
            Escritores escritor = new Escritores(livro, nomeDoEscritor);
            listaEscritores.add(escritor);
            new Thread(escritor).start();
          
        }

    }
}
