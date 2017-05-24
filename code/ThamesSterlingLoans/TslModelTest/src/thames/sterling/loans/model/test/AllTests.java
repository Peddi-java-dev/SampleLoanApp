package thames.sterling.loans.model.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import thames.sterling.loans.model.admin.setup.service.AdminSetupServiceImplTest;

import thames.sterling.loans.model.applicant.service.ApplicantServiceImplTest;
import thames.sterling.loans.model.loanengine.service.LoanEngineServiceImplTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({  LoanEngineServiceImplTest.class, ApplicantServiceImplTest.class,
                      AdminSetupServiceImplTest.class })
public class AllTests {
}
