package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.ga;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.i;

final class il
  implements Runnable
{
  il(hd paramhd)
  {
  }

  public final void run()
  {
    com.tencent.mm.storage.b localb = bg.qW().oZ().xS(this.jtA.jnf.getUsername());
    if ((localb != null) && (localb.aIb()))
    {
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cpan[doScene NetSceneGetChatroomMemberDetail]");
      ga localga = new ga();
      localga.cLh.cLi = this.jtA.jnf.getUsername();
      localga.cLh.cLj = localb.aIa();
      a.aGB().g(localga);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.il
 * JD-Core Version:    0.6.2
 */