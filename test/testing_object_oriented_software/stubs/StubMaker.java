package testing_object_oriented_software.stubs;

import testing_object_oriented_software.Voter;

import java.util.Vector;

/**
 * Created by Felix on 18.12.2017.
 */
public class StubMaker {

    //returns all voters voting true
    public static Vector<Voter> allVotersTrue(){
        Vector<Voter> v = new Vector<>();
        for (int i = 0; i<10; i++){
            v.add(new TrueVoter());
        }
        return v;
    }

    //returns all voters voting false
    public static Vector<Voter> allVotersFalse(){
        Vector<Voter> v = new Vector<>();
        for (int i = 0; i<10; i++) {
            v.add(new FalseVoter());
        }
        return v;
    }

    //returns 5 true 5 false
    public static Vector<Voter> someVotersFalse(){
        Vector<Voter> v = new Vector<>();
        for (int i = 0; i<5; i++) {
            v.add(new TrueVoter());
            v.add(new FalseVoter());
        }
        return v;
    }

    public static Vector<Voter> someVotersNull(){
        Vector<Voter> v = new Vector<>();
        for (int i = 0; i<5; i++) {
            v.add(new TrueVoter());
            v.add(new FalseVoter());
            v.add(null);
        }

        return v;
    }
}
