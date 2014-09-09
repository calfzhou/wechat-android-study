package com.tencent.mm.ui;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;

final class ao
  implements as
{
  ao(LauncherUI paramLauncherUI)
  {
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = com.tencent.mm.platformtools.ap.R(paramObject);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    do
    {
      return;
      this.iKj.aPe();
      if (i == 143618)
      {
        LauncherUI.n(this.iKj);
        return;
      }
    }
    while ((i != 204817) && (i != 204820));
    LauncherUI.m(this.iKj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ao
 * JD-Core Version:    0.6.2
 */