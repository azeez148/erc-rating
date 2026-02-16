package com.nest.erc.yaml.formatter.snakeyaml.serializer;


import java.text.NumberFormat;

import com.nest.erc.yaml.formatter.snakeyaml.nodes.Node;

public class NumberAnchorGenerator implements AnchorGenerator {

    private int lastAnchorId = 0;

    public NumberAnchorGenerator(int lastAnchorId) {
        this.lastAnchorId = lastAnchorId;
    }

    public String nextAnchor(Node node) {
        this.lastAnchorId++;
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMinimumIntegerDigits(3);
        format.setMaximumFractionDigits(0);// issue 172
        format.setGroupingUsed(false);
        String anchorId = format.format(this.lastAnchorId);
        return "id" + anchorId;
    }
}
