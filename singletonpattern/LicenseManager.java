package singletonpattern;

public class LicenseManager {
    private static LicenseManager instance;
    private boolean isLicensed;

    private LicenseManager() {

        isLicensed = false;
    }

    public static LicenseManager getInstance() {
        if (instance == null) {
            instance = new LicenseManager();
        }
        return instance;
    }

    public void grantLicense() {
        isLicensed = true;
        System.out.println("License granted.");
    }

    public boolean isLicensed() {
        return isLicensed;
    }
}
