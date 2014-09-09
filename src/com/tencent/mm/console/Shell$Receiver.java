package com.tencent.mm.console;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public class Shell$Receiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    r localr = (r)Shell.ow().get(str);
    if (localr == null)
    {
      z.e("!24@/B4Tb64lLpLOIdMtS2bKaA==", "no action found for %s", new Object[] { str });
      return;
    }
    z.e("!24@/B4Tb64lLpLOIdMtS2bKaA==", "shell action %s", new Object[] { str });
    localr.b(paramIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.Receiver
 * JD-Core Version:    0.6.2
 */