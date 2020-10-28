package es.albercl.defaultConfig;

import java.io.*;
import java.util.Properties;

public class DefaultConfig extends Properties {
    /**
     * This class is used for setting a default properties file on the resources of the project
     *  and creating a new properties file if it doesn't exists. If a file is found but it is incomplete,
     *  the class will rewrite it on the construction of the object. The object doesn't use more memory than
     *  a normal Properties object.
     * @param defaultStream input stream of the defaultConfig that is in the classpath
     * @param config file path out of the resources
     * @throws IOException if no default config was found, cannot create a new config file, cannot
     * write the config file, cannot read the config file or an error occurred with the streams
     */
    public DefaultConfig(InputStream defaultStream, String config) throws IOException {
        if (defaultStream == null) {
            throw new NullPointerException("Default stream mustn't be null");
        }

        File configFile = new File(config);

        load(defaultStream);

        if(!configFile.exists())
            if(!configFile.createNewFile())
                throw new IOException("Cannot create '" + config + "' file");

        if(!configFile.canWrite())
            throw new IOException("Cannot write '" + config + "' file");

        if(!configFile.canRead())
            throw new IOException("Cannot read '" + config + "' file");

        load(new FileInputStream(configFile));

        store(new FileOutputStream(configFile), null);
    }
}
