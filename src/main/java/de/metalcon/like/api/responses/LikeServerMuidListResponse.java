package de.metalcon.like.api.responses;

import java.util.ArrayList;

import de.metalcon.domain.Muid;

public class LikeServerMuidListResponse extends LikeServerResponse {

	private static final long serialVersionUID = 8296147198358324254L;

	final long[] muids;

	public LikeServerMuidListResponse(final long[] muids) {
		super();
		this.muids = muids;
	}

	public ArrayList<Muid> getMuidList() {
		ArrayList<Muid> tmp = new ArrayList<Muid>(muids.length);
		for (int i = 0; i < muids.length; i++) {
			tmp.add(new Muid(muids[i]));
		}
		return tmp;
	}
}
