package com.tencent.mm.ui.account.mobile;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.f;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;

final class ai extends ClickableSpan
{
  ai(ag paramag, MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    ch.t(this.iUh.aPI(), this.iUh.getString(n.cnh));
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.iUh.getResources().getColor(f.Oo));
    paramTextPaint.setUnderlineText(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ai
 * JD-Core Version:    0.6.2
 */