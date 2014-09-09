package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.mm.f.e;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.protocal.a.ri;
import com.tencent.mm.protocal.a.rj;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class bo
  implements m, x
{
  private static bo hvK;
  private String dAo;
  private boolean hvL = false;
  private boolean hvM = false;
  private List hvN = new LinkedList();
  private long hvO;
  private final int hvP = 20;
  private int hvQ = 0;
  private long hvR;

  private static void a(k paramk, rj paramrj)
  {
    paramk.field_appName = paramrj.igU;
    paramk.field_appName_en = paramrj.igQ;
    paramk.field_appName_tw = paramrj.igR;
    paramk.aP(paramrj.igS);
    paramk.aQ(paramrj.igT);
    paramk.aS(paramrj.igZ);
    paramk.field_serviceAppInfoFlag = paramrj.igW;
    paramk.field_serviceAppType = paramrj.igV;
    paramk.bd(paramrj.iha);
    paramk.field_serviceShowFlag = paramrj.ihc;
  }

  private static void a(o paramo, List paramList)
  {
    if ((paramo == null) || (paramList == null) || (paramList.size() <= 0));
    ArrayList localArrayList;
    label46: 
    do
    {
      return;
      z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "removeExpiredServiceApp");
      localArrayList = new ArrayList();
      if (g.axW() != null)
        break;
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getAllServices, getISubCorePluginBase() == null");
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(localArrayList.size());
      z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "oldList %d", arrayOfObject1);
    }
    while (localArrayList.size() <= 0);
    Iterator localIterator1 = localArrayList.iterator();
    label293: 
    while (true)
    {
      label91: k localk2;
      if (localIterator1.hasNext())
      {
        localk2 = (k)localIterator1.next();
        if (localk2.field_appId != null)
        {
          Iterator localIterator2 = paramList.iterator();
          String str;
          do
          {
            if (!localIterator2.hasNext())
              break;
            str = (String)localIterator2.next();
          }
          while (!localk2.field_appId.equals(str));
        }
      }
      else
      {
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label293;
          boolean bool = paramo.b(localk2, new String[0]);
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = localk2.field_appId;
          arrayOfObject2[1] = Boolean.valueOf(bool);
          z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "delete old service : %s, %s", arrayOfObject2);
          break label91;
          break;
          Cursor localCursor = g.axW().aye();
          if (localCursor == null)
            break label46;
          while (localCursor.moveToNext())
          {
            k localk1 = new k();
            localk1.b(localCursor);
            if (!ch.jb(localk1.field_openId))
              localArrayList.add(localk1);
          }
          localCursor.close();
          break label46;
        }
      }
    }
  }

  public static bo azd()
  {
    if (hvK == null)
      hvK = new bo();
    return hvK;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (!bg.oE())
    {
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "getServiceAppList onSceneEnd account not ready");
      this.hvQ = 0;
      this.hvN.clear();
      return;
    }
    this.hvM = false;
    if (paramx == null)
    {
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "scene == null");
      this.hvQ = 0;
      this.hvN.clear();
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      arrayOfObject1[2] = paramString;
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", arrayOfObject1);
      this.hvQ = 0;
      this.hvN.clear();
      return;
    }
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Integer.valueOf(paramInt1);
    arrayOfObject2[1] = Integer.valueOf(paramInt2);
    arrayOfObject2[2] = paramString;
    z.i("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", arrayOfObject2);
    an localan1 = (an)paramx;
    if ((localan1.dmI != null) && (localan1.dmI.sP() != null));
    for (ri localri = (ri)localan1.dmI.sP(); localri == null; localri = null)
    {
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "resp == null");
      this.hvQ = 0;
      this.hvN.clear();
      return;
    }
    if ((localri.igP == null) || (localri.igP.size() <= 0))
    {
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "Service_appinfo empty");
      a(g.axW().ayd(), this.hvN);
      this.hvQ = 0;
      this.hvN.clear();
      return;
    }
    Object[] arrayOfObject3 = new Object[2];
    arrayOfObject3[0] = Integer.valueOf(this.hvQ);
    arrayOfObject3[1] = Integer.valueOf(localri.igP.size());
    z.i("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "offset = %d, count = %s", arrayOfObject3);
    o localo = g.axW().ayd();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = localri.igP.iterator();
    label519: label906: 
    while (localIterator.hasNext())
    {
      rj localrj = (rj)localIterator.next();
      Object[] arrayOfObject6 = new Object[6];
      arrayOfObject6[0] = localrj.igU;
      arrayOfObject6[1] = Integer.valueOf(localrj.igV);
      arrayOfObject6[2] = Integer.valueOf(localrj.ihc);
      arrayOfObject6[3] = Integer.valueOf(localrj.iha);
      arrayOfObject6[4] = Integer.valueOf(localrj.igW);
      arrayOfObject6[5] = localrj.cJO;
      z.v("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "service info: %s, %s, %s, %s, %s, %s", arrayOfObject6);
      if (!ch.jb(localrj.cJO))
      {
        this.hvN.add(localrj.cJO);
        k localk = l.F(localrj.cJO, true);
        int j;
        if (localk != null)
          if (localk.field_serviceAppInfoFlag != localrj.igW)
          {
            j = 1;
            if (j != 0)
            {
              a(localk, localrj);
              boolean bool2 = localo.a(localk, new String[0]);
              Object[] arrayOfObject8 = new Object[2];
              arrayOfObject8[0] = localrj.cJO;
              arrayOfObject8[1] = Boolean.valueOf(bool2);
              z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "update app: AppID = %s, ret = %s", arrayOfObject8);
            }
          }
        while (true)
        {
          if (!ch.jb(localk.field_openId))
            break label906;
          localLinkedList.add(localrj.cJO);
          break;
          if (localk.field_serviceAppType != localrj.igV)
          {
            j = 1;
            break label519;
          }
          if (localk.iZ() != localrj.iha)
          {
            j = 1;
            break label519;
          }
          if (localk.field_serviceShowFlag != localrj.ihc)
          {
            j = 1;
            break label519;
          }
          if (!ch.ja(localk.field_appName).equals(ch.ja(localrj.igU)))
          {
            j = 1;
            break label519;
          }
          if (!ch.ja(localk.field_appName_en).equals(ch.ja(localrj.igQ)))
          {
            j = 1;
            break label519;
          }
          if (!ch.ja(localk.field_appName_tw).equals(ch.ja(localrj.igR)))
          {
            j = 1;
            break label519;
          }
          if (!ch.ja(localk.iU()).equals(ch.ja(localrj.igT)))
          {
            j = 1;
            break label519;
          }
          if (!ch.ja(localk.iT()).equals(ch.ja(localrj.igS)))
          {
            j = 1;
            break label519;
          }
          if (!ch.ja(localk.iY()).equals(ch.ja(localrj.igZ)))
          {
            j = 1;
            break label519;
          }
          j = 0;
          break label519;
          localk = new k();
          localk.field_appId = localrj.cJO;
          a(localk, localrj);
          boolean bool1 = localo.b(localk);
          Object[] arrayOfObject7 = new Object[2];
          arrayOfObject7[0] = localrj.cJO;
          arrayOfObject7[1] = Boolean.valueOf(bool1);
          z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "insert app: AppID = %s, ret = %s", arrayOfObject7);
        }
      }
    }
    if (localLinkedList.size() > 0)
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(localLinkedList.size());
      z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "needGetOpenIdList %d", arrayOfObject5);
      bf.azc().aT(localLinkedList);
    }
    if (localri.igP.size() == 20)
    {
      this.hvQ = (20 + this.hvQ);
      String str = this.dAo;
      int i = this.hvQ;
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Integer.valueOf(i);
      arrayOfObject4[1] = str;
      z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "get service app, offset = %d, lang = %s", arrayOfObject4);
      an localan2 = new an(i, str);
      bg.qX().d(localan2);
    }
    while (true)
    {
      ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putLong("LAST_GET_SERVICE_APP_TIME", System.currentTimeMillis()).commit();
      this.hvR = System.currentTimeMillis();
      return;
      a(localo, this.hvN);
      this.hvQ = 0;
      this.hvN.clear();
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, ac paramac)
  {
    if (!bg.oE());
    do
    {
      return;
      this.hvL = false;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "Suggestion onSceneEnd errType=%s errCode=%s", arrayOfObject1);
      if (paramac == null)
      {
        z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "scene == null");
        return;
      }
    }
    while ((paramInt1 != 0) || (paramInt2 != 0));
    switch (paramac.getType())
    {
    default:
      return;
    case 4:
    }
    ao localao = (ao)paramac;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(localao.ayT());
    z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "get suggestion appList, AppCount = %s", arrayOfObject2);
    LinkedList localLinkedList1 = localao.ayU();
    if ((localLinkedList1 == null) || (localLinkedList1.size() <= 0))
    {
      z.w("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "empty suggestAppList");
      return;
    }
    if ((ak.getContext() == null) || (g.axW() == null))
    {
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "wrong environment");
      return;
    }
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator1 = localLinkedList1.iterator();
    if (localIterator1.hasNext())
    {
      k localk3 = (k)localIterator1.next();
      Object[] arrayOfObject3 = new Object[5];
      arrayOfObject3[0] = localk3.field_appName;
      arrayOfObject3[1] = localk3.field_packageName;
      arrayOfObject3[2] = localk3.field_signature;
      arrayOfObject3[3] = localk3.iI();
      if (localk3.iH() != null);
      for (boolean bool = true; ; bool = false)
      {
        arrayOfObject3[4] = Boolean.valueOf(bool);
        z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "suggestion appName=%s, packageName=%s, signature [%s], introUrl [%s], has iconUrl [%s]", arrayOfObject3);
        localLinkedList2.add(localk3.field_appId);
        break;
      }
    }
    g.axW().R(localLinkedList2);
    List localList = l.be(ak.getContext());
    o localo;
    Iterator localIterator2;
    if (localList.size() > 0)
    {
      localo = g.axW().ayd();
      localIterator2 = localList.iterator();
    }
    label527: 
    while (true)
    {
      k localk1;
      if (localIterator2.hasNext())
      {
        localk1 = (k)localIterator2.next();
        if (localk1.field_appId != null)
        {
          Iterator localIterator3 = localLinkedList1.iterator();
          k localk2;
          do
          {
            if (!localIterator3.hasNext())
              break;
            localk2 = (k)localIterator3.next();
          }
          while ((localk2.field_appId == null) || (!localk1.field_appId.equals(localk2.field_appId)));
        }
      }
      else
      {
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label527;
          if (l.c(ak.getContext(), localk1));
          for (localk1.field_status = 1; ; localk1.field_status = 4)
          {
            localo.a(localk1, new String[0]);
            break;
          }
          ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putLong("LAST_GET_SUGGEST_APP_LIST_TIME", System.currentTimeMillis()).commit();
          this.hvO = System.currentTimeMillis();
          return;
        }
      }
    }
  }

  public final void aze()
  {
    if (!bg.oE())
      return;
    bf.Uq().b(4, this);
    this.hvL = false;
    this.hvM = false;
  }

  public final void bh(Context paramContext)
  {
    if ((!bg.oE()) || (paramContext == null))
      return;
    try
    {
      String str = e.or().getValue("ShowAPPSuggestion");
      if ((ch.jb(str)) || (Integer.valueOf(str).intValue() != 1))
      {
        z.w("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "cfgShowAppSuggestion %s, return", new Object[] { str });
        return;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.e("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "exception in getSuggestionAppList, %s", arrayOfObject);
      if (this.hvL)
      {
        z.w("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "SuggestionApp is Loading");
        return;
      }
      z.i("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "getSuggestionAppList");
      this.hvL = true;
      if (System.currentTimeMillis() - this.hvO < 43200000L)
      {
        z.d("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "not now");
        this.hvL = false;
        return;
      }
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(ak.aHi(), 0);
      this.hvO = localSharedPreferences.getLong("LAST_GET_SUGGEST_APP_LIST_TIME", 0L);
      if (System.currentTimeMillis() - this.hvO < 43200000L)
      {
        z.w("!44@/B4Tb64lLpJUej9RrA1bOWmsIpR3UVONBzVGWKMsBOw=", "not now sp");
        this.hvL = false;
        return;
      }
      if (this.dAo == null)
        this.dAo = y.d(localSharedPreferences);
      ao localao = new ao(3, 0, 20, this.dAo, new LinkedList());
      bf.Uq();
      c.a(4, localao);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bo
 * JD-Core Version:    0.6.2
 */