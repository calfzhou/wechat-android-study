package com.tencent.mm.ui.chatting;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ao;

final class hs
  implements ao
{
  private Animation jtF;
  private Animation jtG;

  hs(hd paramhd)
  {
  }

  public final boolean dK(boolean paramBoolean)
  {
    if (this.jtF == null)
    {
      this.jtF = AnimationUtils.loadAnimation(this.jtA.agh(), b.MD);
      this.jtG = AnimationUtils.loadAnimation(this.jtA.agh(), b.MB);
    }
    if (paramBoolean)
    {
      if (this.jtA.jrO != null)
      {
        this.jtA.jrO.setVisibility(8);
        this.jtA.jrO.startAnimation(this.jtG);
      }
      this.jtA.fpD.setVisibility(0);
      this.jtA.fpD.startAnimation(this.jtF);
      this.jtA.fpD.postInvalidateDelayed(this.jtF.getDuration());
    }
    do
    {
      return false;
      this.jtA.XF();
      this.jtA.fpD.setVisibility(8);
      this.jtA.fpD.startAnimation(this.jtG);
    }
    while (this.jtA.jrO == null);
    this.jtA.jrO.setVisibility(0);
    this.jtA.jrO.startAnimation(this.jtF);
    this.jtA.jrO.postInvalidateDelayed(this.jtF.getDuration());
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hs
 * JD-Core Version:    0.6.2
 */