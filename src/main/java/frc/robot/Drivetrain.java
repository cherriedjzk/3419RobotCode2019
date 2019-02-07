package frc.robot;

public class Drivetrain extends Mechanism<Drivetrain> {
    public static final int ALIGN_NS = 0;
    public static final int ALIGN_EW = 1;
    public static final State<Drivetrain> STATE_ALIGN_NS = new State<Drivetrain>("ALIGN_NS", ALIGN_NS);
    public static final State<Drivetrain> STATE_ALIGN_EW = new State<Drivetrain>("ALIGN_EW", ALIGN_EW);

    public void TransitionTo(State<Drivetrain> state) {
        switch(state.Value) {
            case ALIGN_EW:
                //turn all wheels sideways
                break;
            case ALIGN_NS:
                //turn all wheels forward
                break;
        }
    }
}