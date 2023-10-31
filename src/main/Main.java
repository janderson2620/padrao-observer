package main;

import entities.CarroRoubado;
import entities.Viatura;

public class Main {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();

        Viatura viatura1 = new Viatura();

        carroRoubado.adicionarObservador(viatura1);

        carroRoubado.virarEsquerda();
        carroRoubado.virarDireita();
        carroRoubado.parar();

    }
}
