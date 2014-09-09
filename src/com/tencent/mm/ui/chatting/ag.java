package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.iz;
import com.tencent.mm.c.a.ja;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class ag extends g
{
  ag(af paramaf)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    iz localiz = (iz)parame;
    long l = localiz.cNk.cDM;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = af.a(this.jmN);
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "playingVoiceId: %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = localiz.cNk.cDM;
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "msg id is: %s", arrayOfObject2);
    if (af.a(this.jmN) == l)
      am.h(new ah(this));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ag
 * JD-Core Version:    0.6.2
 */