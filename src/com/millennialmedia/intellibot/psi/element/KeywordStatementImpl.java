package com.millennialmedia.intellibot.psi.element;

import com.intellij.lang.ASTNode;
import com.millennialmedia.intellibot.psi.RobotTokenTypes;
import org.jetbrains.annotations.NotNull;

/**
 * @author mrubino
 */
public class KeywordStatementImpl extends RobotPsiElementBase implements KeywordStatement {

    public KeywordStatementImpl(@NotNull ASTNode node) {
        super(node, RobotTokenTypes.KEYWORD_STATEMENT);
    }
}
