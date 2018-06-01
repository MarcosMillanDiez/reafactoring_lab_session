package lanSimulation.internals;

public class WorkStation extends Node {

	public WorkStation(byte type, String name) {
		super(type, name);
		
	}
	
	public WorkStation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
	
	}
	
	@Override
	protected void appendElement(StringBuffer buf, Node currentNode) {
		buf.append("Workstation ");
		buf.append(currentNode.name_);
		buf.append(" [Workstation]");
	}
	
	@Override
	protected void appendElementHTML(StringBuffer buf, Node currentNode) {
		buf.append("Workstation ");
		buf.append(currentNode.name_);
		buf.append(" [Workstation]");
	}
	
	@Override
	protected void appendElementXML(StringBuffer buf, Node currentNode) {
		buf.append("<workstation>");
		buf.append(currentNode.name_);
		buf.append("</workstation>");
	}

}
