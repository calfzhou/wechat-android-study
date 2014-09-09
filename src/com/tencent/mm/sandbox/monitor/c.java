package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sandbox.updater.AppUpdaterUI;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Map;
import java.util.TimerTask;

final class c extends TimerTask
{
  c(Map paramMap)
  {
  }

  public final void run()
  {
    Intent localIntent = new Intent(ak.getContext(), AppUpdaterUI.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("intent_extra_desc", (String)this.iBe.get(".Response.desc"));
    localIntent.putExtra("intent_update_type", 999);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ((String)this.iBe.get(".Response.url"));
    localIntent.putExtra("intent_extra_download_url", arrayOfString);
    ak.getContext().startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.c
 * JD-Core Version:    0.6.2
 */