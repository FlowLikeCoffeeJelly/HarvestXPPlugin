package com.patelheet30.mcplugins.config.field.impl;

import com.patelheet30.mcplugins.config.Config;
import com.patelheet30.mcplugins.config.field.ConfigFieldListener;
import com.patelheet30.mcplugins.config.field.ConfigFieldListenerParseException;

/**
 * Created by Jason MK on 2020-04-13 at 12:32 p.m.
 */
public interface BooleanConfigFieldListener<T extends Config> extends ConfigFieldListener<T, Boolean> {

    @Override
    default Boolean parse(String argument) throws ConfigFieldListenerParseException {
        if (argument.equalsIgnoreCase("true") || argument.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(argument);
        }
        throw new ConfigFieldListenerParseException(String.format("Unable to parse %s, expected Boolean true or false", argument));
    }
}
