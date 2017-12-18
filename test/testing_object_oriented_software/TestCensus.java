package testing_object_oriented_software;

import testing_object_oriented_software.stubs.StubMaker;
import testing_object_oriented_software.util.AssertEquals;

public class TestCensus {

    

    public static void allVotersTrueTest() throws Exception{
        Census c = new Census();
        AssertEquals.integers(0,c.voting(StubMaker.allVotersTrue()));
    }



}
