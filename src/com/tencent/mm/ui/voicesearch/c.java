package com.tencent.mm.ui.voicesearch;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.r;
import com.tencent.mm.ui.applet.f;

final class c
  implements f
{
  c(a parama)
  {
  }

  public final String dv(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jZt.getCount()))
    {
      z.e("!56@/B4Tb64lLpIuhwFNmr0jFWYgIN094j0aBZ18bmsj7hGfIxUgiYP/JA==", "pos is invalid");
      return null;
    }
    r localr = (r)this.jZt.getItem(paramInt);
    if (localr == null)
      return null;
    return localr.getUsername();
  }

  public final int vX()
  {
    return this.jZt.getCount();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.c
 * JD-Core Version:    0.6.2
 */