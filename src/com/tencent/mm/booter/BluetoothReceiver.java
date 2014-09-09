package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Set;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class BluetoothReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null) || (ap.jb(paramIntent.getAction())));
    int i;
    do
    {
      do
      {
        do
        {
          return;
          BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
          if (localBluetoothAdapter == null)
          {
            z.d("!44@/B4Tb64lLpLVC0LaS5ZOdqJgxv4SheKzLnVhrVs2Idc=", "getDefaultAdapter == null");
            return;
          }
          Set localSet = localBluetoothAdapter.getBondedDevices();
          if ((localSet == null) || (localSet.size() == 0))
          {
            z.d("!44@/B4Tb64lLpLVC0LaS5ZOdqJgxv4SheKzLnVhrVs2Idc=", "getBondedDevices == null");
            return;
          }
        }
        while (ap.jb(paramIntent.getAction()));
        z.d("!44@/B4Tb64lLpLVC0LaS5ZOdqJgxv4SheKzLnVhrVs2Idc=", "dkbt action :" + paramIntent.getAction());
      }
      while (!bg.oE());
      i = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
      z.d("!44@/B4Tb64lLpLVC0LaS5ZOdqJgxv4SheKzLnVhrVs2Idc=", "dkbt  action :" + paramIntent.getAction() + " state:" + i + " isBluetoothScoOn :" + bg.qY().ms() + " " + bg.qY().mv());
      if ((i == 1) && (bg.qY().ms()))
      {
        bg.qY().mo();
        return;
      }
    }
    while ((i != 0) || (bg.qY().ms()));
    if (v.dNG.dMu == 1)
      bg.qY().mr();
    bg.qY().mp();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.BluetoothReceiver
 * JD-Core Version:    0.6.2
 */