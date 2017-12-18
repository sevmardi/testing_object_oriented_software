package testing_object_oriented_software;

import java.util.Vector;

public class Census {

	public int voting(Vector<Voter> voters) throws Exception {

		int trueVotes = 0;
		int nullVotes = 0;
		int falseVoters = 0;

		if (voters != null) {
			for (Voter v : voters) {
				if (v != null) {
					if (v.vote() == false) {
						falseVoters += 1;
					}
					else {						
					trueVotes += 1;
					}
				} else {
					nullVotes += 1;
				}
			}
		} else {
			return -1;
		} 
		if(falseVoters == 0 && trueVotes >= 1) return -1;

		if (trueVotes + nullVotes > voters.size()) {
			throw new Exception("Valid voters has voted more than once");
		} else if (trueVotes + nullVotes < voters.size()) {
			throw new Exception("Valid voters has not voted ");
		}else{
			return falseVoters;
		}
	}

}
