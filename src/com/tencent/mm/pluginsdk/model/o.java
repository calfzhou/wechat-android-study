package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.network.aj;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.c;
import com.tencent.mm.o.d;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.protocal.a.ob;
import com.tencent.mm.protocal.a.oc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class o extends ac
{
  public String geE;

  public o(String paramString, LinkedList paramLinkedList)
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvmwsOWshANM0oVZp6btVs4zJrREQqldaPg==", "appID: %s", new Object[] { paramString });
    this.geE = paramString;
    b localb = new b();
    localb.a(new ob());
    localb.b(new oc());
    localb.fi("/cgi-bin/micromsg-bin/getuserinfoinapp");
    localb.de(452);
    localb.df(0);
    localb.dg(0);
    this.eJc = localb.sU();
    ob localob = (ob)this.eJc.sO();
    localob.hsT = paramString;
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList != null)
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!ch.jb(str))
          localLinkedList.add(ai.iU(str));
      }
    }
    localob.hvf = localLinkedList;
    if (paramLinkedList == null);
    for (int i = 0; ; i = paramLinkedList.size())
    {
      localob.ibH = i;
      return;
    }
  }

  public final byte[] Ue()
  {
    try
    {
      byte[] arrayOfByte = ((c)this.eJc.tk()).sW();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvmwsOWshANM0oVZp6btVs4zJrREQqldaPg==", localException.getMessage());
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvmwsOWshANM0oVZp6btVs4zJrREQqldaPg==", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvmwsOWshANM0oVZp6btVs4zJrREQqldaPg==", "errType = " + paramInt2 + ", errCode = " + paramInt3);
  }

  public final void ac(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvmwsOWshANM0oVZp6btVs4zJrREQqldaPg==", "buf is null");
      return;
    }
    d locald = this.eJc.sQ();
    try
    {
      locald.r(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvmwsOWshANM0oVZp6btVs4zJrREQqldaPg==", localException.getMessage());
    }
  }

  public final oc ayt()
  {
    if (this.eJc == null)
      return null;
    return (oc)this.eJc.sP();
  }

  public final int getType()
  {
    return 14;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.o
 * JD-Core Version:    0.6.2
 */