/* Generated By:JJTree: Do not edit this line. ASTMonth.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTMonth extends SimpleNode {
	public ASTMonth(int id) {
		super(id);
	}

	public ASTMonth(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=1d23b033bc3a25a11d7b4e6dffc5583d (do not edit this line) */
