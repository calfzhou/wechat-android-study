package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.ch;

public class MMAutoCompleteTextView extends AutoCompleteTextView
{
  private ah iYh;
  final Drawable iYi = getResources().getDrawable(h.aaf);

  public MMAutoCompleteTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.iYi.setBounds(0, 0, this.iYi.getIntrinsicWidth(), this.iYi.getIntrinsicHeight());
    aRC();
    setOnTouchListener(new ae(this));
    addTextChangedListener(new af(this));
    setOnFocusChangeListener(new ag(this));
  }

  private void aRC()
  {
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      aRD();
      return;
    }
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.iYi, getCompoundDrawables()[3]);
  }

  private void aRD()
  {
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
  }

  public final void BN(String paramString)
  {
    if (!ch.jb(paramString))
    {
      this.iYh = new ah(this, paramString);
      addTextChangedListener(this.iYh);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoCompleteTextView
 * JD-Core Version:    0.6.2
 */