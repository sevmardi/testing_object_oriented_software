package testing_object_oriented_software;

/**
 * Created by Felix on 18.12.2017.
 */
public class CensusSuite {

    public static void runAllTests() throws Exception {
        //Case 1
        TestCensus.allVotersFalseTest();
        //Case 2
        TestCensus.allVotersTrueTest();
        //Case 1
        TestCensus.someVotersFalseTest();
        //Case 1
        TestCensus.someVotersNullTest();
        //Case 3
        TestCensus.allTrueSomeVotersNullTest();
    }
}
