package com.nest.erc.yaml.formatter.snakeyaml.nodes;

public class AnchorNode extends Node {

    private Node realNode;

    public AnchorNode(Node realNode) {
        super(realNode.getTag(), realNode.getStartMark(), realNode.getEndMark());
        this.realNode = realNode;
    }

    @Override
    public NodeId getNodeId() {
        return NodeId.anchor;
    }

    public Node getRealNode() {
        return realNode;
    }
}
