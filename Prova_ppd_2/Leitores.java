public class Leitores implements Runnable {
    private final Livro livro;
    private final String nome;

    public Leitores(Livro livro, String nome) {
        this.livro = livro;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        try {
            livro.iniciarLeitura(this);
            Thread.sleep(2000);
            livro.terminarLeitura(this);
        } catch (InterruptedException e) {
            
        }
    }
}
