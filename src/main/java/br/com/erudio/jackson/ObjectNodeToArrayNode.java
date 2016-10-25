package br.com.erudio.jackson;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ObjectNodeToArrayNode {

	public ArrayNode getChildrenList(ObjectNode jsonTreeObject) {
		return (ArrayNode) jsonTreeObject.get("persons");
	}
}
