package exceptions;

public class ContaNaoLocalizadaException extends Exception {
    public ContaNaoLocalizadaException() {
        super("Conta não localizada");
    }
}
