package com.tencent.mm.app;

import com.tencent.mm.booter.g;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.compatible.loader.l;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.c.b;
import com.tencent.mm.sdk.platformtools.ak;

public final class SandBoxProfile extends l
{
  public static final String cFO = ak.getPackageName() + ":sandbox";

  public final void aQ()
  {
  }

  public final void onCreate()
  {
    o.nQ();
    com.tencent.mm.sdk.c.a.a(new b());
    o.a("stlport_shared", SandBoxProfile.class.getClassLoader());
    o.a("MMProtocalJni", SandBoxProfile.class.getClassLoader());
    MMProtocalJni.setClientPackVersion(com.tencent.mm.protocal.a.hrn);
    new g(ak.getContext()).kX();
  }

  public final String toString()
  {
    return cFO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.SandBoxProfile
 * JD-Core Version:    0.6.2
 */