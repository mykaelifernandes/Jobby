import java.io.*;

public class CadastroCandidato {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Estudos\\Jobby\\cadastro.csv"))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                String[] palavras = linha.split(";");

                    System.out.println("Nome: " + palavras[0]);
                    System.out.println( "CPF: "  + palavras[1]);
                    System.out.println( "dataNascimento: " + palavras[2]);
                    System.out.println( "genero: " + palavras[3]);
                    System.out.println( "endereco: " + palavras[4]);
                    System.out.println( "numero: " + palavras[5]);
                    System.out.println( "complemento: " + palavras[6]);
                    System.out.println( "bairro: " + palavras[7]);
                    System.out.println( "cidade: " + palavras[8]);
                    System.out.println( "estado: " + palavras[9]);
                    System.out.println( "email: " + palavras[10]);

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }

}