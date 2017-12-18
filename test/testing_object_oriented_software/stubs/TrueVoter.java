package testing_object_oriented_software.stubs;

import testing_object_oriented_software.Voter;

/**
 * Created by Felix on 18.12.2017.
 */
public class TrueVoter implements Voter {
    @Override
    public boolean vote() {
        return true;
    }
}
