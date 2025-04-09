package tratamento_excecoes;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);

	}
}

//EXTENDS EXCPETION SOMENTE OBRIGA A EU TRATAR O ERRO NO BLOCO OU PROPAGAR ESSE ERRO DIFERENTEMENTE DO RUNTIMEEXCEPTION