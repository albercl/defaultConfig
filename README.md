# Default config class

[![](https://jitpack.io/v/albercl/defaultConfig.svg)](https://jitpack.io/#albercl/defaultConfig)

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

## Installation
Check for the version at the start of this doc
### Gradle
Add Jitpack to your repositories:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the project as dependency:
```gradle
dependencies {
        implementation 'com.github.albercl:defaultConfig:VERSION'
}
```

### Maven
Add Jitpack to your repositories:
```maven
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Add the project as dependency:
```maven
<dependency>
    <groupId>com.github.albercl</groupId>
    <artifactId>defaultConfig</artifactId>
    <version>VERSION</version>
</dependency>
```