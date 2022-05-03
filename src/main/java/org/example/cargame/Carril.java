package org.example.cargame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carril {
    private final Integer numero;
    private final Integer Kilometros;
    private List<Carro> carros;

    public Carril(Integer numero, Integer kilometros) {
        this.Kilometros = Objects.requireNonNull(kilometros);
        this.numero = Objects.requireNonNull(numero);
        this.carros = new ArrayList<>();

        if (kilometros <= 0) {
            throw new IllegalArgumentException("no es in kilometro permitido");
        }
    }


    public void agregarCarro(Carro carro) {
        carros.add(carro);
    }

    public Integer Kilometros() {
        return Kilometros;
    }

    public Integer numero() {
        return numero;
    }

    public List<Carro> carros() {
        return carros;
    }
    public double progresoCarro(String placa){
        for (Carro carro: this.carros){
            if(carro.placa().equalsIgnoreCase(placa)){
                int metros = Kilometros()*1000;
                return (100*carro.metros())/metros;
            }
        }
        throw new IllegalArgumentException("no existe el carro");
}





}
