package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class MyIEDriver implements DriverSource {
	
	@Override
	public WebDriver newDriver() {
	    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		return new InternetExplorerDriver(capabilities);
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}

}
