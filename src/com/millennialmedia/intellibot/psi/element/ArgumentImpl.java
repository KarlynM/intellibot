package com.millennialmedia.intellibot.psi.element;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import com.millennialmedia.intellibot.psi.RobotTokenTypes;
import com.millennialmedia.intellibot.psi.ref.RobotArgumentReference;
import org.jetbrains.annotations.NotNull;

/**
 * @author Stephen Abrams
 */
public class ArgumentImpl extends RobotPsiElementBase implements Argument {

    public ArgumentImpl(@NotNull final ASTNode node) {
        super(node, RobotTokenTypes.ARGUMENT);
    }

    @Override
    public PsiReference getReference() {
        return new RobotArgumentReference(this);
    }

    @Override
    public String getPresentableText() {
        return getTextData();
    }
}
