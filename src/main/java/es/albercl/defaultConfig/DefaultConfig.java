package es.albercl.defaultConfig;

import java.io.*;
import java.util.Properties;

public class DefaultConfig extends Properties {
    public DefaultConfig(String defaultConfig, String config) throws IOException {
        InputStream defaultStream = getClass().getResourceAsStream(defaultConfig);
        File configFile = new File(config);

        load(defaultStream);

        if(!configFile.exists())
            if(!configFile.createNewFile())
                throw new IOException("Cannot create ' + config + ' file");

        if(!configFile.canWrite())
            throw new IOException("Cannot write '" + config + "' file");

        if(!configFile.canRead())
            throw new IOException("Cannot read '" + config + "' file");

        load(new FileInputStream(configFile));

        store(new FileOutputStream(configFile), null);
    }
}
