package com.tencent.mm.ui.tools;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;

public class MMTruncTextView extends TextView
{
  private boolean jUb = false;
  private boolean jUc = false;

  public MMTruncTextView(Context paramContext)
  {
    super(paramContext);
  }

  public MMTruncTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMTruncTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.jUb);
    CharSequence localCharSequence;
    do
    {
      return;
      localCharSequence = getText();
    }
    while (!(localCharSequence instanceof Spanned));
    this.jUc = true;
    setText(TextUtils.ellipsize(localCharSequence, getPaint(), getWidth() - getCompoundPaddingRight() - getCompoundPaddingLeft(), TextUtils.TruncateAt.END));
    this.jUc = false;
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (!this.jUc);
    for (boolean bool = true; ; bool = false)
    {
      this.jUb = bool;
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMTruncTextView
 * JD-Core Version:    0.6.2
 */