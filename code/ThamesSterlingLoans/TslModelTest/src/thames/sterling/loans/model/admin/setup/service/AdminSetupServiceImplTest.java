package thames.sterling.loans.model.admin.setup.service;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewObject;

import oracle.jbo.client.Configuration;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import  thames.sterling.loans.model.test.common.ServiceConfig;
import thames.sterling.loans.model.test.common.TslServiceBaseTestFixture;

public class AdminSetupServiceImplTest {
    
    static TslServiceBaseTestFixture svcFixture = new TslServiceBaseTestFixture(ServiceConfig.ADMIN_SETUP.configDef(),
                                                        ServiceConfig.ADMIN_SETUP.configName());
  
    public AdminSetupServiceImplTest() {
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
     * @see AdminSetupServiceImpl#getobjects()
     */
    @Test
    public void testGetobjects() {
        
        ViewObject   objects = ((AdminSetupServiceImpl)getServiceFixture().getService()).getLoanTypes();
        assertNotNull("objects object is  null", objects);
    }
    
}
