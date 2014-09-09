package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.plugin.exdevice.f.e;
import com.tencent.mm.plugin.exdevice.f.f;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.sdk.platformtools.z;

final class b
  implements Runnable
{
  private int eIe = -1;
  private int eIf = -1;
  private int eIg;
  private byte[] eIh = null;
  private long ejo = -1L;

  public b(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.ejo = paramLong;
    this.eIe = paramInt2;
    this.eIf = paramInt3;
    this.eIh = paramArrayOfByte;
    this.eIg = paramInt1;
  }

  public final void OK()
  {
    if ((this.ejo == -1L) || (this.eIe == -1) || (this.eIf == -1))
    {
      z.e("!44@/B4Tb64lLpL4QiK/M2lvTlpqua5C8YdETLRisD6yutQ=", "invalid arguments, do nothing");
      return;
    }
    switch (this.eIf)
    {
    default:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.eIf);
      z.e("!44@/B4Tb64lLpL4QiK/M2lvTlpqua5C8YdETLRisD6yutQ=", "unknown cmdId = %d, do nothing", arrayOfObject);
      return;
    case 10001:
      e locale = new e(this.eIg, this.ejo, this.eIe, this.eIf, this.eIh);
      an.PO().a(locale);
      return;
    case 10002:
      l.OR().b(this.eIg, this.ejo, this.eIe, this.eIf, this.eIh);
      return;
    case 10003:
    }
    f localf = new f(this.eIg, this.ejo, this.eIe, this.eIf, this.eIh);
    an.PO().a(localf);
  }

  public final void run()
  {
    OK();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.b
 * JD-Core Version:    0.6.2
 */