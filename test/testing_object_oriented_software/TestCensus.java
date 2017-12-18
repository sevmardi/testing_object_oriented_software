package testing_object_oriented_software;
import testing_object_oriented_software.stubs.StubMaker;
import testing_object_oriented_software.stubs.VoteDetector;
import testing_object_oriented_software.util.AssertEquals;
import testing_object_oriented_software.util.NotEqualExeption;

public class TestCensus {


    public static boolean allVotersTrueTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(0,c.voting(StubMaker.allVotersTrue()));
        }catch (NotEqualExeption e){
            System.out.println("Failed Test: allVotersTrueTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean someVotersFalseTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(5, c.voting(StubMaker.someVotersFalse()));
        }catch (NotEqualExeption e){
            System.out.println("Failed Test: someVotersFalseTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean allVotersFalseTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(10,c.voting(StubMaker.allVotersFalse()));
        }catch (NotEqualExeption e){
            System.out.println("Failed Test: allVotersFalseTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean someVotersNullTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(5,c.voting(StubMaker.someVotersNull()));
        }catch (NotEqualExeption e){
            System.out.println("Failed Test: someVotersNullTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;

    }

    public static boolean allTrueSomeVotersNullTest() throws Exception{
        Census c = new Census();
        try{
            AssertEquals.integers(-1,c.voting(StubMaker.allTrueSomeNull()));
        }catch (NotEqualExeption e){
            System.out.println("Failed Test:  allTrueSomeVotersNullTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;

    }

    public static boolean numberOfVotesEqualsNumberOfVotersTest() throws Exception{
        Census c = new Census();
        try{
            c.voting(StubMaker.voteDetectorVector());
            AssertEquals.integers(5, VoteDetector.getNumberOfVotes());
            VoteDetector.setNumberOfVotesToZero();
        }catch (NotEqualExeption e){
            VoteDetector.setNumberOfVotesToZero();
            System.out.println("Failed Test:  numberOfVotesEqualsNumberOfVotersTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;

    }

    public static boolean hasEveryOneVotedExactlyOnceTest() throws Exception{
        Census c = new Census();
        try{
            c.voting(StubMaker.voteDetectorVector());
            AssertEquals.integers(5, VoteDetector.getNumberOfVotes());
            AssertEquals.booleans(false, VoteDetector.hasOneVoterHasVotedMoreThanOnce());
            VoteDetector.setNumberOfVotesToZero();
        }catch (NotEqualExeption e){
            VoteDetector.setNumberOfVotesToZero();
            System.out.println("Failed Test:  hasEveryOneVotedExactlyOnceTest:");
            System.out.println("\t" + e.getMessage());
            return false;
        }
        return true;

    }



}
