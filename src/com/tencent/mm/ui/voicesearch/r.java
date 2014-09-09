package com.tencent.mm.ui.voicesearch;

import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.f;
import java.util.LinkedList;

final class r
  implements f
{
  r(j paramj)
  {
  }

  public final String dv(int paramInt)
  {
    if (paramInt < 0)
      z.e("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "pos is invalid");
    wz localwz;
    do
    {
      return null;
      localwz = this.jZD.rx(1 + (paramInt + j.e(this.jZD)));
    }
    while (localwz == null);
    return localwz.hVf.getString();
  }

  public final int vX()
  {
    if (j.f(this.jZD) == null)
      return 0;
    return j.f(this.jZD).size();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.r
 * JD-Core Version:    0.6.2
 */