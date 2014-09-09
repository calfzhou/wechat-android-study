package com.tencent.mm.platformtools;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.Time;
import com.tencent.mm.am.b;
import com.tencent.mm.booter.notification.a.d;
import com.tencent.mm.network.bm;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.setting.SettingsRingtoneUI;

final class z
  implements b
{
  z(String paramString1, String paramString2, Bundle paramBundle, String paramString3, String paramString4, int paramInt)
  {
  }

  public final void onDone()
  {
    Time localTime = new Time();
    localTime.setToNow();
    if (!bm.a(localTime.hour, localTime.minute, ak.getContext()))
    {
      com.tencent.mm.sdk.platformtools.z.i("!44@9DU/RFsdGl8e3Yxr3KsbFoTdQI3zLyUwqDhl7WcfpS4=", "no shake & sound notification during background deactive time");
      Intent localIntent = new Intent();
      localIntent.setClassName(ak.getPackageName(), ak.getPackageName() + ".plugin.webview.ui.tools.WebViewUI");
      localIntent.putExtra("rawUrl", this.dVb);
      localIntent.putExtra("useJs", true);
      localIntent.putExtra("vertical_scroll", true);
      localIntent.setFlags(872415232);
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = this.dVc;
      arrayOfObject1[1] = this.dVd;
      com.tencent.mm.sdk.platformtools.z.d("!44@9DU/RFsdGl8e3Yxr3KsbFoTdQI3zLyUwqDhl7WcfpS4=", "bizFrom: %s, data: %s", arrayOfObject1);
      if ((this.dVc != null) && (this.dVd != null))
      {
        localIntent.putExtra("bizofstartfrom", this.dVc);
        localIntent.putExtra("startwebviewparams", this.dVd);
      }
      PendingIntent localPendingIntent = PendingIntent.getActivity(ak.getContext(), 0, localIntent, 134217728);
      Notification localNotification = new Notification(d.lK(), null, System.currentTimeMillis());
      localNotification.flags = (0x10 | localNotification.flags);
      localNotification.setLatestEventInfo(ak.getContext(), this.val$title, this.dVe, localPendingIntent);
      ((NotificationManager)ak.getContext().getSystemService("notification")).notify(this.dVf, localNotification);
      return;
    }
    while (true)
    {
      int k;
      try
      {
        String str;
        MediaPlayer localMediaPlayer;
        while (true)
        {
          Context localContext = ak.getContext();
          SharedPreferences localSharedPreferences = localContext.getSharedPreferences(ak.aHi(), 0);
          boolean bool1 = localSharedPreferences.getBoolean("settings_shake", true);
          boolean bool2 = localSharedPreferences.getBoolean("settings_sound", true);
          com.tencent.mm.sdk.platformtools.z.d("!44@9DU/RFsdGl8e3Yxr3KsbFoTdQI3zLyUwqDhl7WcfpS4=", "shake " + bool1 + "sound " + bool2);
          if (bool1)
            ch.a(localContext, true);
          if (!bool2)
            break;
          str = localSharedPreferences.getString("settings.ringtone", SettingsRingtoneUI.jNT);
          if (str != SettingsRingtoneUI.jNT)
            break label553;
          localObject = RingtoneManager.getDefaultUri(2);
          localMediaPlayer = new MediaPlayer();
          try
          {
            localMediaPlayer.setDataSource(localContext, (Uri)localObject);
            localMediaPlayer.setOnCompletionListener(new ab());
            AudioManager localAudioManager = (AudioManager)localContext.getSystemService("audio");
            if (localAudioManager.getStreamVolume(5) == 0)
              break;
            if (!localAudioManager.isWiredHeadsetOn())
              break label567;
            int i = localAudioManager.getStreamVolume(8);
            j = localAudioManager.getStreamMaxVolume(8);
            k = localAudioManager.getStreamVolume(5);
            if (k <= j)
              break label602;
            localAudioManager.setStreamVolume(8, j, 0);
            localMediaPlayer.setAudioStreamType(8);
            localMediaPlayer.setLooping(true);
            localMediaPlayer.prepare();
            localMediaPlayer.setLooping(false);
            localMediaPlayer.start();
            localAudioManager.setStreamVolume(8, i, 0);
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(i);
            arrayOfObject2[1] = Integer.valueOf(j);
            com.tencent.mm.sdk.platformtools.z.d("!44@9DU/RFsdGl8e3Yxr3KsbFoTdQI3zLyUwqDhl7WcfpS4=", "oldVolume is %d, toneVolume is %d", arrayOfObject2);
          }
          catch (Exception localException2)
          {
          }
        }
        break;
        label553: Uri localUri = Uri.parse(str);
        Object localObject = localUri;
        continue;
        label567: localMediaPlayer.setAudioStreamType(5);
        localMediaPlayer.setLooping(true);
        localMediaPlayer.prepare();
        localMediaPlayer.setLooping(false);
        localMediaPlayer.start();
      }
      catch (Exception localException1)
      {
      }
      break;
      label602: int j = k;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.z
 * JD-Core Version:    0.6.2
 */