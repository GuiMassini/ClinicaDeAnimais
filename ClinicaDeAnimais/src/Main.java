import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Main app = new Main();
        app.Start();

	}

	Scanner ler = new Scanner(System.in);
	
	private void Start() {
	    int opcao = 0;
	    
		
		
		while(opcao != 8) {
		System.out.println("1- Cadastrar cavalo");
		System.out.println("2 - Cadastrar girafa");
		System.out.println("3 - Listar cavalos");
		System.out.println("4 - Listar girafas");
		System.out.println("5 - Listar todos os animais");
		System.out.println("6 - Remover um animal por id");
		System.out.println("7 - Exibir a quantidade de animais cadastrados por tipo");
		System.out.println("8 - Sair");
		System.out.println("");
		System.out.println("Selecione a opcao:");
		
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Nome:");
			String nomeDoCavalo = ler.next();
			System.out.println("id: ");
			int idCavalo = ler.nextInt();
			CadastrarCavalo(idCavalo, nomeDoCavalo);
            System.out.println("Cavalo cadastrado!");
	    break;
		case 2:
			System.out.println("Nome:");
			String nomeDaGirafa = ler.next();
			System.out.println("id: ");
			int idGirafa = ler.nextInt();
			CadastrarGirafa(idGirafa, nomeDaGirafa);
			System.out.println("Girafa cadastrada!");
		break;
		case 3:
			ListarCavalos();
		break;
		case 4:
			ListarGirafas();
		break;
		case 5:
			ListarAnimais();
		break;
		case 6:
			
		break;
		case 7:
			
        break;
		case 8:
			System.out.println("Saindo...");
        break;
        
       
	}
		 System.out.println("");
	 }
      }

	List<Animais> listaCavalo = new ArrayList<Animais>();
	
	List<Animais> listaGirafa = new ArrayList<Animais>();
	
	List<Animais> listaAnimais = new ArrayList<Animais>(listaCavalo.size()+ listaGirafa.size());
	
	private void CadastrarCavalo(int id, String nome) {
        Cavalo cavalo = new Cavalo(id, nome);
		
		listaCavalo.add(cavalo);

	}
	
	private void CadastrarGirafa(int idGirafa, String nomeDaGirafa) {
        Girafa girafa = new Girafa(idGirafa, nomeDaGirafa);
        
		listaGirafa.add(girafa);
		
	}
	
private void ListarCavalos() {
		
		for (Animais cavalo : listaCavalo) {
			System.out.println("ID_DO_CAVALO: " + cavalo.getId() + " | " + "NOME_DO_CAVALO: " + cavalo.getNome());
		}
		
		
	}
	
	private void ListarGirafas() {
		for (Animais girafa : listaGirafa) {
			System.out.println("ID_DA_GIRAFA: " + girafa.getId() + " | " + "NOME_DA_GIRAFA: " + girafa.getNome());
		}
	}
	
	private void ListarAnimais() {
		
		listaAnimais.addAll(listaCavalo);
		listaAnimais.addAll(listaGirafa);
		
	}
	
	
	
}
