import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CadastroCandidato {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("C:\\Users\\Mykae\\IdeaProjects\\Jobby\\cadastro.csv"))) {

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] campos = linha.split(";");

                String nome = campos[0];
                System.out.println("Nome: " + nome);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
