//CRIAÇÃO DA CLASSE

class Carro {

    //ATRIBUTOS
    String cor;
    String modelo;
    int capacidadeTanque;

    //MÉTODOS CONSTRUTORES (com sobrecarga)
    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //MÉTODOS GET e SET

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //MÉTODOS RELACIONADOS AO NEGÓCIO

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}