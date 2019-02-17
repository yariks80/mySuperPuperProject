package com.it.tests;

import com.it.pages.DashBordPage;
import com.it.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest {


    @Test
    public void testMyTest() {
        app.login.login(validUser.userName, validUser.password);
        Assert.assertEquals(app.dashBord.getUserEmail(), validUser.email);

    }
}
