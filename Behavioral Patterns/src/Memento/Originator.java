package Memento;

class Originator {
    private String state;

    void setState(String state){
        this.state = state;
    }

    String getState(){
        return state;
    }

    Memento saveStateToMemento(){
        return new Memento(state);
    }

    void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}