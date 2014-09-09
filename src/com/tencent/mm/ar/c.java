package com.tencent.mm.ar;

import com.tencent.mm.c.a.aw;
import com.tencent.mm.c.a.ax;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class c extends g
{
  c()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    aw localaw = (aw)parame;
    int i;
    if (localaw.cIa.cIb == 1)
    {
      i = 1;
      if (i != a.lV())
        if (localaw.cIa.cIb != 1)
          break label80;
    }
    label80: for (boolean bool = true; ; bool = false)
    {
      a.L(bool);
      b.clearCache();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(a.lV());
      z.d("!32@/B4Tb64lLpJdV4abHyr4fNe/R+Qil++a", "emojiUnicodeEventListener, isUseUnicode:%b", arrayOfObject);
      return false;
      i = 0;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c
 * JD-Core Version:    0.6.2
 */