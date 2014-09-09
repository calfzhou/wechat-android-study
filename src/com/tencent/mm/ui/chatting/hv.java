package com.tencent.mm.ui.chatting;

import android.app.Activity;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.plugin.voicereminder.a.k;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class hv
  implements k
{
  hv(hd paramhd)
  {
  }

  public final void m(String paramString, long paramLong)
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "onVoiceRemind " + paramString + " time " + paramLong);
    if (y.dE(bg.ig().lp()))
      e.a(this.jtA.agh(), false, paramString, this.jtA.agh().getString(n.coj), this.jtA.agh().getString(n.cog), this.jtA.agh().getString(n.coi), new hw(this, paramLong), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hv
 * JD-Core Version:    0.6.2
 */