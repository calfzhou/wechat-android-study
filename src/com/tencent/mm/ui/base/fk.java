package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ak;

public final class fk
{
  public static void a(boolean paramBoolean, Intent paramIntent)
  {
    if (paramIntent == null)
      paramIntent = new Intent();
    if (paramBoolean);
    for (String str = "com.tencent.mm.ui.ACTION_ACTIVE"; ; str = "com.tencent.mm.ui.ACTION_DEACTIVE")
    {
      paramIntent.setAction(str);
      paramIntent.putExtra("_application_context_process_", ak.aHm());
      ak.getContext().sendBroadcast(paramIntent, "com.tencent.mm.permission.MM_MESSAGE");
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fk
 * JD-Core Version:    0.6.2
 */