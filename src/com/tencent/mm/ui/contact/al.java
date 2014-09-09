package com.tencent.mm.ui.contact;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.applet.f;

final class al
  implements f
{
  al(aj paramaj)
  {
  }

  public final String dv(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jym.getCount()))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2Pv5tXEtMBlz8=", "pos is invalid");
      return null;
    }
    i locali = (i)this.jym.getItem(paramInt);
    if (locali == null)
      return null;
    return locali.getUsername();
  }

  public final int vX()
  {
    return this.jym.getCount();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.al
 * JD-Core Version:    0.6.2
 */