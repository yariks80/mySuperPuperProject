package com.it.helpers;

import com.it.pages.BasePage;

public class CommonHelper extends BasePage {

   public void stopApp() {
        driver.quit();
    }
}
