package de.metalcon.like.api.responses;

import java.util.ArrayList;

import de.metalcon.domain.Uid;

public class LikeServerMuidListResponse extends LikeServerResponse {

    private static final long serialVersionUID = 8296147198358324254L;

    final long[] uids;

    public LikeServerMuidListResponse(
            final long[] uids) {
        super();
        this.uids = uids;
    }

    public ArrayList<Uid> getUidList() {
        ArrayList<Uid> tmp = new ArrayList<Uid>(uids.length);
        for (long muid : uids) {
            tmp.add(Uid.createFromID(muid));
        }
        return tmp;
    }
}
