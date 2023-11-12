import java.util.HashMap;
import java.util.Map;

/**
 * Classe simples para autenticação de usuários, simulando uma base de dados de usuários.
 */
public class LoginScreen {	
	private Map<String, String> userDatabase; // Usuário simulado na base de dados (usuário, senha)

	/**
	 * Constrói uma nova instância de LoginScreen e inicializa a base de dados de usuários.
	 * Para exemplo, pré-carrega a base de dados com alguns usuários de amostra.
	 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");		
	}
	
	/**
	 * Tentativa de autenticação de usuário baseada em seu nome de usuário e senha.
	 * 
	 * @param username O nome de usuário do usuário que está tentando iniciar sessão.
	 * @param password A senha inserida pelo usuário.
	 * @return {@code true} se a autenticação for bem sucedida, {@code false} caso contrário.
	 */
	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true; // Autenticação bem sucedida
			}
		}
		return false; // Autenticação falhou
	}
	
	/**
	 * Adiciona um novo usuário à base de dados de usuários. Por favor note que esse método não é
	 * recomendado para ser utilizado em ambiente de produção, uma vez que não dispõe de medidas
	 * de segurança adequadas.
	 * 
	 * @param username O nome de usuário do novo usuário.
	 * @param password A senha do novo usuário.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);	
	}
}
