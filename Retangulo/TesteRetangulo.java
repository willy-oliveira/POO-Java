import java.util.Scanner;
public class TesteRetangulo {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Retangulo r = new Retangulo();
        System.out.print("Digite a posição de x: "); 
        r.setX(scan.nextInt());

        System.out.print("Digite a posção de y: "); 
        r.setY(scan.nextInt());

        System.out.println("Digite a largura"); 
        r.setLargura(scan.nextInt());

        System.out.println("Digite a Altura"); 
        r.setAltura(scan.nextInt());
        
        System.out.println(r.toString());
        System.out.println("Área do triangulo: " + r.calculaArea());
        System.out.println("Perímetro do triângulo: " + r.calculaPerimetro());

        System.out.println("Entre com o valor de X do ponto a ser validado"); 
        int vx = scan.nextInt();
        System.out.println("Entre com o valor de Y do ponto a ser validado"); 
        int vy = scan.nextInt();

        System.out.println(r.validaPonto(vx, vy));
    }
}
