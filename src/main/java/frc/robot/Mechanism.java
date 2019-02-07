package frc.robot;

public abstract class Mechanism<M extends Mechanism> implements IMechanism<M>{
    //classes that extend this should also make all their states as public static final objects
    //mechanisms should define their child mechanisms as public so that they can be accessed from any other mechanism

    //each mechanism needs a reference to the root robot object so changes can be affected from any mechanism
    public Robot Robot; 
}