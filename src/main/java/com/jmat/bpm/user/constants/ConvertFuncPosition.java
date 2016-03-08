package com.jmat.bpm.user.constants;

import com.jmat.bpm.user.entity.FuncPosition;
import com.jmat.bpm.user.wrapper.FuncPositionWrap;

/**
 * Created by User on 3/8/2016.
 */
public class ConvertFuncPosition {
    public static FuncPosition convertToEntity(FuncPositionWrap wrap) {
        if (wrap instanceof FuncPositionWrap) {
            FuncPosition funcPosition = new FuncPosition();
            funcPosition.setPositionId(wrap.getPositionId());
            funcPosition.setPositionName(wrap.getPositionName());
            funcPosition.setDescription(wrap.getDescription());
            funcPosition.setParentId(wrap.getParentId());
            funcPosition.setDeleted(wrap.isDeleted());
            funcPosition.setPositionLevel(wrap.getPositionLevel());
            return funcPosition;
        } else {
            return null;
        }
    }

    public static FuncPositionWrap convertToWrapper(FuncPosition entity) {
        if (entity instanceof FuncPosition) {
            FuncPositionWrap funcPositionWrap = new FuncPositionWrap();
            funcPositionWrap.setDeleted(entity.isDeleted());
            funcPositionWrap.setDescription(entity.getDescription());
            funcPositionWrap.setParentId(entity.getParentId());
            funcPositionWrap.setPositionId(entity.getPositionId());
            funcPositionWrap.setPositionLevel(entity.getPositionLevel());
            funcPositionWrap.setPositionName(entity.getPositionName());
            return funcPositionWrap;
        } else {
            return null;
        }
    }


}
