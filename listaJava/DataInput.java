import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        // Criação do scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Definindo o formato esperado para a data de entrada
        DateTimeFormatter formatterEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Definindo o formato desejado para a data de saída
        DateTimeFormatter formatterSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Solicitando a data do usuário
        System.out.print("Informe a data no formato DD/MM/AAAA: ");
        String dataEntrada = scanner.nextLine();

        try {
            // Convertendo a string de entrada em um objeto LocalDate
            LocalDate data = LocalDate.parse(dataEntrada, formatterEntrada);

            // Formatando a data conforme o formato desejado
            String dataFormatada = data.format(formatterSaida);

            // Exibindo a data formatada
            System.out.println("Data formatada: " + dataFormatada);
        } catch (Exception e) {
            // Tratando a exceção caso a data fornecida esteja em um formato inválido
            System.out.println("Formato de data inválido. Por favor, use o formato DD/MM/AAAA.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
