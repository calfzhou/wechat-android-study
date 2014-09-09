package com.tencent.mm.plugin.c.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class g
{
  private final LinkedList eiA = new LinkedList();
  private volatile boolean eiB = false;
  private HandlerThread eiC;
  private int eiD;
  private final BluetoothGattCallback eiE = new h(this);
  private int eiF = -1;
  private BluetoothAdapter eie;
  private long ein;
  private BluetoothDevice eio;
  private Context eip;
  private BluetoothGatt eiq;
  private b eir;
  private BluetoothGattCharacteristic eis;
  private BluetoothGattCharacteristic eit;
  private a eiu;
  private Runnable eiv;
  private Runnable eix;
  private Runnable eiy;
  private g eiz = this;
  private cm mHandler;

  @TargetApi(18)
  public g(long paramLong, Context paramContext, b paramb)
  {
    this.eir = paramb;
    this.eip = paramContext;
    this.eie = ((BluetoothManager)this.eip.getSystemService("bluetooth")).getAdapter();
    this.ein = paramLong;
    this.eiD = 3;
    this.eio = this.eie.getRemoteDevice(com.tencent.mm.plugin.c.a.d.a.aj(paramLong));
    this.eis = null;
    this.eit = null;
    this.eiu = new a();
    this.eiC = new HandlerThread("BLuetoothLE Drive");
    this.eiC.start();
    this.mHandler = new l(this.eiC.getLooper(), this);
    this.eiv = new i(this);
    this.eix = new j(this);
    this.eiy = new k(this);
  }

  private void HR()
  {
    this.eiB = false;
    this.eiA.clear();
  }

  private void HS()
  {
    if (this.eiA.isEmpty())
    {
      this.eiB = false;
      return;
    }
    byte[] arrayOfByte1 = (byte[])this.eiA.pop();
    this.eiu.setData(arrayOfByte1);
    byte[] arrayOfByte2 = this.eiu.HN();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = com.tencent.mm.plugin.exdevice.g.a.Z(arrayOfByte2);
    z.d("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "Out data dump = %s", arrayOfObject);
    this.eit.setValue(arrayOfByte2);
    this.mHandler.postDelayed(this.eiv, 5000L);
    if (!this.eiq.writeCharacteristic(this.eit))
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "mBluetoothGatt.writeCharacteristic Failed!!!");
    this.eiB = true;
  }

  public final long HT()
  {
    return this.ein;
  }

  public final boolean N(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramArrayOfByte.length);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------writeData------length = %d", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = com.tencent.mm.plugin.exdevice.g.a.Z(paramArrayOfByte);
    z.d("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "writeData data dump = %s", arrayOfObject2);
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(3, paramArrayOfByte));
  }

  public final void close()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------close------");
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(2);
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "SendMessage Failed!!! MessageWhat = %d", arrayOfObject);
    }
  }

  public final boolean connect()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------connect------");
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.g
 * JD-Core Version:    0.6.2
 */