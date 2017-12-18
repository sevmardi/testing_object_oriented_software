package testing_object_oriented_software;

/**
 * Created by Felix on 18.12.2017.
 */
public class CensusSuite {

    public static void runAllTests() throws Exception {
        //Case 1: All voters voted false
        TestCensus.allVotersFalseTest();
        //Case 2: All voters voted true
        TestCensus.allVotersTrueTest();
        //Case 1 Some voters Voted False, some Voted True
        TestCensus.someVotersFalseTest();
        //Case 1 Some voters Voted False, some Voted True, Some Voters ARE null
        TestCensus.someVotersNullTest();
        //Case 3 Some voters voted True, some voters ARE null
        TestCensus.allTrueSomeVotersNullTest();
        //Case 4 + 5
        TestCensus.hasEveryOneVotedExactlyOnceTest();
        //Case 4 but slightly obsolete
        TestCensus.numberOfVotesEqualsNumberOfVotersTest();
    }
}
