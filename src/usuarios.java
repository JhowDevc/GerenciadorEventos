import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class usuarios{


    public ArrayList usuarios = new ArrayList();


    String nome;
    String sexo;
    int rg;



    public String getNome(){
    return nome;
     }
    public void setNome(String nome) {
        usuarios.add(nome);
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        usuarios.add(sexo);
        this.sexo = sexo;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(String rg) {
        usuarios.add(rg);
        this.rg = Integer.parseInt(rg);
    }


        public static ArrayList eventos = new ArrayList();
        String nomeEvento;
        String endereco;
        String categoria;
        String descricao;




        public String getnomeEvento(){
            return nomeEvento;
        }
        public void setnomeEvento(String nomeEvento) {
            eventos.add(nomeEvento);
            this.nomeEvento = nomeEvento;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            eventos.add(endereco);
            this.endereco = endereco;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            eventos.add(descricao);
            this.descricao = descricao;
        }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        eventos.add(Categoria);
        this.categoria = Categoria;
    }



public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    Scanner dados1 = new Scanner(System.in);
    Scanner dados2 = new Scanner(System.in);
    Scanner dados3 = new Scanner(System.in);
    Scanner dados4 = new Scanner(System.in);
    Scanner dados5 = new Scanner(System.in);
    Scanner dados6 = new Scanner(System.in);
    Scanner dados7 = new Scanner(System.in);
    Scanner dados8 = new Scanner(System.in);
    Scanner dados9 = new Scanner(System.in);
    Scanner dados10 = new Scanner(System.in);

    usuarios c1 = new usuarios();



    String nome = "";
    String sexo = "";
    String nomeEvento ="";
    String endereco = "";
    String categoria = "";
    String descricao = "";
    int rg = 0;


    LocalDateTime horario = LocalDateTime.of(2024, 3, 21, 15, 0);
    LocalDateTime horario1 = LocalDateTime.of(2024, 5, 25, 10, 0);
    LocalDateTime horario2 = LocalDateTime.of(2024, 7, 10, 8, 30);
    LocalDateTime horario3 = LocalDateTime.of(2024, 8, 15, 12, 30);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    String horarioFormatado = horario.format(formatter);
    String horarioFormatado1 = horario1.format(formatter);
    String horarioFormatado2 = horario2.format(formatter);
    String horarioFormatado3 = horario3.format(formatter);

    System.out.println("Opçoes\n 1-Cadastrar usuario\n 2-Cadastrar Eventos\n 3-Remover usuario\n 4-Cancelar inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n" );
    int numopc = 0;

    System.out.print("nº: ");

    numopc = dados.nextInt();

    while (numopc == 1 || numopc == 2 || numopc == 3 || numopc == 4 || numopc == 5 || numopc == 6) {

        switch (numopc) {

            case 1:
                System.out.println("Nome do usuario: ");
                nome = dados2.nextLine();
                c1.setNome(nome);

                System.out.println("Sexo do usuario: ");
                sexo = dados2.nextLine();
                c1.setSexo(sexo);

                System.out.println("Rg do usuario: ");
                rg = dados2.nextInt();
                c1.setRg(String.valueOf(rg));

                System.out.println("\nUsuario " + nome + " cadastrado com sucesso!\nMenu:\n 0-Sair\n 1-Cadastrar outro usuario\n 2-Cadastrar eventos\n 3-Remover usuario\n 4-Cancelar inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n");
                numopc = dados.nextInt();
                break;


            case 2:
                System.out.println("Nome do Evento");
                c1.setnomeEvento(nomeEvento);
                nomeEvento = dados3.nextLine();

                System.out.println("Endereço");
                c1.setEndereco(endereco);
                endereco = dados3.nextLine();

                System.out.println("Categoria" + "(festas, eventos esportivos, shows, entre outros exemplos)");
                c1.setCategoria(categoria);
                categoria = dados3.nextLine();

                System.out.println("Horario do evento");
                c1.setDescricao(descricao);
                descricao = dados3.nextLine();

                System.out.println("Data do evento");
                c1.setDescricao(descricao);
                descricao = dados3.nextLine();

                System.out.println("Descrição");
                c1.setDescricao(descricao);
                descricao = dados3.nextLine();


                System.out.println("\nEvento " +nomeEvento+ " cadastrado com sucesso!\nMenu:\n 0-Sair\n 1-Cadastrar usuario\n 2-Cadastrar eventos\n 3-Remover usuario\n 4-Cancelar inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n");
                numopc = dados4.nextInt();

                break;

            case 3:
                System.out.println("Remover usuario");

                System.out.println("Digite o Nome do usuario");
                nome = dados4.nextLine();
                c1.setNome(nome);

                System.out.println("Digite o RG do usuario");
                rg = dados4.nextInt();
                c1.setRg(String.valueOf(rg));

                System.out.println("\nUsuario " +nome+ " removido com sucesso!\nMenu:\n 0-Sair\n 1-Cadastrar usuario\n 2-Cadastrar Eventos\n 3-Remover outro usuario\n 4-Cancelar inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n");
                numopc = dados4.nextInt();
                break;

            case 4:
                System.out.println("Deseja cancelar a sua participação?");
                dados5.nextLine();


                System.out.println("Informe seu RG");
                rg = dados5.nextInt();
                c1.setNome(String.valueOf(rg));

                System.out.println("Digite o nome do evento em que a inscriçao será cancelada");
                 nomeEvento = dados6.nextLine();
                 c1.setnomeEvento(nomeEvento);

                System.out.println("\nInscrição no evento " +nomeEvento+ " cancelada com sucesso!\nMenu:\n 0-Sair\n 1-Cadastrar usuario\n 2-Cadastrar Eventos\n 3-Remover usuario\n 4-Cancelar outra inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n");
                numopc = dados5.nextInt();
                break;


            case 5:
                System.out.println("Horario dos eventos!");
                System.out.println("Show Lulu Santos:\n " + horarioFormatado);
                System.out.println("Show Luan Santana:\n " + horarioFormatado1);
                System.out.println("Jogo dos aposentados(São Paulo):\n " + horarioFormatado2);
                System.out.println("Almoço beneficente:\n " + horarioFormatado3);

                System.out.println("\nMenu:\n 0-Sair\n 1-Cadastrar usuario\n 2-Cadastrar Eventos\n 3-Remover usuario\n 4-Cancelar inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n");
                numopc = dados6.nextInt();
                break;

            case 6:

                System.out.println("\nEventos passados: \n Concerto para a Paz Mundial\n Festival de Beneficência de Rock\n Show de Natal Solidário\n ");
                System.out.println("\nMenu:\n 0-Sair\n 1-Cadastrar usuario\n 2-Cadastrar Eventos\n 3-Remover usuario\n 4-Cancelar inscrição\n 5-Horarios dos eventos\n 6-Eventos passados\n");
                numopc = dados6.nextInt();
        }



        System.out.println(c1.usuarios.toString());
    }

}}
