/* Generated By:JJTree: Do not edit this line. ASTDeleteClause.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTDeleteClause extends SimpleNode {
	public ASTDeleteClause(int id) {
		super(id);
	}

	public ASTDeleteClause(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=64958954e7ca14317fd9ff6b55d78cb5 (do not edit this line) */
