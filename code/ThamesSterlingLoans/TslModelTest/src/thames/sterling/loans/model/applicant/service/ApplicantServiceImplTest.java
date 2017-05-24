package thames.sterling.loans.model.applicant.service;

import oracle.jbo.ViewObject;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import thames.sterling.loans.model.admin.setup.service.AdminSetupServiceImpl;
import thames.sterling.loans.model.test.common.ServiceConfig;
import thames.sterling.loans.model.test.common.TslServiceBaseTestFixture;

public class ApplicantServiceImplTest {
    static TslServiceBaseTestFixture svcFixture = new TslServiceBaseTestFixture(ServiceConfig.APPLICANT.configDef(),
                                              ServiceConfig.APPLICANT.configName());

    public ApplicantServiceImplTest() {
    }

    public static TslServiceBaseTestFixture getServiceFixture() {

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
     * @see ApplicantServiceImpl#getApplicantAddress()
     */
    @Test
    public void testGetApplicantAddress() {        
        ViewObject   object = ((ApplicantServiceImpl)svcFixture.getService()).getApplicantAddress();
        assertNotNull("ApplicantAddress object is  null", object);
    }

    /**
     * @see ApplicantServiceImpl#getApplicantFinaceDetails()
     */
    @Test
    public void testGetApplicantFinaceDetails() {
        ViewObject   object = ((ApplicantServiceImpl)svcFixture.getService()).getApplicantFianceDetails();
        assertNotNull("ApplicantFinaceDetails object is  null", object);
    }

    /**
     * @see ApplicantServiceImpl#getApplicantPersonalDetails()
     */
    @Test
    public void testGetApplicantPersonalDetails() {
        ViewObject   object = ((ApplicantServiceImpl)svcFixture.getService()).getApplicantPesonalDetails();
        assertNotNull("ApplicantPersonalDetails object is  null", object);
    }

    /**
     * @see ApplicantServiceImpl#getEmploymentType()
     */
    @Test
    public void testGetEmploymentType() {
        ViewObject   object = ((ApplicantServiceImpl)svcFixture.getService()).getEmploymentType();
        assertNotNull("EmploymentType object is  null", object);
    }

    /**
     * @see ApplicantServiceImpl#getLoanApprovalStatuses()
     */
    @Test
    public void testGetLoanApprovalStatuses() {
        ViewObject   object = ((ApplicantServiceImpl)svcFixture.getService()).getLoanApprovalStatuses();
        assertNotNull("LoanApprovalStatuses object is  null", object);
    }

    /**
     * @see ApplicantServiceImpl#getLoanPurpose()
     */
    @Test
    public void testGetLoanPurpose() {
        ViewObject   object = ((ApplicantServiceImpl)svcFixture.getService()).getLoanPurpose();
        assertNotNull("LoanPurpose object is  null", object);
    }
}
