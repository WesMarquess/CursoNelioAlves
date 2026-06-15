package JDBC.ex001.db;

public class DbException extends RuntimeException {

    public DbException(String message) {
        super("Erro ao acessar banco de dados");
    }
}
