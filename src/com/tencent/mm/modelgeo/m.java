package com.tencent.mm.modelgeo;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.jr;
import com.tencent.mm.protocal.a.js;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m extends x
  implements ab
{
  private com.tencent.mm.o.m dlH;
  public final a dmI;
  private String dvK = "";

  public m(double paramDouble1, double paramDouble2)
  {
    b localb = new b();
    localb.a(new jr());
    localb.b(new js());
    localb.fi("/cgi-bin/micromsg-bin/getaddress");
    localb.de(655);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    jr localjr = (jr)this.dmI.sO();
    localjr.KL = paramDouble1;
    localjr.KM = paramDouble2;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvmIFh9H6wO6MjG7PJL6UK8U=", "onGYNetEnd errType %d errCode%d", arrayOfObject);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.dvK = ((js)((a)paramaj).sP()).iaF;
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvmIFh9H6wO6MjG7PJL6UK8U=", this.dvK);
      if (this.dlH != null)
        this.dlH.a(paramInt2, paramInt3, paramString, this);
    }
    while (this.dlH == null)
      return;
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 655;
  }

  public final Addr xo()
  {
    int i = 0;
    if (ch.jb(this.dvK))
      return null;
    Addr localAddr = new Addr();
    while (true)
    {
      try
      {
        JSONArray localJSONArray = new JSONObject(this.dvK).getJSONArray("results");
        localAddr.duW = localJSONArray.getJSONObject(1).getString("address_name");
        JSONObject localJSONObject1 = localJSONArray.getJSONObject(0);
        localAddr.duX = localJSONObject1.getString("p");
        localAddr.duY = localJSONObject1.getString("c");
        localAddr.dva = localJSONObject1.getString("d");
        localAddr.dvb = "";
        localAddr.dvc = "";
        localAddr.dvd = "";
        int j = localJSONArray.length();
        if (i < j)
        {
          try
          {
            JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
            String str = localJSONObject2.getString("dtype");
            if ("ST".equals(str))
              localAddr.dvc = localJSONObject2.getString("name");
            else if ("ST_NO".equals(str))
              localAddr.dvd = localJSONObject2.getString("name");
          }
          catch (Exception localException2)
          {
          }
        }
        else
        {
          if (!ch.jb(localAddr.dvd))
            localAddr.dvc = "";
          return localAddr;
        }
      }
      catch (Exception localException1)
      {
        return null;
      }
      i++;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.m
 * JD-Core Version:    0.6.2
 */