package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.f;
import com.tencent.mm.pluginsdk.ab;
import com.tencent.mm.pluginsdk.ui.applet.aq;
import java.lang.ref.WeakReference;

final class or extends ClickableSpan
{
  private final WeakReference jwp;
  private final aq jwq;
  private final WeakReference jwr;

  public or(View paramView, ab paramab, aq paramaq)
  {
    this.jwr = new WeakReference(paramView);
    this.jwp = new WeakReference(paramab);
    this.jwq = paramaq;
  }

  public final void onClick(View paramView)
  {
    ab localab = (ab)this.jwp.get();
    if (localab != null)
      localab.onClick(this.jwq);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
    View localView = (View)this.jwr.get();
    if (localView != null)
    {
      paramTextPaint.setColor(localView.getResources().getColor(f.NV));
      if (localView.isPressed())
        paramTextPaint.bgColor = -5908174;
    }
    else
    {
      return;
    }
    paramTextPaint.bgColor = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.or
 * JD-Core Version:    0.6.2
 */