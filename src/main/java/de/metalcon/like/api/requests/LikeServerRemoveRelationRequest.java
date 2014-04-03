package de.metalcon.like.api.requests;

import de.metalcon.domain.Muid;

/**
 * Removes a relation between two nodes
 * 
 * (from) -[:(dis)like]-> (to)
 */
public class LikeServerRemoveRelationRequest extends LikeServerRequest {

	private static final long serialVersionUID = -3558452309396031389L;

	private final long from;

	private final long to;

	/**
	 * @param from
	 *            muid of the (from) node (see top)
	 * @param to
	 *            muid of the (to) node (see top)
	 * @param v
	 *            the type of the relation: Vote.UP or Vote.DOWN
	 */
	public LikeServerRemoveRelationRequest(final Muid from, final Muid to) {
		super();
		this.from = from.getValue();
		this.to = to.getValue();
	}

	public long getFrom() {
		return from;
	}

	public long getTo() {
		return to;
	}
}
