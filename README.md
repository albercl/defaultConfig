# Default config class

## How to use it
### Example
```java
    try {
        Properties config = new DefaultClass(
            "defaults.properties",
            "config.properties");

    } catch (IOException e) {
        e.printStackTrace();
        System.exit(1);
    }

    System.out.println(config.getProperty("prop"));
    
```

### Managing files
It just take the default file from the resources of the project, and the config from the file system.

The default file must exist, otherwise, the config from the file system is created if doesn't exist.

If an error occurs while treating with the files, an IOException is thrown.