package pm.atividade.business;

import java.time.LocalDate;

public class Reserva {
    
   private int codigo;
   private String nomeCliente;
   private LocalDate data;
   private LocalDate horario;
   private int qntdConvidados;
   private String statusReserva;
   private double valorTotal;
   private Salao salao;

   public Reserva(int codigo, String nomeCliente, LocalDate data, LocalDate horario, int qntdConvidados,
        String statusReserva, double valorTotal) {
    this.codigo = codigo;
    this.nomeCliente = nomeCliente;
    this.data = data;
    this.horario = horario;
    this.qntdConvidados = qntdConvidados;
    this.statusReserva = statusReserva;
    this.valorTotal = valorTotal;
}

   public int getCodigo() {
    return codigo;
   }

   public void setCodigo(int codigo) {
    this.codigo = codigo;
   }

   public String getNomeCliente() {
    return nomeCliente;
   }

   public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
   }

   public LocalDate getData() {
    return data;
   }

   public void setData(LocalDate data) {
    this.data = data;
   }

   public LocalDate getHorario() {
    return horario;
   }

   public void setHorario(LocalDate horario) {
    this.horario = horario;
   }
   
   public int getQntdConvidados() {
    return qntdConvidados;
   }

   public void setQntdConvidados(int qntdConvidados) {
    this.qntdConvidados = qntdConvidados;
   }

   public String getStatusReserva() {
    return statusReserva;
   }

   public void setStatusReserva(String statusReserva) {
    this.statusReserva = statusReserva;
   }

   public double getValorTotal() {
    return valorTotal;
   }

   public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
   }

   public Salao getSalao() {
    return salao;
    }

   public void setSalao(Salao salao) {
    this.salao = salao;
   }

   public void exibirDetalhesReserva(Reserva reserva) {

     System.out.println("Reserva: " + reserva.getCodigo() + " ; " + " Data: " + reserva.getData() + " e Horario: " +
    reserva.getHorario() + " ; Quantidade de convidados: " + reserva.getQntdConvidados() + "; Status: " + reserva.getStatusReserva());

   }
}
