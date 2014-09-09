package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.c.a.as;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.pluginsdk.model.app.a;
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
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
{
  private static final SimpleDateFormat hnI = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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

  private static String a(hs paramhs)
  {
    String str = paramhs.aLw();
    if (ch.jb(str))
      str = paramhs.acg();
    return y.dh(str);
  }

  private static boolean a(com.tencent.mm.c.a.ar paramar, com.tencent.mm.storage.ar paramar1)
  {
    if ((paramar == null) || (paramar1 == null))
    {
      z.w("!44@/B4Tb64lLpKYFtXtgZZWUK4VcPMjRhy1n3liRqSeHfA=", "fill favorite event fail, event or msg is null");
      if (paramar != null)
        paramar.cHU.type = com.tencent.mm.n.bHo;
      return false;
    }
    com.tencent.mm.storage.ar localar = com.tencent.mm.storage.ar.w(paramar1);
    if (localar.aJD())
    {
      hr localhr1 = new hr();
      localhr1.c(u(localar));
      hq localhq1 = new hq();
      localhq1.wK(String.valueOf(localar.kl()));
      localhq1.nA(1);
      if (!localar.aJM())
        localhq1.ws(localar.getContent());
      while (true)
      {
        localhq1.eb(true);
        localhq1.ea(true);
        localhq1.a(localhr1);
        localhq1.wN(a(localhr1.aLk()));
        localhq1.wO(b(localhr1.aLk()));
        paramar.cHU.cHW.hZx.add(localhq1);
        ja localja1 = paramar.cHU.cHX;
        localja1.hZI = (1 + localja1.hZI);
        return true;
        localhq1.ws(localar.getContent() + "\n\n" + localar.kw());
      }
    }
    if (localar.aJw())
    {
      hr localhr2 = new hr();
      localhr2.c(u(localar));
      hq localhq2 = new hq();
      localhq2.wK(String.valueOf(localar.kl()));
      String str2;
      label333: com.tencent.mm.modelvoice.b localb;
      if (y.dD(localar.kt()))
      {
        String str1 = localar.kp();
        str2 = o.a(bg.qW().pg(), "recbiz_", str1, ".rec", 2);
        if (ch.jb(str2))
        {
          str2 = null;
          localhq2.wG(str2);
          localhq2.nA(3);
          localhq2.eb(true);
          localb = bs.iw(localar.kp());
          if (localb != null)
            break label399;
        }
      }
      for (boolean bool1 = false; ; bool1 = true)
      {
        return bool1;
        new File(str2).exists();
        break;
        localhq2.wG(bs.gP(localar.kp()));
        break label333;
        label399: localhq2.wB(c.mg(localb.getFormat()));
        localhq2.nz((int)new bp(localar.getContent()).getTime());
        localhq2.a(localhr2);
        localhq2.wN(a(localhr2.aLk()));
        localhq2.wO(b(localhr2.aLk()));
        paramar.cHU.cHW.hZx.add(localhq2);
        ja localja2 = paramar.cHU.cHX;
        localja2.hZK = (1 + localja2.hZK);
      }
    }
    if (localar.aJC())
      return b(paramar, localar);
    if (localar.aJA())
    {
      boolean bool2 = localar.kk() < 0L;
      l locall = null;
      if (bool2)
        locall = ap.yg().T((int)localar.kk());
      if (((locall == null) || (locall.xM() <= 0L)) && (localar.kl() > 0L))
        locall = ap.yg().S(localar.kl());
      if (locall == null)
      {
        z.w("!44@/B4Tb64lLpKYFtXtgZZWUK4VcPMjRhy1n3liRqSeHfA=", "getImgDataPath: try get imgInfo fail");
        paramar.cHU.type = com.tencent.mm.n.bHr;
        return false;
      }
      hr localhr5 = new hr();
      localhr5.c(u(localar));
      hq localhq13 = new hq();
      localhq13.wK(String.valueOf(localar.kl()));
      localhq13.nA(2);
      localhq13.wG(ap.yg().f(com.tencent.mm.y.m.c(locall), "", ""));
      localhq13.wH(ap.yg().gS(localar.kp()));
      localhq13.a(localhr5);
      localhq13.wN(a(localhr5.aLk()));
      localhq13.wO(b(localhr5.aLk()));
      paramar.cHU.cHW.hZx.add(localhq13);
      ja localja13 = paramar.cHU.cHX;
      localja13.hZJ = (1 + localja13.hZJ);
      return true;
    }
    if ((localar.aJE()) || (localar.aNW()))
    {
      hr localhr3 = new hr();
      localhr3.c(u(localar));
      hq localhq3 = new hq();
      localhq3.wK(String.valueOf(localar.kl()));
      localhq3.wG(com.tencent.mm.ak.m.AL().ib(localar.kp()));
      localhq3.wH(com.tencent.mm.ak.m.AL().ic(localar.kp()));
      if (localar.aNW())
        localhq3.nA(15);
      q localq;
      while (true)
      {
        localq = com.tencent.mm.ak.v.ij(localar.kp());
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localq.sp());
        z.i("!44@/B4Tb64lLpKYFtXtgZZWUK4VcPMjRhy1n3liRqSeHfA=", "video length is %d", arrayOfObject);
        if (localq.sp() <= 26214400)
          break;
        paramar.cHU.type = com.tencent.mm.n.bIN;
        return false;
        localhq3.nA(4);
      }
      localhq3.nz(localq.AU());
      localhq3.a(localhr3);
      localhq3.wN(a(localhr3.aLk()));
      localhq3.wO(b(localhr3.aLk()));
      paramar.cHU.cHW.hZx.add(localhq3);
      ja localja3 = paramar.cHU.cHX;
      localja3.hZL = (1 + localja3.hZL);
      return true;
    }
    if (localar.aJv())
      return c(paramar, localar);
    if ((localar.aJu()) && (!localar.aJG()))
    {
      hr localhr4 = new hr();
      localhr4.c(u(localar));
      String str3 = localar.getContent();
      if (str3 == null)
      {
        paramar.cHU.type = com.tencent.mm.n.bHt;
        return false;
      }
      com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(str3);
      if (localb1 == null)
      {
        paramar.cHU.type = com.tencent.mm.n.bHt;
        return false;
      }
      localhr4.aLk().xd(localb1.appId);
      localhr4.aLk().xg(localb1.cNM);
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
      case 19:
      default:
        paramar.cHU.type = com.tencent.mm.n.bHs;
        return false;
      case 1:
        hq localhq12 = new hq();
        localhq12.wK(String.valueOf(localar.kl()));
        localhq12.nA(1);
        localhq12.ws(localb1.title);
        localhq12.eb(true);
        localhq12.ea(true);
        localhq12.a(localhr4);
        localhq12.wN(a(localhr4.aLk()));
        localhq12.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq12);
        ja localja12 = paramar.cHU.cHX;
        localja12.hZI = (1 + localja12.hZI);
        return true;
      case 2:
        if (!bg.qW().isSDCardAvailable())
        {
          paramar.cHU.type = com.tencent.mm.n.bHv;
          return false;
        }
        a locala2 = bf.GP().uU(localb1.dQY);
        hq localhq11 = new hq();
        localhq11.wK(String.valueOf(localar.kl()));
        if (locala2 != null)
          localhq11.wG(locala2.field_fileFullPath);
        String str5 = ap.yg().gS(localar.kp());
        if (com.tencent.mm.a.c.ac(str5))
          localhq11.wH(str5);
        localhq11.nA(2);
        localhq11.wr(localb1.title);
        localhq11.ws(localb1.description);
        localhq11.a(localhr4);
        localhq11.wN(a(localhr4.aLk()));
        localhq11.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq11);
        ja localja11 = paramar.cHU.cHX;
        localja11.hZJ = (1 + localja11.hZJ);
        return true;
      case 3:
        hq localhq10 = a(localar, localb1, 7);
        localhq10.a(localhr4);
        localhq10.wN(a(localhr4.aLk()));
        localhq10.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq10);
        ja localja10 = paramar.cHU.cHX;
        localja10.hZO = (1 + localja10.hZO);
        return true;
      case 4:
        hq localhq9 = a(localar, localb1, 4);
        localhq9.a(localhr4);
        localhq9.wN(a(localhr4.aLk()));
        localhq9.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq9);
        ja localja9 = paramar.cHU.cHX;
        localja9.hZL = (1 + localja9.hZL);
        return true;
      case 5:
        if ((localb1.url != null) && (!localb1.url.equals("")))
        {
          localhr4.aLk().xf(localb1.url);
          hq localhq8 = a(localar, localb1, 5);
          localhq8.a(localhr4);
          localhq8.wN(a(localhr4.aLk()));
          localhq8.wO(b(localhr4.aLk()));
          jb localjb = new jb();
          if (!ch.jb(localb1.title))
            localjb.As(localb1.title);
          if (!ch.jb(localb1.description))
            localjb.At(localb1.description);
          if (!ch.jb(localb1.thumburl))
            localjb.Av(localb1.thumburl);
          if (localjb.hD() > 0)
          {
            localjb.nH(1);
            localhr4.a(localjb);
          }
          paramar.cHU.cHW.hZx.add(localhq8);
          ja localja8 = paramar.cHU.cHX;
          localja8.hZM = (1 + localja8.hZM);
          return true;
        }
        paramar.cHU.type = com.tencent.mm.n.bHq;
        return false;
      case 6:
        if (!bg.qW().isSDCardAvailable())
        {
          paramar.cHU.type = com.tencent.mm.n.bHv;
          return false;
        }
        a locala1 = bf.GP().uU(localb1.dQY);
        hq localhq7 = new hq();
        if (locala1 != null)
        {
          localhq7.wG(locala1.field_fileFullPath);
          if (new File(locala1.field_fileFullPath).length() > 26214400L)
          {
            paramar.cHU.type = com.tencent.mm.n.bIN;
            return false;
          }
        }
        localhq7.wK(String.valueOf(localar.kl()));
        localhq7.nA(8);
        localhq7.wB(localb1.dQX);
        String str4 = ap.yg().gS(localar.kp());
        if (ch.jb(str4))
          localhq7.eb(true);
        if (com.tencent.mm.a.c.ac(str4))
          localhq7.wH(str4);
        localhq7.wr(localb1.title);
        localhq7.ws(localb1.description);
        localhq7.a(localhr4);
        localhq7.wN(a(localhr4.aLk()));
        localhq7.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq7);
        ja localja7 = paramar.cHU.cHX;
        localja7.hZP = (1 + localja7.hZP);
        return true;
      case 7:
        if ((localb1.dQY == null) || (localb1.dQY.length() == 0))
          paramar.cHU.type = com.tencent.mm.n.bHp;
        while (bg.qW().isSDCardAvailable())
        {
          paramar.cHU.type = com.tencent.mm.n.bHs;
          return false;
        }
        paramar.cHU.type = com.tencent.mm.n.bHv;
        return false;
      case 10:
        hx localhx2 = new hx();
        localhx2.xk(localb1.title);
        localhx2.xl(localb1.description);
        localhx2.nE(localb1.dRp);
        localhx2.xn(localb1.dRq);
        localhx2.xm(localb1.thumburl);
        localhr4.a(localhx2);
        hq localhq6 = new hq();
        localhq6.wK(String.valueOf(localar.kl()));
        localhq6.nA(10);
        localhq6.eb(true);
        localhq6.ea(true);
        localhq6.a(localhr4);
        localhq6.wN(a(localhr4.aLk()));
        localhq6.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq6);
        ja localja6 = paramar.cHU.cHX;
        localja6.hZR = (1 + localja6.hZR);
        return true;
      case 20:
        io localio = new io();
        localio.Ao(localb1.title);
        localio.Ap(localb1.description);
        localio.Ar(localb1.dRt);
        localio.Aq(localb1.thumburl);
        localhr4.a(localio);
        hq localhq5 = new hq();
        localhq5.wK(String.valueOf(localar.kl()));
        localhq5.nA(14);
        localhq5.eb(true);
        localhq5.ea(true);
        localhq5.a(localhr4);
        localhq5.wN(a(localhr4.aLk()));
        localhq5.wO(b(localhr4.aLk()));
        paramar.cHU.cHW.hZx.add(localhq5);
        ja localja5 = paramar.cHU.cHX;
        localja5.hZV = (1 + localja5.hZV);
        return true;
      case 13:
      }
      hx localhx1 = new hx();
      localhx1.xk(localb1.title);
      localhx1.xl(localb1.description);
      localhx1.nE(localb1.dRv);
      localhx1.xn(localb1.dRw);
      localhx1.xm(localb1.thumburl);
      localhr4.a(localhx1);
      hq localhq4 = new hq();
      localhq4.wK(String.valueOf(localar.kl()));
      localhq4.nA(11);
      localhq4.eb(true);
      localhq4.ea(true);
      localhq4.a(localhr4);
      localhq4.wN(a(localhr4.aLk()));
      localhq4.wO(b(localhr4.aLk()));
      paramar.cHU.cHW.hZx.add(localhq4);
      ja localja4 = paramar.cHU.cHX;
      localja4.hZS = (1 + localja4.hZS);
      return true;
    }
    paramar.cHU.type = com.tencent.mm.n.bHs;
    return false;
  }

  public static boolean a(com.tencent.mm.c.a.ar paramar, String paramString, List paramList)
  {
    int i = 1;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      z.w("!44@/B4Tb64lLpKYFtXtgZZWUK4VcPMjRhy1n3liRqSeHfA=", "fill favorite event fail, event or msgs is null");
      paramar.cHU.type = com.tencent.mm.n.bHo;
      return false;
    }
    if (paramList.size() == i)
    {
      com.tencent.mm.storage.ar localar = (com.tencent.mm.storage.ar)paramList.get(0);
      if (localar.aJv())
      {
        com.tencent.mm.ai.c localc = com.tencent.mm.ai.b.jd(localar.getContent());
        if ((localc.dRV != null) && (localc.dRV.size() == i))
          return c.a(paramar, localar);
        paramar.cHU.cHW = new hy();
        paramar.cHU.cHX = new ja();
        paramar.cHU.cHW.a(uP(paramString));
        paramar.cHU.type = 14;
        return a(paramar, localar);
      }
      return c.a(paramar, localar);
    }
    paramar.cHU.cHW = new hy();
    paramar.cHU.cHX = new ja();
    paramar.cHU.cHW.a(uP(paramString));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      if (!a(paramar, (com.tencent.mm.storage.ar)localIterator.next()))
        i = 0;
    paramar.cHU.type = 14;
    return i;
  }

  private static String b(hs paramhs)
  {
    return hnI.format(new Date(paramhs.kn()));
  }

  private static boolean b(com.tencent.mm.c.a.ar paramar, com.tencent.mm.storage.ar paramar1)
  {
    hr localhr = new hr();
    localhr.c(u(paramar1));
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
        localhr.a(localhv);
        hq localhq = new hq();
        localhq.wK(String.valueOf(paramar1.kl()));
        localhq.nA(6);
        localhq.eb(true);
        localhq.ea(true);
        localhq.a(localhr);
        localhq.wN(a(localhr.aLk()));
        localhq.wO(b(localhr.aLk()));
        paramar.cHU.cHW.hZx.add(localhq);
        ja localja = paramar.cHU.cHX;
        localja.hZN = (1 + localja.hZN);
        return true;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getStackTrace().toString();
        z.e("!44@/B4Tb64lLpKYFtXtgZZWUK4VcPMjRhy1n3liRqSeHfA=", "parse failed, %s", arrayOfObject);
      }
    paramar.cHU.type = com.tencent.mm.n.bHt;
    return false;
  }

  private static boolean c(com.tencent.mm.c.a.ar paramar, com.tencent.mm.storage.ar paramar1)
  {
    hr localhr = new hr();
    localhr.c(u(paramar1));
    while (true)
    {
      try
      {
        com.tencent.mm.ai.c localc = com.tencent.mm.ai.b.jd(paramar1.getContent());
        LinkedList localLinkedList = localc.dRV;
        localhr.aLk().xg(localc.cNM);
        if (localLinkedList != null)
        {
          Iterator localIterator = localLinkedList.iterator();
          int i = 0;
          if (!localIterator.hasNext())
            break label330;
          com.tencent.mm.ai.d locald = (com.tencent.mm.ai.d)localIterator.next();
          localhr.aLk().xf(locald.url);
          hq localhq = new hq();
          localhq.wr(locald.title);
          localhq.ws(locald.djA);
          localhq.wK(localhr.aLk().aLv());
          if (!ch.jb(locald.djy))
          {
            String str1 = locald.djy;
            int j = paramar1.getType();
            if (i != 0)
              break label332;
            str2 = "@T";
            localhq.wH(v.i(str1, j, str2));
            localhq.ea(true);
            localhq.nA(5);
            localhq.a(localhr);
            localhq.wN(a(localhr.aLk()));
            localhq.wO(b(localhr.aLk()));
            paramar.cHU.cHW.hZx.add(localhq);
            ja localja = paramar.cHU.cHX;
            localja.hZM = (1 + localja.hZM);
            i++;
            continue;
          }
          localhq.eb(true);
          continue;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getLocalizedMessage();
        z.e("!44@/B4Tb64lLpKYFtXtgZZWUK4VcPMjRhy1n3liRqSeHfA=", "retransmit app msg error : %s", arrayOfObject);
        paramar.cHU.type = com.tencent.mm.n.bHt;
        return false;
      }
      label330: return true;
      label332: String str2 = "@S";
    }
  }

  private static hs u(com.tencent.mm.storage.ar paramar)
  {
    hs localhs = new hs();
    if (paramar.jK() == 1)
    {
      localhs.wP(com.tencent.mm.model.x.pG());
      localhs.wV(paramar.kt());
      if (y.dc(paramar.kt()))
        localhs.wX(localhs.acg());
    }
    do
    {
      localhs.nC(1);
      localhs.cH(paramar.kn());
      localhs.wY(paramar.kl());
      if (paramar.kl() > 0L)
        localhs.wW(paramar.kl());
      return localhs;
      localhs.wP(paramar.kt());
      localhs.wV(com.tencent.mm.model.x.pG());
    }
    while (!y.dc(paramar.kt()));
    if (paramar.getContent() != null);
    for (String str = paramar.getContent().substring(0, Math.max(0, paramar.getContent().indexOf(':'))); ; str = "")
    {
      localhs.wX(str);
      if ((ch.jb(localhs.aLw())) || (paramar.aJw()))
        break;
      paramar.setContent(paramar.getContent().substring(1 + localhs.aLw().length()));
      if ((paramar.getContent().length() > 0) && ('\n' == paramar.getContent().charAt(0)))
        paramar.setContent(paramar.getContent().substring(1));
      if (!paramar.aJK())
        break;
      paramar.bN(paramar.kw().substring(1 + localhs.aLw().length()));
      if ((paramar.kw().length() <= 0) || ('\n' != paramar.kw().charAt(0)))
        break;
      paramar.bN(paramar.kw().substring(1));
      break;
    }
  }

  private static il uP(String paramString)
  {
    il localil = new il();
    localil.xL(paramString);
    localil.nG(1);
    localil.cL(ch.CM());
    localil.xO("");
    return localil;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.d
 * JD-Core Version:    0.6.2
 */