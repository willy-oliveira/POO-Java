public class Parede {
    private double largura;
    private double altura;
    private String cor;

    public Parede(){
    }

    public Parede(double largura, double altura, String cor){
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
    }

    public double getLargura() { return this.largura; }
    public double getAltura() { return this.altura; }
    public String getCor() { return this.cor; }

    public void setLargura(double largura) { this.largura = largura; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setCor(String cor) { this.cor = cor; }

    public double calculaArea(){
        double area = this.largura * this.altura;
        return area;
    }
    public double calculaPerimetro(){
        double perimetro = 2 * (this.altura + this.largura);
        return perimetro;
    }
    public double calculaQuantidadeTinta(int rendimento){
        double qtdTinta = this.calculaArea()/rendimento;
        return qtdTinta;
    }
    public double calculaQuantidadeAzulejos(double lAz, double aAz){
        double areaAzuleijo = lAz * aAz;
        double qtdAzuleijos = this.calculaArea()/areaAzuleijo;
        return qtdAzuleijos;
    }
    public String toString(){
        String dados = "Largura: " + this.largura + ", Altura: " + this.altura + ", Cor: " + this.cor +
                        ", Área: " + this.calculaArea() + ", Perimetro: " + this.calculaPerimetro(); 
        return dados;
    }
}
