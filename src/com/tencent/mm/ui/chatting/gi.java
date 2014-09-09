package com.tencent.mm.ui.chatting;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

public final class gi extends LinkMovementMethod
{
  private static gi jre;
  private gj jrf;

  public static gi aVd()
  {
    if (jre == null)
      jre = new gi();
    return jre;
  }

  public final void a(gj paramgj)
  {
    this.jrf = paramgj;
  }

  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i == 1) || (i == 0))
    {
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      int m = j - paramTextView.getTotalPaddingLeft();
      int n = k - paramTextView.getTotalPaddingTop();
      int i1 = m + paramTextView.getScrollX();
      int i2 = n + paramTextView.getScrollY();
      Layout localLayout = paramTextView.getLayout();
      int i3 = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i2), i1);
      ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])paramSpannable.getSpans(i3, i3, ClickableSpan.class);
      if (arrayOfClickableSpan.length != 0)
      {
        if (this.jrf != null)
          this.jrf.a(paramMotionEvent, paramSpannable, arrayOfClickableSpan[0]);
        if (i == 1)
          arrayOfClickableSpan[0].onClick(paramTextView);
        while (true)
        {
          return true;
          if (i == 0)
            Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(arrayOfClickableSpan[0]), paramSpannable.getSpanEnd(arrayOfClickableSpan[0]));
        }
      }
      Selection.removeSelection(paramSpannable);
    }
    while (true)
    {
      return super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
      if (this.jrf != null)
        this.jrf.a(paramMotionEvent, paramSpannable, null);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gi
 * JD-Core Version:    0.6.2
 */