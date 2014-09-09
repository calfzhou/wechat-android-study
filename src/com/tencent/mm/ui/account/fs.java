package com.tencent.mm.ui.account;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.f;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;

final class fs extends ClickableSpan
{
  fs(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(View paramView)
  {
    ch.t(this.iQP.aPI(), this.iQP.getString(n.cnl));
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.iQP.getResources().getColor(f.Oo));
    paramTextPaint.setUnderlineText(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fs
 * JD-Core Version:    0.6.2
 */