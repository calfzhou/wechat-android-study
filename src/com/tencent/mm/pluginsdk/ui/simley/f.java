package com.tencent.mm.pluginsdk.ui.simley;

import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.z;

final class f
  implements al
{
  f(d paramd)
  {
  }

  public final void a(String paramString, ao paramao)
  {
    if (paramString == null);
    do
    {
      return;
      if (paramString.equals("create_emoji_info_notify"))
      {
        z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0KXlW+3FKbuI=", "create emoji info");
        a.hIe.aDq();
        return;
      }
      if (paramString.equals("delete_emoji_info_notify"))
      {
        z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0KXlW+3FKbuI=", "delete emoji info");
        a.hIe.aDq();
        return;
      }
    }
    while (!paramString.equals("event_update_emoji"));
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0KXlW+3FKbuI=", "update emoji info");
    a.hIe.aDq();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.f
 * JD-Core Version:    0.6.2
 */