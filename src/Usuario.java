
public class Usuario {
	private String Nome;
	private int codigo;
	private String Telefone;
	private String Endereco; 
	private String Livro;
	private boolean Emprestimo;

	public Usuario(){

	}

	public Usuario(String nome, int codigo, String telefone, String endereco, String livro, boolean emprestimo) {
		this.Nome = nome;
		this.codigo = codigo;
		this.Telefone = telefone;
		this.Endereco = endereco;
		this.Livro = livro;
		this.Emprestimo = emprestimo;
	}

	
	
public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		this.Telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getLivro() {
		return Livro;
	}

	public void setLivro(String livro) {
		Livro = livro;
	}

	public boolean isEmprestimo() {
		return Emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		Emprestimo = emprestimo;
	}

public String disponivel(){
		
		if(Livro== ""){
			Emprestimo=false;
			return "sem devoluções pendentes";
		} else {
			Emprestimo= true;
			return "devolucoes pendentes";
		}
		
		
	}
	
	
}

		
		
		
		
