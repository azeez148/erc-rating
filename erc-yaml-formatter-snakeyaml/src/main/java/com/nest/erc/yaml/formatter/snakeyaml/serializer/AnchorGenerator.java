package com.nest.erc.yaml.formatter.snakeyaml.serializer;

import com.nest.erc.yaml.formatter.snakeyaml.nodes.Node;

public interface AnchorGenerator {

    String nextAnchor(Node node);
}