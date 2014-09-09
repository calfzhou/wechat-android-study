package com.tencent.mm.compatible.audio;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.compatible.c.a;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class b
{
  public static c ml()
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences(ak.aHi(), 0);
    if (v.dNC.dLk == 1);
    for (boolean bool = false; ; bool = true)
    {
      if (!localSharedPreferences.contains("settings_voicerecorder_mode"))
        localSharedPreferences.edit().putBoolean("settings_voicerecorder_mode", bool).commit();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(v.dNC.dLk);
      arrayOfObject[1] = Boolean.valueOf(bool);
      arrayOfObject[2] = Boolean.valueOf(localSharedPreferences.getBoolean("settings_voicerecorder_mode", bool));
      z.i("AudioConfig", "getModeByConfig mVoiceRecordMode:%d defValue:%b settings_voicerecorder_mode:%b", arrayOfObject);
      if (!localSharedPreferences.getBoolean("settings_voicerecorder_mode", bool))
        break;
      return c.dJH;
    }
    return c.dJI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.b
 * JD-Core Version:    0.6.2
 */