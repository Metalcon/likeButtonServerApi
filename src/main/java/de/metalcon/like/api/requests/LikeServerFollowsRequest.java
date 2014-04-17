package de.metalcon.like.api.requests;

import de.metalcon.domain.Uid;

/**
 * Retrieves the relation between the node (from) and (two)
 * 
 * Response to this request: LikeServerVoteResponse
 */
public class LikeServerFollowsRequest extends LikeServerRequest {

    private static final long serialVersionUID = -109009227221978868L;

    private final long from;

    private final long to;

    /**
     * @param from
     *            uid of the (from) node (see top)
     * @param to
     *            uid of the (to) node (see top)
     */
    public LikeServerFollowsRequest(
            final Uid from,
            final Uid to) {
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
