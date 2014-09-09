package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.exdevice.b.ad;
import com.tencent.mm.plugin.exdevice.b.l;
import com.tencent.mm.plugin.exdevice.b.t;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;

public final class e extends ad
  implements m
{
  private af eIB;
  private d eKN;
  private com.tencent.mm.plugin.exdevice.a.c eKO = null;
  private a eKP;
  private int ejr;

  public e(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.eKO = new com.tencent.mm.plugin.exdevice.a.c(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.ejr = paramInt1;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    bg.qX().b(541, this);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = paramString;
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "onscen end, errType = %d, errCode = %d, errMsg = %s", arrayOfObject1);
    t localt = (t)paramx;
    com.tencent.mm.plugin.exdevice.e.b localb = com.tencent.mm.plugin.exdevice.b.z.Pp().lP(this.eKO.HW());
    if (localb == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      return;
    }
    long l = localb.kq();
    if (System.currentTimeMillis() / 1000L < l)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "device has been blocked");
      this.eKO.a(-5, "", new byte[0]);
      this.eKP = new a(this.eKO, this.eKN);
      boolean bool2 = this.eKP.c(this.eIB);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Boolean.valueOf(bool2);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "auth start task : %b", arrayOfObject3);
      return;
    }
    this.eKO.a(paramInt2, paramString, localt.Pj());
    this.eKP = new a(this.eKO, this.eKN);
    boolean bool1 = this.eKP.c(this.eIB);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Boolean.valueOf(bool1);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "auth start task : %b", arrayOfObject2);
  }

  public final boolean a(af paramaf, d paramd)
  {
    int i = -1;
    if ((-5 == this.ejr) || (-3 == this.ejr) || (-4 == this.ejr))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.ejr);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "Error Code = %d, reply errorcode to device and close channel", arrayOfObject1);
      this.eKO.a(i, "", new byte[0]);
      this.eKP = new a(this.eKO, paramd);
      boolean bool1 = this.eKP.c(paramaf);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(bool1);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "auth start task : %b", arrayOfObject2);
      return bool1;
    }
    com.tencent.mm.plugin.exdevice.e.b localb = com.tencent.mm.plugin.exdevice.b.z.Pp().lP(this.eKO.HW());
    if (localb == null)
    {
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = Long.valueOf(this.eKO.HW());
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "get device info failed : %d", arrayOfObject7);
      return false;
    }
    if (localb != null)
    {
      long l1 = localb.kq();
      if (System.currentTimeMillis() / 1000L < l1)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "device has been blocked");
        this.eKO.a(-5, "", new byte[0]);
        this.eKP = new a(this.eKO, paramd);
        boolean bool4 = this.eKP.c(paramaf);
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[0] = Boolean.valueOf(bool4);
        com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "auth start task : %b", arrayOfObject6);
        return bool4;
      }
      long l2 = localb.kr();
      int j = localb.ko();
      if ((l2 + j > 0L) && (l2 + j < System.currentTimeMillis() / 1000L))
      {
        byte[] arrayOfByte2 = an.PN().aG(this.eKO.HW());
        byte[] arrayOfByte3 = an.PN().aH(this.eKO.HW());
        Object[] arrayOfObject4 = new Object[2];
        int k;
        if (arrayOfByte2 == null)
        {
          k = i;
          arrayOfObject4[0] = Integer.valueOf(k);
          if (arrayOfByte3 != null)
            break label552;
        }
        while (true)
        {
          arrayOfObject4[1] = Integer.valueOf(i);
          com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "has not reach time out, just set back sessionkey, get auth buf from local, auth buf length = %d, session key buf lenght = %d", arrayOfObject4);
          if ((arrayOfByte2 == null) || (arrayOfByte3 == null))
            break label559;
          an.PN().aD(localb.field_mac);
          if (2 == an.PN().aB(localb.field_mac))
          {
            com.tencent.mm.plugin.exdevice.b.z.Ps();
            l.C(localb.field_brandName, 2);
          }
          this.eKO.a(0, "", an.PN().aG(this.eKO.HW()));
          this.eKP = new a(this.eKO, this.eKN);
          paramaf.setChannelSessionKey(localb.field_mac, arrayOfByte3);
          boolean bool3 = this.eKP.c(paramaf);
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = Boolean.valueOf(bool3);
          com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "auth start task : %b", arrayOfObject5);
          return bool3;
          k = arrayOfByte2.length;
          break;
          label552: i = arrayOfByte3.length;
        }
        label559: com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "has not reach time out, but local authbuf is null, do auth from server");
      }
    }
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "now do really auth from server");
    this.eIB = paramaf;
    this.eKN = paramd;
    com.tencent.mm.plugin.exdevice.c.a locala = (com.tencent.mm.plugin.exdevice.c.a)this.eKO.OQ();
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "Auth Request parse failed!!!, Tell device before stop this task");
      this.eKO.a(-4, "", new byte[0]);
      this.eKP = new a(this.eKO, paramd);
      boolean bool2 = this.eKP.c(paramaf);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Boolean.valueOf(bool2);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGgVMmysf7kCNEfsKWuQxq/9qdhianJErLQ==", "auth start task : %b", arrayOfObject3);
      return bool2;
    }
    byte[] arrayOfByte1 = null;
    if (locala != null)
    {
      com.tencent.mm.ao.b localb1 = locala.eJt;
      arrayOfByte1 = null;
      if (localb1 != null)
        arrayOfByte1 = locala.eJt.toByteArray();
    }
    bg.qX().a(541, this);
    t localt = new t(localb.field_brandName, localb.field_deviceType, localb.field_deviceID, locala.eJr, arrayOfByte1);
    bg.qX().d(localt);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.e
 * JD-Core Version:    0.6.2
 */