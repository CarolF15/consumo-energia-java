import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner leitor  = new Scanner(System.in);
          //     entrada de dados
        System.out.println("Digite o nome do aparelho: ");
                String nomeAparelho = leitor.nextLine();

        System.out.println("Digite a potência do aparelho em watts (W): ");
                double potencia = leitor.nextDouble();

       System.out.println("Digite o tempo médio de uso diário em horas: ");
                double horasDia = leitor.nextDouble();

         //Validação com estrutura de decisão
        if (potencia <= 0 || horasDia <=0) {
            System.out.println("\nA potência e as horas devem ser maiores que zero.");
        }
        else if (horasDia > 24) {
                System.out.println("\nO tempo de uso diário não pode exceder 24 horas.");
        }
        else {

            //Procesando a fórmula
            double consumoMensal = (potencia * horasDia * 30) / 1000;
            double custoEstimado = consumoMensal * 0.75;

            // Saída formatada
            System.out.println("\n-----------------------------------");
            System.out.println("Aparelho: " + nomeAparelho);
            System.out.printf("Consumo estimado: %.2f kWh/mês\n", consumoMensal);
            System.out.printf("Custo estimado: R$ %.2f/mês\n", custoEstimado);
            System.out.println("-----------------------------------");
        }
            leitor.close();
        }






    }
