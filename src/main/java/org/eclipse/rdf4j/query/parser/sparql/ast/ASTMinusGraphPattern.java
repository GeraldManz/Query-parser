/* Generated By:JJTree: Do not edit this line. ASTMinusGraphPattern.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTMinusGraphPattern extends SimpleNode {
	public ASTMinusGraphPattern(int id) {
		super(id);
	}

	public ASTMinusGraphPattern(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=399d84e3d887771a5cfa960b73460c6a (do not edit this line) */
