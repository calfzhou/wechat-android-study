package com.tencent.mm.modelfriend;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements h
{
  public final void Z(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "syncAddrBookAndUpload onSyncEnd suc:%b", arrayOfObject);
    if (!paramBoolean)
      return;
    System.currentTimeMillis();
    au localau = new au(aa.vN(), aa.wh());
    bg.qX().d(localau);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.d
 * JD-Core Version:    0.6.2
 */