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


        if( mediaFinal > 8){
            System.out.println("Aprovada com média final de " +mediaFinal);
        }
        else{
           if(mediaFinal > 5){
                System.out.println("A aluna recebeu a média final de " +mediaFinal+ ",portanto está de recuperação");
            }
           else{
               System.out.println("A aluna foi reprovada com média final de " +mediaFinal);
           }
        }//fim da condicional
    }
}
