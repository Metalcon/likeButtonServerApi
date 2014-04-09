package de.metalcon.like.api.responses;

import de.metalcon.like.api.Vote;

public class LikeServerVoteResponse extends LikeServerResponse {

    private static final long serialVersionUID = -8990841050657185591L;

    final Vote vote;

    public LikeServerVoteResponse(
            final Vote vote) {
        super();
        this.vote = vote;
    }

    public Vote getVote() {
        return vote;
    }
}
