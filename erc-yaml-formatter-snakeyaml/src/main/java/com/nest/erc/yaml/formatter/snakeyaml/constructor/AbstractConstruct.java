package com.nest.erc.yaml.formatter.snakeyaml.constructor;

import com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException;
import com.nest.erc.yaml.formatter.snakeyaml.nodes.Node;

/**
 * Because recursive structures are not very common we provide a way to save
 * some typing when extending a constructor
 */
public abstract class AbstractConstruct implements Construct {

    /**
     * Fail with a reminder to provide the seconds step for a recursive
     * structure
     * 
     * @see org.yaml.snakeyaml.constructor.Construct#construct2ndStep(org.yaml.snakeyaml.nodes.Node,
     *      java.lang.Object)
     */
    public void construct2ndStep(Node node, Object data) {
        if (node.isTwoStepsConstruction()) {
            throw new IllegalStateException("Not Implemented in " + getClass().getName());
        } else {
            throw new YAMLException("Unexpected recursive structure for Node: " + node);
        }
    }
}
