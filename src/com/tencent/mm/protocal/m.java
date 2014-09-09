package com.tencent.mm.protocal;

import com.tencent.mm.ao.b;
import com.tencent.mm.protocal.a.ba;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.z;

public final class m
{
  public static void a(q paramq, bb parambb)
  {
    if (parambb.hQx != null)
    {
      paramq.fq(parambb.hQx.getString());
      return;
    }
    paramq.fq("");
    z.e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
  }

  public static ba b(p paramp)
  {
    ba localba = new ba();
    localba.hPM = paramp.getClientVersion();
    localba.hPL = b.aO(paramp.tI().getBytes()).ns(16);
    localba.hPN = b.aO(paramp.getDeviceType().getBytes()).ns(132);
    localba.hOi = paramp.tJ();
    localba.hQu = b.aO(paramp.qL().getBytes()).ns(36);
    localba.hQv = paramp.oD();
    return localba;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.m
 * JD-Core Version:    0.6.2
 */