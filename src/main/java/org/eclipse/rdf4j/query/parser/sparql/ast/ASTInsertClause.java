/* Generated By:JJTree: Do not edit this line. ASTInsertClause.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTInsertClause extends SimpleNode {
	public ASTInsertClause(int id) {
		super(id);
	}

	public ASTInsertClause(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=10d1a3d4965f4f78e9b5dd959b32bf73 (do not edit this line) */
