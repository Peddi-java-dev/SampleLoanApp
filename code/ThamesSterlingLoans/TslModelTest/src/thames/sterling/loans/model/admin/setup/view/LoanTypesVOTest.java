package thames.sterling.loans.model.admin.setup.view;

import oracle.jbo.ViewObject;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

import thames.sterling.loans.model.admin.setup.service.AdminSetupServiceImpl;
import thames.sterling.loans.model.admin.setup.service.AdminSetupServiceImplTest;
import thames.sterling.loans.model.test.common.ServiceConfig;
import thames.sterling.loans.model.test.common.TslServiceBaseTestFixture;

public class LoanTypesVOTest {
    static TslServiceBaseTestFixture svcFixture = new TslServiceBaseTestFixture(ServiceConfig.ADMIN_SETUP.configDef(),
                                                        ServiceConfig.ADMIN_SETUP.configName());
        //AdminSetupServiceImplTest.getServiceFixture();

    public LoanTypesVOTest() {
    }


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svcFixture.setUp();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        svcFixture.tearDown();
    }
    
    /**
     * @see AdminSetupServiceImpl#getLoanTypes()
     */
    @Test
    public void testGetLoanTypes() {
        
        ViewObject   loanTypes = ((AdminSetupServiceImpl)svcFixture.getService()).getLoanTypes();
        assertNotNull("LoanTypes object is  null", loanTypes);
    }
    
}
