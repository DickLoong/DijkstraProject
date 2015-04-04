package com.dickloong.study.map;

import java.util.HashMap;
import java.util.Map;

public class MapNode {
	private Map<MapNode, Integer> nextNodes=new HashMap<MapNode,Integer>();
	private String nodeName;
	public Map<MapNode, Integer> getNextNodes() {
		return nextNodes;
	}
	public void setNextNodes(Map<MapNode, Integer> nextNodes) {
		this.nextNodes = nextNodes;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	@Override
	public int hashCode(){
		return this.nodeName.hashCode();
	}
	@Override
	public boolean equals(Object o){
		return ((MapNode)o).getNodeName().equalsIgnoreCase(this.getNodeName());		
	}
}
