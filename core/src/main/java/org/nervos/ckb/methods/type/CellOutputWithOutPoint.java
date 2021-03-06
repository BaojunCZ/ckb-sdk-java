package org.nervos.ckb.methods.type;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by duanyytop on 2018-12-21.
 * Copyright © 2018 Nervos Foundation. All rights reserved.
 */
public class CellOutputWithOutPoint {

    /**
     * capacity : 50000
     * lock : 0x321c1ca2887fb8eddaaa7e917399f71e63e03a1c83ff75ed12099a01115ea2ff
     * out_point : {"hash":"0xbddb7c2559c2c3cdfc8f3cae2697ca75489521c352265cc9e60b4b2416ad5929","index":0}
     */

    public int capacity;
    public String lock;

    @JsonProperty("out_point")
    public OutPoint outPoint;

}
