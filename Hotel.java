import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> quartos;

    public Hotel() {
        this.quartos = new ArrayList<>();
    }

    public void reservarQuarto(int numero) {
        for (int i = 0; i < quartos.size(); i++) {
            if (quartos.get(i).getNumero() == numero && !quartos.get(i).isOcupado()) {
                System.out.println("Quarto de número " + numero + " reservado com sucesso!");
            } else if (quartos.get(i).getNumero() == numero && quartos.get(i).isOcupado()) {
                System.out.println("Quarto ocupado, reserva cancelada.");
            } else {
                System.out.println("Número não consta no sistema.");
            }
        }
    }

    public boolean liberarQuarto(int numero) {
        for (int i = 0; i < quartos.size(); i++) {
            if (quartos.get(i).getNumero() == numero) {
                if (quartos.get(i).isOcupado()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void listarQuartos() {
        for (int i = 0; i < quartos.size(); i++) {
            System.out.println(quartos.get(i));
        }
    }

    public int quartosLivres() {
        int quartosdisp = 0;
        for (int i = 0; i < quartos.size(); i++) {
            if (!quartos.get(i).isOcupado()) {
                quartosdisp++;
            }
        }
        return quartosdisp;
    }

}
