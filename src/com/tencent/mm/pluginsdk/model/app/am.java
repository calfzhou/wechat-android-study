package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.aj;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.c;
import com.tencent.mm.o.d;
import com.tencent.mm.protocal.a.ad;
import com.tencent.mm.protocal.a.jz;
import com.tencent.mm.protocal.a.ka;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class am extends ac
{
  private List hvh;

  public am(List paramList)
  {
    b localb = new b();
    localb.a(new jz());
    localb.b(new ka());
    localb.fi("/cgi-bin/micromsg-bin/getappsetting");
    localb.de(395);
    localb.df(0);
    localb.dg(0);
    this.eJc = localb.sU();
    this.hvh = paramList;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "<init>, appIdList size = " + paramList.size());
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str != null) && (str.length() > 0))
      {
        ad localad = new ad();
        localad.hsT = str;
        localLinkedList.add(localad);
      }
    }
    if (localLinkedList.size() == 0)
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "doScene fail, reqList is empty");
    jz localjz = (jz)this.eJc.sO();
    localjz.iaN = localLinkedList;
    localjz.iaM = localLinkedList.size();
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
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "toProtBuf error: " + localException.getMessage());
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
    while (true)
    {
      return;
      ka localka = (ka)this.eJc.sP();
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "onGYNetEnd, resp appCount = " + localka.iaM);
      LinkedList localLinkedList = localka.iaO;
      if ((localLinkedList == null) || (localLinkedList.size() == 0))
      {
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "onGYNetEnd, settingList is empty");
        return;
      }
      o localo = bf.GO();
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.protocal.a.ac localac = (com.tencent.mm.protocal.a.ac)localIterator.next();
        k localk = l.F(localac.hsT, false);
        if (localk != null)
        {
          localk.field_authFlag = localac.hPy;
          localk.field_openId = localac.hPz;
          boolean bool = localo.a(localk, new String[0]);
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "onGYNetEnd, update ret = " + bool + ", appId = " + localac.hsT);
        }
      }
    }
  }

  public final void ac(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "buf is null");
      return;
    }
    try
    {
      this.eJc.sQ().r(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvqCbadAkYDJ5+v+Qdt4xnOs=", "bufToResp error: " + localException.getMessage());
    }
  }

  public final List ayP()
  {
    return this.hvh;
  }

  public final int getType()
  {
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.am
 * JD-Core Version:    0.6.2
 */