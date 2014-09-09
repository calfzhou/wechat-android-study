package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.aj;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.c;
import com.tencent.mm.o.d;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.protocal.a.agb;
import com.tencent.mm.protocal.a.i;
import com.tencent.mm.protocal.a.np;
import com.tencent.mm.protocal.a.nq;
import com.tencent.mm.protocal.a.om;
import com.tencent.mm.protocal.a.u;
import com.tencent.mm.protocal.a.vs;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class ao extends ac
{
  private LinkedList fbf;
  private LinkedList hvi;
  private LinkedList hvj;
  private LinkedList hvk;
  private int hvl;
  private om hvm;
  private u hvn;

  public ao(int paramInt1, int paramInt2, int paramInt3, String paramString, LinkedList paramLinkedList)
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "offset: " + paramInt2 + ", limit = " + paramInt3 + ", lang = " + paramString + "installedApp list size: " + paramLinkedList.size());
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "install id:[%s]", new Object[] { (String)localIterator.next() });
    this.hvl = paramInt1;
    b localb = new b();
    localb.a(new np());
    localb.b(new nq());
    localb.fi("/cgi-bin/micromsg-bin/getsuggestionapplist");
    localb.de(409);
    localb.df(0);
    localb.dg(0);
    this.eJc = localb.sU();
    np localnp = (np)this.eJc.sO();
    localnp.idF = paramInt1;
    localnp.idG = paramInt2;
    localnp.idH = paramInt3;
    localnp.hPf = paramString;
    LinkedList localLinkedList = T(paramLinkedList);
    localnp.idK = localLinkedList.size();
    localnp.idL = localLinkedList;
    this.hvi = new LinkedList();
    this.hvj = new LinkedList();
    this.hvk = new LinkedList();
    this.hvk.addAll(paramLinkedList);
  }

  private static LinkedList T(LinkedList paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList == null)
      return localLinkedList;
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!ch.jb(str))
        localLinkedList.add(ai.iU(str));
    }
    return localLinkedList;
  }

  private static void a(k paramk, agb paramagb)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = paramk.field_appId;
    z.v("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "dealYYBDownloadInfos, appId = %s", arrayOfObject1);
    if (paramagb != null)
    {
      paramk.ba(paramagb.iyw);
      paramk.aL(paramagb.hSa);
      paramk.aM(paramagb.iyx);
      paramk.aJ(paramagb.iyy);
      paramk.aK(paramagb.hTI);
      paramk.aN(paramagb.iyz);
      paramk.bb(paramagb.iyA);
      Object[] arrayOfObject2 = new Object[7];
      arrayOfObject2[0] = Integer.valueOf(paramagb.iyw);
      arrayOfObject2[1] = paramagb.hSa;
      arrayOfObject2[2] = paramagb.iyx;
      arrayOfObject2[3] = paramagb.iyy;
      arrayOfObject2[4] = paramagb.hTI;
      arrayOfObject2[5] = paramagb.iyz;
      arrayOfObject2[6] = Integer.valueOf(paramagb.iyA);
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", arrayOfObject2);
    }
  }

  private static void a(k paramk, i parami)
  {
    paramk.az(parami.hOq);
    paramk.aA(parami.hOr);
    paramk.aF(parami.hOs);
    paramk.aD(parami.hOv);
    paramk.field_appName = parami.hOt;
    paramk.field_appIconUrl = parami.hOu;
    paramk.aG(parami.hOx);
    paramk.aO(parami.hOz);
    a(paramk, parami.hOy);
  }

  private static void a(k paramk, vs paramvs)
  {
    paramk.aA(paramvs.hOr);
    paramk.field_appIconUrl = paramvs.hOu;
    paramk.ay(paramvs.iql);
    paramk.field_appName = paramvs.hOt;
    paramk.aC(paramvs.iqo);
    paramk.aD(paramvs.hOv);
    paramk.field_appType = paramvs.hPE;
    paramk.aF(paramvs.hOs);
    paramk.field_packageName = paramvs.hOw;
    paramk.aG(paramvs.hOx);
    if (!ch.jb(paramvs.hOx))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramvs.hOx;
      arrayOfObject[1] = Integer.valueOf(paramvs.iqv);
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "google play download url is : %s, download flag is %d", arrayOfObject);
      paramk.ba(paramvs.iqv);
    }
    paramk.aH(paramvs.iqs);
    paramk.aI(paramvs.iqt);
    a(paramk, paramvs.hOy);
    if ((!ch.jb(paramk.field_appType)) && (paramk.field_appType.startsWith("1")))
    {
      if (!paramk.field_appType.endsWith(","))
        paramk.field_appType += ",";
      paramk.field_appType = ("," + paramk.field_appType);
    }
  }

  private void a(o paramo, LinkedList paramLinkedList)
  {
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      if (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        k localk1 = l.F(locali.hsT, true);
        if (localk1 != null)
        {
          a(localk1, locali);
          paramo.a(localk1, new String[0]);
        }
        k localk2;
        for (Object localObject = localk1; ; localObject = localk2)
        {
          this.hvj.add(localObject);
          break;
          localk2 = new k();
          localk2.field_appId = locali.hsT;
          a(localk2, locali);
          paramo.b(localk2);
        }
      }
    }
  }

  private void b(o paramo, LinkedList paramLinkedList)
  {
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        vs localvs = (vs)localIterator.next();
        if (ch.jb(localvs.hsT))
        {
          z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "error appinfo, the appid is null");
        }
        else
        {
          boolean bool1 = true;
          boolean bool2 = false;
          k localk1 = l.F(localvs.hsT, true);
          label140: label160: boolean bool3;
          Object localObject;
          if (localk1 != null)
          {
            a(localk1, localvs);
            boolean bool7;
            boolean bool8;
            boolean bool6;
            if (this.hvl == 3)
            {
              localk1.field_status = 5;
              if ((ch.jb(localk1.iI())) || (ch.jb(localk1.iH())))
              {
                Object[] arrayOfObject4 = new Object[2];
                if (localk1.iI() != null)
                {
                  bool7 = true;
                  arrayOfObject4[0] = Boolean.valueOf(bool7);
                  if (localk1.iH() == null)
                    break label283;
                  bool8 = true;
                  arrayOfObject4[1] = Boolean.valueOf(bool8);
                  z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", arrayOfObject4);
                  bool3 = false;
                  bool6 = false;
                }
              }
            }
            while (true)
            {
              Object[] arrayOfObject3 = new Object[3];
              arrayOfObject3[0] = localvs.hsT;
              arrayOfObject3[1] = Boolean.valueOf(bool6);
              arrayOfObject3[2] = Boolean.valueOf(bool3);
              z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", arrayOfObject3);
              localObject = localk1;
              label232: if ((!bool3) || (this.hvk.contains(localvs.hsT)) || (this.hvi.contains(localObject)))
                break label481;
              this.hvi.add(localObject);
              break;
              bool7 = false;
              break label140;
              label283: bool8 = false;
              break label160;
              bool6 = paramo.a(localk1, new String[0]);
              bool3 = bool1;
            }
          }
          k localk2 = new k();
          localk2.field_appId = localvs.hsT;
          a(localk2, localvs);
          boolean bool4;
          label387: boolean bool5;
          if (this.hvl == 3)
          {
            localk2.field_status = 5;
            if ((ch.jb(localk2.iI())) || (ch.jb(localk2.iH())))
            {
              Object[] arrayOfObject2 = new Object[2];
              if (localk2.iI() != null)
              {
                bool4 = true;
                arrayOfObject2[0] = Boolean.valueOf(bool4);
                if (localk2.iH() == null)
                  break label489;
                bool5 = true;
                label407: arrayOfObject2[1] = Boolean.valueOf(bool5);
                z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", arrayOfObject2);
                bool1 = false;
              }
            }
          }
          while (true)
          {
            Object[] arrayOfObject1 = new Object[3];
            arrayOfObject1[0] = localvs.hsT;
            arrayOfObject1[1] = Boolean.valueOf(bool2);
            arrayOfObject1[2] = Boolean.valueOf(bool1);
            z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", arrayOfObject1);
            localObject = localk2;
            bool3 = bool1;
            break label232;
            label481: break;
            bool4 = false;
            break label387;
            label489: bool5 = false;
            break label407;
            bool2 = paramo.b(localk2);
          }
        }
      }
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
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", localException.getMessage());
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      return;
    }
    nq localnq = (nq)this.eJc.sP();
    if (localnq == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "resp == null");
      return;
    }
    int i = localnq.idM;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(this.hvl);
    z.v("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "suggestion app count = %s, appType = %s, ", arrayOfObject);
    o localo = g.axW().ayd();
    b(localo, localnq.idN);
    a(localo, localnq.idQ);
    this.fbf = localnq.idS;
    this.hvm = localnq.idV;
    this.hvn = localnq.idW;
  }

  public final void ac(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", "buf is null");
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
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvj7m8+vib/Mw3blTBa+iKdgt/FVKjRm8gw==", localException.getMessage());
    }
  }

  public final LinkedList ayQ()
  {
    return this.hvj;
  }

  public final LinkedList ayR()
  {
    return this.fbf;
  }

  public final om ayS()
  {
    return this.hvm;
  }

  public final int ayT()
  {
    return ((nq)this.eJc.sP()).idM;
  }

  public final LinkedList ayU()
  {
    return this.hvi;
  }

  public final u ayV()
  {
    return this.hvn;
  }

  public final int getType()
  {
    return 4;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ao
 * JD-Core Version:    0.6.2
 */