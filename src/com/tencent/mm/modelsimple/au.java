package com.tencent.mm.modelsimple;

import com.tencent.mm.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

final class au
  implements m
{
  au(String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = paramString;
    z.i("!56@/B4Tb64lLpIuznxMDiXSbP9MkXbTW1ymAAAVGtTaecfQD5lkiwWqpQ==", "onSceneEnd errType:%d, erCode:%d, errMsg:%s", arrayOfObject);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      c.deleteFile(this.dDf);
    at.rB();
    bg.qX().b(157, at.zH());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.au
 * JD-Core Version:    0.6.2
 */