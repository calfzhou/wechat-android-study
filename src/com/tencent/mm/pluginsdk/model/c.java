package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.ai.d;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.if;
import com.tencent.mm.c.a.ih;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.protocal.a.hq;
import com.tencent.mm.protocal.a.hr;
import com.tencent.mm.protocal.a.hs;
import com.tencent.mm.protocal.a.hv;
import com.tencent.mm.protocal.a.hx;
import com.tencent.mm.protocal.a.hy;
import com.tencent.mm.protocal.a.il;
import com.tencent.mm.protocal.a.io;
import com.tencent.mm.protocal.a.ja;
import com.tencent.mm.protocal.a.jb;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static hq a(hq paramhq, int paramInt)
  {
    hq localhq = g(paramhq);
    localhq.nA(paramInt);
    if ((paramhq.aLh() != null) && (paramhq.aLh().aLn() != null))
    {
      hx localhx = new hx();
      localhx.xk(paramhq.aLh().aLn().getTitle());
      localhx.xl(paramhq.aLh().aLn().getDesc());
      localhx.nE(paramhq.aLh().aLn().getType());
      localhx.xn(paramhq.aLh().aLn().getInfo());
      localhx.xm(paramhq.aLh().aLn().aLF());
      localhq.aLh().a(localhx);
    }
    return localhq;
  }

  private static hq a(com.tencent.mm.storage.ar paramar, com.tencent.mm.ai.b paramb, int paramInt)
  {
    hq localhq = new hq();
    localhq.wK(String.valueOf(paramar.kl()));
    localhq.wy(paramb.dRl);
    localhq.wz(paramb.dRm);
    localhq.wx(paramb.url);
    localhq.ea(true);
    File localFile = new File(ch.Y(ap.yg().gS(paramar.kp()), ""));
    if (localFile.exists())
      localhq.wH(localFile.getAbsolutePath());
    while (true)
    {
      localhq.wr(paramb.title);
      localhq.ws(paramb.description);
      localhq.nA(paramInt);
      return localhq;
      localhq.eb(true);
    }
  }

  private static void a(hq paramhq1, hq paramhq2)
  {
    paramhq1.wy(paramhq2.aHR());
    paramhq1.wz(paramhq2.aHS());
    paramhq1.wx(paramhq2.aHF());
    paramhq1.wr(paramhq2.getTitle());
    paramhq1.ws(paramhq2.getDesc());
  }

  public static boolean a(com.tencent.mm.c.a.ar paramar, int paramInt, String paramString)
  {
    if (ch.jb(paramString))
    {
      z.w("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "fill favorite event fail, event is null or image path is empty");
      paramar.cHU.type = com.tencent.mm.n.bHo;
      return false;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramInt);
    z.i("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "do fill event info(fav simple image), path %s sourceType %d", arrayOfObject);
    hy localhy = new hy();
    il localil = new il();
    hq localhq = new hq();
    localhq.nA(2);
    localhq.wG(paramString);
    localhq.eb(true);
    localil.xL(com.tencent.mm.model.x.pG());
    localil.xM(com.tencent.mm.model.x.pG());
    localil.nG(paramInt);
    localil.cL(ch.CM());
    localhy.a(localil);
    localhy.hZx.add(localhq);
    paramar.cHU.title = localhq.getTitle();
    paramar.cHU.cHW = localhy;
    paramar.cHU.type = 2;
    return true;
  }

  public static boolean a(com.tencent.mm.c.a.ar paramar, long paramLong)
  {
    return a(paramar, bg.qW().oV().cV(paramLong));
  }

  private static boolean a(com.tencent.mm.c.a.ar paramar, com.tencent.mm.ai.b paramb, hy paramhy, long paramLong)
  {
    if localif1 = new if();
    localif1.cMG.type = 0;
    localif1.cMG.cMI = paramb.dRu;
    com.tencent.mm.sdk.c.a.aGB().g(localif1);
    com.tencent.mm.protocal.b.a.a locala = localif1.cMH.cMN;
    if (locala == null)
    {
      z.w("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "fill favorite event fail, parse record msg null");
      paramar.cHU.type = com.tencent.mm.n.bHt;
      return false;
    }
    paramhy.xJ(locala.title);
    Iterator localIterator = locala.dRV.iterator();
    while (localIterator.hasNext())
    {
      hq localhq1 = (hq)localIterator.next();
      switch (localhq1.getDataType())
      {
      case 9:
      case 13:
      default:
        break;
      case 1:
        LinkedList localLinkedList9 = paramhy.hZx;
        hq localhq10 = g(localhq1);
        localhq10.nA(1);
        localhq10.ws(localhq1.getDesc());
        localLinkedList9.add(localhq10);
        ja localja11 = paramar.cHU.cHX;
        localja11.hZI = (1 + localja11.hZI);
        break;
      case 3:
        LinkedList localLinkedList8 = paramhy.hZx;
        hq localhq9 = g(localhq1);
        localhq9.nA(3);
        localLinkedList8.add(localhq9);
        ja localja10 = paramar.cHU.cHX;
        localja10.hZK = (1 + localja10.hZK);
        break;
      case 2:
        LinkedList localLinkedList7 = paramhy.hZx;
        hq localhq8 = g(localhq1);
        localhq8.nA(2);
        if localif6 = new if();
        localif6.cMG.type = 1;
        localif6.cMG.cMJ = localhq1;
        localif6.cMG.cDM = paramLong;
        com.tencent.mm.sdk.c.a.aGB().g(localif6);
        if ((ch.jb(localif6.cMH.dDL)) && (ch.jb(localif6.cMH.cEF)))
          z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "cloneImgItem:not record plugin ? get paths error");
        localhq8.wG(localif6.cMH.dDL);
        localhq8.wH(localif6.cMH.cEF);
        localhq8.eb(false);
        localhq8.ea(false);
        localLinkedList7.add(localhq8);
        ja localja9 = paramar.cHU.cHX;
        localja9.hZJ = (1 + localja9.hZJ);
        break;
      case 5:
        LinkedList localLinkedList6 = paramhy.hZx;
        hq localhq7 = g(localhq1);
        a(localhq7, localhq1);
        localhq7.nA(5);
        if localif5 = new if();
        localif5.cMG.type = 1;
        localif5.cMG.cMJ = localhq1;
        localif5.cMG.cDM = paramLong;
        com.tencent.mm.sdk.c.a.aGB().g(localif5);
        if ((ch.jb(localif5.cMH.dDL)) && (ch.jb(localif5.cMH.cEF)))
          z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "cloneUrlItem:not record plugin ? get paths error");
        localhq7.wH(localif5.cMH.cEF);
        if ((localhq1.aLh() != null) && (localhq1.aLh().aLm() != null))
        {
          jb localjb = new jb();
          localjb.As(localhq1.aLh().aLm().getTitle());
          localjb.At(localhq1.aLh().aLm().getDesc());
          localjb.Av(localhq1.aLh().aLm().aLF());
          localjb.nH(localhq1.aLh().aLm().aLJ());
          localjb.Au(localhq1.aLh().aLm().aLI());
          localhq7.aLh().a(localjb);
        }
        localLinkedList6.add(localhq7);
        ja localja8 = paramar.cHU.cHX;
        localja8.hZM = (1 + localja8.hZM);
        break;
      case 4:
      case 15:
        LinkedList localLinkedList5 = paramhy.hZx;
        hq localhq6 = g(localhq1);
        a(localhq6, localhq1);
        if (localhq1.getDataType() == 15)
          localhq6.nA(15);
        while (true)
        {
          if localif4 = new if();
          localif4.cMG.type = 1;
          localif4.cMG.cMJ = localhq1;
          localif4.cMG.cDM = paramLong;
          com.tencent.mm.sdk.c.a.aGB().g(localif4);
          if ((ch.jb(localif4.cMH.dDL)) && (ch.jb(localif4.cMH.cEF)))
            z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "cloneVideoItem:not record plugin ? get paths error");
          if (localif4.cMH.cMO)
          {
            localhq6.ea(false);
            localhq6.wG(localif4.cMH.dDL);
          }
          if (localif4.cMH.cMP)
          {
            localhq6.wH(localif4.cMH.cEF);
            localhq6.eb(false);
          }
          localhq6.nz(localhq1.getDuration());
          localLinkedList5.add(localhq6);
          ja localja7 = paramar.cHU.cHX;
          localja7.hZL = (1 + localja7.hZL);
          break;
          localhq6.nA(4);
        }
      case 6:
        LinkedList localLinkedList4 = paramhy.hZx;
        hq localhq5 = g(localhq1);
        localhq5.nA(6);
        if ((localhq1.aLh() != null) && (localhq1.aLh().aLl() != null))
        {
          hv localhv = new hv();
          localhv.xh(localhq1.aLh().aLl().getLabel());
          localhv.f(localhq1.aLh().aLl().aLD());
          localhv.e(localhq1.aLh().aLl().aLC());
          localhv.nD(localhq1.aLh().aLl().aEX());
          localhv.xj(localhq1.aLh().aLl().aLE());
          localhq5.aLh().a(localhv);
        }
        localLinkedList4.add(localhq5);
        ja localja6 = paramar.cHU.cHX;
        localja6.hZN = (1 + localja6.hZN);
        break;
      case 7:
        LinkedList localLinkedList3 = paramhy.hZx;
        hq localhq4 = g(localhq1);
        a(localhq4, localhq1);
        localhq4.nA(7);
        if localif3 = new if();
        localif3.cMG.type = 1;
        localif3.cMG.cMJ = localhq1;
        localif3.cMG.cDM = paramLong;
        com.tencent.mm.sdk.c.a.aGB().g(localif3);
        if ((ch.jb(localif3.cMH.dDL)) && (ch.jb(localif3.cMH.cEF)))
          z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "cloneMusicItem:not record plugin ? get paths error");
        localhq4.wH(localif3.cMH.cEF);
        localLinkedList3.add(localhq4);
        ja localja5 = paramar.cHU.cHX;
        localja5.hZO = (1 + localja5.hZO);
        break;
      case 8:
        LinkedList localLinkedList2 = paramhy.hZx;
        hq localhq3 = g(localhq1);
        a(localhq3, localhq1);
        localhq3.nA(8);
        if localif2 = new if();
        localif2.cMG.type = 1;
        localif2.cMG.cMJ = localhq1;
        localif2.cMG.cDM = paramLong;
        com.tencent.mm.sdk.c.a.aGB().g(localif2);
        if ((ch.jb(localif2.cMH.dDL)) && (ch.jb(localif2.cMH.cEF)))
          z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "cloneFileItem:not record plugin ? get paths error");
        localhq3.wG(localif2.cMH.dDL);
        localhq3.wH(localif2.cMH.cEF);
        localhq3.ea(false);
        localhq3.wB(localhq1.aHU());
        localLinkedList2.add(localhq3);
        ja localja4 = paramar.cHU.cHX;
        localja4.hZP = (1 + localja4.hZP);
        break;
      case 10:
        paramhy.hZx.add(a(localhq1, localhq1.getDataType()));
        ja localja3 = paramar.cHU.cHX;
        localja3.hZR = (1 + localja3.hZR);
        break;
      case 11:
        paramhy.hZx.add(a(localhq1, localhq1.getDataType()));
        ja localja2 = paramar.cHU.cHX;
        localja2.hZS = (1 + localja2.hZS);
        break;
      case 12:
      case 14:
        LinkedList localLinkedList1 = paramhy.hZx;
        hq localhq2 = g(localhq1);
        localhq2.nA(14);
        if ((localhq1.aLh() != null) && (localhq1.aLh().aLo() != null))
        {
          io localio = new io();
          localio.Ao(localhq1.aLh().aLo().getTitle());
          localio.Ap(localhq1.aLh().aLo().getDesc());
          localio.Ar(localhq1.aLh().aLo().getInfo());
          localio.Aq(localhq1.aLh().aLo().aLF());
          localhq2.aLh().a(localio);
        }
        localLinkedList1.add(localhq2);
        ja localja1 = paramar.cHU.cHX;
        localja1.hZV = (1 + localja1.hZV);
      }
    }
    paramar.cHU.type = 14;
    return true;
  }

  public static boolean a(com.tencent.mm.c.a.ar paramar, com.tencent.mm.storage.ar paramar1)
  {
    if ((paramar == null) || (paramar1 == null))
    {
      z.w("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "fill favorite event fail, event or msg is null");
      if (paramar != null)
        paramar.cHU.type = com.tencent.mm.n.bHo;
      return false;
    }
    com.tencent.mm.storage.ar localar = com.tencent.mm.storage.ar.w(paramar1);
    boolean bool1;
    if (localar.aJD())
    {
      hy localhy1 = new hy();
      localhy1.a(t(localar));
      paramar.cHU.cHW = localhy1;
      if (!localar.aJM())
      {
        paramar.cHU.desc = localar.getContent();
        paramar.cHU.type = 1;
        bool1 = true;
      }
    }
    while (true)
    {
      paramar.cHU.cHY = localar.getContent();
      return bool1;
      paramar.cHU.desc = (localar.getContent() + "\n\n" + localar.kw());
      break;
      if (localar.aJw())
      {
        hy localhy2 = new hy();
        localhy2.a(t(localar));
        hq localhq1 = new hq();
        localhq1.wK(String.valueOf(localar.kl()));
        String str2;
        label247: label255: com.tencent.mm.modelvoice.b localb;
        if (y.dD(localar.kt()))
        {
          String str1 = localar.kp();
          str2 = o.a(bg.qW().pg(), "recbiz_", str1, ".rec", 2);
          if (ch.jb(str2))
          {
            str2 = null;
            localhq1.wG(str2);
            localhq1.nA(3);
            localhq1.eb(true);
            localb = bs.iw(localar.kp());
            if (localb != null)
              break label325;
          }
        }
        for (boolean bool2 = false; ; bool2 = true)
        {
          bool1 = bool2;
          break;
          new File(str2).exists();
          break label247;
          localhq1.wG(bs.gP(localar.kp()));
          break label255;
          label325: localhq1.wB(mg(localb.getFormat()));
          localhq1.nz((int)new bp(localar.getContent()).getTime());
          LinkedList localLinkedList1 = new LinkedList();
          localLinkedList1.add(localhq1);
          localhy2.U(localLinkedList1);
          paramar.cHU.cHW = localhy2;
          paramar.cHU.type = 3;
        }
      }
      if (localar.aJC())
      {
        bool1 = b(paramar, localar);
      }
      else if (localar.aJA())
      {
        boolean bool3 = localar.kk() < 0L;
        l locall = null;
        if (bool3)
          locall = ap.yg().T(localar.kk());
        if (((locall == null) || (locall.xM() <= 0L)) && (localar.kl() > 0L))
          locall = ap.yg().S(localar.kl());
        if (locall == null)
        {
          z.w("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "getImgDataPath: try get imgInfo fail");
          paramar.cHU.type = com.tencent.mm.n.bHr;
          bool1 = false;
        }
        else
        {
          hy localhy5 = new hy();
          localhy5.a(t(localar));
          hq localhq8 = new hq();
          localhq8.wK(String.valueOf(localar.kl()));
          localhq8.nA(2);
          localhq8.wG(ap.yg().f(com.tencent.mm.y.m.c(locall), "", ""));
          localhq8.wH(ap.yg().gS(localar.kp()));
          LinkedList localLinkedList3 = new LinkedList();
          localLinkedList3.add(localhq8);
          localhy5.U(localLinkedList3);
          paramar.cHU.cHW = localhy5;
          paramar.cHU.type = 2;
          bool1 = true;
        }
      }
      else
      {
        if ((localar.aJE()) || (localar.aNW()))
        {
          hy localhy3 = new hy();
          localhy3.a(t(localar));
          hq localhq2 = new hq();
          localhq2.wK(String.valueOf(localar.kl()));
          localhq2.wG(com.tencent.mm.ak.m.AL().ib(localar.kp()));
          localhq2.wH(com.tencent.mm.ak.m.AL().ic(localar.kp()));
          if (localar.aNW())
            localhq2.nA(15);
          q localq;
          while (true)
          {
            localq = com.tencent.mm.ak.v.ij(localar.kp());
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(localq.sp());
            z.i("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "video length is %d", arrayOfObject);
            if (localq.sp() <= 26214400)
              break label836;
            paramar.cHU.type = com.tencent.mm.n.bIN;
            bool1 = false;
            break;
            localhq2.nA(4);
          }
          label836: localhq2.nz(localq.AU());
          LinkedList localLinkedList2 = new LinkedList();
          localLinkedList2.add(localhq2);
          localhy3.U(localLinkedList2);
          paramar.cHU.cHW = localhy3;
          if (localar.aNW());
          for (paramar.cHU.type = 16; ; paramar.cHU.type = 4)
          {
            bool1 = true;
            break;
          }
        }
        if (localar.aJv())
        {
          bool1 = c(paramar, localar);
        }
        else
        {
          hy localhy4;
          com.tencent.mm.ai.b localb1;
          if ((localar.aJu()) && (!localar.aJG()))
          {
            localhy4 = new hy();
            localhy4.a(t(localar));
            String str3 = localar.getContent();
            if (str3 == null)
            {
              paramar.cHU.type = com.tencent.mm.n.bHt;
              bool1 = false;
            }
            else
            {
              localb1 = com.tencent.mm.ai.b.iS(str3);
              if (localb1 == null)
              {
                paramar.cHU.type = com.tencent.mm.n.bHt;
                bool1 = false;
              }
              else
              {
                paramar.cHU.cHW = localhy4;
                il localil = localhy4.aLG();
                localil.Al(localb1.appId);
                localil.An(localb1.cNM);
              }
            }
          }
          else
          {
            switch (localb1.type)
            {
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
              paramar.cHU.type = com.tencent.mm.n.bHs;
              bool1 = false;
              break;
            case 1:
              paramar.cHU.cHW = localhy4;
              paramar.cHU.desc = localb1.title;
              paramar.cHU.type = 1;
              bool1 = true;
              break;
            case 2:
              if (!bg.qW().isSDCardAvailable())
              {
                paramar.cHU.type = com.tencent.mm.n.bHv;
                bool1 = false;
              }
              else
              {
                com.tencent.mm.pluginsdk.model.app.a locala2 = bf.GP().uU(localb1.dQY);
                hq localhq7 = new hq();
                localhq7.wK(String.valueOf(localar.kl()));
                if (locala2 != null)
                  localhq7.wG(locala2.field_fileFullPath);
                String str5 = ap.yg().gS(localar.kp());
                if (com.tencent.mm.a.c.ac(str5))
                  localhq7.wH(str5);
                localhq7.nA(2);
                localhq7.wr(localb1.title);
                localhq7.ws(localb1.description);
                localhy4.hZx.add(localhq7);
                paramar.cHU.type = 2;
                bool1 = true;
              }
              break;
            case 3:
              hq localhq6 = a(localar, localb1, 7);
              localhy4.hZx.add(localhq6);
              paramar.cHU.type = 7;
              bool1 = true;
              break;
            case 4:
              hq localhq5 = a(localar, localb1, 4);
              localhy4.xJ(localhq5.getTitle());
              localhy4.xK(localhq5.getDesc());
              localhy4.hZx.add(localhq5);
              paramar.cHU.type = 4;
              bool1 = true;
              break;
            case 5:
              if ((localb1.url != null) && (!localb1.url.equals("")))
              {
                localhy4.aLG().Am(localb1.url);
                hq localhq4 = a(localar, localb1, 5);
                localhy4.hZx.add(localhq4);
                localhy4.xJ(localhq4.getTitle());
                localhy4.xK(localhq4.getDesc());
                paramar.cHU.type = 5;
                bool1 = true;
              }
              else
              {
                paramar.cHU.type = com.tencent.mm.n.bHq;
                bool1 = false;
              }
              break;
            case 6:
              if (!bg.qW().isSDCardAvailable())
              {
                paramar.cHU.type = com.tencent.mm.n.bHv;
                bool1 = false;
              }
              else
              {
                com.tencent.mm.pluginsdk.model.app.a locala1 = bf.GP().uU(localb1.dQY);
                hq localhq3 = new hq();
                if (locala1 != null)
                {
                  localhq3.wG(locala1.field_fileFullPath);
                  if (new File(locala1.field_fileFullPath).length() > 26214400L)
                  {
                    paramar.cHU.type = com.tencent.mm.n.bIN;
                    bool1 = false;
                  }
                }
                else
                {
                  localhq3.wK(String.valueOf(localar.kl()));
                  localhq3.nA(8);
                  localhq3.wB(localb1.dQX);
                  String str4 = ap.yg().gS(localar.kp());
                  if (ch.jb(str4))
                    localhq3.eb(true);
                  if (com.tencent.mm.a.c.ac(str4))
                    localhq3.wH(str4);
                  localhq3.wr(localb1.title);
                  localhq3.ws(localb1.description);
                  localhy4.hZx.add(localhq3);
                  paramar.cHU.desc = localb1.title;
                  paramar.cHU.type = 8;
                  bool1 = true;
                }
              }
              break;
            case 7:
              if ((localb1.dQY == null) || (localb1.dQY.length() == 0))
                paramar.cHU.type = com.tencent.mm.n.bHp;
              while (bg.qW().isSDCardAvailable())
              {
                paramar.cHU.type = com.tencent.mm.n.bHs;
                bool1 = false;
                break;
              }
              paramar.cHU.type = com.tencent.mm.n.bHv;
              bool1 = false;
              break;
            case 10:
              hx localhx2 = new hx();
              localhx2.xk(localb1.title);
              localhx2.xl(localb1.description);
              localhx2.nE(localb1.dRp);
              localhx2.xn(localb1.dRq);
              localhx2.xm(localb1.thumburl);
              paramar.cHU.title = localb1.title;
              paramar.cHU.desc = localb1.description;
              paramar.cHU.type = 10;
              localhy4.b(localhx2);
              bool1 = true;
              break;
            case 20:
              io localio = new io();
              localio.Ao(localb1.title);
              localio.Ap(localb1.description);
              localio.Ar(localb1.dRt);
              localio.Aq(localb1.thumburl);
              paramar.cHU.title = localb1.title;
              paramar.cHU.desc = localb1.description;
              paramar.cHU.type = 15;
              localhy4.b(localio);
              bool1 = true;
              break;
            case 13:
              hx localhx1 = new hx();
              localhx1.xk(localb1.title);
              localhx1.xl(localb1.description);
              localhx1.nE(localb1.dRv);
              localhx1.xn(localb1.dRw);
              localhx1.xm(localb1.thumburl);
              paramar.cHU.title = localb1.title;
              paramar.cHU.desc = localb1.description;
              paramar.cHU.type = 11;
              localhy4.b(localhx1);
              bool1 = true;
              break;
            case 19:
              paramar.cHU.cHX = new ja();
              bool1 = a(paramar, localb1, localhy4, localar.kk());
              continue;
              paramar.cHU.type = com.tencent.mm.n.bHs;
              bool1 = false;
            }
          }
        }
      }
    }
  }

  private static boolean b(com.tencent.mm.c.a.ar paramar, com.tencent.mm.storage.ar paramar1)
  {
    hy localhy = new hy();
    localhy.a(t(paramar1));
    Map localMap = com.tencent.mm.sdk.platformtools.x.bB(paramar1.getContent(), "msg");
    if (localMap != null)
      try
      {
        hv localhv = new hv();
        localhv.xh((String)localMap.get(".msg.location.$label"));
        localhv.f(Double.parseDouble((String)localMap.get(".msg.location.$x")));
        localhv.e(Double.parseDouble((String)localMap.get(".msg.location.$y")));
        localhv.nD(Integer.valueOf((String)localMap.get(".msg.location.$scale")).intValue());
        localhv.xj((String)localMap.get(".msg.location.$poiname"));
        localhy.b(localhv);
        paramar.cHU.type = 6;
        paramar.cHU.cHW = localhy;
        return true;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getStackTrace().toString();
        z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "parse failed, %s", arrayOfObject);
      }
    paramar.cHU.type = com.tencent.mm.n.bHt;
    return false;
  }

  private static boolean c(com.tencent.mm.c.a.ar paramar, com.tencent.mm.storage.ar paramar1)
  {
    hy localhy = new hy();
    il localil = t(paramar1);
    localhy.a(localil);
    while (true)
    {
      try
      {
        com.tencent.mm.ai.c localc = com.tencent.mm.ai.b.jd(paramar1.getContent());
        LinkedList localLinkedList = localc.dRV;
        localil.An(localc.cNM);
        if ((localLinkedList != null) && (localLinkedList.size() > paramar.cHU.cHZ))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(paramar.cHU.cHZ);
          z.i("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "favorite biz msg, index is %d", arrayOfObject2);
          d locald = (d)localLinkedList.get(paramar.cHU.cHZ);
          localil.Am(locald.url);
          if (paramar.cHU.cHZ > 0)
            localil.xO("");
          hq localhq = new hq();
          localhq.wr(locald.title);
          localhq.ws(locald.djA);
          localhq.wK(localil.aLH());
          if (!ch.jb(locald.djy))
          {
            String str1 = locald.djy;
            int i = paramar1.getType();
            if (paramar.cHU.cHZ <= 0)
              break label341;
            str2 = "@S";
            localhq.wH(v.i(str1, i, str2));
            localhq.ea(true);
            localhq.nA(5);
            localhy.hZx.add(localhq);
            paramar.cHU.cHW = localhy;
            paramar.cHU.desc = locald.title;
            paramar.cHU.type = 5;
            return true;
          }
          localhq.eb(true);
          continue;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getLocalizedMessage();
        z.e("!44@/B4Tb64lLpIMW2SMTebo7pCgcd6Nit3va959GFVdKPo=", "retransmit app msg error : %s", arrayOfObject1);
        paramar.cHU.type = com.tencent.mm.n.bHt;
        return false;
      }
      label341: String str2 = "@T";
    }
  }

  private static hq g(hq paramhq)
  {
    hq localhq = new hq();
    hr localhr = new hr();
    hs localhs = new hs();
    localhs.wP(com.tencent.mm.model.x.pG());
    localhs.wV(com.tencent.mm.model.x.pG());
    localhs.nC(1);
    localhs.cH(ch.CM());
    localhr.c(localhs);
    localhq.a(localhr);
    localhq.wN(paramhq.aLi());
    localhq.wO(paramhq.aLj());
    localhq.eb(true);
    localhq.ea(true);
    return localhq;
  }

  public static String mg(int paramInt)
  {
    if (paramInt == 1)
      return "speex";
    if (paramInt == 4)
      return "silk";
    return "amr";
  }

  private static il t(com.tencent.mm.storage.ar paramar)
  {
    il localil = new il();
    if (paramar.jK() == 1)
    {
      localil.xL(com.tencent.mm.model.x.pG());
      localil.xM(paramar.kt());
      if (y.dc(paramar.kt()))
        localil.Ai(localil.acg());
    }
    do
    {
      localil.nG(1);
      localil.cL(paramar.kn());
      localil.Aj(paramar.kl());
      if (paramar.kl() > 0L)
        localil.xO(paramar.kl());
      return localil;
      localil.xL(paramar.kt());
      localil.xM(com.tencent.mm.model.x.pG());
    }
    while (!y.dc(paramar.kt()));
    if (paramar.getContent() != null);
    for (String str = paramar.getContent().substring(0, Math.max(0, paramar.getContent().indexOf(':'))); ; str = "")
    {
      localil.Ai(str);
      if ((ch.jb(localil.aLw())) || (paramar.aJw()))
        break;
      paramar.setContent(paramar.getContent().substring(1 + localil.aLw().length()));
      if ((paramar.getContent().length() > 0) && ('\n' == paramar.getContent().charAt(0)))
        paramar.setContent(paramar.getContent().substring(1));
      if (!paramar.aJK())
        break;
      paramar.bN(paramar.kw().substring(1 + localil.aLw().length()));
      if ((paramar.kw().length() <= 0) || ('\n' != paramar.kw().charAt(0)))
        break;
      paramar.bN(paramar.kw().substring(1));
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.c
 * JD-Core Version:    0.6.2
 */