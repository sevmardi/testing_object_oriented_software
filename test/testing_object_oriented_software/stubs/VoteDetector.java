package testing_object_oriented_software.stubs;

import testing_object_oriented_software.Voter;

/**
 * Created by Felix on 18.12.2017.
 */
public class VoteDetector implements Voter {

    private static boolean oneVoterHasVotedMoreThanOnce = false;
    private boolean hasvoted = false;
    private static int numberOfVotes = 0;
    @Override
    public boolean vote() {
        if(this.hasvoted == true){
            oneVoterHasVotedMoreThanOnce = true;
        }
        numberOfVotes ++;
        this.hasvoted = true;
        return false;
    }
    public static int getNumberOfVotes(){
        return numberOfVotes;
    }
    public static boolean hasOneVoterHasVotedMoreThanOnce() {
        return oneVoterHasVotedMoreThanOnce;
    }

}
