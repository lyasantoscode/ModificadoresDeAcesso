package veiculo;

//arquivo que inclui os metodos em Carro.java

public class Main {
    public static void main(String[] args) {

//new significa instanciar
            Veiculo veiculo = new Veiculo(" Carro "," Azul ", 1.77, 1.55);
            veiculo.primeiraMarcha();
        /*
        Modificadores de Acesso
        public > Todas as classes terão acesso
        private > So pode ser acessados de dentro da classe
        protected > Tem que estar no mesmo pacote
        default > Se nao definir nenhum tipo de modificadores, o acesso vai ser permitido dentro do mesmo pacote
         */
       // Carro carro = new Carro( "Carro "," azul ", 1.77, 1.55);
       // carro.primeiraMarcha(); // se eu colocar para privar , nao consigo mais acessar
      //  carro.primeiraMarcha(); // se eu colocar para privar , nao consigo mais acessar
       // carro.marchar();

        //  Moto moto = new Moto("amarelo", 1.77, 1.35);
        //  moto.primeiraMarcha();
       // Moto moto = new Moto("Moto ", " vermelho ", 1.35, 1.55);
       // moto.segundaMarcha();

    }
}




