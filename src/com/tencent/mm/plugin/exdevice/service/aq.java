package com.tencent.mm.plugin.exdevice.service;

import android.os.RemoteException;

public final class aq
  implements af
{
  private q eKy;

  public aq(q paramq)
  {
    this.eKy = paramq;
  }

  public final long a(aj paramaj)
  {
    try
    {
      long l = this.eKy.a(paramaj);
      return l;
    }
    catch (RemoteException localRemoteException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localRemoteException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGseGSlDgjTRrfOecTYmnJyqsVcH5wj74Cw==", "startTask failed!!! %s", arrayOfObject);
    }
    return -1L;
  }

  public final boolean a(long paramLong, int paramInt, z paramz)
  {
    an.PN().aE(paramLong);
    try
    {
      boolean bool = this.eKy.a(paramLong, paramInt, paramz);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localRemoteException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGseGSlDgjTRrfOecTYmnJyqsVcH5wj74Cw==", "startChannel failed!!! %s", arrayOfObject);
    }
    return false;
  }

  public final boolean a(t paramt)
  {
    try
    {
      boolean bool = this.eKy.a(paramt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localRemoteException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGseGSlDgjTRrfOecTYmnJyqsVcH5wj74Cw==", "registOnDeviceRequest failed!!! %s", arrayOfObject);
    }
    return false;
  }

  public final boolean au(long paramLong)
  {
    an.PN().aE(paramLong);
    try
    {
      boolean bool = this.eKy.au(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localRemoteException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGseGSlDgjTRrfOecTYmnJyqsVcH5wj74Cw==", "stopChannel failed!!! %s", arrayOfObject);
    }
    return false;
  }

  public final boolean b(t paramt)
  {
    try
    {
      boolean bool = this.eKy.b(paramt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localRemoteException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGseGSlDgjTRrfOecTYmnJyqsVcH5wj74Cw==", "unRegistOnDeviceRequest failed!!! %s", arrayOfObject);
    }
    return false;
  }

  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGseGSlDgjTRrfOecTYmnJyqsVcH5wj74Cw==", "------setChannelSessionKey------ deviceId = %d", arrayOfObject);
    try
    {
      this.eKy.setChannelSessionKey(paramLong, paramArrayOfByte);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.aq
 * JD-Core Version:    0.6.2
 */