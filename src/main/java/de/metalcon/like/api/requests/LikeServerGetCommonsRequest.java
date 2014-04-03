package de.metalcon.like.api.requests;

import de.metalcon.domain.Muid;
import de.metalcon.like.api.Vote;

/**
 * Retrieves the list of common neighbors (X) such that
 * 
 * (from) -[:like]-> (X) -[:like]-> (to)
 */
public class LikeServerGetCommonsRequest extends LikeServerRequest {

	private static final long serialVersionUID = -109009227221978868L;

	private final long from;

	private final long to;

	private final Vote vote;

	/**
	 * @param from
	 *            muid of the (from) node (see top)
	 * @param to
	 *            muid of the (to) node (see top)
	 */
	public LikeServerGetCommonsRequest(final Muid from, final Muid to,
			final Vote v) {
		super();
		this.from = from.getValue();
		this.to = to.getValue();
		vote = v;
	}

	public long getFrom() {
		return from;
	}

	public long getTo() {
		return to;
	}

	public Vote getVote() {
		return vote;
	}

}
