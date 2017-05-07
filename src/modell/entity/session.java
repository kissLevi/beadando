package modell.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import modell.entity.computer;

public class session{
        private final HashMap<customer,computer> session;
	private final Date start;
	
	public session(Date start, customer user, computer computer) {
		this.session = new HashMap<customer,computer>();
                this.start = new Date();
	}

	public int calculatePoints() {
		// TODO - implement Session.calculatePoints
		throw new UnsupportedOperationException();
	}

	public customer getUser() {
		return this.session.;
	}

	public computer getComputer() {
		return this.computer;
	}

}