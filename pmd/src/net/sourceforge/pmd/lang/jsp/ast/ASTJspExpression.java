/* Generated By:JJTree: Do not edit this line. ASTJspExpression.java */

package net.sourceforge.pmd.lang.jsp.ast;

public class ASTJspExpression extends AbstractJspNode {
    public ASTJspExpression(int id) {
        super(id);
    }

    public ASTJspExpression(JspParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}