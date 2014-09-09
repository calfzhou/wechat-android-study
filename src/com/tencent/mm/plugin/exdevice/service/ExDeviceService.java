package com.tencent.mm.plugin.exdevice.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.z;

public class ExDeviceService extends Service
{
  private r eKk = new ar();

  public IBinder onBind(Intent paramIntent)
  {
    return this.eKk;
  }

  public void onCreate()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12s0kcWST5M1hQ==", "ExDeviceService onCreate");
    super.onCreate();
  }

  public void onDestroy()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12s0kcWST5M1hQ==", "ExDeviceService onDestroy");
    Java2CExDevice.closeBluetoothAccessoryLib();
    super.onDestroy();
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12s0kcWST5M1hQ==", "kill exdevice process now");
    Process.killProcess(Process.myPid());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ExDeviceService
 * JD-Core Version:    0.6.2
 */