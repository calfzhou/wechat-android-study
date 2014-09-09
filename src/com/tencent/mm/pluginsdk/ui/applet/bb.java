package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import com.tencent.mm.f;
import com.tencent.mm.pluginsdk.ab;

public final class bb extends az
{
  private int bgColor;
  private Context context;
  private aq hCc;
  private ab hCd;
  private int linkColor;

  public bb(aq paramaq, Context paramContext, ab paramab)
  {
    this.hCc = paramaq;
    this.context = paramContext;
    this.hCd = paramab;
    this.bgColor = -3355962;
    this.linkColor = this.context.getResources().getColor(f.Oo);
  }

  public final void onClick(View paramView)
  {
    if (this.hCd != null)
      this.hCd.onClick(this.hCc);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.linkColor);
    if (aAV())
    {
      paramTextPaint.bgColor = this.bgColor;
      return;
    }
    paramTextPaint.bgColor = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.bb
 * JD-Core Version:    0.6.2
 */