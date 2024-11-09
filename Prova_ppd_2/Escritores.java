public class Escritores implements Runnable {
    private final Livro livro;
    private final String nome;

    public Escritores(Livro livro, String nome) {
        this.livro = livro;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        try {
            livro.iniciarEscrita(this);
            Thread.sleep(1500);
            livro.terminarEscrita(this);
        } catch (InterruptedException e) {
    
        }
    }
}
