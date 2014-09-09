package com.tencent.mm.app;

import com.tencent.mm.compatible.g.o;
import com.tencent.mm.compatible.loader.l;
import com.tencent.mm.console.Shell;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.b;

public final class PusherProfile extends l
{
  public static final String cFO = com.tencent.mm.sdk.platformtools.ak.getPackageName() + ":push";
  private Shell cGx = new Shell();

  public final void aQ()
  {
  }

  public final void onCreate()
  {
    com.tencent.mm.booter.ak.J(false);
    o.a("stlport_shared", h.class.getClassLoader());
    h.aq(cFO);
    o.nQ();
    a.a(new b());
  }

  public final String toString()
  {
    return cFO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.PusherProfile
 * JD-Core Version:    0.6.2
 */