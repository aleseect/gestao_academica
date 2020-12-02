import java.util.Scanner;//importa a classe Scanner

public class CalculoMedia {
    public static void main (String[] args){
        //metodo scanner
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite o nome da(o) aluna(o): ");
        String nome = meuScanner.nextLine();//inserir os dados pelo teclado
        //Inicio Saída de Dados
        //System.out.println("************* SISTEMA GESTÃO ACADEMICA *************");
        //System.out.println("O nome da aluna(o) é " +nome+" !");
        //Inicio dados das provas
        System.out.println("Digite a nota da primeira prova bimestral : ");
        Float prova1 = meuScanner.nextFloat();
        System.out.println("Digite a nota da segunda prova bimestral : ");
        Float prova2 = meuScanner.nextFloat();
        System.out.println("Digite a nota final dos exercícios complementares : ");
        Float exercicios = meuScanner.nextFloat();
        System.out.println("Digite a nota final dos projetos de Software : ");
        Float projetos = meuScanner.nextFloat();
        //Validar a Media
        Float mediaFinal = (prova1 + prova2 + exercicios + projetos) /4;
        System.out.println("A media da(o) " +nome+ " é de "+mediaFinal);

    }
}
