package Memento;

class Memento {
    private String state;

    Memento(String state){
        this.state = state;
    }

    String getState(){
        return state;
    }
}