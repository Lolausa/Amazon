package com.Amazon.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {

    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("Configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }

}
