package com.tencent.mm.booter.notification;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.mm.booter.notification.a.f;
import com.tencent.mm.booter.notification.a.l;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  private NotificationManager diY = (NotificationManager)this.mContext.getSystemService("notification");
  private l diZ = new l(this.mContext);
  private final int dja = com.tencent.mm.i.ckL;
  private Context mContext = ak.getContext();

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, int paramInt, String paramString2, String paramString3, Intent paramIntent, boolean paramBoolean3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean1);
    arrayOfObject[1] = Boolean.valueOf(paramBoolean2);
    arrayOfObject[2] = Integer.valueOf(paramInt);
    arrayOfObject[3] = paramString2;
    arrayOfObject[4] = paramString3;
    z.i("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "in sample Notify: needSound: %B, needShake: %B, msgContent: ==, msgType: %d, talker: %s, customNotify: %s", arrayOfObject);
    if (!com.tencent.mm.booter.notification.a.a.v(this.mContext))
      cancel();
    if (!this.mContext.getSharedPreferences(ak.aHi(), 0).getBoolean("settings_new_msg_notification", true));
    label361: label492: 
    while (true)
    {
      return;
      String str1;
      Notification localNotification;
      int j;
      int k;
      PendingIntent localPendingIntent;
      String str2;
      String str3;
      String str4;
      b localb;
      if (com.tencent.mm.storage.i.yc(paramString2))
      {
        str1 = "@bottle";
        localNotification = new Notification();
        localNotification.icon = h.icon;
        localNotification.ledARGB = -16711936;
        localNotification.ledOnMS = 300;
        localNotification.ledOffMS = 1000;
        this.diZ.a(paramBoolean1, paramBoolean2, localNotification, str1, paramInt, paramIntent, paramString1, paramString3, paramBoolean3);
        int i = f.lL().co(str1);
        j = this.diZ.lU();
        k = this.diZ.lT();
        localPendingIntent = this.diZ.bU(i);
        str2 = this.diZ.lW();
        str3 = this.diZ.lX();
        str4 = this.diZ.lY();
        Bitmap localBitmap = this.diZ.lS();
        if (Build.VERSION.SDK_INT < 11)
          break label437;
        Notification.Builder localBuilder = new Notification.Builder(this.mContext);
        localBuilder.setLights(-16711936, 300, 1000).setSmallIcon(j).setTicker(str4).setContentIntent(localPendingIntent);
        if (str2 != null)
          localBuilder.setContentTitle(str2);
        if (str3 != null)
          localBuilder.setContentText(str3);
        localBuilder.setDefaults(k);
        if (localBitmap != null)
          localBuilder.setLargeIcon(localBitmap);
        if (localNotification.sound != null)
          localBuilder.setSound(localNotification.sound);
        localNotification = localBuilder.getNotification();
        localb = new b(i, str1, localNotification);
        localb.show();
        if ((!paramBoolean3) || (this.diZ.lP() > 0) || (this.diZ.lR()) || (this.diZ.lQ() > 0))
          break label488;
      }
      for (int m = 1; ; m = 0)
      {
        if (m == 0)
          break label492;
        localb.cancel();
        return;
        str1 = paramString2;
        break;
        localNotification.flags = (0x1 | localNotification.flags);
        localNotification.icon = j;
        localNotification.tickerText = str4;
        localNotification.defaults = k;
        localNotification.setLatestEventInfo(this.mContext, str2, str3, localPendingIntent);
        break label361;
      }
    }
  }

  public final boolean a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Boolean.valueOf(paramBoolean1);
    arrayOfObject[3] = Boolean.valueOf(paramBoolean2);
    z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "dealCurChattingTalker, talker: %s, curChattingTalker: %s, needSound: %B, needShake: %B", arrayOfObject);
    if ((!ch.jb(paramString1)) && (!ch.jb(paramString2)) && (paramString1.equals(paramString2)))
    {
      if ((!paramBoolean2) && (!paramBoolean1))
        z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[NO NOTIFICATION] is current talker chatroom & no shake & no sound");
      do
      {
        return true;
        ch.a(this.mContext, paramBoolean2);
      }
      while (!paramBoolean1);
      String str = com.tencent.mm.booter.notification.a.i.w(this.mContext);
      this.diZ.cp(str);
      return true;
    }
    return false;
  }

  public final void cancel()
  {
    this.diY.cancelAll();
    f.lL().clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a
 * JD-Core Version:    0.6.2
 */