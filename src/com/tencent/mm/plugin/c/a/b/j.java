package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothSocket;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.io.InputStream;

public final class j extends Thread
{
  private final BluetoothSocket eiX;
  private f eiZ;
  a eja;
  private InputStream ejd;
  private volatile boolean eje;

  public j(f paramf, a parama, BluetoothSocket paramBluetoothSocket)
  {
    this.eiX = paramBluetoothSocket;
    this.eiZ = paramf;
    this.eja = parama;
    this.eje = false;
    this.ejd = null;
    try
    {
      this.ejd = paramBluetoothSocket.getInputStream();
      return;
    }
    catch (IOException localIOException)
    {
      this.ejd = null;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIOException.toString();
      z.e("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "socket.getInputStream failed!!! (%s)", arrayOfObject);
    }
  }

  public final void cancel()
  {
    z.i("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "------cancel------");
    if (this.eje)
    {
      z.w("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "Cancel is done aready, just leave");
      return;
    }
    this.eje = true;
    interrupt();
    try
    {
      this.eiX.close();
      return;
    }
    catch (IOException localIOException)
    {
      z.e("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "close() of connect socket failed", new Object[] { localIOException });
    }
  }

  public final void run()
  {
    z.i("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "BEGIN RecvThread");
    if (this.ejd == null)
    {
      z.e("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "socket.getInputStream failed!!! Just Leave");
      return;
    }
    byte[] arrayOfByte1 = new byte[2048];
    while (true)
    {
      if (this.eje)
      {
        z.w("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "Cancel is called while receiving data, just leave");
        return;
      }
      try
      {
        int i = this.ejd.read(arrayOfByte1);
        if (i > 0)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(i);
          z.i("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "------On data receivce------data length = %d", arrayOfObject3);
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = com.tencent.mm.plugin.exdevice.g.a.k(arrayOfByte1, i);
          z.d("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "data dump = %s", arrayOfObject4);
          byte[] arrayOfByte2 = new byte[i];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
          if (this.eja != null)
            this.eja.eiP.c(this.eiZ.ein, arrayOfByte2);
        }
      }
      catch (IOException localIOException1)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localIOException1.toString();
        z.e("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "mInStream.read Failed!!! (%s)", arrayOfObject1);
        try
        {
          this.eiX.close();
          return;
        }
        catch (IOException localIOException2)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localIOException2.toString();
          z.e("!44@/B4Tb64lLpLHXwcx366fGt69EOJQNpFrSIYlWV0i2Rk=", "Close socket failed!!! (%s)", arrayOfObject2);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.j
 * JD-Core Version:    0.6.2
 */