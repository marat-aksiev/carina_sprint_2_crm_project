package com.crm.utilities;

public class CrmUtils {

    public static String getUserNameByRole(String userRole) {
        return ConfigurationReader.getProperty(userRole + "_username");
    }

    public static String getPasswordByRole(String userRole) {
        return ConfigurationReader.getProperty(userRole + "_password");
    }

}
