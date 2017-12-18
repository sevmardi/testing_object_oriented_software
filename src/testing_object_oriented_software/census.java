package testing_object_oriented_software;

import java.util.Vector;

public class Census {

	public int voting(Vector<Voter> voters) throws Exception {

		int notNullVotes = 0;
		int nullVotes = 0;
		int results = 0;

		if (voters != null) {
			for (Voter v : voters) {
				if (v != null) {
					if (v.vote() == false) {
						results += 1;
					}
					notNullVotes += 1;
				} else {
					nullVotes += 1;
				}
			}

		} else {
			return 0;
		}

		if (notNullVotes + nullVotes > voters.size()) {
			throw new Exception("Valid voters has voted more than once");
		} else if (notNullVotes + nullVotes < voters.size()) {
			throw new Exception("Valid voters has not voted ");
		} else {
			return results;
		}
	}

}
