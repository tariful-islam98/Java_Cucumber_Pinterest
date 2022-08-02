package utils;

import java.util.ResourceBundle;

public class ResourceHelper {
    public ResourceBundle bundle;

    public ResourceHelper getResource(String file) {
        bundle = ResourceBundle.getBundle(file);
        return this;
    }

    public String getString(String key) {
        return System.getProperty(key) == null ? bundle.getString(key) : System.getProperty(key);
    }

    public boolean getBool(String key) {
        return Boolean.parseBoolean(getString(key));
    }

    public int getInt(String key) {
        return Integer.parseInt(getString(key));
    }

}
//	ResourceHelper config = new ResourceHelper().getResource("config");
//	int pageLoadWait = config.getInt("PAGE_LOAD_WAIT");
//	int implicitWait = config.getInt("IMPLICIT_WAIT");
