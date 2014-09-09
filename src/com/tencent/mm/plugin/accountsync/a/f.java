package com.tencent.mm.plugin.accountsync.a;

import com.tencent.mm.model.ar;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public final class f
  implements bd
{
  private static int dFN = 0;
  public static int dWv = i.dWy;
  private static ay dWw = null;
  private a dWu = null;

  public static void eU(int paramInt)
  {
    dWv = paramInt;
    switch (h.dWx[(paramInt - 1)])
    {
    default:
      return;
    case 1:
      dFN = 0;
      if (dWw == null)
        dWw = new ay(new g(), true);
      z.d("!44@/B4Tb64lLpIAhUt0Bg2QTtWTArGQBknYDKsnvcDnFmA=", "[oneliang][SmsVerifyCodeState]Sent");
      dWw.cP(900000L);
      return;
    case 2:
    case 3:
    }
    if (dWw != null)
      dWw.aNu();
    z.d("!44@/B4Tb64lLpIAhUt0Bg2QTtWTArGQBknYDKsnvcDnFmA=", "[oneliang][SmsVerifyCodeState]verified");
    dWv = i.dWy;
    bg.ig().lr();
    dFN = 0;
    dWw = null;
  }

  public final void O(boolean paramBoolean)
  {
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.a.f
 * JD-Core Version:    0.6.2
 */