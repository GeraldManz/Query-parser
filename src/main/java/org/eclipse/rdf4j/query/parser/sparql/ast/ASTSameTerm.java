/* Generated By:JJTree: Do not edit this line. ASTSameTerm.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTSameTerm extends SimpleNode {
	public ASTSameTerm(int id) {
		super(id);
	}

	public ASTSameTerm(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}
}
/* JavaCC - OriginalChecksum=3efc02e4c478be1309fb8f6cc17ea736 (do not edit this line) */
