package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;

final class m
  implements Runnable
{
  m(e parame)
  {
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "post to first init finish");
    View localView = this.jxW.findViewById(i.aAz);
    localView.setVisibility(8);
    localView.startAnimation(AnimationUtils.loadAnimation(this.jxW.agh(), b.Mw));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.m
 * JD-Core Version:    0.6.2
 */