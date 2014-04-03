package de.metalcon.like.api.requests;

import de.metalcon.domain.Muid;
import de.metalcon.like.api.Vote;

/**
 * Retrieves all nodes (Y) with distance 2 of (node) so that
 * 
 * (node) [:vote]-> (X) [:vote]-> (Y)
 */
public class LikeServerGetLikedLikesRequest extends LikeServerRequest {

	private static final long serialVersionUID = 6343693277618740104L;

	private final long node;

	private final Vote vote;

	/**
	 * @param node
	 *            muid of the requested (node)
	 * @param vote
	 *            the type of the relation: Vote.UP or Vote.DOWN
	 */
	public LikeServerGetLikedLikesRequest(final Muid node, final Vote vote) {
		super();
		this.node = node.getValue();
		this.vote = vote;
	}

	public long getNode() {
		return node;
	}

	public Vote getVote() {
		return vote;
	}

}
