public class Retangulo {

    private int X;
    private int Y;
    private int Largura;
    private int Altura;

    public Retangulo(){
    }

    public Retangulo(int x, int y, int largura, int altura){
        this.X = x;
        this.Y = y;
        this.Largura = largura;
        this.Altura = altura;
    }

    public int getX(){ return this.X; }
    public int getY(){ return this.Y; }
    public int getLargura(){ return this.Largura; }
    public int getAltura(){ return this.Altura; }

    public void setX(int x){ this.X = x; }
    public void setY(int y){ this.Y = y; }
    public void setLargura(int largura){ this.Largura = largura; }
    public void setAltura(int altura){ this.Altura = altura; }

    public boolean validaPonto(int vx, int vy){
        boolean resultado = true;
        if((vx > this.X) && (vx < (this.X + this.Largura))){
            if((vy > this.Y) && (vy < (this.Y + this.Altura))){
                resultado = true;
            }
            else{
                resultado = false;
            }  
        }  
        return resultado;
    }

    public int calculaArea(){
        int area = this.Largura * this.Altura;
        return area;
    }

    public int calculaPerimetro(){
        int perimetro = 2 * (this.Largura + this.Altura);
        return perimetro;
    }

    public String toString(){
        String dados = "Ponto X: " + this.X + 
                        ", Ponto Y: " + this.Y + 
                        ", Largura: " + this.Largura + 
                        ", Altura: " + this.Altura + ".";
        return dados;
    }

}
