package com.tencent.mm.pluginsdk.ui;

import com.tencent.mm.al.f;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class bh
  implements az
{
  bh(VoiceSearchLayout paramVoiceSearchLayout)
  {
  }

  public final boolean kJ()
  {
    if (VoiceSearchLayout.d(this.hAB) == null)
      return true;
    if (VoiceSearchLayout.e(this.hAB) < VoiceSearchLayout.aAC().length)
    {
      VoiceSearchLayout.a(this.hAB, VoiceSearchLayout.aAC()[VoiceSearchLayout.f(this.hAB)]);
      return true;
    }
    int i = VoiceSearchLayout.d(this.hAB).getMaxAmplitude();
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "addr vol:" + i);
    int j = VoiceSearchLayout.g(this.hAB);
    if (VoiceSearchLayout.g(this.hAB) == VoiceSearchLayout.h(this.hAB))
    {
      if (i <= 10)
      {
        VoiceSearchLayout.i(this.hAB);
        if (VoiceSearchLayout.j(this.hAB) >= VoiceSearchLayout.aAD().length)
          VoiceSearchLayout.k(this.hAB);
        VoiceSearchLayout.a(this.hAB, VoiceSearchLayout.aAD()[VoiceSearchLayout.j(this.hAB)]);
        return true;
      }
      int k = i / 5;
      if (k >= VoiceSearchLayout.aAE().length)
        k = -1 + VoiceSearchLayout.aAE().length;
      z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "addr mvol:" + k);
      VoiceSearchLayout.b(this.hAB, k);
    }
    while (true)
    {
      VoiceSearchLayout.a(this.hAB, VoiceSearchLayout.aAE()[j]);
      return true;
      if (VoiceSearchLayout.g(this.hAB) > VoiceSearchLayout.h(this.hAB))
        VoiceSearchLayout.l(this.hAB);
      else
        VoiceSearchLayout.m(this.hAB);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.bh
 * JD-Core Version:    0.6.2
 */