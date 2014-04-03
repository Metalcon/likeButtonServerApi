package de.metalcon.like.api;

import de.metalcon.domain.Muid;

public class LikeServerGetCommonsRequest extends LikeServerRequest {

    private long from;

    private long to;

    /**
     * 
     */
    private static final long serialVersionUID = -3558452309396031389L;

    public LikeServerGetCommonsRequest(
            Muid from,
            Muid to
    /* Vote.UP */) {
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
