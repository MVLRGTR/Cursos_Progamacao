package tratamento_excecoes_exe;

public class AccountExeception extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public AccountExeception(String msg) {
		super(msg);
	}

}
