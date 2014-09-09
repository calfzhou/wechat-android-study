package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.ci;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class t extends g
{
  public t()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof ci))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      return false;
    }
    z.i("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "requestAccountSync()");
    if (ak.getContext() == null)
    {
      z.w("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "MMApplicationContext.getContext() == null");
      return false;
    }
    f.K(ak.getContext());
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.t
 * JD-Core Version:    0.6.2
 */