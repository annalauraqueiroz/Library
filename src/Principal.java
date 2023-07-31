
import java.util.Scanner;

public class Principal {
	public Usuario CadastroUsuario(Scanner leitor){
		Usuario user = new Usuario ();
	 String Nome;
	 int codigo;
	 String Telefone;
	 String Endereco; 
	 
	System.out.println("\nEntre com os dados do Usuario");
		System.out.println("Nome:");
		Nome = leitor.next();
		System.out.println("Codigo");
		codigo = leitor.nextInt();
		System.out.println("Telefone");
		Telefone = leitor.next();
		System.out.println("Endereco");
		Endereco = leitor.next();
		
		user.setNome(Nome);
		user.setTelefone(Telefone);
		user.setEndereco(Endereco);
		user.setCodigo(codigo);
		user.setEmprestimo(false);
		
		return user;
		
	}
		public void Exibir1(Usuario user){
		System.out.println("Dados do Usuario:");
		System.out.println("Nome:"+user.getNome()+"\nTelefone"+user.getTelefone()+"\nEndereco"+user.getEndereco()
		+"\nLivro"+user.getLivro()); }
		
		public Livro CadastroLivro(Scanner leitor){
			Livro book = new Livro ();
			String nome;
			 int anoLancamento;
			 int codigo;
			 String autor;
			 String genero;
			
			
			System.out.println("\nEntre com os dados do Livro");
			System.out.println("Nome:");
			nome = leitor.next();
			System.out.println("Codigo");
			codigo = leitor.nextInt();
			System.out.println("Ano Lançamento");
			anoLancamento = leitor.nextInt();
			System.out.println("Autor");
			autor = leitor.next();
			System.out.println("Genero");
			genero = leitor.next();
			
			
			book.setNome(nome);
			book.setCodigo(codigo);
			book.setAnoLancamento(anoLancamento);
			book.setAutor(autor);
			book.setGenero(genero);
			book.setEstaEmUso(false);
			
			return book;
		}
		
			public void Exibir2(Livro book){
				System.out.println("Dados do livro:");
				System.out.println("Nome:"+book.getNome()
				+"\nCodigo"+book.getCodigo()+
				"\nAno de lancamento"+book.getAnoLancamento()
				+"\nAutor"+book.getAutor()+
				"\nGenero:"+book.getGenero()+
				"\nStatus: "+book.disponivel()); 
			}
			
			public void Menu(Scanner leitor){
				int opcao=0;
				
				
				Usuario user=new Usuario();
				Livro book = new Livro ();
				do{
				System.out.println("\nOpcoes:");
				System.out.println("1 - Cadastrar um novo Usuario. \n2 - Ver dados do usuario "
						+ "\n3 - Para Alugar/Devolver Livro \n4- Cadastrar Livro \n5- Ver dados do livro \n6 - para sair");
				
				opcao=leitor.nextInt();
				System.out.println(opcao);
				
				switch(opcao){
				case 1:
					user = CadastroUsuario(leitor);
					break;
				case 2:
					Exibir1(user);
					break;
				case 3:
					book.alugdevol();
					break;
				case 4:
					book = CadastroLivro(leitor);
					break;
				case 5:
			        Exibir2(book);
			        break;
				case 6:
					break;			
				default:
					System.out.println("Opcao Invalida.\n");
				}
				
				}while(opcao!=6);
				
				
			}
			
			public static void main(String[] args) {
				Principal p = new Principal();
				Scanner leitor = new Scanner(System.in);
				p.Menu(leitor);
				
				
				
				leitor.close();
				
			}
			
		
			
}
