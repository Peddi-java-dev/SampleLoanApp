package thames.sterling.loans.model.test.common;

public enum ServiceConfig {
    
    ADMIN_SETUP("thames.sterling.loans.model.admin.setup.service.AdminSetupService",
                 "AdminSetupServiceLocal"),
    APPLICANT("thames.sterling.loans.model.applicant.service.ApplicantService",
              "ApplicantServiceLocal"),    
    LOAN_ENGINE("thames.sterling.loans.model.loanengine.service.LoanEngineService",
                "LoanEngineServiceLocal");
    
   ServiceConfig(String configDef, String configName){
        this.configDef = configDef;
        this.configName = configName;
    }
    
   public String configDef(){
       return configDef;
   }
   
   public String configName(){
       return configName;
   }
    private final String configDef;
    private final String configName;
    
}
