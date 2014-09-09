package com.tencent.mm.modelstat;

import com.tencent.mm.model.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class v
  implements ay
{
  v(r paramr)
  {
  }

  public final void x(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(0);
    arrayOfObject[3] = ch.aHN();
    z.d("!32@/B4Tb64lLpIAhUt0Bg2QTmlgHJ0Y/UE3", "ReportDataFlow [%d][%d][%d] : %s ", arrayOfObject);
    k.h(paramInt1, paramInt2, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.v
 * JD-Core Version:    0.6.2
 */