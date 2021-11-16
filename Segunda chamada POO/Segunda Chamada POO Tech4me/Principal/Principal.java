package Principal;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Livro;
import Classes.Locacao;
import Classes.Status;

public class Principal {
    public static void main(String[] args) {
        Integer opcao = -1;
        int resposta, op;
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        List<Locacao> locado = new ArrayList<>();
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {

            System.out.println("\n******* M E N U *******\n");
            System.out.println("Digite 1 para cadastrar novo livro ao sistema!");
            System.out.println("Digite 2 para consultar livros cadastrados no sistema!");
            System.out.println("Digite 3 para listar todos os livros cadastrados no sistema!");
            System.out.println("Digite 4 para realizar locação de livro!");
            System.out.println("Digite 5 para realizar devolução de livro!");
            System.out.println("Digite 6 para inspecionar relatório de livros com devolução em aberto!");
            System.out.println("Digite 7 para inspecionar relatório de livros alugados por período!");
            System.out.println("Digite 0 para finalizar programa!");
            opcao = sc.nextInt();
            sc.nextLine();

        switch (opcao) {
        case 1:

            do {
            System.out.println("***** Cadastrando novo livro: *****\n");
            System.out.printf("Digite o código do livro:");
            sc.nextLine();
            String codigo = sc.nextLine();
            System.out.printf("Digite o título do livro:");
            String titulo = sc.nextLine();
            System.out.printf("Digite o nome do autor:");
            String autor = sc.nextLine();
            System.out.printf("Digite o número de páginas:");
            int numerodePaginas = sc.nextInt();
            System.out.printf("\n");
            System.out.println("Livro cadastrado com sucesso!\n");

            Livro livro = new Livro(codigo, titulo, autor, numerodePaginas);
            livros.add(livro);

            System.out.printf("Gostaria de cadastrar outro livro?\n");
            System.out.println("1 = Sim\n");
            System.out.printf("0 = Não\n");
            resposta = sc.nextInt();

            } while (resposta == 1);
             
        break;
        case 2:
            do {
                System.out.println("***** Consulta de livro: *****\n");
                System.out.printf("Digite o código do livro requisitado:");
                String codigo = sc.nextLine();
                System.out.println("\n");
           
                for (Livro l : livros) {
                
                if(l.getCodigo().equals(codigo)){

                System.out.println(l);

                }else{

                System.out.println("O código digitado não corresponde a nenhum livro!");

                System.out.println("Gostaria de consultar outro livro?\n");
                System.out.println("1 = Sim\n");
                System.out.printf("0 = Não\n");
                op = sc.nextInt();}
            }

            } while (op == 1);
    
            break;
        case 3:
            System.out.println("***** Lista de livros cadastrados: *****\n");
            System.out.println(livros);

            if(livros.isEmpty()){
                System.out.println("Não há livros cadastrados!");
            }
            break;
        case 4:
            System.out.println("***** Realizar locação de livro: *****\n");
            System.out.println("Aperte espaço para prosseguir!");

            if(livros.isEmpty()){
                System.out.println("Não há livros disponiveis!");

            }else{
        
                sc.nextLine();
                System.out.println("Digite a data da locação [dd/mm/aaaa]:");
                String datadaLocacao = sc.nextLine();

                System.out.println("Digite a data da devolucao [dd/mm/aaaa]:");
                String datadaDevolucao = sc.nextLine();

                System.out.println("Digite o CPF do locatario:");
                String CPF = sc.nextLine();

                System.out.println("Digite o código de locação");
                String codigoLo = sc.nextLine();

                System.out.println("Digite o status do livro [Disponivel/Locado]:");
                String statusdeDevolucao = sc.nextLine();

                System.out.println("Digite o código do livro:");
                String codigoLivro = sc.nextLine();
                System.out.println("\n");

            for (Livro liv : livros) {
            
            if(liv.getCodigo().equals(codigoLivro)){
        
                System.out.println(liv);
                System.out.println("\n Esse livro foi locado!");
                        
                Locacao emlocacao = new Locacao(datadaLocacao, CPF, codigoLivro, datadaDevolucao, statusdeDevolucao);
                locado.add(emlocacao);

            }else{

                System.out.println("Código não encontrado!");
            }
        }
    }
            break;
        case 5:
           System.out.println("***** Realizar devolução de livro: *****\n");
           System.out.println("Aperte espaço para prosseguir!");

           if(livros.isEmpty()){
                System.out.println("Não há livros disponiveis!");

            }else{
        
                sc.nextLine();
                System.out.println("DIgite a data da locação [dd/mm/aaaa]:");
                String datadaLocacao = sc.nextLine();

                System.out.println("Digite a data da devolucao [dd/mm/aaaa]:");
                String datadaDevolucao = sc.nextLine();

                System.out.println("Digite o CPF do locatario:");
                String CPF = sc.nextLine();

                System.out.println("Digite o status do livro [Disponivel/Locado]:");
                String statusdeDevolucao = sc.nextLine();

                System.out.println("Digite o código do livro:");
                String codigoLivro = sc.nextLine();
                System.out.println("\n");

                for (Livro liv : livros) {
            
                if(liv.getCodigo().equals(codigoLivro)){
        
                    System.out.println(livros);
                    System.out.println("\nEsse livro foi devolvido!");
                        
                    Locacao emlocacao = new Locacao(datadaLocacao, CPF, codigoLivro, datadaDevolucao, statusdeDevolucao);
                    locado.add(emlocacao);

                }else{

                    System.out.println("Código não existente!");
                    }
                }
            }
            break;
        case 6:
            System.out.println("***** Lista de livros com devolução em aberto: *****\n");
            System.out.println(locado);
            break;
        case 7:
            System.out.println("***** Livros alugados por período: *****\n");
            System.out.println(Status);
                    break;
            break;
        case 0:
            System.out.println("***** Programa encerrado! *****");
            break;
        default:
            System.out.println("***** Opção inválida! *****");
            break;
        }

    } while (opcao != 0);

    sc.close();

    }
}       