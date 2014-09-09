package com.tencent.mm.modelfriend;

import android.database.Cursor;
import com.tencent.mm.a.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.f;
import com.tencent.mm.protocal.a.nc;
import com.tencent.mm.protocal.a.nd;
import com.tencent.mm.protocal.a.vb;
import com.tencent.mm.protocal.a.vc;
import com.tencent.mm.protocal.a.vd;
import com.tencent.mm.protocal.a.ve;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ao extends com.tencent.mm.o.x
  implements ab
{
  private m dlH = null;
  private final com.tencent.mm.o.a dmI;

  public ao(int paramInt1, int paramInt2)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new nc());
    localb.b(new nd());
    localb.fi("/cgi-bin/micromsg-bin/getqqgroup");
    localb.de(143);
    localb.df(38);
    localb.dg(1000000038);
    this.dmI = localb.sU();
    nc localnc = (nc)this.dmI.sO();
    localnc.hWX = paramInt1;
    localnc.idn = paramInt2;
  }

  private static void a(ve paramve)
  {
    int i = 0;
    Cursor localCursor = az.xc().wN();
    HashMap localHashMap;
    vd localvd;
    av localav2;
    if (localCursor == null)
    {
      localHashMap = null;
      if (i >= paramve.huF)
        break label569;
      localvd = (vd)paramve.iqf.get(i);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "id:" + localvd.idn + " name:" + localvd.iab + " mem:" + localvd.hWF + " wei:" + localvd.iqe + " md5:" + localvd.hVM);
      if (localvd.idn >= 0)
        break label258;
      localav2 = null;
      label124: if (localav2 != null)
        break label320;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "Error Resp Group Info index:" + i);
    }
    label258: label320: 
    while (localav2.wI() == 0)
    {
      i++;
      break;
      if (localCursor.getCount() <= 0)
      {
        localCursor.close();
        i = 0;
        localHashMap = null;
        break;
      }
      localHashMap = new HashMap();
      for (int j = 0; j < localCursor.getCount(); j++)
      {
        localCursor.moveToPosition(j);
        av localav4 = new av();
        localav4.b(localCursor);
        localHashMap.put(Integer.valueOf(localav4.wH()), localav4);
      }
      localCursor.close();
      i = 0;
      break;
      localav2 = new av();
      localav2.dB(localvd.idn);
      localav2.gA(localvd.iab);
      localav2.dC(localvd.hWF);
      localav2.dD(localvd.iqe);
      localav2.gz(localvd.hVM);
      break label124;
    }
    if (localHashMap != null);
    for (av localav3 = (av)localHashMap.get(Integer.valueOf(localav2.wH())); ; localav3 = null)
    {
      if (localav3 == null)
      {
        localav2.dE((int)ch.CL());
        localav2.dF((int)ch.CL());
        localav2.dG(1);
        boolean bool4 = az.xc().a(localav2);
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "Insert name:" + localav2.wM() + " ret:" + bool4);
        break;
      }
      localav3.dG(-1);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", localav2.wL() + " " + localav3.wL() + " " + localav2.wH());
      if (localav3.wL().equals(localav2.wL()))
        break;
      localav2.dF((int)ch.CL());
      localav2.dG(1);
      localav2.db(-1);
      boolean bool3 = az.xc().b(localav2);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "Update name:" + localav2.wM() + " ret:" + bool3);
      break;
      label569: if (localHashMap != null)
      {
        Iterator localIterator = localHashMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          av localav1 = (av)localHashMap.get(localIterator.next());
          if (localav1.wK() == 0)
          {
            boolean bool1 = az.xc().dI(localav1.wH());
            com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "delete name:" + localav1.wM() + " ret:" + bool1);
            boolean bool2 = az.xe().dL(localav1.wH());
            com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "delete QQList name:" + localav1.wM() + " ret:" + bool2);
          }
        }
      }
      return;
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    nc localnc = (nc)this.dmI.sO();
    if (localnc.hWX == 1)
    {
      av localav = az.xc().dH(localnc.idn);
      if ((localav == null) || (localav.wK() == 0))
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "Err group not exist or group no need update.");
        return -1;
      }
    }
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    nc localnc = (nc)this.dmI.sO();
    nd localnd = (nd)this.dmI.sP();
    if (localnc.hWX == 0)
      a(localnd.ido);
    while (true)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = new ArrayList();
      int i = 0;
      while (i < localnd.idp.huF)
      {
        vb localvb = (vb)localnd.idp.iqd.get(i);
        int j = localnc.idn;
        com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "friend");
        ax localax3 = new ax();
        localax3.J(new k(localvb.ipZ).longValue());
        c.c(localax3.wP(), 3);
        localax3.dK(j);
        localax3.dJ(localvb.iqb);
        if (localvb.iqb != 0)
        {
          if ((localvb.gnq == null) || (localvb.gnq.equals("")))
          {
            localax3 = null;
            localArrayList1.add(localax3);
            y localy = new y();
            localy.bj(localvb.dtf);
            localy.bo(localvb.dth);
            localy.bi(localvb.Ks);
            localy.bj(localvb.Kt);
            localy.bh(localvb.dtg);
            localy.setUsername(localvb.gnq);
            localArrayList2.add(localy);
            com.tencent.mm.n.x localx = new com.tencent.mm.n.x();
            localx.bi(3);
            localx.T(true);
            localx.setUsername(localvb.gnq);
            localx.fe(localvb.hTy);
            localx.ff(localvb.hTz);
            localArrayList3.add(localx);
            i++;
          }
          else
          {
            i locali = bg.qW().oT().ys(localvb.gnq);
            if ((locali != null) && (locali.getUsername().equals(localvb.gnq)) && (com.tencent.mm.g.a.cv(locali.getType())))
              localax3.dJ(2);
          }
        }
        else
          while (true)
          {
            localax3.setUsername(localvb.gnq);
            localax3.aU(localvb.hwV);
            localax3.gE(localvb.iqc);
            localax3.gF(f.jw(localvb.iqc));
            localax3.gG(f.jv(localvb.iqc));
            localax3.aV(f.jw(localvb.hwV));
            localax3.aW(f.jv(localvb.hwV));
            localax3.gB(localvb.iqa);
            localax3.gC(f.jw(localvb.iqa));
            localax3.gD(f.jv(localvb.iqa));
            com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvuUm/HlJEjmIAxuN9at7xJw=", "QQ Friend nickname: " + localax3.wR() + "  remark: " + localax3.wU());
            break;
            localax3.dJ(1);
          }
      }
      HashMap localHashMap = new HashMap();
      Cursor localCursor = az.xe().dM(localnc.idn);
      while (localCursor.moveToNext())
      {
        ax localax1 = new ax();
        localax1.b(localCursor);
        localHashMap.put(Long.valueOf(localax1.wP()), localax1);
      }
      localCursor.close();
      Iterator localIterator1 = localArrayList1.iterator();
      while (localIterator1.hasNext())
      {
        ax localax2 = (ax)localIterator1.next();
        if (localHashMap.containsKey(Long.valueOf(localax2.wP())))
        {
          if (!((ax)localHashMap.get(Long.valueOf(localax2.wP()))).a(localax2))
          {
            az.xe().a(localax2.wP(), localax2);
            localHashMap.remove(Long.valueOf(localax2.wP()));
          }
        }
        else
          az.xe().b(localax2);
      }
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        long l = ((Long)localIterator2.next()).longValue();
        az.xe().L(l);
      }
      az.xb().g(localArrayList2);
      af.sJ().g(localArrayList3);
      av localav = new av();
      localav.dB(localnc.idn);
      localav.dG(0);
      localav.dF((int)ch.CL());
      localav.db(48);
      az.xc().b(localav);
    }
  }

  public final int getType()
  {
    return 143;
  }

  public final int wy()
  {
    return ((nc)this.dmI.sO()).hWX;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ao
 * JD-Core Version:    0.6.2
 */