package com.tencent.mm.plugin.c.a.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class h extends BluetoothGattCallback
{
  h(g paramg)
  {
  }

  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------onDataReceive------");
    if (!g.e(this.eiG).sendMessage(g.e(this.eiG).obtainMessage(8, paramBluetoothGattCharacteristic.getValue())))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(8);
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "SendMessage Failed!!! MessageWhat = %d", arrayOfObject);
    }
  }

  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------onCharacteristicRead------ status = %d", arrayOfObject);
  }

  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------onDataWriteCallback------ status = %d", arrayOfObject1);
    if (!g.e(this.eiG).sendMessage(g.e(this.eiG).obtainMessage(7, paramInt, 0)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(7);
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "SendMessage Failed!!! MessageWhat = %d", arrayOfObject2);
    }
  }

  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt2);
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(g.d(this.eiG));
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", arrayOfObject1);
    if (!g.e(this.eiG).sendMessage(g.e(this.eiG).obtainMessage(4, paramInt2, 0)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(4);
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "SendMessage Failed!!! MessageWhat = %d", arrayOfObject2);
    }
  }

  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------onDescriptorWrite------ status = %d", arrayOfObject1);
    if (!g.e(this.eiG).sendMessage(g.e(this.eiG).obtainMessage(6, paramInt, 0, paramBluetoothGatt)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(6);
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "SendMessage Failed!!! MessageWhat = %d", arrayOfObject2);
    }
  }

  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "------onServicesDiscovered------ status = %d", arrayOfObject1);
    if (!g.e(this.eiG).sendMessage(g.e(this.eiG).obtainMessage(5, paramInt, 0, paramBluetoothGatt)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(5);
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "SendMessage Failed!!! MessageWhat = %d", arrayOfObject2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.h
 * JD-Core Version:    0.6.2
 */