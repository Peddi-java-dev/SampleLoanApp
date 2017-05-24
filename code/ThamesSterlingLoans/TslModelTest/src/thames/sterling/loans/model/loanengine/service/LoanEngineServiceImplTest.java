package thames.sterling.loans.model.loanengine.service;

import oracle.jbo.ViewObject;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


import thames.sterling.loans.model.test.common.ServiceConfig;
import thames.sterling.loans.model.test.common.TslServiceBaseTestFixture;

public class LoanEngineServiceImplTest {
   static TslServiceBaseTestFixture svcFixture   = new TslServiceBaseTestFixture(ServiceConfig.LOAN_ENGINE.configDef(),
                                                        ServiceConfig.LOAN_ENGINE.configName());

    public LoanEngineServiceImplTest() {
    }
    
    public static TslServiceBaseTestFixture getServiceFixture(){  
       return svcFixture;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        getServiceFixture().setUp();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        getServiceFixture().tearDown();
    }


    /**
     * @see LoanEngineServiceImpl#getLoanAgreements()
     */
    @Test
    public void testGetLoanAgreements() {
        ViewObject   objects = ((LoanEngineServiceImpl)svcFixture.getService()).getLoanAgreements();
        assertNotNull("LoanAgreements object is  null", objects);
    }
    
    /**
     * @see LoanEngineServiceImpl#getStaffJobRoles()
     */
    @Test
    public void testGetStaffJobRoles() {
        ViewObject   objects = ((LoanEngineServiceImpl)svcFixture.getService()).getLoanAgreements();
        assertNotNull("StaffJobRoles object is  null", objects);
    }

    /**
     * @see LoanEngineServiceImpl#getStaff()
     */
    @Test
    public void testGetStaff() {
        ViewObject   objects = ((LoanEngineServiceImpl)svcFixture.getService()).getStaff();
        assertNotNull("GetStaff object is  null", objects);
    }


}
