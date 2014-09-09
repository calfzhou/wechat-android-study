package com.tencent.mm.ui.bindlinkedin;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.f;

final class q extends ClickableSpan
{
  q(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.jjm.getResources().getColor(f.Oo));
    paramTextPaint.setUnderlineText(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.q
 * JD-Core Version:    0.6.2
 */