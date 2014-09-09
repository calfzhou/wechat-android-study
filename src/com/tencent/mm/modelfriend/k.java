package com.tencent.mm.modelfriend;

import com.tencent.mm.c.a.q;
import com.tencent.mm.c.a.r;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.ca;

final class k extends g
{
  public k()
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (!(parame instanceof q))
    {
      z.f("!56@/B4Tb64lLpIqcrJBKv7GGpaIJVKtF1au3qNBtibJ6VVaWk4rYzgWDw==", "not bind qq event");
      return false;
    }
    if (((q)parame).cHq.cHs == 0);
    try
    {
      int i = 0x1000 | x.pO();
      bg.qW().oQ().set(34, Integer.valueOf(i));
      bg.qW().oS().a(new ca(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0));
      z.d("!56@/B4Tb64lLpIqcrJBKv7GGpaIJVKtF1au3qNBtibJ6VVaWk4rYzgWDw==", "doClearQQFriendHelper succ ");
      label105: return false;
    }
    catch (Exception localException)
    {
      break label105;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.k
 * JD-Core Version:    0.6.2
 */