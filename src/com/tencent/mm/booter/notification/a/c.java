package com.tencent.mm.booter.notification.a;

import android.app.Notification;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.setting.SettingsRingtoneUI;
import java.io.File;

public final class c
{
  private int djg = 0;

  private static boolean bS(int paramInt)
  {
    return (paramInt & 0x1) > 0;
  }

  public final int a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, Notification paramNotification)
  {
    AudioManager localAudioManager;
    boolean bool;
    int j;
    int i;
    if (paramBoolean1)
    {
      localAudioManager = (AudioManager)paramContext.getSystemService("audio");
      if (localAudioManager == null)
      {
        bool = false;
        if (!bool)
          break label188;
        j = 1;
        i = 0;
      }
    }
    while (true)
    {
      label34: if (paramBoolean2)
        i |= 2;
      String str = i.w(paramContext);
      if ((str != null) && (new File(str).exists()))
        str = SettingsRingtoneUI.jNT;
      if (v.dNG.dMO != 2)
      {
        int k = i & 0x2;
        int m = 0;
        if (k > 0)
          m = 1;
        if (m != 0)
        {
          i &= -3;
          ch.a(paramContext, true);
        }
        if ((bS(i)) && (j == 0))
        {
          i &= -2;
          k.lO().cp(str);
        }
      }
      if (j != 0)
      {
        i &= -2;
        k.lO().cp(str);
      }
      while (true)
      {
        this.djg = i;
        return this.djg;
        bool = localAudioManager.isWiredHeadsetOn();
        break;
        label188: i = 1;
        j = 0;
        break label34;
        if ((bS(i)) && (str != null))
        {
          i &= -2;
          paramNotification.sound = Uri.parse(str);
        }
      }
      i = 0;
      j = 0;
    }
  }

  public final int lI()
  {
    return this.djg;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.c
 * JD-Core Version:    0.6.2
 */