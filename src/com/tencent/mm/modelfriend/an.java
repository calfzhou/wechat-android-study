package com.tencent.mm.modelfriend;

import com.tencent.mm.as.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.f;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.hi;
import com.tencent.mm.protocal.a.me;
import com.tencent.mm.protocal.a.mf;
import com.tencent.mm.protocal.a.rf;
import com.tencent.mm.protocal.a.rg;
import com.tencent.mm.protocal.a.sc;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class an extends com.tencent.mm.o.x
  implements ab
{
  private m dlH = null;
  private com.tencent.mm.o.a dmI;
  private List dtA;
  private List duf;

  public an()
  {
    ww();
    me localme = (me)this.dmI.sO();
    localme.hVM = "";
    localme.icM = null;
    localme.icL = 0;
    localme.icK = null;
    localme.icJ = 0;
    localme.hWX = 0;
  }

  public an(List paramList1, List paramList2)
  {
    ww();
    if (((paramList1 == null) || (paramList1.size() == 0)) && ((paramList2 == null) || (paramList2.size() == 0)))
      return;
    this.dtA = paramList1;
    this.duf = paramList2;
    me localme = (me)this.dmI.sO();
    localme.hVM = "";
    localme.hWX = 2;
  }

  private static void a(i parami, rg paramrg)
  {
    parami.gb(paramrg.dte);
    parami.bj(paramrg.dtf);
    parami.bi(paramrg.Ks);
    parami.bj(paramrg.Kt);
    parami.bh(paramrg.dtg);
    parami.bo(paramrg.dth);
    parami.aR(paramrg.dti);
    parami.dp(paramrg.dtj);
    parami.gh(paramrg.dtl);
    parami.dq(paramrg.dtk);
    parami.gi(paramrg.dtm);
    parami.gc(paramrg.dtn);
    aan localaan = paramrg.ifU;
    if (localaan != null)
    {
      parami.dn(localaan.dto);
      parami.gd(localaan.dtp);
      parami.G(localaan.dtq);
    }
    ev localev = paramrg.ifV;
    if (localev != null)
    {
      parami.jdMethod_do(localev.dtr);
      parami.ge(localev.dts);
      parami.gf(localev.dtt);
      parami.gg(localev.dtu);
    }
  }

  private void ww()
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new me());
    localb.b(new mf());
    localb.fi("/cgi-bin/micromsg-bin/getmfriend");
    localb.de(142);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    me localme = (me)this.dmI.sO();
    if (localme.hWX == 2)
    {
      if (((this.dtA == null) || (this.dtA.size() == 0)) && ((this.duf == null) || (this.duf.size() == 0)))
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "doScene failed, mobile list and email list empty.");
        return -1;
      }
      if ((this.dtA != null) && (this.dtA.size() > 0))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.dtA.size());
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "doScene get mobile list size:%d", arrayOfObject2);
        LinkedList localLinkedList2 = new LinkedList();
        Iterator localIterator2 = this.dtA.iterator();
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          sc localsc = new sc();
          localsc.igM = str2;
          localLinkedList2.add(localsc);
        }
        localme.icK = localLinkedList2;
        localme.icJ = localLinkedList2.size();
      }
      if ((this.duf != null) && (this.duf.size() > 0))
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.duf.size());
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "doScene get email list size:%d", arrayOfObject1);
        LinkedList localLinkedList1 = new LinkedList();
        Iterator localIterator1 = this.duf.iterator();
        while (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          rf localrf = new rf();
          localrf.igM = str1;
          localLinkedList1.add(localrf);
        }
        localme.icM = localLinkedList1;
        localme.icL = localLinkedList1.size();
      }
    }
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    mf localmf = (mf)this.dmI.sP();
    me localme = (me)this.dmI.sO();
    if ((paramInt2 == 4) && (paramInt3 == -68))
    {
      this.dlH.a(paramInt2, paramInt3, localmf.hRz.hQx.getString(), this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    String str = ch.ja((String)bg.qW().oQ().get(65828));
    if ((localme.hWX == 1) && (!ch.jb(localmf.hVM)) && (!localmf.hVM.equals(str)))
    {
      bg.qW().oQ().set(65828, localmf.hVM);
      az.xa().vT();
    }
    if (localmf.hEV == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "onGYNetEnd  friendlist null");
      return;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localmf.hEV.size());
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "onGYNetEnd friend list size:%d", arrayOfObject);
    long l = bg.qW().oO().dc(Thread.currentThread().getId());
    int i = 0;
    if (i < localmf.hEV.size())
    {
      rg localrg = (rg)localmf.hEV.get(i);
      if (localrg == null)
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "Err getFriendList null");
      i locali;
      o localo;
      while (true)
      {
        i++;
        break;
        locali = az.wZ().gn(localrg.dte);
        if ((locali == null) && (localme.hWX != 1))
        {
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "Err MD5 not found is AddrUploadStg, nickName: " + localrg.igN + " md5: " + localrg.dte);
        }
        else
        {
          localo = new o();
          if (localme.hWX != 1)
            break label866;
          if (localrg.igO != null)
            break label445;
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "ERR: facebook friend return null info");
        }
      }
      label445: localo.j(localrg.igO.hWV);
      localo.dr(localrg.igO.hWW);
      c.eG(localrg.igO.hWV);
      localo.gp(localrg.igO.KH);
      localo.aR(localrg.dti);
      localo.bj(localrg.Kt);
      localo.bi(localrg.Ks);
      localo.bh(localrg.dtg);
      localo.bo(localrg.dth);
      localo.bj(localrg.dtf);
      localo.fX(localrg.igN);
      localo.fY(f.jw(localrg.igO.KH));
      localo.fZ(f.jv(localrg.igO.KH));
      localo.setUsername(localrg.hRk);
      label620: y localy = new y();
      localy.setUsername(localrg.hRk);
      localy.bi(localrg.Ks);
      localy.bj(localrg.Kt);
      localy.bh(localrg.dtg);
      localy.bj(localrg.dtf);
      localy.bo(localrg.dth);
      boolean bool1 = ch.jb(localrg.hRk);
      com.tencent.mm.storage.i locali1 = null;
      if (!bool1)
      {
        locali1 = bg.qW().oT().ys(localrg.hRk);
        if ((locali1 == null) || (!localrg.hRk.equals(locali1.getUsername())))
          break label888;
        if ((!ch.jb(localrg.dti)) && (!localrg.dti.equals(locali1.iS())))
        {
          locali1.aR(localrg.dti);
          bg.qW().oT().a(locali1.getUsername(), locali1);
        }
      }
      label798: boolean bool2;
      if (ch.jb(localrg.hRk))
        if (localme.hWX == 1)
        {
          bool2 = true;
          label821: Assert.assertTrue("mobile friend never go here", bool2);
          localo.setStatus(102);
        }
      while (true)
      {
        if (localme.hWX == 1)
          az.xa().a(localo);
        az.xb().a(localy);
        break;
        label866: if (!ch.jb(localrg.hRk))
          break label620;
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "username null for mobile");
        break;
        label888: locali1 = null;
        break label798;
        bool2 = false;
        break label821;
        if ((locali1 == null) || (!com.tencent.mm.g.a.cv(locali1.getType())))
        {
          localo.setStatus(100);
          if (locali != null)
          {
            com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "onGYNetEnd update status on, nick:" + localrg.igN + " realName:" + locali.vw() + "  MFriend:" + localrg.toString());
            locali.setStatus(1);
            locali.setUsername(localrg.hRk);
            locali.fX(localrg.igN);
            locali.fY(f.jw(localrg.igO.KH));
            locali.fZ(f.jv(localrg.igO.KH));
            a(locali, localrg);
            locali.db(-1);
            az.wZ().a(locali.vu(), locali);
            com.tencent.mm.n.x localx = new com.tencent.mm.n.x();
            localx.setUsername(localrg.hRk);
            localx.fe(localrg.hTy);
            localx.ff(localrg.hTz);
            localx.T(true);
            localx.bi(3);
            af.sJ().a(localx);
          }
        }
        else
        {
          localo.setStatus(101);
          if (locali != null)
          {
            com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvgkcsXdgVst9bxTjb+M9eAs=", "onGYNetEnd update status friend, nick:" + localrg.igN + "  md5:" + localrg.dte);
            locali.setStatus(2);
            locali.setUsername(localrg.hRk);
            locali.fX(localrg.igN);
            a(locali, localrg);
            locali.db(-1);
            az.wZ().a(locali.vu(), locali);
            c.k(localrg.hRk, 3);
          }
        }
      }
    }
    bg.qW().oO().dd(l);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 32;
  }

  public final void wx()
  {
    me localme = (me)this.dmI.sO();
    localme.hVM = ((String)bg.qW().oQ().get(65828));
    localme.hWX = 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.an
 * JD-Core Version:    0.6.2
 */