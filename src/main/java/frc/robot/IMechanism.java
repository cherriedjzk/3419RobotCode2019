package frc.robot;

public interface IMechanism<M extends IMechanism> {
    //this method should essentially just be a switch statement between all of the states of the mechanism
    public abstract void TransitionTo(State<M> state);
}