package BigOAST;

import com.github.javaparser.ast.Node;

public class FunctionDeclarationNode extends BasicNode {
	private String name;
	private String parameter;

	public FunctionDeclarationNode(Node node, String name, String parameter) {
		super(FunctionDeclarationNode.class.getSimpleName(), node);
		this.name = name;
		this.parameter = parameter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
}