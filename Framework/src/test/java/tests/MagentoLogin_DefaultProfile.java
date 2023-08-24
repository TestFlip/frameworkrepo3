package tests;

import jakarta.mail.*;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;
import io.restassured.RestAssured;

//http://ec2-35-178-43-81.eu-west-2.compute.amazonaws.com:80/app/#!/model-engine/guid/cd5ae9fd-bba7-45e6-b250-98cd4c1fa861
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 1, profileId = 100001)
public class MagentoLogin_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Magento Login","Magento Login - Default Profile"})
    @TestModellerPath(guid = "79270cbe-b78c-49ed-9eb3-e96838d7b7d2")
    public void MagentoLoginError()
    {
        
           pages.Magento_Login _Magento_Login = new pages.Magento_Login(getDriver());
    TestModellerLogger.SetModellerContext("4cb9d28e-bb2e-42bf-a8db-5da2e15de8cb", 100011, 100150);
    _Magento_Login.GoToUrl();

    TestModellerLogger.SetModellerContext("87a8903f-c05a-4fd5-8727-8ed618613e7f", 100011, 100152);
    _Magento_Login.Enter_Email("roni_cost@example.com");

    TestModellerLogger.SetModellerContext("7be9e260-ab8b-425a-a5c7-925d8e3831c8", 100011, 100153);
    _Magento_Login.Enter_Password("");

    TestModellerLogger.SetModellerContext("e896ea05-6a5e-48ef-9e31-884634aec8e5", 100011, 100154);
    _Magento_Login.Click_Signin_Button();

    TestModellerLogger.SetModellerContext("d831462e-3b7b-45da-a313-df2610164d18", 100011, 100156);
    _Magento_Login.Assert_Invalid_Password();

    }


    @Test  (groups= {"Magento Login","Magento Login - Default Profile"})
    @TestModellerPath(guid = "25f03b61-1532-4928-a895-a0a8da710ba5")
    public void MagentoLoginAuthenticated()
    {
        
           pages.Magento_Login _Magento_Login = new pages.Magento_Login(getDriver());
    TestModellerLogger.SetModellerContext("4cb9d28e-bb2e-42bf-a8db-5da2e15de8cb", 100011, 100150);
    _Magento_Login.GoToUrl();

    TestModellerLogger.SetModellerContext("87a8903f-c05a-4fd5-8727-8ed618613e7f", 100011, 100152);
    _Magento_Login.Enter_Email("roni_cost@example.com");

    TestModellerLogger.SetModellerContext("19b53e77-d038-40b5-a198-7e5de93713e9", 100011, 100153);
    _Magento_Login.Enter_Password("roni_cost3@example.com");

    TestModellerLogger.SetModellerContext("b710fe18-446c-46cc-8ad7-5b755ef053df", 100011, 100154);
    _Magento_Login.Click_Signin_Button();

    }


    @Test  (groups= {"Magento Login","Magento Login - Default Profile"})
    @TestModellerPath(guid = "79d1fb37-6bd7-4549-832e-9ef00eaf3363")
    public void MagentoLoginError1()
    {
        
           pages.Magento_Login _Magento_Login = new pages.Magento_Login(getDriver());
    TestModellerLogger.SetModellerContext("4cb9d28e-bb2e-42bf-a8db-5da2e15de8cb", 100011, 100150);
    _Magento_Login.GoToUrl();

    TestModellerLogger.SetModellerContext("5c484bb6-14e6-4222-86a5-52fbf5d5b6ce", 100011, 100152);
    _Magento_Login.Enter_Email("invalidEmail");

    TestModellerLogger.SetModellerContext("a7842524-ad78-445e-840d-1b57d840b21d", 100011, 100154);
    _Magento_Login.Click_Signin_Button();

    TestModellerLogger.SetModellerContext("1e26dcaf-c9a6-4710-a987-613a227f6e5d", 100011, 100155);
    _Magento_Login.Assert_Invalid_Email();

    }


}