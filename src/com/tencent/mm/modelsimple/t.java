package com.tencent.mm.modelsimple;

import com.tencent.mm.a.j;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.q;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;
import junit.framework.Assert;

public final class t extends com.tencent.mm.o.x
  implements ab
{
  private byte[] content;
  private String dCB = "";
  private m dlH;
  private aj dpk;

  public t(q paramq)
  {
    y localy = (y)paramq;
    this.dCB = localy.zj();
    this.content = localy.zk();
  }

  public t(List paramList, byte[] paramArrayOfByte)
  {
    if ((paramList.size() > 0) && (paramArrayOfByte != null));
    int m;
    Object localObject;
    int k;
    for (int j = i; ; k = 0)
    {
      Assert.assertTrue(j);
      m = (int)(System.currentTimeMillis() / 1000L);
      String str;
      for (localObject = (String)paramList.get(0); i < paramList.size(); localObject = str)
      {
        str = (String)localObject + "," + ((String)paramList.get(i)).trim();
        i++;
      }
    }
    this.dpk = new u();
    com.tencent.mm.protocal.x localx = (com.tencent.mm.protocal.x)this.dpk.tk();
    localx.nv(111);
    localx.aHa();
    localx.nw(m);
    localx.wq((String)localObject);
    localx.aP(paramArrayOfByte);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvkASPLG9hDDydmb3CTe3k6g=", "NetSceneDirectSend: cmdId=111" + " seq=" + m);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvkASPLG9hDDydmb3CTe3k6g=", "NetSceneDirectSend: lstReceiver=" + (String)localObject + " status = " + j.b(paramArrayOfByte, 0));
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 10;
  }

  public final String zj()
  {
    return this.dCB;
  }

  public final byte[] zk()
  {
    return this.content;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.t
 * JD-Core Version:    0.6.2
 */