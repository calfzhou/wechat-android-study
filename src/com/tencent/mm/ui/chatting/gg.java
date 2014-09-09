package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import com.tencent.mm.f;
import com.tencent.mm.sdk.platformtools.ak;

final class gg
  implements gj
{
  private ClickableSpan jrd = null;

  gg(gb paramgb)
  {
  }

  public final void a(MotionEvent paramMotionEvent, Spannable paramSpannable, ClickableSpan paramClickableSpan)
  {
    int i = paramMotionEvent.getAction();
    if (i == 0)
      if (paramClickableSpan != null)
      {
        if ((ak.getContext() != null) && (ak.getContext().getResources() != null))
          paramSpannable.setSpan(new BackgroundColorSpan(ak.getContext().getResources().getColor(f.Oq)), paramSpannable.getSpanStart(paramClickableSpan), paramSpannable.getSpanEnd(paramClickableSpan), 33);
        this.jrd = paramClickableSpan;
      }
    do
    {
      do
      {
        return;
        if (i != 1)
          break;
      }
      while (paramClickableSpan == null);
      paramSpannable.setSpan(new BackgroundColorSpan(-1), paramSpannable.getSpanStart(paramClickableSpan), paramSpannable.getSpanEnd(paramClickableSpan), 33);
      return;
    }
    while ((i != 3) || (this.jrd == null));
    paramSpannable.setSpan(new BackgroundColorSpan(-1), paramSpannable.getSpanStart(this.jrd), paramSpannable.getSpanEnd(this.jrd), 33);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gg
 * JD-Core Version:    0.6.2
 */