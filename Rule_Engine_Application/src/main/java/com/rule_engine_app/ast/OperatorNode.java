package com.rule_engine_app.ast;

import com.rule_engine_app.model.UserAttributes;

public class OperatorNode extends Node {
    private String operator;
    private Node left;
    private Node right;

    public OperatorNode(String operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate(UserAttributes attributes) {
        switch (operator) {
            case "AND":
                return left.evaluate(attributes) && right.evaluate(attributes);
            case "OR":
                return left.evaluate(attributes) || right.evaluate(attributes);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
