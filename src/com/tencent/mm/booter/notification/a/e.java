package com.tencent.mm.booter.notification.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.model.z;
import com.tencent.mm.ui.LauncherUI;

public final class e
{
  private Intent jB;

  public final PendingIntent a(int paramInt, Context paramContext)
  {
    if (this.jB == null)
      return null;
    return PendingIntent.getActivity(paramContext, paramInt, this.jB, 134217728);
  }

  public final void a(Context paramContext, String paramString, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramIntent != null)
    {
      this.jB = paramIntent;
      return;
    }
    boolean bool = l.cl(paramString);
    if (paramInt3 >= 0);
    Intent localIntent;
    while (true)
    {
      localIntent = new Intent(paramContext, LauncherUI.class);
      localIntent.putExtra("nofification_type", "new_msg_nofification");
      localIntent.putExtra("Main_User", paramString);
      localIntent.putExtra("MainUI_User_Last_Msg_Type", paramInt1);
      localIntent.addFlags(536870912);
      localIntent.addFlags(67108864);
      if (!paramBoolean)
        break;
      localIntent.putExtra("talkerCount", 1);
      if (!bool)
      {
        localIntent.putExtra("Intro_Is_Muti_Talker", false);
        localIntent.putExtra("Intro_Bottle_unread_count", paramInt3);
      }
      localIntent.putExtra("talkerCount", 1);
      this.jB = localIntent;
      return;
      paramInt3 = z.qs();
    }
    if (paramInt2 >= 0)
    {
      label146: if ((paramInt2 > 1) || (bool))
        break label197;
      localIntent.putExtra("Intro_Is_Muti_Talker", false);
      localIntent.putExtra("Intro_Bottle_unread_count", paramInt3);
    }
    while (true)
    {
      localIntent.putExtra("talkerCount", paramInt2);
      break;
      paramInt2 = l.lG();
      break label146;
      label197: localIntent.putExtra("Intro_Is_Muti_Talker", true);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.e
 * JD-Core Version:    0.6.2
 */