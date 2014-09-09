package com.tencent.mm.ui.pluginapp;

import com.tencent.mm.c.a.ez;
import com.tencent.mm.pluginsdk.c.a;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.platformtools.z;

final class w extends a
{
  w(t paramt)
  {
    super(0);
  }

  public final void d(e parame)
  {
    z.d("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "onMStorageNotifyEvent " + parame.getId());
    if ((parame instanceof ez))
      t.c(this.jKV);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.w
 * JD-Core Version:    0.6.2
 */