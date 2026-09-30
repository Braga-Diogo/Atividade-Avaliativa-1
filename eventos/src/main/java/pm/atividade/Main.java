package pm.atividade;

import java.util.Scanner;
import pm.atividade.business.*;

public class Main { 
    
    private static Scanner sc = new Scanner(System.in); 
    private static EmpresaEventos empresa = new EmpresaEventos();

    private static void carregarDadosIniciais() {
        empresa.adicionarSalao(new Salao(1, 100, "Bloco A", "Festas"));
        empresa.adicionarSalao(new Salao(2, 200, "Bloco B", "Casamentos"));
        empresa.adicionarSalao(new Salao(3, 50, "Bloco C", "Reuniões"));

        empresa.adicionarOrganizador(new Organizador("Ana Souza", "111", "3111-1111", "Festas"));
        empresa.adicionarOrganizador(new Organizador("Bruno Lima", "222", "3222-2222", "Casamentos"));
        empresa.adicionarOrganizador(new Organizador("Carla Dias", "333", "3333-3333", "Corporativo"));
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("MENU DE SALÕES");
            System.out.println("1 - Cadastrar reserva");
            System.out.println("2 - Associar organizador");
            System.out.println("3 - Atribuir reserva");
            System.out.println("4 - Reservas confirmadas");
            System.out.println("5 - Total de reservas finalizadas");
            System.out.println("6 - Buscar reservas por status");
            System.out.println("7 - Detalhes de uma reserva");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = lerInt();

            switch (opcao) {

                case 1: cadastrarReserva(); 

                break;

                case 2: associarOrganizador(); 

                break;

                case 3: atribuirReserva(); 

                break;

                case 4: reservasDoSalao(); 

                break;

                case 5: finalizadasPorSalao(); 

                break;

                case 6: buscarReserva();

                break;

                case 7: exibirDetalhes();

                break;
                


    }

 }
