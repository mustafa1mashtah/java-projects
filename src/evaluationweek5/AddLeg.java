package evaluationweek5;

import weektest5.Ex1.Ex6.Furniture;
import weektest5.Ex1.Ex6.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}
