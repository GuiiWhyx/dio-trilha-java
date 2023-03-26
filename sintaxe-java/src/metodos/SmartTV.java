package edu.gui.metodos;
public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Canais
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    public void aumentandoCanal () {
        canal++;
    }
    public void diminuindoCanal () {
        canal--;
    }

    //Volumes
    public void aumentarVolume () {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume () {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //Ligar e desligar
    public void ligar () {
        ligada = true;
    }
    public void desligar () {
        ligada = false;
    }

}
