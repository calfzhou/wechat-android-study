package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.ui.bl;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.bs;

final class bf
  implements bl
{
  bf(be parambe)
  {
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Long.valueOf(paramLong);
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "on voice search return, success %B, voice id %d", arrayOfObject);
    if (be.b(this.hMD) != null)
      be.b(this.hMD).a(paramBoolean, paramArrayOfString, paramLong, be.f(this.hMD));
  }

  public final void aAF()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "on voice search start");
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(be.a(this.hMD));
    arrayOfObject[1] = Integer.valueOf(3);
    localn.d(10453, arrayOfObject);
    if (be.b(this.hMD) != null)
      be.b(this.hMD).Jf();
  }

  public final void aAG()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "on voice search cancel");
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(be.a(this.hMD));
    arrayOfObject[1] = Integer.valueOf(4);
    localn.d(10453, arrayOfObject);
    if (be.c(this.hMD) != null)
    {
      be.d(this.hMD).fY(true);
      be.e(this.hMD).fZ(true);
    }
    if (be.b(this.hMD) != null)
      be.b(this.hMD).Jg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bf
 * JD-Core Version:    0.6.2
 */