package entities;

import interfaces.IObserver;

public class Viatura implements IObserver {

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
