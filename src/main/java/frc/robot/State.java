package frc.robot;

public class State<M extends IMechanism> {
    public final String Name;
    public final int Value;

    public State(String name, int value) {
        Name = name;
        Value = value;
    }
}