import java.util.Scanner;

public class TestaPorta {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Porta p = new Porta();
        System.out.println("Altura da Porta:"); 
        p.setAltura(sc.nextDouble());

        System.out.println("Largura da porta: "); 
        p.setLargura(sc.nextDouble());

        System.out.println("Digite a cor da porta: "); 
        p.setCor(sc.next()); 


        System.out.println("Área da porta: " + p.calculaArea());
        System.out.println("Perímetro da porta: " + p.calculaPerimetro());
        System.out.println(p.toString());

        System.out.println("Digite o rendimento do verniz: "); 
        int rendimento = sc.nextInt();
        System.out.println("Quantidade de Verniz: " + String.format("%.2f", p.calculaQuantidadeVerniz(rendimento)) + " Litros de verniz");
    }

}
