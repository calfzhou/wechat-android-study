package com.tencent.mm.modelfriend;

import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.z;

final class bk extends ap
{
  bk(bj parambj)
  {
  }

  protected final boolean vQ()
  {
    boolean bool = true;
    Object[] arrayOfObject;
    if ((bj.a(this.dSg) == null) || (bj.a(this.dSg).aHQ()))
    {
      arrayOfObject = new Object[bool];
      if (bj.a(this.dSg) != null)
        break label61;
    }
    label61: for (Object localObject = "null"; ; localObject = Boolean.valueOf(bj.a(this.dSg).aHQ()))
    {
      arrayOfObject[0] = localObject;
      z.w("!44@/B4Tb64lLpJ4FHnyJpFGLGUFfp8Yd7awqsKJHV4TzI0=", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.bk
 * JD-Core Version:    0.6.2
 */