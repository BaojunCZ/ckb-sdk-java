package org.nervos.ckb.methods.response;

import org.nervos.ckb.methods.Response;
import org.nervos.ckb.methods.type.CellOutputWithOutPoint;

import java.util.List;

/**
 * Created by duanyytop on 2018-12-21.
 * Copyright © 2018 Nervos Foundation. All rights reserved.
 */
public class CkbCells extends Response<List<CellOutputWithOutPoint>> {

    public List<CellOutputWithOutPoint> getCells() {
        return result;
    }

}
