package com.brendandonegan.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

import org.junit.Test;
/**
 * Created by brendand on 14/04/17.
 */
@Config(browser=Browser.CHROME, url="http://seleniumhq.org")
public class SeleniumHQTest extends Locomotive {
    @Test
    public void testDownloadLinkExists() {
        validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);
    }

    @Test
    public void testTabsExist() {
        validatePresent(HomePage.LOC_LNK_ABOUTTAB);
        validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB);
        validatePresent(HomePage.LOC_LNK_DOWNLOADTAB);
        validatePresent(HomePage.LOC_LNK_PROJECTSTAB);
    }

    @Test
    public void testGotoAboutPage() {
        click(HomePage.LOC_LNK_ABOUTTAB);
        waitForElement(AboutPage.LOC_BTN_DONATE);
    }
}