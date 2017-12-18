package testing_object_oriented_software;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

/**
 * Created by Felix on 18.12.2017.
 */
public class CensusSuite {


    public static void runAllTests() throws Exception {

        ArrayList<Boolean> testResults = new ArrayList<Boolean>();

        //Case 1: All voters voted false
        testResults.add(TestCensus.allVotersFalseTest());
        //Case 2: All voters voted true
        testResults.add(TestCensus.allVotersTrueTest());
        //Case 1 Some voters Voted False, some Voted True
        testResults.add(TestCensus.someVotersFalseTest());
        //Case 1 Some voters Voted False, some Voted True, Some Voters ARE null
        testResults.add(TestCensus.someVotersNullTest());
        //Case 3 Some voters voted True, some voters ARE null
        testResults.add(TestCensus.allTrueSomeVotersNullTest());
        //Case 4 + 5
        testResults.add(TestCensus.hasEveryOneVotedExactlyOnceTest());
        //Case 4 but slightly obsolete
        testResults.add(TestCensus.numberOfVotesEqualsNumberOfVotersTest());

        int successfulTests = 0;
        int failedTests =0;
        for (boolean b:testResults
             ) {
            if(b){
                successfulTests++;
            }else{
                failedTests++;
            }
        }
        int alltests = successfulTests+failedTests;
        System.out.println("==================================");
        System.out.println(successfulTests + " out of "+ Integer.toString(alltests) + " tests were successful.");
        System.out.println("==================================");
    }
}
