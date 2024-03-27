package singletonpattern;

public class Main {
    public static void main(String[] args) {
        LicenseManager licenseManager = LicenseManager.getInstance();

        if (!licenseManager.isLicensed()) {
            licenseManager.grantLicense();
        }

        if (licenseManager.isLicensed()) {
            System.out.println("Software is licensed. Proceed with execution.");
        } else {
            System.out.println("Software is not licensed. Cannot proceed.");
        }
    }
}
