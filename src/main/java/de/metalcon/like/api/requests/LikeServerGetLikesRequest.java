package de.metalcon.like.api.requests;

import de.metalcon.domain.Uid;
import de.metalcon.like.api.Direction;
import de.metalcon.like.api.Vote;

/**
 * Retrieves all neighbour nodes of (node)
 * 
 * (node) <-[:vote]-> (X)
 */
public class LikeServerGetLikesRequest extends LikeServerRequest {

    private static final long serialVersionUID = 6343693277618740104L;

    private final long node;

    private final Direction direction;

    private final Vote vote;

    /**
     * @param node
     *            uid of the requested (node)
     * @param Direction
     *            are INCOMING, OUTGOING or BOTH directions requested?
     * @param vote
     *            the type of the relation: Vote.UP or Vote.DOWN
     */
    public LikeServerGetLikesRequest(
            final Uid node,
            final Direction dir,
            final Vote vote) {
        super();
        this.node = node.getValue();
        direction = dir;
        this.vote = vote;
    }

    public long getNode() {
        return node;
    }

    public Direction getDirection() {
        return direction;
    }

    public Vote getVote() {
        return vote;
    }

}
