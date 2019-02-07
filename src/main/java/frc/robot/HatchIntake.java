package frc.robot;

public class HatchIntake extends Mechanism<HatchIntake> {
    public static final int OPEN = 1;
    public static final int CLOSED = 0;
    public static final State<HatchIntake> STATE_OPEN = new State<HatchIntake>("OPEN", OPEN);
    public static final State<HatchIntake> STATE_CLOSED = new State<HatchIntake>("CLOSED", CLOSED);
    
    public void TransitionTo(State<HatchIntake> state) {
        switch(state.Value) {
            case OPEN:
                //turn wheels sideways
                Robot.Drivetrain.TransitionTo(Drivetrain.STATE_ALIGN_EW);
                //open piston
                SetPistonState(true);
                break;
            case CLOSED:
                //turn wheels sideways
                Robot.Drivetrain.TransitionTo(Drivetrain.STATE_ALIGN_EW);
                //close piston
                SetPistonState(false);
                break;
        }
    }

    private void SetPistonState(boolean open) {
        //set the piston to open or closed
    }
}