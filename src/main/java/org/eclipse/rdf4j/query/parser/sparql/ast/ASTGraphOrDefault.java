/* Generated By:JJTree: Do not edit this line. ASTGraphOrDefault.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTGraphOrDefault extends SimpleNode {
	public ASTGraphOrDefault(int id) {
		super(id);
	}

	public ASTGraphOrDefault(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=d1bc941587249d7b7c65dddc6c99b8b3 (do not edit this line) */