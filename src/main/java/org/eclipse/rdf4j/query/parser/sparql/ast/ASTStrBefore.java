/* Generated By:JJTree: Do not edit this line. ASTStrBefore.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTStrBefore extends SimpleNode {
	public ASTStrBefore(int id) {
		super(id);
	}

	public ASTStrBefore(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=cb42b3edfffb51272528a3403dee45e4 (do not edit this line) */
