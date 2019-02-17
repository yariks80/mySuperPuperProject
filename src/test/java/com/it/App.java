package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBordHelper;
import com.it.helpers.LoginHelper;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashBordHelper dashBord;

    public App() {
        common= new CommonHelper();
        login =new LoginHelper();
        dashBord=new DashBordHelper();
    }
}
