package com.tencent.mm.sandbox.updater;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

final class as
  implements Runnable
{
  as(ar paramar, int paramInt)
  {
  }

  public final void run()
  {
    ((NotificationManager)this.iCJ.mContext.getSystemService("notification")).cancel(99);
    z.d("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "finishType == " + this.iCI);
    if ((this.iCI == 2) && (this.iCJ.iBm == 1))
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
      this.iCJ.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.as
 * JD-Core Version:    0.6.2
 */