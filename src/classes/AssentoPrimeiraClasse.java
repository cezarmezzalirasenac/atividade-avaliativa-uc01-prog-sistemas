package classes;

public class AssentoPrimeiraClasse extends Assento {
  public AssentoPrimeiraClasse(int id, int numeroAssento,
      int fileiraAssento) {
    super(id, numeroAssento, fileiraAssento, 1000);
  }

  @Override
  public void reservar() {
    String mensagem = """
          Poltrona Primeira Classe reservada com sucesso!
          Valor: R$ %.2f
          Fileira: %d
          Poltrona: %d
        """;
    System.out.printf(mensagem, this.valor, this.fileiraAssento, this.numeroAssento);
  }

}
