package org.libgit2.jagged;

/**
 * A scope for a group of Git configuration settings, ranging from the local
 * repository to the entire system.
 */
public enum ConfigurationLevel
{
    /** The system-wide configuration */
    SYSTEM(1),

    /** User configuration per X Desktop Group specifications */
    XDG(2),

    /** User configuration */
    GLOBAL(3),

    /** Repository configuration */
    LOCAL(4),

    /** Application specific configuration */
    APPLICATION(5);

    private final int value;

    private ConfigurationLevel(int value)
    {
        this.value = value;
    }

    int getValue()
    {
        return value;
    }
}
