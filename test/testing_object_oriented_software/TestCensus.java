package testing_object_oriented_software;

import testing_object_oriented_software.stubs.StubMaker;
import testing_object_oriented_software.util.AssertEquals;
import testing_object_oriented_software.util.NotEqualExeption;

public class TestCensus {


    public static boolean allVotersTrueTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(0,c.voting(StubMaker.allVotersTrue()));
        }catch (NotEqualExeption e){
            return false;
        }
        return true;
    }

    public static boolean someVotersFalseTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(5, c.voting(StubMaker.someVotersFalse()));
        }catch (NotEqualExeption e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


}
