package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.tencent.mm.sdk.platformtools.z;

public final class f
{
  public long eiT;
  public h eiU;
  public j eiV;
  public k eiW;
  public long ein;
  private BluetoothDevice eio;
  public int mState;

  public f(long paramLong)
  {
    this.eiT = paramLong;
    this.ein = paramLong;
    this.eiU = null;
    this.eiV = null;
    this.eiW = null;
    this.mState = 0;
    this.eio = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(com.tencent.mm.plugin.c.a.d.a.aj(paramLong));
  }

  public final boolean a(a parama, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLfYulCLBIG2OvhTg4RJk6Kw==", "connect");
    if (this.eio == null)
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLfYulCLBIG2OvhTg4RJk6Kw==", "Can not found remote device(" + com.tencent.mm.plugin.c.a.d.a.aj(this.eiT) + ")");
      if (parama != null)
        parama.eiP.b(this.ein, 7, "Device not found");
      return false;
    }
    this.mState = 2;
    if (this.eiU != null)
    {
      this.eiU.disconnect();
      this.eiU = null;
    }
    this.eiU = new h(this, parama, this.eio, paramBoolean);
    this.eiU.connect();
    return true;
  }

  public final void disconnect()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLfYulCLBIG2OvhTg4RJk6Kw==", "disconnect");
    this.mState = 0;
    if (this.eiU != null)
    {
      this.eiU.disconnect();
      this.eiU = null;
    }
    if (this.eiV != null)
    {
      this.eiV.cancel();
      this.eiV = null;
    }
    if (this.eiW != null)
    {
      this.eiW.cancel();
      this.eiW = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.f
 * JD-Core Version:    0.6.2
 */