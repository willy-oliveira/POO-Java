public class Circunferencia {

    private int xCentro;
    private int yCentro;
    private int Raio;

    public Circunferencia(){
    }

    public Circunferencia(int x, int y, int raio){
        this.xCentro = x;
        this.yCentro = y;
        this.Raio = raio;
    }

    public int getX() { return this.xCentro; }
    public int getY() { return this.yCentro; }
    public int getRaio() { return this.Raio; }

    public void setX(int x){ this.xCentro = x;}
    public void setY(int y){ this.yCentro = y;}
    public void setRaio(int raio){ this.Raio = raio;}

    public boolean validaPonto(int vx, int vy){
        boolean resultado = true;

        double raiopx = Math.sqrt(((vx - this.xCentro)* 2)) + ((( vy -this.xCentro)*2));

        if(raiopx < this.Raio){
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }
    public double calculaArea(){
        double area = 3.1415 * (this.Raio*this.Raio);
        return area;
    }
    public double calculaPerimetro(){
        double perimetro = (2* 3.1415) * this.Raio;
        return perimetro;
    }
    public String toString(){
        String dados = "Eixo central x: " + this.xCentro + 
                        ", Eixo central Y: " + this.yCentro + 
                        ", Raio: " + this.Raio;
        return dados;
    }
}
