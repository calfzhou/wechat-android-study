package com.tencent.mm.ui;

import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class ap extends g
{
  ap(LauncherUI paramLauncherUI)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = parame.toString();
    z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "appTagUnreadChangeListener, event:%s", arrayOfObject);
    this.iKj.aPe();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ap
 * JD-Core Version:    0.6.2
 */