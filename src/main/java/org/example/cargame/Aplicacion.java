package org.example.cargame;



public class Aplicacion {
    public static void main (String[]args){

        int numCarriles=3;  
        int kilometros=200;
        Juego juego = new Juego(numCarriles,kilometros,"pista#los Andes");

        Carro rojo = new Carro(Carro.Colores.ROJO,"XX1");
        rojo.agregarconductor(new Conductor("C1","raul","raul@email.com","raul"));
        Carro azul = new Carro(Carro.Colores.AZUL,"XX2");
        azul.agregarconductor(new Conductor("C2","Andres","andres@email.com","andres"));
        Carro verde = new Carro(Carro.Colores.VERDE,"XX3");
        verde.agregarconductor(new Conductor("C3","Pedro","pedro@email.com","pedro"));
        Carro blanco = new Carro(Carro.Colores.BLANCO,"XX5");
        blanco.agregarconductor(new Conductor("C4","ana","ana@email.com","ana"));

        juego.agregarCarroACarril(1,rojo);
        juego.agregarCarroACarril(2,azul);
        juego.agregarCarroACarril(3,verde);
        juego.agregarCarroACarril(1,blanco);

        Podium podium= juego.iniciarJuego();
        System.out.println(podium);


    }
}




