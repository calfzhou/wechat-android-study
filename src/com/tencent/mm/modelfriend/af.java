package com.tencent.mm.modelfriend;

import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.z;

final class af extends ap
{
  af(ae paramae)
  {
  }

  protected final boolean vQ()
  {
    boolean bool = true;
    Object[] arrayOfObject;
    if ((ae.a(this.dtX) == null) || (ae.a(this.dtX).aHQ()))
    {
      arrayOfObject = new Object[bool];
      if (ae.a(this.dtX) != null)
        break label61;
    }
    label61: for (Object localObject = "null"; ; localObject = Boolean.valueOf(ae.a(this.dtX).aHQ()))
    {
      arrayOfObject[0] = localObject;
      z.w("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.af
 * JD-Core Version:    0.6.2
 */