package pm.atividade.business;

import java.util.ArrayList;

public class EmpresaEventos {
    
    private ArrayList<Salao> saloes = new ArrayList<>(); 
    private ArrayList<Organizador> organizadores = new ArrayList<>(); 
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void adicionarSalao(Salao salao) { 
        saloes.add(salao); 
    
    }
    public void adicionarOrganizador(Organizador organizador) { 
        organizadores.add(organizador); 
    }

    public ArrayList<Salao> getSaloes() { 
        return saloes; 
    }

    public ArrayList<Organizador> getOrganizadores() { 
        return organizadores; 
    }

    public ArrayList<Reserva> getReservas() { 
        return reservas; 
    }

    public Salao buscarSalao(int numero) {
        for (Salao s : saloes) if (s.getNumero() == numero) return s;
        return null;
    }

    public Organizador buscarOrganizador(String cpf) {
        for (Organizador o : organizadores) if (o.getCPF().equals(cpf)) return o;
        return null;
    }

    public Reserva buscarReserva(int codigo) {
        for (Reserva r : reservas) if (r.getCodigo() == codigo) return r;
        return null;
    }

    public boolean cadastrarReserva(Reserva r) {
        if (buscarReserva(r.getCodigo()) != null) return false;
        reservas.add(r);
        return true;
    }

    public String associarOrganizador(String cpf, int numeroSalao) {

        Organizador o = buscarOrganizador(cpf);
        Salao s = buscarSalao(numeroSalao);

        if (o == null) 
            return "Organizador não encontrado";

        if (s == null) 
            return "Salão não encontrado";

        if (o.isResponsavel()) 
            return "Este organizador já é responsável por outro salão";

        if (s.getOrganizador() != null) 
            return "Este salão já tem organizador";

        s.setOrganizador(o);
        o.setResponsavel(true);

        return "Organizador associado";
    }

    public String atribuirReserva(int codigoReserva, int numeroSalao) {

        Reserva r = buscarReserva(codigoReserva);
        Salao s = buscarSalao(numeroSalao);

        if (r == null) 
            return "Reserva não encontrada.";

        if (s == null) 
            return "Salão não encontrado.";

        if (r.getStatusReserva() != "SOLICITADA")
            return "Apenas reservas solicitadas podem ser atribuídas.";

        if (r.getQntdConvidados() > s.getCapacidadeMaxima()) 
            return "Quantidade de convidados excede a capacidade do salão.";

        r.setSalao(s);
        r.setStatusReserva("CONFIRMADA");
        s.adicionarReserva(r);

        return "Reserva confirmada no salão " + s.getNumero() + "!";
    }

    public String finalizarReserva(int codigoReserva) {

        Reserva r = buscarReserva(codigoReserva);

        if (r == null) 
            return "Reserva não encontrada.";

        if (r.getStatusReserva() != "CONFIRMADA") 
            return "Apenas reservas confirmadas podem ser finalizadas.";

        r.setStatusReserva("FINALIZADA");

        return "Reserva finalizada!";
        
    }

    public int totalFinalizadasDoSalao(Salao s) {

        int total = 0;

        for (Reserva r : reservas) {
            if (r.getStatusReserva() == "FINALIZADA" && r.getSalao() == s) 
                total++;
        }

        return total;

    }

   public ArrayList<Reserva> buscarPorStatus(String status) {

        ArrayList<Reserva> lista = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getStatusReserva() == status) lista.add(r);
        }
        return lista;
    }

}
