package Arquivos.Ex015.Controller;

public class UsuarioController {

    public String cadastrarNome(String nome) {
        while (true) {
            if (nome.trim().isEmpty()) {
                System.out.println("Nome invalido.");
                continue;
            }

            if (nome.trim().length() < 3) {
                System.out.println("Nome precisa conter mais do que três caracteres");
                continue;
            }
            return nome;
        }
    }
}
