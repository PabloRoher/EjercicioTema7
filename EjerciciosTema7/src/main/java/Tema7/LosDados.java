package Tema7;

public class LosDados {
    public int numeroCaras;
    public int ultimoResultado;

    public LosDados(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public LosDados() {
        this.numeroCaras = 6;
    }

    public int getNumeroCaras() {
        return numeroCaras;
    }

    public int getUltimoResultado() {
        return ultimoResultado;
    }

    public void setNumeroCaras(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public int tirada(){
        ultimoResultado = (int) (Math.random() * numeroCaras) + 1;
        return ultimoResultado;
    }

    public static void main(String[] args) {
        LosDados dado = new LosDados(6);
        LosDados dado2 = new LosDados(10);
        LosDados dado3 = new LosDados(12);

        while (true){
            System.out.println("Dado 1: " + dado.tirada());
            System.out.println("Dado 2: " + dado2.tirada());
            System.out.println("Dado 3: " + dado3.tirada());

            if (dado.getUltimoResultado() + dado2.getUltimoResultado() + dado3.getUltimoResultado() >= 20){
                System.out.println("La suma de los dados es mayor o igual a 20");
                break;
            }else {
                System.out.println("La suma de los dados es menor a 20 \nSe procedera a otra tirada");
            }
        }
    }
}
