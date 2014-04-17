package de.metalcon.like.api.requests;

import de.metalcon.domain.Uid;
import de.metalcon.like.api.Vote;

/**
 * Retrieves the list of common neighbors (X) such that
 * 
 * (from) -[:like]-> (X) -[:like]-> (to)
 * 
 * Response to this request: LikeServerMuidListResponse
 */
public class LikeServerGetCommonsRequest extends LikeServerRequest {

    private static final long serialVersionUID = -109009227221978868L;

    private final long from;

    private final long to;

    private final Vote vote;

    /**
     * @param from
     *            ID of the (from) node (see top)
     * @param to
     *            ID of the (to) node (see top)
     */
    public LikeServerGetCommonsRequest(
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
