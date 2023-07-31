
public class Livro {
	private String nome;
	private int anoLancamento;
	private int codigo;
	private String autor;
	private String genero;
	private boolean estaEmUso;

	public Livro(){
		
	}

	public Livro(String nome, int anoLancamento, int codigo, String autor, String genero, boolean estaEmUso) {
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.codigo = codigo;
		this.autor = autor;
		this.genero = genero;
		this.estaEmUso = estaEmUso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public int getCodigo(){
		return codigo;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isEstaEmUso() {
		return estaEmUso;
	}

	public void setEstaEmUso(boolean estaEmUso) {
		this.estaEmUso = estaEmUso;
	}
	
	public String disponivel(){
		
		if(this.isEstaEmUso()==true){
			return "indisponivel";
		}
		
		return "disponivel";
	}
	public void alugdevol(){
	
		if(isEstaEmUso()==true){
			this.estaEmUso= false;
			System.out.println("Livro Devolvido com sucesso");
		}	
		else{
	
			this.estaEmUso= true;
			System.out.println("Livro Alugado com sucesso");
			}
}

}


