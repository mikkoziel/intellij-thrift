// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface ThriftInclude extends ThriftPsiCompositeElement {

  @Nullable
  PsiElement getLiteral();

  @NotNull
  PsiReference[] getReferences();

  @NotNull
  String getPath();

}
