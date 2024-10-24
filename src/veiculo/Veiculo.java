package veiculo;

public class Veiculo {
    public Veiculo (String tipo, String cor, Double largura, Double altura) {
        System.out.println(tipo + " é " + cor + " e tem a largura " + largura+
                " e a altura " + altura);
    }

   /* private void primeiraMarcha() {
        System.out.println("passando a primeira marcha");
   }*/
//defualt é nao colocar nada na frente, por exem de : "xxxxx" void primeiraMarcha. E ainda, so pode ser acessado de dentro
    // do mesmo pacote.

    protected void primeiraMarcha() {
        System.out.println("passando a primeira marcha");
   } //so consigo acessar protected setiver no mesmo pacote, ou seja main junto de veiculo no outro packet.

public void segundaMarcha() {
        System.out.println("passando a segunda marcha");
    }
  //  public  void marchar () {              /* como esta dentro de private, eu consigo acessar ainda */

    //}
}

