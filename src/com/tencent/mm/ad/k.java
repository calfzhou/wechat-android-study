package com.tencent.mm.ad;

import android.os.Looper;
import com.tencent.mm.a.c;
import com.tencent.mm.c.a.do;
import com.tencent.mm.c.a.gv;
import com.tencent.mm.c.a.gw;
import com.tencent.mm.c.a.jf;
import com.tencent.mm.c.a.mm;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.mq;
import com.tencent.mm.protocal.a.mr;
import com.tencent.mm.protocal.a.ud;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class k extends com.tencent.mm.o.x
  implements com.tencent.mm.network.ab, com.tencent.mm.o.ab
{
  private int cJN;
  private List dAv;
  private boolean dAw = false;
  private com.tencent.mm.o.m dlH;
  private com.tencent.mm.o.a dmI;

  public k(int paramInt)
  {
    this.cJN = paramInt;
    this.dAv = new ArrayList();
    this.dAw = false;
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "Init dkregcode:" + paramInt);
  }

  private l a(ud paramud)
  {
    l locall = new l();
    locall.setId(paramud.hWU);
    locall.setVersion(paramud.hWt);
    locall.setName(paramud.KH);
    locall.setSize(paramud.dZv);
    locall.hf(paramud.hWc);
    locall.setStatus(5);
    locall.ea(this.cJN);
    return locall;
  }

  private static void b(ud paramud)
  {
    do localdo = new do();
    localdo.cJI.cJJ = paramud;
    com.tencent.mm.sdk.c.a.aGB().g(localdo);
  }

  private void d(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty upload speex config list");
      return;
    }
    String str1 = s.yO().yL();
    int i = 0;
    label28: ud localud;
    l locall2;
    if (i < paramLinkedList.size())
    {
      localud = (ud)paramLinkedList.get(i);
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      if ((locall1 == null) || (locall1.getVersion() != localud.hWt))
      {
        c.deleteFile(str1 + s.yO().E(localud.hWU, this.cJN));
        locall2 = a(localud);
        locall2.db(-1);
        if (locall1 != null)
          break label351;
        s.yO().a(locall2);
      }
    }
    while (true)
    {
      j localj = new j(locall2.getId(), 9);
      bg.qX().d(localj);
      if (ai.a(localud.hPu) != null)
      {
        String str2 = new String(ai.a(localud.hPu));
        com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "xml:" + str2);
      }
      if (ai.a(localud.ipc) != null)
      {
        String str3 = new String(ai.a(localud.ipc));
        com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "xml2:" + str3);
      }
      com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "xml3:" + localud.toString());
      com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "xml4:" + localud.KH);
      com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "xml5:" + localud.hWc);
      i++;
      break label28;
      break;
      label351: s.yO().b(locall2);
    }
  }

  private void e(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty background pkg list");
      return;
    }
    String str1 = s.yO().yL();
    int i = 0;
    label28: ud localud;
    l locall2;
    if (i < paramLinkedList.size())
    {
      localud = (ud)paramLinkedList.get(i);
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      if ((locall1 == null) || (locall1.getVersion() != localud.hWt))
      {
        c.deleteFile(str1 + s.yO().E(localud.hWU, this.cJN));
        locall2 = a(localud);
        locall2.db(-1);
        if (locall1 != null)
          break label222;
        s.yO().a(locall2);
      }
    }
    while (true)
    {
      byte[] arrayOfByte = ai.a(localud.hPu);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
      {
        s.yO();
        String str2 = m.D(localud.hWU, this.cJN);
        c.deleteFile(str1 + str2);
        c.c(str1, str2, arrayOfByte);
      }
      i++;
      break label28;
      break;
      label222: s.yO().b(locall2);
    }
  }

  private void f(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty emoji pkg list");
      return;
    }
    int i = 0;
    label21: ud localud;
    l locall2;
    if (i < paramLinkedList.size())
    {
      localud = (ud)paramLinkedList.get(i);
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      locall2 = a(localud);
      locall2.db(-1);
      if (locall1 != null)
        break label126;
      s.yO().a(locall2);
    }
    while (true)
    {
      byte[] arrayOfByte = ai.a(localud.hPu);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        this.dAv.add(new String(arrayOfByte));
      i++;
      break label21;
      break;
      label126: s.yO().b(locall2);
    }
  }

  private void g(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty emoji pkg list");
    String str1;
    ud localud;
    l locall1;
    byte[] arrayOfByte;
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + paramLinkedList.size());
      str1 = s.yO().yL();
      for (int i = 0; i < paramLinkedList.size(); i++)
      {
        localud = (ud)paramLinkedList.get(i);
        locall1 = s.yO().C(localud.hWU, this.cJN);
        arrayOfByte = ai.a(localud.hPu);
        if (localud.hPu != null)
          break label119;
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "error give me a null thumb it should be xml");
      }
    }
    label119: String str2;
    String str3;
    label163: l locall2;
    if ((locall1 == null) || (locall1.getVersion() != localud.hWt))
    {
      str2 = new String(arrayOfByte);
      str3 = "zh_CN";
      if (str2.indexOf(str3) >= 0)
      {
        String str4 = str3 + "_ARTIST.mm";
        c.deleteFile(str1 + str4);
        c.deleteFile(str1 + str3 + "_ARTISTF.mm");
        c.c(str1, str4, arrayOfByte);
      }
    }
    else
    {
      locall2 = a(localud);
      locall2.db(-1);
      if (locall1 != null)
        break label381;
      s.yO().a(locall2);
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localud.KH + " - " + localud.hWU + " - " + localud.hWc + " - " + localud.dZv);
      break;
      str3 = "en";
      if (str2.indexOf(str3) >= 0)
        break label163;
      str3 = "zh_TW";
      if (str2.indexOf(str3) >= 0)
        break label163;
      str3 = "en";
      break label163;
      label381: s.yO().b(locall2);
    }
  }

  private void h(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty egg package");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "updateEggPackage pkgList size " + paramLinkedList.size());
    ud localud = (ud)paramLinkedList.get(0);
    if (localud == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "egg in pkgList is null");
      return;
    }
    String str1 = new String(ai.a(localud.hPu));
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "eggXml:" + str1);
    Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str1, "EasterEgg");
    if (localMap == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "Exception in parseXml EasterEgg, please check the xml");
      return;
    }
    l locall1 = s.yO().C(localud.hWU, this.cJN);
    l locall2 = a(localud);
    locall2.db(-1);
    f localf;
    if (locall1 == null)
    {
      s.yO().a(locall2);
      localf = new f();
      localf.dAq = he((String)localMap.get(".EasterEgg.$version"));
    }
    for (int i = 0; ; i++)
    {
      StringBuilder localStringBuilder1 = new StringBuilder(".EasterEgg.Item");
      Object localObject1;
      label225: d locald;
      int j;
      label475: StringBuilder localStringBuilder2;
      if (i == 0)
      {
        localObject1 = "";
        String str2 = localObject1;
        if (localMap.get(str2 + ".$name") == null)
          break label667;
        locald = new d();
        locald.name = hc((String)localMap.get(str2 + ".$name"));
        locald.dAk = hd((String)localMap.get(str2 + ".$reportType"));
        locald.dAj = hd((String)localMap.get(str2 + ".Emoji"));
        locald.dAl = ch.xq((String)localMap.get(str2 + ".$BeginDate"));
        locald.dAm = ch.xq((String)localMap.get(str2 + ".$EndDate"));
        j = 0;
        localStringBuilder2 = new StringBuilder().append(str2).append(".KeyWord");
        if (j != 0)
          break label640;
      }
      label640: for (Object localObject2 = ""; ; localObject2 = Integer.valueOf(j))
      {
        String str3 = localObject2;
        String str4 = str3 + ".$lang";
        if (localMap.get(str3) == null)
          break label650;
        e locale = new e();
        locale.dAn = hc((String)localMap.get(str3));
        locale.dAo = hc((String)localMap.get(str4));
        locald.dAi.add(locale);
        j++;
        break label475;
        s.yO().b(locall2);
        break;
        localObject1 = Integer.valueOf(i);
        break label225;
      }
      label650: localf.dAp.add(locald);
    }
    try
    {
      label667: byte[] arrayOfByte = localf.toByteArray();
      c.a(bg.qW().pt() + "eggingfo.ini", arrayOfByte, arrayOfByte.length);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "Exception in updateEggPackage, %s", arrayOfObject);
    }
  }

  private static String hc(String paramString)
  {
    if (paramString == null)
      paramString = "";
    return paramString;
  }

  private static int hd(String paramString)
  {
    try
    {
      int j = Integer.parseInt(paramString);
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      do
        int i = 0;
      while (paramString == null);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "parserInt error " + paramString);
    }
    return 0;
  }

  private static double he(String paramString)
  {
    double d1 = 0.0D;
    try
    {
      double d2 = Double.parseDouble(paramString);
      d1 = d2;
      return d1;
    }
    catch (Exception localException)
    {
      while (paramString == null);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "parserInt error " + paramString);
    }
    return d1;
  }

  private void i(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty config list");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + paramLinkedList.size());
    int i = 0;
    label46: ud localud;
    l locall2;
    if (i < paramLinkedList.size())
    {
      localud = (ud)paramLinkedList.get(i);
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      locall2 = a(localud);
      locall2.db(-1);
      if (locall1 != null)
        break label228;
      s.yO().a(locall2);
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localud.KH + " - " + localud.hWU + " - " + localud.hWc + " - " + localud.dZv);
      byte[] arrayOfByte = ai.a(localud.hPu);
      String str = new String(arrayOfByte);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "ConfigList xml : " + str);
      com.tencent.mm.f.e.os().d(localud.hWU, arrayOfByte);
      i++;
      break label46;
      break;
      label228: s.yO().b(locall2);
    }
  }

  private void j(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty bank logo pkg list");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + paramLinkedList.size());
    int i = 0;
    label46: l locall2;
    if (i < paramLinkedList.size())
    {
      ud localud = (ud)paramLinkedList.get(i);
      byte[] arrayOfByte = ai.a(localud.hPu);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
      {
        jf localjf = new jf();
        localjf.cNo.cNq = arrayOfByte;
        if (com.tencent.mm.sdk.c.a.aGB().g(localjf))
        {
          l locall1 = s.yO().C(localud.hWU, this.cJN);
          locall2 = a(localud);
          locall2.db(-1);
          if (locall1 != null)
            break label164;
          s.yO().a(locall2);
        }
      }
    }
    while (true)
    {
      i++;
      break label46;
      break;
      label164: s.yO().b(locall2);
    }
  }

  private void k(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty address pkg list");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + paramLinkedList.size());
    int i = 0;
    label46: l locall2;
    if (i < paramLinkedList.size())
    {
      ud localud = (ud)paramLinkedList.get(i);
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      locall2 = a(localud);
      locall2.db(-1);
      if (locall1 != null)
        break label137;
      s.yO().a(locall2);
    }
    while (true)
    {
      j localj = new j(locall2.getId(), 12);
      bg.qX().d(localj);
      i++;
      break label46;
      break;
      label137: s.yO().b(locall2);
    }
  }

  private void l(LinkedList paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "updateLangPkg");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty langage package list");
    while (true)
    {
      return;
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        ud localud = (ud)localIterator.next();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localud.toString();
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkg.toString %s", arrayOfObject);
        l locall1 = s.yO().C(localud.hWU, this.cJN);
        l locall2 = a(localud);
        locall2.db(-1);
        if (locall1 == null)
          s.yO().a(locall2);
        else
          s.yO().b(locall2);
      }
    }
  }

  private void m(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty regioncode pkg list");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + paramLinkedList.size());
    Iterator localIterator = paramLinkedList.iterator();
    label49: ud localud;
    l locall2;
    if (localIterator.hasNext())
    {
      localud = (ud)localIterator.next();
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      locall2 = a(localud);
      locall2.db(-1);
      if (locall1 != null)
        break label175;
      s.yO().a(locall2);
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localud.KH + " - " + localud.hWU + " - " + localud.hWc + " - " + localud.dZv);
      break label49;
      break;
      label175: s.yO().b(locall2);
    }
  }

  private void r(List paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "[oneliang]empty update expose scene list");
      return;
    }
    String str = s.yO().yL();
    int i = 0;
    label31: ud localud;
    l locall2;
    if (i < paramList.size())
    {
      localud = (ud)paramList.get(i);
      l locall1 = s.yO().C(localud.hWU, this.cJN);
      if ((locall1 == null) || (locall1.getVersion() != localud.hWt))
      {
        c.deleteFile(str + s.yO().E(localud.hWU, this.cJN));
        locall2 = a(localud);
        locall2.db(-1);
        if (locall1 != null)
          break label217;
        s.yO().a(locall2);
      }
    }
    while (true)
    {
      j localj = new j(locall2.getId(), 19);
      bg.qX().d(localj);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localud.KH;
      arrayOfObject[1] = localud.hWc;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "[oneliang]name:%s,packName:%s", arrayOfObject);
      i++;
      break label31;
      break;
      label217: s.yO().b(locall2);
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "DoScene dkregcode :" + this.cJN);
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new mq());
    localb.b(new mr());
    localb.fi("/cgi-bin/micromsg-bin/getpackagelist");
    localb.de(159);
    localb.df(51);
    localb.dg(1000000051);
    this.dmI = localb.sU();
    mq localmq = (mq)this.dmI.sO();
    LinkedList localLinkedList = new LinkedList();
    if (!bg.oE())
      return -1;
    l[] arrayOfl = s.yO().ed(this.cJN);
    if ((arrayOfl != null) && (arrayOfl.length > 0))
    {
      int i = 0;
      if (i < arrayOfl.length)
      {
        ud localud = new ud();
        localud.hWU = arrayOfl[i].getId();
        if ((ao.dVO) && (this.cJN == 7))
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "isShakeGetConfigList");
        for (localud.hWt = 0; ; localud.hWt = arrayOfl[i].getVersion())
        {
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(localud.hWU);
          arrayOfObject[1] = Integer.valueOf(localud.hWt);
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "package, id:%d, ver:%d", arrayOfObject);
          localLinkedList.add(localud);
          i++;
          break;
        }
      }
    }
    localmq.hQc = localLinkedList;
    localmq.huF = localLinkedList.size();
    localmq.ewb = this.cJN;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = Integer.valueOf(paramInt3);
    arrayOfObject1[3] = Integer.valueOf(this.cJN);
    arrayOfObject1[4] = paramString;
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "onGYNetEnd, netid:%d, errType:%d, errCode:%d, pkgType:%d, errMsg:%s", arrayOfObject1);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    mr localmr = (mr)((com.tencent.mm.o.a)paramaj).sP();
    if (localmr.ewb != this.cJN)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(localmr.ewb);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "packageType is not consistent, respType = %d", arrayOfObject3);
      this.dlH.a(3, -1, "", this);
      return;
    }
    LinkedList localLinkedList = localmr.hQc;
    StringBuilder localStringBuilder = new StringBuilder("summer list size:");
    int i;
    if (localLinkedList == null)
    {
      i = 0;
      label176: com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", i + " packageType: " + this.cJN + " resp.Type: " + localmr.ewb);
      if (this.cJN != 2)
        break label324;
      f(localLinkedList);
    }
    while (true)
    {
      mm localmm = new mm();
      localmm.cPh.cPi = localLinkedList;
      localmm.cPh.cJN = this.cJN;
      com.tencent.mm.sdk.c.a.aGB().g(localmm);
      if (localmr.hSL <= 0)
        break label1549;
      if (a(tp(), this.dlH) != -1)
        break;
      this.dlH.a(3, -1, "doScene failed", this);
      return;
      i = localLinkedList.size();
      break label176;
      label324: if (this.cJN == 1)
        e(localLinkedList);
      else if (this.cJN == 4)
        g(localLinkedList);
      else if (this.cJN == 6)
        h(localLinkedList);
      else if (this.cJN == 7)
        i(localLinkedList);
      else if (this.cJN == 8)
      {
        if ((localLinkedList == null) || (localLinkedList.size() <= 0))
        {
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty regioncode pkg list");
        }
        else
        {
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + localLinkedList.size());
          ud localud5 = (ud)localLinkedList.get(0);
          l locall10 = s.yO().C(localud5.hWU, this.cJN);
          l locall11 = a(localud5);
          locall11.db(-1);
          if (locall10 == null)
            s.yO().a(locall11);
          while (true)
          {
            com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localud5.KH + " - " + localud5.hWU + " - " + localud5.hWc + " - " + localud5.dZv);
            break;
            s.yO().b(locall11);
          }
        }
      }
      else if (this.cJN == 9)
        d(localLinkedList);
      else if (this.cJN == 10)
      {
        if ((localLinkedList == null) || (localLinkedList.size() <= 0))
        {
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "empty mass send top config package");
        }
        else
        {
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "pkgList size " + localLinkedList.size());
          ud localud4 = (ud)localLinkedList.get(0);
          l locall8 = s.yO().C(localud4.hWU, this.cJN);
          l locall9 = a(localud4);
          locall9.db(-1);
          if (locall8 == null)
            s.yO().a(locall9);
          else
            s.yO().b(locall9);
        }
      }
      else if (this.cJN == 11)
        j(localLinkedList);
      else if (this.cJN == 12)
        k(localLinkedList);
      else if (this.cJN == 5)
        l(localLinkedList);
      else if (this.cJN == 20)
        m(localLinkedList);
      else if (this.cJN == 17)
      {
        if ((localLinkedList == null) || (localLinkedList.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "poi type is null");
        }
        else
        {
          ud localud3 = (ud)localLinkedList.get(0);
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localud3.KH + " - " + localud3.hWU + " - " + localud3.hWc + " - " + localud3.dZv);
          l locall6 = s.yO().C(localud3.hWU, this.cJN);
          l locall7 = a(localud3);
          locall7.db(-1);
          gv localgv;
          if (locall6 == null)
          {
            s.yO().a(locall7);
            localgv = new gv();
          }
          try
          {
            localgv.cLL.content = ai.a(localud3.hPu);
            if (localgv.cLL.content == null)
              continue;
            com.tencent.mm.sdk.c.a.aGB().a(localgv, Looper.getMainLooper());
            continue;
            s.yO().b(locall7);
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localException.getMessage());
          }
        }
      }
      else if (this.cJN == 18)
      {
        if ((localLinkedList == null) || (localLinkedList.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "feature list type is null");
        }
        else
        {
          ud localud2 = (ud)localLinkedList.get(0);
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", localud2.KH + " - " + localud2.hWU + " - " + localud2.hWc + " - " + localud2.dZv + "-" + localud2.hWt);
          l locall3 = s.yO().C(localud2.hWU, this.cJN);
          if (locall3 != null)
          {
            if (locall3.getVersion() < localud2.hWt)
            {
              com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "Feature List New Version");
              l locall5 = a(localud2);
              s.yO().b(locall5);
              b(localud2);
            }
            else
            {
              com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "Feature List Old Version");
            }
          }
          else
          {
            com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "Feature List First Time Update");
            l locall4 = a(localud2);
            s.yO().a(locall4);
            b(localud2);
          }
        }
      }
      else if (this.cJN == 19)
        r(localLinkedList);
      else if (this.cJN == 21)
        if ((localLinkedList == null) || (localLinkedList.size() <= 0))
        {
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "summer trace config empty scene list");
        }
        else
        {
          ud localud1 = (ud)localLinkedList.get(0);
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "summer getpackage pkg: " + localud1 + "|id = " + localud1.hWU + "|Name = " + localud1.KH + "|PackName = " + localud1.hWc + "|Size = " + localud1.dZv + "|Version = " + localud1.hWt);
          l locall1 = s.yO().C(localud1.hWU, this.cJN);
          l locall2 = a(localud1);
          locall2.db(-1);
          if (locall1 == null)
          {
            s.yO().a(locall2);
          }
          else if (locall1.getVersion() < locall2.getVersion())
          {
            s.yO().b(locall2);
          }
          else
          {
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(locall1.getVersion());
            arrayOfObject2[1] = Integer.valueOf(locall2.getVersion());
            com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvohZ9CMvcrGBKZH2Z+bEQA8=", "summer old version [%d] new version[%d], not need update", arrayOfObject2);
          }
        }
    }
    label1549: this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  protected final boolean b(com.tencent.mm.o.x paramx)
  {
    if (!(paramx instanceof k));
    while (this.cJN != ((k)paramx).cJN)
      return true;
    return false;
  }

  public final int getType()
  {
    return 159;
  }

  protected final int sB()
  {
    return 20;
  }

  public final int tu()
  {
    return this.cJN;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.k
 * JD-Core Version:    0.6.2
 */