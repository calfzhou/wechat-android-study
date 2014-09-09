package com.tencent.mm.plugin.extqlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class e extends cm
{
  e(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public final void handleMessage(Message paramMessage)
  {
    if ((ak.getContext() == null) || (!bg.oE()))
      z.w("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "wrong status");
    int i;
    do
    {
      do
        return;
      while (!b.a(this.eNa));
      i = b.Qo();
    }
    while ((i <= 0) && (i >= b.d(this.eNa)));
    z.d("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "notify unread");
    Intent localIntent = new Intent("com.tencent.mm.ext.ACTION_EXT_NOTIFY");
    localIntent.putExtra("EXTRA_EXT_NOTIFY_TYPE", "NEW_UNREAD");
    ak.getContext().sendBroadcast(localIntent);
    b.a(this.eNa, i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.e
 * JD-Core Version:    0.6.2
 */