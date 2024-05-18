package classes;

public class AssentoEconomico extends Assento {

  public AssentoEconomico(int id, int numeroAssento,
      int fileiraAssento) {
    super(id, numeroAssento, fileiraAssento, 500);
  }

  @Override
  public void reservar() {
    System.out.printf("Poltrona Economica reservada com sucesso!\nValor: R$ %.2f\nFileira: %d\nPoltrona: %d",
        this.valor, this.fileiraAssento, this.numeroAssento);
  }

}
