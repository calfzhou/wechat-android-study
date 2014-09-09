package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

class MMAutoSwitchEditText extends EditText
{
  private ai iYl = new ai(this);

  public MMAutoSwitchEditText(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMAutoSwitchEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    addTextChangedListener(this.iYl);
    setOnKeyListener(this.iYl);
  }

  public final void a(aj paramaj)
  {
    this.iYl.a(paramaj);
  }

  public final void a(ak paramak)
  {
    this.iYl.a(paramak);
  }

  public final void a(al paramal)
  {
    this.iYl.b(paramal);
  }

  public final void pp(int paramInt)
  {
    this.iYl.pp(paramInt);
  }

  public final void setIndex(int paramInt)
  {
    this.iYl.setIndex(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSwitchEditText
 * JD-Core Version:    0.6.2
 */