package com.tencent.mm.plugin.voicereminder.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.platformtools.l;
import com.tencent.mm.platformtools.m;
import com.tencent.mm.plugin.voicereminder.ui.RemindDialog;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.setting.SettingsRingtoneUI;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public class f
  implements bd
{
  private static HashMap fUL;
  private static f gSE;
  private final Set dJS = new HashSet();
  private String djU;
  private m fUH;
  private z gSD;
  private v gSF;
  private List gSG = new ArrayList();
  private com.tencent.mm.sdk.c.g gSH = new i(this);
  private com.tencent.mm.sdk.c.g gSI = new j(this);

  static
  {
    HashMap localHashMap = new HashMap();
    fUL = localHashMap;
    localHashMap.put(Integer.valueOf("VOICEREMIND_TABLE".hashCode()), new h());
  }

  private static f arF()
  {
    f localf = (f)bg.qF().eA(f.class.getName());
    gSE = localf;
    if (localf == null)
    {
      gSE = new f();
      bg.qF().a(f.class.getName(), gSE);
    }
    return gSE;
  }

  public static z arG()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (arF().gSD == null)
      arF().gSD = new z(arF().fUH);
    return arF().gSD;
  }

  public static v arH()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (arF().gSF == null)
      arF().gSF = new v();
    return arF().gSF;
  }

  public final void O(boolean paramBoolean)
  {
    com.tencent.mm.sdk.c.a.aGB().a("VoiceReminderRemind", this.gSH);
    com.tencent.mm.sdk.c.a.aGB().a("VoiceReminderDeleteRecordMessage", this.gSI);
  }

  public final void a(k paramk)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "addVoiceRemind ");
    if (paramk != null)
      this.dJS.add(paramk);
  }

  public final void b(k paramk)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "removeVoiceRemind ");
    if (paramk != null)
      this.dJS.remove(paramk);
  }

  public final void ci(int paramInt)
  {
  }

  public final boolean cj(long paramLong)
  {
    boolean bool = this.gSG.contains(Long.valueOf(paramLong));
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "silent " + bool + "  mid " + paramLong);
    return bool;
  }

  public final void f(String paramString1, String paramString2, long paramLong)
  {
    Context localContext = ak.getContext();
    if (localContext == null)
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "notifyVoiceRemind context null");
    while (true)
    {
      return;
      try
      {
        SharedPreferences localSharedPreferences = localContext.getSharedPreferences(ak.aHi(), 0);
        boolean bool1 = localSharedPreferences.getBoolean("settings_shake", true);
        boolean bool2 = localSharedPreferences.getBoolean("settings_sound", true);
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "shake " + bool1 + "sound " + bool2);
        if (y.dE(bg.ig().lp()))
          if (bool1)
            ap.a(localContext, true);
        while ((this.dJS == null) || (this.dJS.size() == 0))
        {
          RemindDialog.h(localContext, paramString1, paramString2);
          return;
          if (bool1)
            ap.a(localContext, true);
          if (bool2)
          {
            String str = localSharedPreferences.getString("settings.ringtone", SettingsRingtoneUI.jNT);
            if (str == SettingsRingtoneUI.jNT);
            MediaPlayer localMediaPlayer;
            Uri localUri;
            for (Object localObject = RingtoneManager.getDefaultUri(2); ; localObject = localUri)
            {
              while (true)
              {
                localMediaPlayer = new MediaPlayer();
                try
                {
                  localMediaPlayer.setDataSource(localContext, (Uri)localObject);
                  localMediaPlayer.setOnCompletionListener(new g(this));
                  AudioManager localAudioManager = (AudioManager)localContext.getSystemService("audio");
                  if (localAudioManager.getStreamVolume(5) == 0)
                    break;
                  if (!localAudioManager.isWiredHeadsetOn())
                    break label381;
                  int i = localAudioManager.getStreamVolume(8);
                  j = localAudioManager.getStreamMaxVolume(8);
                  k = localAudioManager.getStreamVolume(5);
                  if (k <= j)
                    break label458;
                  localAudioManager.setStreamVolume(8, j, 0);
                  localMediaPlayer.setAudioStreamType(8);
                  localMediaPlayer.setLooping(true);
                  localMediaPlayer.prepare();
                  localMediaPlayer.setLooping(false);
                  localMediaPlayer.start();
                  localAudioManager.setStreamVolume(8, i, 0);
                  Object[] arrayOfObject = new Object[2];
                  arrayOfObject[0] = Integer.valueOf(i);
                  arrayOfObject[1] = Integer.valueOf(j);
                  com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "oldVolume is %d, toneVolume is %d", arrayOfObject);
                }
                catch (Exception localException2)
                {
                }
              }
              break;
              localUri = Uri.parse(str);
            }
            label381: localMediaPlayer.setAudioStreamType(5);
            localMediaPlayer.setLooping(true);
            localMediaPlayer.prepare();
            localMediaPlayer.setLooping(false);
            localMediaPlayer.start();
          }
        }
        Iterator localIterator = this.dJS.iterator();
        while (localIterator.hasNext())
          ((k)localIterator.next()).m(paramString2, paramLong);
      }
      catch (Exception localException1)
      {
        while (true)
        {
          int k;
          continue;
          label458: int j = k;
        }
      }
    }
  }

  public final void nv()
  {
    if (arF().gSF != null)
      arF().gSF.stop();
    if (gSE != null)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "SubCoreVoiceRemind close db");
      f localf = gSE;
      if (localf.fUH != null)
      {
        localf.fUH.ev(localf.hashCode());
        localf.fUH = null;
      }
      localf.djU = "";
    }
    com.tencent.mm.sdk.c.a.aGB().b("VoiceReminderRemind", this.gSH);
    com.tencent.mm.sdk.c.a.aGB().b("VoiceReminderDeleteRecordMessage", this.gSI);
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
    f localf = arF();
    if ((ap.jb(paramString1)) || (ap.jb(localf.djU)) || (!paramString1.equals(localf.djU)))
    {
      String str = paramString2 + "CommonOneMicroMsg.db";
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "setVoiceRemindPath core on accPath : " + paramString1);
      localf.djU = paramString1;
      File localFile1 = new File(paramString1);
      if (!localFile1.exists())
        localFile1.mkdirs();
      File localFile2 = new File(paramString1 + "voiceremind/");
      if (!localFile2.exists())
        localFile2.mkdirs();
      localf.fUH = l.a(localf.hashCode(), str, fUL);
      localf.gSD = new z(localf.fUH);
    }
  }

  public final void tf(String paramString)
  {
    bg.qW().oW().yF(paramString);
    this.gSG.clear();
    Cursor localCursor = bg.qW().oV().zA(paramString);
    localCursor.moveToFirst();
    while (!localCursor.isAfterLast())
    {
      com.tencent.mm.storage.ar localar = new com.tencent.mm.storage.ar();
      localar.b(localCursor);
      long l = localar.kk();
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpIAhUt0Bg2QTpz+BQvcb319iO3PzNDXr0E=", "resetSilentQuene: msgId = " + l + " status = " + localar.getStatus());
      localCursor.moveToNext();
      this.gSG.add(Long.valueOf(l));
    }
    localCursor.close();
    bg.qW().oV().zx(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.f
 * JD-Core Version:    0.6.2
 */