package com.tencent.mm.model;

import com.tencent.mm.c.a.iz;
import com.tencent.mm.f.e;
import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.o.l;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.cd;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class dw
  implements j
{
  private Map dmA = new HashMap();
  private Map dmz = new HashMap();

  private void a(String paramString, q paramq, boolean paramBoolean)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = ai.a(paramq.hOS);
    arrayOfObject1[2] = Boolean.valueOf(paramBoolean);
    z.i("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "key is %s, content is %s, isNewXml : %s", arrayOfObject1);
    Map localMap;
    List localList;
    if (paramBoolean)
    {
      localMap = this.dmA;
      localList = (List)localMap.get(paramString);
      if ((localList != null) && (!localList.isEmpty()))
        break label94;
      z.w("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "listener list is empty, return now");
    }
    while (true)
    {
      return;
      localMap = this.dmz;
      break;
      label94: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localList.size());
      z.i("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "listener list size is %d", arrayOfObject2);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        ((dx)localIterator.next()).b(paramq);
    }
  }

  public final k a(q paramq)
  {
    switch (paramq.hOR)
    {
    default:
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramq.hOR);
      z.w("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "cmdAM msgType is %d, ignore, return now", arrayOfObject2);
      return null;
    case 10001:
      String str14 = ai.a(paramq.hOP);
      ai.a(paramq.hOS);
      a(str14, paramq, false);
      n.fTF.a(false, 10395, String.valueOf(paramq.hOY));
      return null;
    case 10002:
    }
    String str1 = ai.a(paramq.hOS);
    if (ch.jb(str1))
    {
      z.e("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "null msg content");
      return null;
    }
    Object localObject1;
    Object localObject2;
    label169: j localj2;
    if (str1.startsWith("~SEMI_XML~"))
    {
      Map localMap2 = cd.AW(str1);
      if (localMap2 == null)
      {
        z.e("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "SemiXml values is null, msgContent %s", new Object[] { str1 });
        return null;
      }
      localObject1 = localMap2;
      localObject2 = "brand_service";
      z.d("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "recieve a syscmd_newxml %s", new Object[] { str1 });
      if (localObject2 != null)
        a((String)localObject2, paramq, true);
      if ((localObject2 == null) || (!((String)localObject2).equals("addcontact")))
        break label1055;
      paramq.hOS = ai.iU((String)((Map)localObject1).get(".sysmsg.addcontact.content"));
      localj2 = l.P(Integer.valueOf(1));
      if (localj2 != null)
        break label918;
    }
    label918: label1049: label1055: for (k localk1 = null; ; localk1 = null)
      while (true)
      {
        label248: if ((localObject2 != null) && (((String)localObject2).equals("dynacfg")))
        {
          e.or().a(str1, (Map)localObject1);
          e.os();
          if (com.tencent.mm.f.a.oa() == 2)
            n.fTF.a(false, 10879, "");
        }
        String str6;
        String str7;
        String str8;
        if ((localObject2 != null) && (((String)localObject2).equals("banner")))
        {
          str6 = (String)((Map)localObject1).get(".sysmsg.mainframebanner.$type");
          str7 = (String)((Map)localObject1).get(".sysmsg.mainframebanner.showtype");
          str8 = (String)((Map)localObject1).get(".sysmsg.mainframebanner.data");
          if ((str6 == null) || (str6.length() <= 0));
        }
        try
        {
          bt.rn().a(new bs(Integer.valueOf(str6).intValue(), Integer.valueOf(str7).intValue(), str8));
          String str9 = (String)((Map)localObject1).get(".sysmsg.friendrecommand.fromuser");
          str10 = (String)((Map)localObject1).get(".sysmsg.friendrecommand.touser");
          if ((str9 == null) || (str10 == null));
        }
        catch (Exception localException3)
        {
          try
          {
            String str10;
            bg.qW().px().a(str10, true, null);
            str11 = (String)((Map)localObject1).get(".sysmsg.banner.securitybanner.chatname");
            str12 = (String)((Map)localObject1).get(".sysmsg.banner.securitybanner.wording");
            str13 = (String)((Map)localObject1).get(".sysmsg.banner.securitybanner.showtype");
            if ((ch.jb(str11)) || (ch.jb(str13)));
          }
          catch (Exception localException3)
          {
            try
            {
              while (true)
              {
                while (true)
                {
                  String str11;
                  String str12;
                  String str13;
                  if (!str13.equals("1"))
                    break label1049;
                  bool = true;
                  bg.qW().py().a(str11, bool, new String[] { str12 });
                  if ((localObject2 == null) || (!((String)localObject2).equals("revokemsg")))
                    break label992;
                  String str3 = (String)((Map)localObject1).get(".sysmsg.revokemsg.session");
                  String str4 = (String)((Map)localObject1).get(".sysmsg.revokemsg.newmsgid");
                  String str5 = (String)((Map)localObject1).get(".sysmsg.revokemsg.replacemsg");
                  z.i("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", new Object[] { str4, str5 });
                  long l1 = 0L;
                  try
                  {
                    l1 = Long.parseLong(str4);
                    ar localar = bg.qW().oV().q(str3, l1);
                    localar.setContent(str5);
                    localar.setType(10000);
                    iz localiz = new iz();
                    localiz.cNk.cDM = localar.kk();
                    localiz.cNk.cNl = str5;
                    localiz.cNk.cMM = localar;
                    com.tencent.mm.sdk.c.a.aGB().g(localiz);
                    bg.qW().oV().a(localar.kk(), localar);
                    r localr = bg.qW().oW().yE(localar.kt());
                    if ((localr == null) || (localr.jI() <= 0))
                      break;
                    int i = bg.qW().oV().x(localar);
                    if (localr.jI() < i)
                      break;
                    localr.bt(-1 + localr.jI());
                    bg.qW().oW().a(localr, localr.getUsername());
                    return null;
                  }
                  catch (Exception localException1)
                  {
                    long l2 = l1;
                    Object[] arrayOfObject1 = new Object[2];
                    arrayOfObject1[0] = Long.valueOf(l2);
                    arrayOfObject1[1] = localException1.toString();
                    z.printErrStackTrace("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", localException1, "[oneliang][revokeMsg] msgId:%d,error:%s", arrayOfObject1);
                    return null;
                  }
                }
                Map localMap1 = x.bB(str1, "sysmsg");
                if (localMap1 == null)
                {
                  z.e("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "KVConfig values is null, msgContent %s", new Object[] { str1 });
                  return null;
                }
                String str2 = (String)localMap1.get(".sysmsg.$type");
                localObject1 = localMap1;
                localObject2 = str2;
                break label169;
                localk1 = localj2.a(paramq);
                break label248;
                localException4 = localException4;
                z.e("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", localException4.toString());
                continue;
                localException3 = localException3;
                z.e("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", localException3.toString());
              }
            }
            catch (Exception localException2)
            {
              while (true)
              {
                z.e("!44@/B4Tb64lLpLqQYyN0INswY/XO4icKaZhr30o48Gx2tE=", "[oneliang]" + localException2.toString());
                continue;
                label992: j localj1;
                k localk2;
                if ((localObject2 != null) && (((String)localObject2).equals("updatepackage")))
                {
                  localj1 = l.P(Integer.valueOf(62));
                  if (localj1 == null)
                    localk2 = null;
                }
                while (true)
                {
                  return localk2;
                  localk2 = localj1.a(paramq);
                  continue;
                  localk2 = localk1;
                }
                boolean bool = false;
              }
            }
          }
        }
      }
  }

  public final void a(String paramString, dx paramdx)
  {
    a(paramString, paramdx, false);
  }

  public final void a(String paramString, dx paramdx, boolean paramBoolean)
  {
    if ((ch.jb(paramString)) || (paramdx == null))
      return;
    if (paramBoolean);
    for (Map localMap = this.dmA; ; localMap = this.dmz)
    {
      Object localObject = (List)localMap.get(paramString);
      if (localObject == null)
      {
        localObject = new LinkedList();
        localMap.put(paramString, localObject);
      }
      if (((List)localObject).contains(paramdx))
        break;
      ((List)localObject).add(paramdx);
      return;
    }
  }

  public final void b(String paramString, dx paramdx, boolean paramBoolean)
  {
    if ((ch.jb(paramString)) || (paramdx == null))
      return;
    if (paramBoolean);
    for (Map localMap = this.dmA; ; localMap = this.dmz)
    {
      List localList = (List)localMap.get(paramString);
      if (localList == null)
        break;
      localList.remove(paramdx);
      return;
    }
  }

  public final void c(String paramString, dx paramdx)
  {
    b(paramString, paramdx, false);
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.dw
 * JD-Core Version:    0.6.2
 */