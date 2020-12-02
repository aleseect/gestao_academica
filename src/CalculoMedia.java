import java.util.Scanner;//importa a classe Scanner

public class CalculoMedia {
    public static void main (String[] args){
        //metodo scanner
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite o nome da(o) aluna(o): ");
        String nome = meuScanner.nextLine();//inserir os dados pelo teclado
        //print na tela
        System.out.println("O nome da aluna(o) é " +nome+" !");


    }
}
