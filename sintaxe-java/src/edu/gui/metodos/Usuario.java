package edu.gui.metodos;

public class Usuario {
    public static void main(String [] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(0);
        smartTv.aumentandoCanal();
        smartTv.aumentandoCanal();
        smartTv.diminuindoCanal();
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.mudarCanal(21);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Volume atual? "+ smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Desligada? " + smartTv.ligada);
    }
}
