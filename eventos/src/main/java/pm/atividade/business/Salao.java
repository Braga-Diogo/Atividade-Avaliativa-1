package pm.atividade.business;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salao {

    private int numero;
    private int capacidadeMaxima;
    private String localizacao;
    private String tipoSalao;
    private Organizador organizador;
    private Reserva reserva;
    private ArrayList reservas;

    public Salao(int numero, int capacidadeMaxima, String localizacao, String tipoSalao) {
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.tipoSalao = tipoSalao;
        this.organizador = organizador;
        this.reserva = reserva;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getTipoSalao() {
        return tipoSalao;
    }
    public void setTipoSalao(String tipoSalao) {
        this.tipoSalao = tipoSalao;
    }

    public Organizador getOrganizador() {
        return organizador;
    }
    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

     public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
    public boolean estaDisponivel(String data, LocalDate horario) {
        for (Reserva r : reservas) {
            if (r.getData().equals(data) && r.getHorario() == horario) {
                return false;
            }
        }
        return true;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

}
