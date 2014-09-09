package com.tencent.mm.ab;

import android.database.Cursor;
import com.tencent.mm.model.ba;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.w;
import com.tencent.mm.model.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.sa;
import com.tencent.mm.protocal.a.sb;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.xw;
import com.tencent.mm.protocal.a.xx;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public final class h extends com.tencent.mm.o.x
  implements ab
{
  private static final List dzp = new ArrayList();
  private long cDM;
  private m dlH;
  private a dmI;
  private final List dzq = new LinkedList();
  private ar dzr = null;

  public h()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ch.aHN();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "dktext :%s", arrayOfObject);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "empty msg sender created");
  }

  public h(long paramLong)
  {
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "resend msg , local id = " + paramLong);
    this.cDM = paramLong;
    this.dzr = bg.qW().oV().cV(paramLong);
    if (this.dzr == null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "resend msg , msg is null localid:%d", arrayOfObject);
    }
  }

  public h(String paramString1, String paramString2, int paramInt)
  {
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = ch.aHN();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "dktext :%s", arrayOfObject);
    if (!ap.jb(paramString1))
    {
      ar localar = new ar();
      localar.setStatus(i);
      localar.bJ(paramString1);
      localar.q(bw.eo(paramString1));
      localar.bv(i);
      localar.setContent(paramString2);
      localar.setType(paramInt);
      this.cDM = bg.qW().oV().y(localar);
      if (this.cDM == -1L)
        break label159;
    }
    while (true)
    {
      Assert.assertTrue(i);
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "new msg inserted to db , local id = " + this.cDM);
      return;
      label159: int j = 0;
    }
  }

  public static void a(ba paramba)
  {
    dzp.remove(paramba);
  }

  private static void a(sa paramsa)
  {
    if ((paramsa.ewb != 1) || (!y.dc(paramsa.hOQ.getString())) || (!paramsa.fxG.contains("@")));
    long l1;
    List localList;
    do
    {
      return;
      l1 = System.currentTimeMillis();
      localList = v.cU(paramsa.hOQ.getString());
    }
    while ((localList == null) || (localList.size() == 0));
    LinkedList localLinkedList = new LinkedList();
    String str1 = paramsa.fxG;
    int k;
    for (int i = 0; i < str1.length(); i = k + 1)
    {
      k = str1.indexOf("@", i);
      if (k == -1)
        break;
      localLinkedList.add(str1.substring(k + 1, Math.min(k + 40, str1.length())));
    }
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "after split @ :%s", new Object[] { localLinkedList });
    long l2 = System.currentTimeMillis();
    HashMap localHashMap1 = new HashMap();
    Cursor localCursor = bg.qW().oT().aL(localList);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      while (!localCursor.isAfterLast())
      {
        i locali = new i();
        locali.b(localCursor);
        Iterator localIterator4 = localLinkedList.iterator();
        while (localIterator4.hasNext())
        {
          String str7 = (String)localIterator4.next();
          if (str7.length() != 0)
            if ((!ap.jb(locali.iV())) && (str7.startsWith(locali.iV())))
              localHashMap1.put(locali.getUsername(), locali.getUsername());
            else if ((!ap.jb(locali.ja())) && (str7.startsWith(locali.ja())))
              localHashMap1.put(locali.getUsername(), locali.getUsername());
            else if ((!ap.jb(locali.iS())) && (str7.startsWith(locali.iS())))
              localHashMap1.put(locali.getUsername(), locali.getUsername());
            else if ((!ap.jb(locali.getUsername())) && (str7.startsWith(locali.getUsername())))
              localHashMap1.put(locali.getUsername(), locali.getUsername());
        }
        localCursor.moveToNext();
      }
      localCursor.close();
    }
    long l3 = System.currentTimeMillis();
    HashMap localHashMap2 = new HashMap();
    v.b(paramsa.hOQ.getString(), localHashMap2);
    Iterator localIterator1 = localHashMap2.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str4 = (String)localIterator1.next();
      Iterator localIterator3 = localLinkedList.iterator();
      while (localIterator3.hasNext())
      {
        String str5 = (String)localIterator3.next();
        if (str5.length() != 0)
        {
          String str6 = (String)localHashMap2.get(str4);
          if ((!ap.jb(str6)) && (str5.startsWith(str6)))
            localHashMap1.put(str4, str4);
        }
      }
    }
    StringBuilder localStringBuilder;
    if (localHashMap1.values().size() > 0)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("<msgsource><atuserlist><![CDATA[");
      Iterator localIterator2 = localHashMap1.keySet().iterator();
      for (int j = 0; localIterator2.hasNext(); j = 1)
      {
        String str3 = (String)localIterator2.next();
        if (j != 0)
          localStringBuilder.append(",");
        localStringBuilder.append(str3);
      }
      localStringBuilder.append("]]></atuserlist>");
      if ((!ap.jb(paramsa.hOW)) && (paramsa.hOW.startsWith("<msgsource>")))
        break label851;
    }
    label851: for (String str2 = "<msgsource></msgsource>"; ; str2 = paramsa.hOW)
    {
      paramsa.hOW = str2;
      paramsa.hOW = paramsa.hOW.replace("<msgsource>", localStringBuilder.toString());
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramsa.hOW;
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "send text msg with MsgSrouce: %s", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l1);
      arrayOfObject2[1] = Long.valueOf(l3 - l2);
      arrayOfObject2[2] = Long.valueOf(l2 - l1);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "format msgsource time:%d, %d, %d", arrayOfObject2);
      return;
    }
  }

  private void dY(int paramInt)
  {
    ar localar = (ar)this.dzq.get(paramInt);
    localar.setStatus(5);
    bg.qW().oV().a(localar.kk(), localar);
    Iterator localIterator = dzp.iterator();
    while (localIterator.hasNext())
    {
      ba localba = (ba)localIterator.next();
      String str = localar.kt();
      localar.getContent();
      localba.ee(str);
    }
  }

  private void yw()
  {
    for (int i = 0; i < this.dzq.size(); i++)
      dY(i);
  }

  protected final int a(aj paramaj)
  {
    if (this.dzq.size() > 0)
      return aa.doM;
    return aa.doN;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new xw());
    localb.b(new xx());
    localb.fi("/cgi-bin/micromsg-bin/newsendmsg");
    localb.de(522);
    localb.df(237);
    localb.dg(1000000237);
    this.dmI = localb.sU();
    xw localxw = (xw)this.dmI.sO();
    Object localObject;
    int j;
    if (this.dzr == null)
    {
      localObject = bg.qW().oV().aKo();
      if (((List)localObject).size() != 0)
        break label239;
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "no sending message");
      j = -2;
    }
    label239: 
    do
    {
      return j;
      if (this.dzr.getStatus() != 5)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Long.valueOf(this.dzr.kk());
        arrayOfObject2[1] = Integer.valueOf(this.dzr.getStatus());
        z.w("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "msg:%d status:%d should not be resend !", arrayOfObject2);
      }
      this.dzr.setStatus(1);
      bg.qW().oV().a(this.cDM, this.dzr);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(this.dzr);
      this.dzr = null;
      localObject = localArrayList;
      break;
      this.dzq.clear();
      for (int i = 0; i < ((List)localObject).size(); i++)
      {
        ar localar = (ar)((List)localObject).get(i);
        if (localar.jK() == 1)
        {
          sa localsa = new sa();
          localsa.hOQ = new vt().wF(localar.kt());
          localsa.hOV = ((int)(localar.kn() / 1000L));
          localsa.ewb = localar.getType();
          localsa.fxG = localar.getContent();
          localsa.ilT = w.a(com.tencent.mm.model.x.pG(), localar.kn()).hashCode();
          a(localsa);
          localxw.hQc.add(localsa);
          localxw.huF = localxw.hQc.size();
          this.dzq.add(localar);
        }
      }
      j = a(paramr, this.dmI, this);
    }
    while (j >= 0);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(j);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "mark all failed. do scene %d", arrayOfObject1);
    yw();
    return j;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt2);
      arrayOfObject1[1] = Integer.valueOf(paramInt3);
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "mark all failed. onGYNetEnd. errType:%d errCode:%d", arrayOfObject1);
      yw();
      this.dlH.a(paramInt2, paramInt3, paramString, this);
    }
    int i;
    do
    {
      return;
      LinkedList localLinkedList = ((xx)this.dmI.sP()).hQc;
      if (this.dzq.size() == localLinkedList.size())
      {
        for (int j = 0; j < localLinkedList.size(); j++)
        {
          sb localsb = (sb)localLinkedList.get(j);
          if (localsb.hQw != 0)
          {
            z.e("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "send msg failed: item ret code=" + localsb.hQw);
            dY(j);
            this.dlH.a(4, localsb.hQw, paramString, this);
            return;
          }
          long l = ((ar)this.dzq.get(j)).kk();
          z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "msg local id = " + l + ", SvrId = " + localsb.hOY + " sent successfully!");
          ar localar = bg.qW().oV().cV(l);
          localar.p(localsb.hOY);
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Long.valueOf(localsb.hOY);
          arrayOfObject2[1] = Integer.valueOf(ao.dVZ);
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "dkmsgid  set svrmsgid %d -> %d", arrayOfObject2);
          if ((10007 == ao.dVY) && (ao.dVZ != 0))
          {
            localar.p(ao.dVZ);
            ao.dVZ = 0;
          }
          localar.setStatus(2);
          bg.qW().oV().a(l, localar);
        }
        z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBLjDRbPDJXV4=", "total " + j + " msgs sent successfully");
      }
      i = a(tp(), this.dlH);
      if (i == -2)
      {
        this.dlH.a(0, 0, paramString, this);
        return;
      }
    }
    while (i >= 0);
    this.dlH.a(3, -1, paramString, this);
  }

  public final int getType()
  {
    return 522;
  }

  public final long kk()
  {
    return this.cDM;
  }

  protected final int sB()
  {
    return 10;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.h
 * JD-Core Version:    0.6.2
 */