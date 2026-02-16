package com.nest.erc.yaml.formatter.snakeyaml.representer;

import com.nest.erc.yaml.formatter.snakeyaml.nodes.Node;

/**
 * Create a Node Graph out of the provided Native Data Structure (Java
 * instance).
 * 
 * @see <a href="http://yaml.org/spec/1.1/#id859109">Chapter 3. Processing YAML
 *      Information</a>
 */
public interface Represent {
    /**
     * Create a Node
     * 
     * @param data
     *            the instance to represent
     * @return Node to dump
     */
    Node representData(Object data);
}

