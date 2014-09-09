package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class h
{
  private final HandlerThread eiC;
  private BluetoothSocket eiX;
  private final boolean eiY;
  private final f eiZ;
  private final a eja;
  private boolean ejb;
  private final BluetoothDevice ejc;
  private final cm mHandler;

  public h(f paramf, a parama, BluetoothDevice paramBluetoothDevice, boolean paramBoolean)
  {
    this.eja = parama;
    this.eiZ = paramf;
    this.eiY = paramBoolean;
    this.ejb = false;
    this.ejc = paramBluetoothDevice;
    this.eiC = new HandlerThread("BC ConnectThread");
    this.eiC.start();
    this.mHandler = new i(this.eiC.getLooper(), this);
  }

  public final void connect()
  {
    z.i("!44@/B4Tb64lLpLHXwcx366fGkrVPGmnfuoKTMJN6xKrNrs=", "------connect------");
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(0)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      z.e("!44@/B4Tb64lLpLHXwcx366fGkrVPGmnfuoKTMJN6xKrNrs=", "sendMessage = %d failed!!!", arrayOfObject);
      if (this.eja != null)
        this.eja.d(this.eiZ.ein, false);
    }
  }

  public final void disconnect()
  {
    z.i("!44@/B4Tb64lLpLHXwcx366fGkrVPGmnfuoKTMJN6xKrNrs=", "------disconnect------");
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      z.e("!44@/B4Tb64lLpLHXwcx366fGkrVPGmnfuoKTMJN6xKrNrs=", "sendMessage = %d failed!!!", arrayOfObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.h
 * JD-Core Version:    0.6.2
 */