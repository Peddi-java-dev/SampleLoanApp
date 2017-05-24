package thames.sterling.loans.model.common;

import oracle.jbo.server.uniqueid.UniqueIdHelper;

public class SequenceIdUtil {
    public SequenceIdUtil() {
        super();
    }
    
    /**
     * get unique id value to be used for the primary key in the database. 
     * @return
     */
    public static Long getUniqueId(){
       return UniqueIdHelper.getNextId().longValue();
    }
}
