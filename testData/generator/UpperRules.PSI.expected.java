// ---- GeneratedTypes.java -----------------
//header.txt
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType ABC = new IElementType("ABC", null);
  IElementType ABC_ONE = new IElementType("ABC_ONE", null);
  IElementType ABC_PIN = new IElementType("ABC_PIN", null);
  IElementType ABC_SEQ = new IElementType("ABC_SEQ", null);
  IElementType ABC_TWO = new IElementType("ABC_TWO", null);
  IElementType PREFIX = new IElementType("PREFIX", null);
  IElementType ROOT = new IElementType("ROOT", null);

  IElementType A = new IElementType("A", null);
  IElementType B = new IElementType("B", null);
  IElementType C = new IElementType("C", null);
}
// ---- Abc.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Abc extends PsiElement {

  @Nullable
  AbcOne getAbcOne();

  @Nullable
  AbcTwo getAbcTwo();

  @NotNull
  Prefix getPrefix();

}
// ---- AbcOne.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AbcOne extends PsiElement {

}
// ---- AbcPin.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AbcPin extends PsiElement {

  @Nullable
  AbcOne getAbcOne();

  @Nullable
  AbcTwo getAbcTwo();

  @NotNull
  Prefix getPrefix();

}
// ---- AbcSeq.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AbcSeq extends PsiElement {

  @NotNull
  AbcOne getAbcOne();

  @NotNull
  AbcTwo getAbcTwo();

  @NotNull
  Prefix getPrefix();

}
// ---- AbcTwo.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AbcTwo extends PsiElement {

}
// ---- Prefix.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Prefix extends PsiElement {

}
// ---- Root.java -----------------
//header.txt
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Root extends PsiElement {

  @NotNull
  List<Abc> getAbcList();

  @NotNull
  List<AbcPin> getAbcPinList();

  @NotNull
  List<AbcSeq> getAbcSeqList();

}
// ---- AbcImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class AbcImpl extends ASTWrapperPsiElement implements Abc {

  public AbcImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public AbcOne getAbcOne() {
    return findChildByClass(AbcOne.class);
  }

  @Override
  @Nullable
  public AbcTwo getAbcTwo() {
    return findChildByClass(AbcTwo.class);
  }

  @Override
  @NotNull
  public Prefix getPrefix() {
    return findNotNullChildByClass(Prefix.class);
  }

}
// ---- AbcOneImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class AbcOneImpl extends ASTWrapperPsiElement implements AbcOne {

  public AbcOneImpl(ASTNode node) {
    super(node);
  }

}
// ---- AbcPinImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class AbcPinImpl extends ASTWrapperPsiElement implements AbcPin {

  public AbcPinImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public AbcOne getAbcOne() {
    return findChildByClass(AbcOne.class);
  }

  @Override
  @Nullable
  public AbcTwo getAbcTwo() {
    return findChildByClass(AbcTwo.class);
  }

  @Override
  @NotNull
  public Prefix getPrefix() {
    return findNotNullChildByClass(Prefix.class);
  }

}
// ---- AbcSeqImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class AbcSeqImpl extends ASTWrapperPsiElement implements AbcSeq {

  public AbcSeqImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public AbcOne getAbcOne() {
    return findNotNullChildByClass(AbcOne.class);
  }

  @Override
  @NotNull
  public AbcTwo getAbcTwo() {
    return findNotNullChildByClass(AbcTwo.class);
  }

  @Override
  @NotNull
  public Prefix getPrefix() {
    return findNotNullChildByClass(Prefix.class);
  }

}
// ---- AbcTwoImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class AbcTwoImpl extends ASTWrapperPsiElement implements AbcTwo {

  public AbcTwoImpl(ASTNode node) {
    super(node);
  }

}
// ---- PrefixImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class PrefixImpl extends ASTWrapperPsiElement implements Prefix {

  public PrefixImpl(ASTNode node) {
    super(node);
  }

}
// ---- RootImpl.java -----------------
//header.txt
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class RootImpl extends ASTWrapperPsiElement implements Root {

  public RootImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<Abc> getAbcList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Abc.class);
  }

  @Override
  @NotNull
  public List<AbcPin> getAbcPinList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AbcPin.class);
  }

  @Override
  @NotNull
  public List<AbcSeq> getAbcSeqList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AbcSeq.class);
  }

}