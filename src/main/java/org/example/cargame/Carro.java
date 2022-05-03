package org.example.cargame;

import java.util.Objects;

public class Carro {
    private final Colores color;
    private  final String placa;
    private Conductor conductor;
    private Integer metros;
    private boolean estaEnMarcha;


    public Carro(Colores color,String placa,Integer metros) {
        this.color = Objects.requireNonNull(color);
        this.placa=Objects.requireNonNull(placa);
        this.metros=Objects.requireNonNull(metros);
        this.estaEnMarcha=false;
        if(metros<0){
            throw new IllegalArgumentException("no se puede tener metros negativos");
        }

    }
    public Carro(Colores color,String placa) {
        this(color,placa, 0);
    }
    public void agregarconductor(Conductor conductor){
        this.conductor= Objects.requireNonNull(conductor);
    }

    public void Iniciar(){
        this.estaEnMarcha=true;
    }

    public void aumentarMetro(){
        if(this.estaEnMarcha){this.metros=metros +1;}

    }
    public double kilimetros(){
        return Math.ceil((double) metros/1000);
    }
    public void pararMarcha(){
        this.estaEnMarcha=false;
    }
    public double metros(){
        return metros;
    }

    public Conductor conductor(){
        return conductor;
    }

    public  Colores color(){
        return color;
    }


    public boolean estaEnMarcha() {
        return estaEnMarcha;
    }

    public String placa() {
        return placa;
    }




    public enum  Colores{
        ROJO,BLANCO,NEGRO,AZUL,VERDE
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color=" + color +
                ", placa='" + placa + '\'' +
                ", conductor=" + conductor +
                ", metros=" + metros +
                '}';
    }
}
