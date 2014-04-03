package de.metalcon.like.api.responses;

import java.util.ArrayList;

import de.metalcon.api.responses.SuccessResponse;
import de.metalcon.domain.Muid;

public class LikeServerResponse extends SuccessResponse {

    long[] commonMuids;

    public void setCommonMuids(long[] commonMuids) {
        this.commonMuids = commonMuids;
    }

    public ArrayList<Muid> getCommonMuids() {
        ArrayList<Muid> tmp = new ArrayList<Muid>(commonMuids.length);
        for (int i = 0; i < commonMuids.length; i++) {
            tmp.add(new Muid(commonMuids[i]));
        }
        return tmp;
    }
}
