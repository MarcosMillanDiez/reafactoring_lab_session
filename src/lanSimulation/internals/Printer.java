package lanSimulation.internals;

public class Printer extends Node{
	
	public Printer(byte type, String name) {
		super(type, name);
		
	}

	public Printer(byte type, String name, Node nextNode) {
		super(type, name,nextNode);
		
	}
	
	@Override
	protected void appendElement(StringBuffer buf, Node currentNode) {
		buf.append("Printer ");
		buf.append(currentNode.name_);
		buf.append(" [Printer]");
	}
	
	@Override
	protected void appendElementHTML(StringBuffer buf, Node currentNode) {
		buf.append("Printer ");
		buf.append(currentNode.name_);
		buf.append(" [Printer]");
	}
	
	@Override
	protected void appendElementXML(StringBuffer buf, Node currentNode) {
		buf.append("<printer>");
		buf.append(currentNode.name_);
		buf.append("</printer>");
	}


}