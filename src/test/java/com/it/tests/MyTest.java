package com.it.tests;

import com.it.emun.Page;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest {


    @Test
    public void testMyTest() {
        app.login.login(validUser.userName, validUser.password);
        app.goTo(Page.DASHBORD);
        Assert.assertEquals(app.dashBord.getUserEmail(), validUser.email);

    }
}
