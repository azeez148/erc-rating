package com.nest.erc.yaml.formatter.snakeyaml.nodes;

/**
 * Stores one key value pair used in a map.
 */
public final class NodeTuple {

    private Node keyNode;
    private Node valueNode;

    public NodeTuple(Node keyNode, Node valueNode) {
        if (keyNode == null || valueNode == null) {
            throw new NullPointerException("Nodes must be provided.");
        }
        this.keyNode = keyNode;
        this.valueNode = valueNode;
    }

    /**
     * Key node.
     *
     * @return the node used as key
     */
    public Node getKeyNode() {
        return keyNode;
    }

    /**
     * Value node.
     * 
     * @return node used as value
     */
    public Node getValueNode() {
        return valueNode;
    }

    @Override
    public String toString() {
        return "<NodeTuple keyNode=" + keyNode.toString() + "; valueNode=" + valueNode.toString()
                + ">";
    }
}
