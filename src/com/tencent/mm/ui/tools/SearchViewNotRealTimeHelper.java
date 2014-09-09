package com.tencent.mm.ui.tools;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.k;

public class SearchViewNotRealTimeHelper extends LinearLayout
  implements bs
{
  private View jOC;
  private ImageButton jOE;
  private h jOI;
  private Button jUG;
  private ge jUH;
  private EditText jgF;

  public SearchViewNotRealTimeHelper(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public SearchViewNotRealTimeHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void init()
  {
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(k.baA, this, true);
    this.jgF = ((EditText)findViewById(com.tencent.mm.i.aqy));
    this.jOE = ((ImageButton)findViewById(com.tencent.mm.i.aRS));
    this.jOC = findViewById(com.tencent.mm.i.aTU);
    this.jUG = ((Button)findViewById(com.tencent.mm.i.button));
    this.jUG.setEnabled(false);
    this.jgF.addTextChangedListener(new fy(this));
    this.jgF.setOnEditorActionListener(new fz(this));
    this.jOE.setOnClickListener(new ga(this));
    this.jOC.setOnClickListener(new gb(this));
    this.jUG.setOnClickListener(new gc(this));
  }

  public final void A(CharSequence paramCharSequence)
  {
    this.jgF.setHint(paramCharSequence);
  }

  public final void Dk(String paramString)
  {
    this.jgF.setText("");
    this.jgF.append(paramString);
  }

  public final void Si()
  {
    this.jgF.post(new gd(this));
  }

  public final void a(ge paramge)
  {
    this.jUH = paramge;
  }

  public final void a(h paramh)
  {
    this.jOI = paramh;
  }

  public final void a(i parami)
  {
  }

  public final String aAn()
  {
    Editable localEditable = this.jgF.getEditableText();
    if (localEditable == null)
      return "";
    return localEditable.toString();
  }

  public final void aZA()
  {
    this.jgF.clearFocus();
  }

  public final boolean aZB()
  {
    return false;
  }

  public final boolean aZC()
  {
    return false;
  }

  public final void b(ge paramge)
  {
    this.jUH = paramge;
  }

  public final void baP()
  {
    this.jgF.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
  }

  public final void baQ()
  {
    if (this.jOC != null)
      this.jOC.setVisibility(8);
  }

  public final void baR()
  {
    this.jUG.performClick();
  }

  public final void dZ(boolean paramBoolean)
  {
  }

  public final void fY(boolean paramBoolean)
  {
  }

  public final void fZ(boolean paramBoolean)
  {
  }

  public final void ga(boolean paramBoolean)
  {
    this.jgF.setText("");
  }

  public boolean hasFocus()
  {
    return false;
  }

  public final void ri(int paramInt)
  {
    this.jgF.setTextColor(paramInt);
  }

  public final void rj(int paramInt)
  {
    this.jgF.setHintTextColor(paramInt);
  }

  public final void setHint(CharSequence paramCharSequence)
  {
    A(paramCharSequence);
  }

  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper
 * JD-Core Version:    0.6.2
 */