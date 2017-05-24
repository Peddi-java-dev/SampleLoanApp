package thames.sterling.loans.model.loanengine.entity;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.uniqueid.UniqueIdHelper;

import thames.sterling.loans.model.common.SequenceIdUtil;

public class TslCommonEOImpl extends EntityImpl {
    public TslCommonEOImpl() {
        super();
    }
    
    /**
     * get unique id value to be used for the primary key in the database. 
     * @return
     */
    public  Long getUniqueId(){
       return SequenceIdUtil.getUniqueId();
    }
}
