package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.plugin.exdevice.e.b;
import com.tencent.mm.plugin.exdevice.e.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class n
{
  private HashMap eKn = new HashMap();

  private void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramLong < 0L) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Long.valueOf(paramLong);
      boolean bool;
      if (paramArrayOfByte == null)
      {
        bool = true;
        arrayOfObject1[1] = Boolean.valueOf(bool);
        if (paramArrayOfByte != null)
          break label77;
      }
      label77: for (int i = -1; ; i = paramArrayOfByte.length)
      {
        arrayOfObject1[2] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "device id low than 0 or authbuf is null, deviceid = %d, buffer == null : %b, buffer length = %d", arrayOfObject1);
        return;
        bool = false;
        break;
      }
    }
    o localo = (o)this.eKn.get(Long.valueOf(paramLong));
    if (localo == null)
    {
      localo = new o();
      localo.eKo = paramLong;
    }
    switch (paramInt)
    {
    default:
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "unkown buffer type : %d", arrayOfObject2);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.eKn.put(Long.valueOf(paramLong), localo);
      return;
      localo.eKr = paramArrayOfByte;
      continue;
      localo.eKp = paramArrayOfByte;
      continue;
      localo.eKq = paramArrayOfByte;
    }
  }

  private void aJ(long paramLong)
  {
    b localb = com.tencent.mm.plugin.exdevice.b.z.Pp().lP(String.valueOf(paramLong));
    if (localb == null)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(paramLong);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "get harddevice info from db failed : %d", arrayOfObject2);
      return;
    }
    o localo = new o();
    localo.eKo = paramLong;
    localo.eKr = localb.field_authBuf;
    localo.eKp = localb.field_sessionKey;
    localo.eKq = localb.field_sessionBuf;
    localo.cIj = localb.field_brandName;
    localo.cLJ = 0;
    o.a(localo, false);
    this.eKn.put(Long.valueOf(paramLong), localo);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "not contains the device info, device id = %d, load from db", arrayOfObject1);
  }

  private byte[] h(long paramLong, int paramInt)
  {
    if (paramLong < 0L)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "device is lower than 0");
      return null;
    }
    o localo = (o)this.eKn.get(Long.valueOf(paramLong));
    if (localo == null)
      aJ(paramLong);
    byte[] arrayOfByte;
    switch (paramInt)
    {
    default:
      arrayOfByte = null;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = localo.eKr;
      continue;
      arrayOfByte = localo.eKp;
      continue;
      arrayOfByte = localo.eKq;
    }
  }

  public final void PE()
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "delAllDeviceAuthFlag");
    if (this.eKn == null)
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "null == exdeviceInfoList");
    while (true)
    {
      return;
      Iterator localIterator = this.eKn.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        o localo = (o)localEntry.getValue();
        o.a(localo, false);
        localEntry.setValue(localo);
      }
    }
  }

  public final void aA(long paramLong)
  {
    if (this.eKn.containsKey(Long.valueOf(paramLong)))
    {
      this.eKn.remove(Long.valueOf(paramLong));
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(paramLong);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "remove the device from map : %d", arrayOfObject2);
      return;
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "device id not contains in the map : %d", arrayOfObject1);
  }

  public final int aB(long paramLong)
  {
    if (this.eKn.containsKey(Long.valueOf(paramLong)))
      return ((o)this.eKn.get(Long.valueOf(paramLong))).cLJ;
    return 0;
  }

  public final o aC(long paramLong)
  {
    if (!this.eKn.containsKey(Long.valueOf(paramLong)))
      aJ(paramLong);
    return (o)this.eKn.get(Long.valueOf(paramLong));
  }

  public final boolean aD(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "setDeviceAuthFlag, device id = %d", arrayOfObject);
    o localo = aC(paramLong);
    if (localo == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "getExDeviceInfo failed!!!");
      return false;
    }
    o.a(localo, true);
    return true;
  }

  public final boolean aE(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "delDeviceAuthFlag, device id = %d", arrayOfObject);
    o localo = aC(paramLong);
    if (localo == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "getExDeviceInfo failed!!!");
      return false;
    }
    o.a(localo, false);
    return true;
  }

  public final boolean aF(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "delDeviceAuthFlag, device id = %d", arrayOfObject);
    o localo = aC(paramLong);
    if (localo == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnqJCvcyiFM7Uq8lBfjD8M8A==", "getExDeviceInfo failed!!!");
      return false;
    }
    return o.a(localo);
  }

  public final byte[] aG(long paramLong)
  {
    return h(paramLong, 1);
  }

  public final byte[] aH(long paramLong)
  {
    return h(paramLong, 2);
  }

  public final byte[] aI(long paramLong)
  {
    return h(paramLong, 2);
  }

  public final void e(long paramLong, byte[] paramArrayOfByte)
  {
    a(paramLong, paramArrayOfByte, 1);
  }

  public final void f(long paramLong, byte[] paramArrayOfByte)
  {
    a(paramLong, paramArrayOfByte, 2);
  }

  public final void g(long paramLong, byte[] paramArrayOfByte)
  {
    a(paramLong, paramArrayOfByte, 3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.n
 * JD-Core Version:    0.6.2
 */