
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException exception){
			System.out.println("Deu erro na conex�o");
		}
		
		
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		} catch(IllegalStateException exception){
//			System.out.println("Deu erro na conex�o");
//		} finally {
//			conexao.fecha();
//		}

	}

}
