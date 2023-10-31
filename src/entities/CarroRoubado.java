package entities;

import interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado {

    private List<IObserver> observadores = new ArrayList<>();

    public void adicionarObservador(IObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(IObserver observador) {
        observadores.remove(observador);
    }

    public void virarEsquerda() {
        System.out.println("Carro roubado virou a esquerda...");
        notificarObservadores("Viatura virou a esquerda....");
    }

    public void virarDireita() {
        System.out.println("Carro roubado virou a direita...");
        notificarObservadores("Viatura virou a direita....");
    }

    public void parar() {
        System.out.println("Carro roubado parou...");
        notificarObservadores("Viatura parou....");
    }

    private void notificarObservadores(String mensagem) {
        for (IObserver observador : observadores) {
            observador.notificar(mensagem);
        }
    }
}
