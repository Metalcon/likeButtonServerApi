package de.metalcon.like.api.requests;

import de.metalcon.domain.Uid;
import de.metalcon.like.api.Vote;

/**
 * Adds a new relation between two nodes
 * 
 * (from) -[:(dis)like]-> (to)
 * 
 * Response to this request: RequestQueuedResponse
 */
public class LikeServerAddRelationRequest extends LikeServerRequest {

    private static final long serialVersionUID = -3189757071310502003L;

    private final long from;

    private final long to;

    private final Vote vote;

    /**
     * @param from
     *            uid of the (from) node (see top)
     * @param to
     *            uid of the (to) node (see top)
     * @param v
     *            the type of the relation: Vote.UP or Vote.DOWN
     */
    public LikeServerAddRelationRequest(
            final Uid from,
            final Uid to,
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
