/* Generated By:JJTree: Do not edit this line. ASTHours.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTHours extends SimpleNode {
	public ASTHours(int id) {
		super(id);
	}

	public ASTHours(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=954c4c8967aec2fbcef1e27c14b707bd (do not edit this line) */