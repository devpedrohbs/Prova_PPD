public class Livro {
    private int leitores = 0;
    private boolean escritorAtual = false;
   

    public  void iniciarLeitura(Leitores leitor)  {    
        leitores++;
        System.out.println(leitor.getNome() + " começou a ler o livro.");
    }

    
    public synchronized void terminarLeitura(Leitores leitor) {
        leitores--;
        notifyAll();
        System.out.println(leitor.getNome() + " terminou de ler o livro.");
    }

    public synchronized void iniciarEscrita(Escritores escritor) throws InterruptedException {
        while (leitores > 0 || escritorAtual) {
            wait();
        }

        escritorAtual = true;
        System.out.println("\n********************************************\n");
        System.out.println(escritor.getNome() + " começou a escrever no livro.");
    }

    public synchronized void terminarEscrita(Escritores escritor) {
        escritorAtual = false;
        notifyAll();
        System.out.println(escritor.getNome() + " terminou de escrever no livro.");
    }
}


