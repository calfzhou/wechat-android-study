package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.c.a.gk;
import com.tencent.mm.c.a.gl;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class j extends g
{
  j(VoiceTransTextUI paramVoiceTransTextUI)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "receive notify, process----> may be pass.");
    if (VoiceTransTextUI.n(this.kav) == null);
    while ((VoiceTransTextUI.m(this.kav)) || (!(parame instanceof gk)) || (((gk)parame).cLA.cLB != VoiceTransTextUI.n(this.kav).bcf()))
      return false;
    z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "");
    if (VoiceTransTextUI.o(this.kav))
    {
      z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "has new result! but need wait. so, wait.");
      VoiceTransTextUI.p(this.kav);
      return false;
    }
    new cm(this.kav.getMainLooper()).post(new k(this));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.j
 * JD-Core Version:    0.6.2
 */