package classes;

import static java.lang.StringTemplate.STR;

public class AssentoEconomico extends Assento {

  public AssentoEconomico(int id, int numeroAssento,
      int fileiraAssento) {
    super(id, numeroAssento, fileiraAssento, 500);
  }

  @Override
  public void reservar() {
    var message = """
          Poltrona Economica reservada com sucesso!
          Valor: R$ %.2f
          Fileira: %d
          Poltrona: %d
        """.formatted(this.valor, this.fileiraAssento, this.numeroAssento);
    System.out.println(message);
  }

}
