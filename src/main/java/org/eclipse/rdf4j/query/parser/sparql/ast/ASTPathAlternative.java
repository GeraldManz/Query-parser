/* Generated By:JJTree: Do not edit this line. ASTPathAlternative.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTPathAlternative extends SimpleNode {
	public ASTPathAlternative(int id) {
		super(id);
	}

	public ASTPathAlternative(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=f86126e3c43c985273e8c431764522fa (do not edit this line) */