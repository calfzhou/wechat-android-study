package com.tencent.mm.ab;

import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

final class v
  implements Runnable
{
  v(int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    u.nf();
    u.gZ(h.dOI + "/testaddmsg.txt");
    if ((u.yB().size() <= 0) || (u.yC().size() <= 0))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(u.yC().size());
      arrayOfObject[1] = Integer.valueOf(u.yB().size());
      z.e("!32@/B4Tb64lLpJ890peMBnAqTpgOBI4mE3+", "syncAddMsg get source failed cmd:%d contact:%d", arrayOfObject);
      return;
    }
    new ay(bg.qQ().getLooper(), new w(this), true).cP(3000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.v
 * JD-Core Version:    0.6.2
 */