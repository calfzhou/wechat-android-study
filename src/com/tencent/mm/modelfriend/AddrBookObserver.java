package com.tencent.mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class AddrBookObserver extends ContentObserver
{
  private static boolean dsC = false;
  private static boolean dsD = false;
  private static boolean dsE = false;
  private static Intent dsF;
  private static cm gQj = new a(Looper.getMainLooper());
  private final Context context;

  public AddrBookObserver(Context paramContext)
  {
    super(cm.fetchFreeHandler());
    this.context = paramContext;
  }

  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "address book changed, start sync after 20 second");
    if (dsC)
    {
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "isSyncing:" + dsC + ", is time to sync:true , return");
      return;
    }
    dsE = true;
    gQj.removeMessages(0);
    Message localMessage = gQj.obtainMessage();
    localMessage.obj = this.context;
    localMessage.what = 0;
    gQj.sendMessageDelayed(localMessage, 20000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.AddrBookObserver
 * JD-Core Version:    0.6.2
 */