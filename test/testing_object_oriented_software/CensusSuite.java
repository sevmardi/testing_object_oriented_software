package testing_object_oriented_software;

/**
 * Created by Felix on 18.12.2017.
 */
public class CensusSuite {

    public static void runAllTests() throws Exception {
        TestCensus.allVotersFalseTest();
        TestCensus.allVotersTrueTest();
        TestCensus.someVotersFalseTest();
        TestCensus.didAllVotersVote();
    }
}
