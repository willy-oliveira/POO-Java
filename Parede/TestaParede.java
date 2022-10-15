import java.util.Scanner;
public class TestaParede{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Parede pa = new Parede();
        
        System.out.println("Altura da parede:"); 
        pa.setAltura(sc.nextDouble());

        System.out.println("Largura da parede: "); 
        pa.setLargura(sc.nextDouble());

        System.out.println("Digite a cor da parede: "); 
        pa.setCor(sc.next()); 

        System.out.println("Dados obtidos");
        System.out.println(pa.toString());

        System.out.println("informe a largura do azuleijo: "); 
        double lAz = sc.nextDouble();
        System.out.println("informe a altura do azuleijo: "); 
        double aAz = sc.nextDouble();
        System.out.println("Quantidade de Azuleijos: " + pa.calculaQuantidadeAzulejos(lAz, aAz));

        System.out.println("Digite o rendimento da tinta: "); 
        int rendimento = sc.nextInt();
        System.out.println("Quantidade de da tinta: " + String.format("%.2f", pa.calculaQuantidadeTinta(rendimento)) + " Litros de Tinta");
    }

}