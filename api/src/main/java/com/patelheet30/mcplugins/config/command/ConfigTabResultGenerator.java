package com.patelheet30.mcplugins.config.command;

import com.patelheet30.mcplugins.config.Config;

import java.util.List;

/**
 * Created by Jason MK on 2020-03-20 at 6:50 p.m.
 */
public interface ConfigTabResultGenerator<T extends Config> {

    List<String> results(T config, String[] arguments);

}
