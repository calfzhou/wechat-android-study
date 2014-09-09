package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;

public class ActionBarSearchView extends LinearLayout
  implements bs
{
  private TextWatcher hDZ = new c(this);
  private View jOC;
  private ActionBarSearchView.ActionBarEditText jOD;
  private ImageButton jOE;
  private int jOF = j.jOO;
  private boolean jOG = false;
  private i jOH;
  private h jOI;
  private View.OnFocusChangeListener jOJ = new d(this);
  private View.OnClickListener jOK = new e(this);
  private View.OnClickListener jOL = new f(this);

  public ActionBarSearchView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public ActionBarSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void aZz()
  {
    if ((this.jOD.getEditableText() != null) && (!ch.jb(this.jOD.getEditableText().toString())))
    {
      r(com.tencent.mm.h.aaf, 0, getResources().getDimensionPixelSize(com.tencent.mm.g.PF));
      this.jOF = j.jOO;
      return;
    }
    if (this.jOG)
    {
      r(com.tencent.mm.h.acU, com.tencent.mm.h.VZ, getResources().getDimensionPixelSize(com.tencent.mm.g.Pk));
      this.jOF = j.jOP;
      return;
    }
    r(0, 0, 0);
    this.jOF = j.jOO;
  }

  private void init()
  {
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(k.baz, this, true);
    this.jOC = findViewById(com.tencent.mm.i.aTU);
    this.jOC.setOnClickListener(this.jOL);
    this.jOD = ((ActionBarSearchView.ActionBarEditText)findViewById(com.tencent.mm.i.aqy));
    this.jOD.g(this);
    this.jOD.post(new g(this));
    this.jOE = ((ImageButton)findViewById(com.tencent.mm.i.aRS));
    this.jOD.addTextChangedListener(this.hDZ);
    this.jOD.setOnFocusChangeListener(this.jOJ);
    this.jOE.setOnClickListener(this.jOK);
  }

  private void r(int paramInt1, int paramInt2, int paramInt3)
  {
    this.jOE.setImageResource(paramInt1);
    this.jOE.setBackgroundResource(paramInt2);
    ViewGroup.LayoutParams localLayoutParams = this.jOE.getLayoutParams();
    localLayoutParams.width = paramInt3;
    this.jOE.setLayoutParams(localLayoutParams);
  }

  public final void Dk(String paramString)
  {
    if (paramString == null)
      paramString = "";
    this.jOD.setText(paramString);
    this.jOD.setSelection(paramString.length());
  }

  public final void a(ge paramge)
  {
  }

  public final void a(h paramh)
  {
    this.jOI = paramh;
  }

  public final void a(i parami)
  {
    this.jOH = parami;
  }

  public final String aAn()
  {
    if (this.jOD.getEditableText() != null)
      return this.jOD.getEditableText().toString();
    return "";
  }

  public final void aZA()
  {
    this.jOD.clearFocus();
  }

  public final boolean aZB()
  {
    if (this.jOD != null)
      return this.jOD.hasFocus();
    return false;
  }

  public final boolean aZC()
  {
    if (this.jOD != null)
      return this.jOD.requestFocus();
    return false;
  }

  public final void dZ(boolean paramBoolean)
  {
    this.jOG = paramBoolean;
    aZz();
  }

  public final void fY(boolean paramBoolean)
  {
    this.jOD.setEnabled(paramBoolean);
  }

  public final void fZ(boolean paramBoolean)
  {
    this.jOE.setEnabled(paramBoolean);
  }

  public final void ga(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.jOD.removeTextChangedListener(this.hDZ);
      this.jOD.setText("");
      this.jOD.addTextChangedListener(this.hDZ);
      return;
    }
    this.jOD.setText("");
  }

  public final void setHint(CharSequence paramCharSequence)
  {
    this.jOD.setHint(paramCharSequence);
  }

  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    this.jOD.setOnEditorActionListener(paramOnEditorActionListener);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ActionBarSearchView
 * JD-Core Version:    0.6.2
 */