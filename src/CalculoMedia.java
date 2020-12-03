import java.util.Scanner;//importa a classe Scanner

public class CalculoMedia {
    public static void main (String[] args){
        //metodo scanner
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite o nome da(o) aluna(o): ");
        String nome = meuScanner.nextLine();//inserir os dados pelo teclado
        //Inicio Saída de Dados
        System.out.println("************* SISTEMA GESTÃO ACADÊMICA *************");
        /* ---- */
        //Inicio dados das provas
        System.out.println("Digite a nota da primeira prova bimestral : ");
        Float prova1 = meuScanner.nextFloat();
        System.out.println("Digite a nota da segunda prova bimestral : ");
        Float prova2 = meuScanner.nextFloat();
        System.out.println("Digite a nota final dos exercícios complementares : ");
        Float exercicios = meuScanner.nextFloat();
        System.out.println("Digite a nota final dos projetos de Software : ");
        Float projetos = meuScanner.nextFloat();

        //Media
        Float mediaFinal = (prova1 + prova2 + exercicios + projetos) /4;//media
        Integer minimoAprovacao = 10;//valor minimo
        Float resultado = minimoAprovacao - mediaFinal;
        /*valida se a media é superior a 8 tanto das provas, quanto com o valor mínimo da prova final */

        //Condicional
        if(mediaFinal >= 8 || resultado >= 8){
            System.out.println("A média da(o) "+nome+" é "+mediaFinal+" e foi aprovada(o)!");
        }
        else{
            System.out.println("A media da(o) "+nome+" é "+resultado+ " e foi reprovada(o)!");
        }
    }
}
