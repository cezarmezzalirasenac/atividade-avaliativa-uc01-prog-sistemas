package classes;

public abstract class Assento {
  protected int id;
  protected int numeroAssento;
  protected int fileiraAssento;
  protected double valor;

  public Assento(int id, int numeroAssento, 
  int fileiraAssento, double valor) {
    this.id = id;
    this.numeroAssento = numeroAssento;
    this.fileiraAssento = fileiraAssento;
    this.valor = valor;
  }

  public abstract void reservar();

  public int getId() {
    return id;
  }

  public int getNumeroAssento() {
    return numeroAssento;
  }

  public int getFileiraAssento() {
    return fileiraAssento;
  }
}