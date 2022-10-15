public class Porta {
    private double Largura;
    private double Altura;
    private String Cor;

    public Porta(){
    }

    public Porta( double largura, double altura, String cor){
        this.Largura = largura;
        this.Altura =  altura;
        this.Cor = cor;
    }

    public double getLargura(){ return this.Largura; }
    public double getAltura(){ return this.Altura; }
    public String getCor(){ return this.Cor; }

    public void setLargura(double largura){ this.Largura = largura;}
    public void setAltura(double altura){ this.Altura = altura;}
    public void setCor(String cor){ this.Cor = cor; }

    public double calculaArea(){
        double area = this.Altura * this.Largura;
        return area;
    }

    public double calculaPerimetro(){
        double perimetro = 2 * (this.Largura + this.Altura);
        return perimetro;
    }

    public double calculaQuantidadeVerniz(int rendimento){
        double A = this.Altura * this.Largura;
        double Qtdverniz = rendimento/A;
        return Qtdverniz;
    }

    public String toString(){
        String dados = "Largura: " + this.Largura + 
                        ", Altura: " + this.Altura + 
                        ", Cor: " + this.Cor; 
        return dados;
    }

}
