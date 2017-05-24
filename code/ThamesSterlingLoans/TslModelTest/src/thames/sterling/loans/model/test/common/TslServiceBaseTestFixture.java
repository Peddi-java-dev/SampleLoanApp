package thames.sterling.loans.model.test.common;


import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

import org.junit.Test;
public class TslServiceBaseTestFixture {
    
    private String configName;
    
    private String configDefinition;
    
    private ApplicationModule service; 
    
    public TslServiceBaseTestFixture() {
    }
    
    public TslServiceBaseTestFixture(String cd, String cn) {
        System.out.println("TslServiceBaseTestFixture");
        this.configDefinition = cd;
        this.configName = cn;
    }

    public void setUp() {
        if(service == null){
            System.out.println("TslServiceBaseTestFixture.setUp");
            service = Configuration.createRootApplicationModule(configDefinition, configName);
        }
    }

    public void tearDown() {
        if ( service != null){
            Configuration.releaseRootApplicationModule(service, true);
        }
    }

    public ApplicationModule getService() {
        return service;
    }
    

}
