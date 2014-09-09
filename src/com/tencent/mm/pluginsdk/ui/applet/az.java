package com.tencent.mm.pluginsdk.ui.applet;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.f;

public class az extends ClickableSpan
{
  private int bgColor;
  private boolean hCa = false;
  private ba hCb;
  private int linkColor;
  private String username;

  public az()
  {
  }

  public az(Activity paramActivity, String paramString, ba paramba)
  {
    this.linkColor = paramActivity.getResources().getColor(f.Oo);
    this.bgColor = paramActivity.getResources().getColor(f.OO);
    this.username = paramString;
    this.hCb = paramba;
  }

  public final boolean aAV()
  {
    return this.hCa;
  }

  public final void dq(boolean paramBoolean)
  {
    this.hCa = paramBoolean;
  }

  public void onClick(View paramView)
  {
    if (this.hCb != null)
      this.hCb.onClick(paramView, this.username);
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(this.linkColor);
    if (this.hCa)
    {
      paramTextPaint.bgColor = this.bgColor;
      return;
    }
    paramTextPaint.bgColor = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.az
 * JD-Core Version:    0.6.2
 */