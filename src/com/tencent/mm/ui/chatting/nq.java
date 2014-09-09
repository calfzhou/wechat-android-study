package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;

final class nq
  implements cm
{
  nq(ar paramar, Context paramContext)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str1 = paramMenuItem.getTitle();
    String str2 = com.tencent.mm.storage.z.yW(this.dxM.getContent()).vu();
    if ((str2 == null) || (str2.endsWith("-1")))
      str2 = this.dxM.kp();
    if (str2 == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptEmojiConnector: filePath is null");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "connector click[emoji]: to[%s] filePath[%s]", new Object[] { str1, str2 });
    if (g.axR().e(this.dLL, str1, str2))
    {
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(47);
      arrayOfObject2[1] = Integer.valueOf(64);
      arrayOfObject2[2] = str1;
      localn2.d(10424, arrayOfObject2);
      e.aw(this.dLL, "");
    }
    com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(47);
    arrayOfObject1[1] = Integer.valueOf(64);
    arrayOfObject1[2] = str1;
    localn1.d(10424, arrayOfObject1);
    e.aw(this.dLL, this.dLL.getString(com.tencent.mm.n.bue));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nq
 * JD-Core Version:    0.6.2
 */