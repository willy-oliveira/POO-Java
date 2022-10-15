import java.util.Scanner;
public class TestaCirculo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Circunferencia c = new Circunferencia();
        System.out.println("Digite o eixo x:"); 
        c.setX(sc.nextInt());

        System.out.println("Digite o eixo y:"); 
        c.setY(sc.nextInt());

        System.out.println("Digite o Raio"); 
        c.setRaio(sc.nextInt());
        
        System.out.println("Área do circulo: " + c.calculaArea());
        System.out.println("Perímetro do circulo: " + c.calculaPerimetro());
        System.out.println(c.toString());

        System.out.println("Entre com o valor de X do ponto a ser validado"); 
        int vx = sc.nextInt();
        System.out.println("Entre com o valor de Y do ponto a ser validado"); 
        int vy = sc.nextInt();

        System.out.println(c.validaPonto(vx, vy));
    }
}
