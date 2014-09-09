package com.tencent.mm.ui;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;

final class bd
  implements Runnable
{
  bd(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    if (!bg.oE())
      z.w("!44@/B4Tb64lLpK+AkWszK7UvIu5cpERJB7d1VkLoGBmsjY=", "getAddrTabUnreadCount, but mmcore not ready");
    for (int i = 0; ; i = ap.a((Integer)bg.qW().oQ().get(143618)))
    {
      if (LauncherUI.a(this.iKj) != null)
        LauncherUI.a(this.iKj).oA(i);
      return;
    }
  }

  public final String toString()
  {
    return super.toString() + "|setAddressTagUnread";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bd
 * JD-Core Version:    0.6.2
 */