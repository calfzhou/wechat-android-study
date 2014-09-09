package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.y;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.dj;
import com.tencent.mm.protocal.a.dk;
import com.tencent.mm.protocal.a.ez;
import com.tencent.mm.protocal.a.fg;
import com.tencent.mm.protocal.a.k;
import com.tencent.mm.protocal.a.ry;
import com.tencent.mm.protocal.a.sh;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class v
{
  public static i a(i parami, ry paramry)
  {
    parami.setUsername(ai.a(paramry.hVj));
    parami.aU(ai.a(paramry.hVj));
    parami.aV(ai.a(paramry.hVj));
    parami.aW(ai.a(paramry.hUZ));
    parami.bj(paramry.dtf);
    parami.aT(ai.a(paramry.ilQ));
    parami.ba(ai.a(paramry.ilR));
    parami.aZ(ai.a(paramry.hUZ));
    parami.bn(paramry.hUI);
    parami.bo(paramry.dth);
    parami.bn(RegionCodeDecoder.v(paramry.dtm, paramry.Ks, paramry.Kt));
    parami.bh(paramry.dtg);
    return parami;
  }

  public static String a(List paramList, int paramInt)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      localObject1 = "";
      return localObject1;
    }
    Object localObject1 = "";
    int i = paramInt - 1;
    int j = 0;
    label28: if (j < paramList.size())
    {
      String str = (String)paramList.get(j);
      if (str.length() <= 0)
        break label186;
      i locali = bg.qW().oT().ys(str);
      localObject2 = (String)localObject1 + locali.oc();
      if ((j == i) && (j < paramList.size()))
        return (String)localObject2 + "...";
      if (j >= -1 + paramList.size());
    }
    label186: for (Object localObject2 = (String)localObject2 + ak.getContext().getString(n.byx); ; localObject2 = localObject1)
    {
      j++;
      localObject1 = localObject2;
      break label28;
      break;
    }
  }

  public static void a(String paramString, com.tencent.mm.storage.b paramb, boolean paramBoolean)
  {
    int i = 1;
    paramb.eg(paramBoolean);
    bg.qW().oZ().a(paramb, new String[0]);
    String str = x.pG();
    sh localsh = new sh();
    localsh.hVg = paramString;
    localsh.gnq = str;
    localsh.ilX = i;
    if (paramBoolean);
    while (true)
    {
      localsh.hWK = i;
      bg.qW().oS().a(new com.tencent.mm.storage.bg(49, localsh));
      return;
      i = 2;
    }
  }

  public static boolean a(com.tencent.mm.storage.b paramb)
  {
    if (paramb == null)
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "updateChatroomMember error! member is null");
      return false;
    }
    boolean bool = bg.qW().oZ().b(paramb);
    String str1;
    o localo;
    i locali;
    if (bool)
    {
      str1 = paramb.field_chatroomname;
      String str2 = paramb.field_roomowner;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "update contact chatroom type to %d", arrayOfObject);
      localo = bg.qW().oT();
      locali = localo.ys(str1);
      if (((int)locali.dhv != 0) && (!ch.jb(str2)) && (!ch.jb(x.pG())))
      {
        if (!str2.equals(x.pG()))
          break label129;
        locali.cl(1);
      }
    }
    while (true)
    {
      localo.a(str1, locali);
      return bool;
      label129: locali.cl(0);
    }
  }

  public static boolean a(String paramString, ez paramez)
  {
    if ((!paramString.toLowerCase().endsWith("@chatroom")) || (paramez.hOA == 0))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "DelChatroomMember: room:[" + paramString + "] listCnt:" + paramez.hOA);
      return false;
    }
    c localc = bg.qW().oZ();
    com.tencent.mm.storage.b localb = localc.xS(paramString);
    List localList = com.tencent.mm.storage.b.xR(localb.field_memberlist);
    z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "DelChatroomMember before " + localList.size());
    Iterator localIterator = paramez.hOB.iterator();
    while (localIterator.hasNext())
      localList.remove(ai.a(((fg)localIterator.next()).hVj));
    z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "DelChatroomMember after " + localList.size());
    localb.aE(localList).field_displayname = d(localList);
    boolean bool = localc.b(localb);
    z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "delChatroomMember " + bool);
    return bool;
  }

  public static boolean a(String paramString, k paramk)
  {
    if ((!paramString.toLowerCase().endsWith("@chatroom")) || (paramk.hOA == 0))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "AddChatroomMember: room:[" + paramString + "] listCnt:" + paramk.hOA);
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    o localo = bg.qW().oT();
    int i = 0;
    while (i < paramk.hOA)
    {
      String str = ai.a(((ry)paramk.hOB.get(i)).hVj);
      if (ch.jb(str))
      {
        z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "this member name is null! chatRoomName : %s", new Object[] { paramString });
        i++;
      }
      else
      {
        i locali1 = localo.ys(str);
        i locali2;
        if ((int)locali1.dhv != 0)
        {
          locali1.oy();
          localo.a(locali1.getUsername(), locali1);
          locali2 = locali1;
        }
        while (true)
        {
          localArrayList.add(locali2.getUsername());
          break;
          locali2 = a(locali1, (ry)paramk.hOB.get(i));
          localo.F(locali2);
        }
      }
    }
    return a(paramString, localArrayList, null);
  }

  public static boolean a(String paramString1, String paramString2, dj paramdj, String paramString3, com.tencent.mm.e.a.a.a parama, com.tencent.mm.sdk.c.e parame)
  {
    if (((!paramString1.toLowerCase().endsWith("@chatroom")) && (!paramString1.toLowerCase().endsWith("@groupcard")) && (!paramString1.toLowerCase().endsWith("@talkroom"))) || (paramdj.hOA == 0))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "SyncAddChatroomMember: room:[" + paramString1 + "] listCnt:" + paramdj.hOA);
      return false;
    }
    o localo = bg.qW().oT();
    com.tencent.mm.storage.b localb1 = bg.qW().oZ().xS(paramString1);
    if (localb1 != null)
      parama.cLj = localb1.aIa();
    ArrayList localArrayList = new ArrayList();
    z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "SyncAddChatroomMember: room:[" + paramString1 + "] memCnt:" + paramdj.hOA);
    boolean bool1 = false;
    int i = 0;
    while (i < paramdj.hOA)
    {
      dk localdk = (dk)paramdj.hTv.get(i);
      i locali = localo.ys(localdk.gnq);
      if (locali == null)
      {
        z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "SyncAddChatroomMember memberlist username is null");
        i++;
      }
      else
      {
        com.tencent.mm.e.a.a.b localb4 = new com.tencent.mm.e.a.a.b();
        localb4.cDi = localdk.gnq;
        com.tencent.mm.n.x localx;
        if (paramdj.hTw == 0)
        {
          localb4.dbG = localdk.hTx;
          localb4.dJz = localdk.hTA;
          if (!ch.jb(localdk.hTz))
          {
            localx = af.sJ().fg(localdk.gnq);
            if (localx == null)
            {
              localx = new com.tencent.mm.n.x();
              localx.setUsername(localdk.gnq);
            }
            localx.fe(localdk.hTy);
            localx.ff(localdk.hTz);
            localx.bi(3);
            if (ch.jb(localdk.hTy))
              break label484;
          }
        }
        label484: for (boolean bool4 = true; ; bool4 = false)
        {
          localx.T(bool4);
          af.sJ().a(localx);
          if (localb1 != null)
          {
            com.tencent.mm.e.a.a.b localb5 = localb1.xP(localdk.gnq);
            if (localb5 != null)
            {
              localb4.dbG = localb5.dbG;
              localb4.dJz = localb5.dJz;
            }
          }
          parama.dJw.add(localb4);
          if ((int)locali.dhv == 0)
          {
            locali.setUsername(localdk.gnq);
            locali.aU(localdk.hwV);
            locali.oy();
            localo.F(locali);
            bool1 = true;
          }
          localArrayList.add(locali.getUsername());
          break;
        }
      }
    }
    z.i("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "summertt SyncAddChatroomMember listUsernames size: " + localArrayList.size() + " event: " + parame + " publish: " + bool1);
    if (bool1)
      com.tencent.mm.sdk.c.a.aGB().g(parame);
    com.tencent.mm.storage.b localb2 = bg.qW().oZ().xS(paramString1);
    if (localb2 == null)
      localb2 = new com.tencent.mm.storage.b();
    long l1 = System.currentTimeMillis();
    localb2.field_chatroomname = paramString1;
    localb2.field_roomowner = paramString2;
    com.tencent.mm.storage.b localb3 = localb2.aE(localArrayList);
    localb3.field_displayname = d(localArrayList);
    if (paramdj.hTw != 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      localb3.a(paramString3, parama, bool2);
      boolean bool3 = a(localb2);
      long l2 = System.currentTimeMillis() - l1;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(bool3);
      arrayOfObject[1] = Long.valueOf(l2);
      z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "syncAddChatroomMember ret : %s , during : %s", arrayOfObject);
      localb2.aIb();
      return bool3;
    }
  }

  public static boolean a(String paramString1, ArrayList paramArrayList, String paramString2)
  {
    c localc = bg.qW().oZ();
    com.tencent.mm.storage.b localb = localc.xT(paramString1);
    if (paramString1.endsWith("@chatroom"));
    LinkedList localLinkedList;
    int i;
    int m;
    for (Object localObject = cU(paramString1); ; localObject = new LinkedList())
    {
      localLinkedList = new LinkedList();
      i = 0;
      if (localObject == null)
        break label184;
      for (int j = 0; ; j++)
      {
        int k = ((List)localObject).size();
        m = 0;
        if (j >= k)
          break;
        localLinkedList.add(((List)localObject).get(j));
      }
    }
    while (m < paramArrayList.size())
    {
      if (!((List)localObject).contains(paramArrayList.get(m)))
        localLinkedList.add(paramArrayList.get(m));
      m++;
    }
    if (!ch.jb(paramString2))
      localb.field_roomowner = paramString2;
    localb.aE(localLinkedList).field_displayname = d(localLinkedList);
    return localc.b(localb);
    label184: 
    while (i < paramArrayList.size())
    {
      localLinkedList.add(paramArrayList.get(i));
      i++;
    }
    if (!ch.jb(paramString2))
      localb.field_roomowner = paramString2;
    localb.aE(localLinkedList).field_displayname = d(localLinkedList);
    localb.field_roomowner = paramString2;
    boolean bool = localc.b(localb);
    z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "insertMembersByChatRoomName " + bool);
    return bool;
  }

  public static boolean b(String paramString, Map paramMap)
  {
    com.tencent.mm.storage.b localb = bg.qW().oZ().xS(paramString);
    if (localb == null)
      return false;
    Iterator localIterator = localb.aHY().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramMap.put(str, localb.dh(str));
    }
    return true;
  }

  public static boolean cP(String paramString)
  {
    String str = (String)bg.qW().oQ().get(2);
    List localList = cU(paramString);
    if (localList == null)
    {
      z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "getmembsersbychatroomname is null ");
      return false;
    }
    if ((localList.size() == 0) || (!localList.contains(str)))
    {
      z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "getmembsersbychatroomname is list is zero or no contains user  " + localList.size() + " ");
      return false;
    }
    return true;
  }

  public static boolean cQ(String paramString)
  {
    if ((paramString == null) || (!paramString.toLowerCase().endsWith("@chatroom")));
    c localc;
    com.tencent.mm.storage.b localb;
    do
    {
      return false;
      z.d("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "updateFailState chatRoomName %s", new Object[] { paramString });
      localc = bg.qW().oZ();
      localb = localc.xS(paramString);
    }
    while (localb == null);
    localb.field_roomflag = 1;
    return localc.b(localb);
  }

  public static boolean cR(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@groupcard"))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "deleteWholeGroupcard: room:[" + paramString + "]");
      return false;
    }
    o localo = bg.qW().oT();
    if (localo.yu(paramString))
      localo.yz(paramString);
    while (true)
    {
      return cT(paramString);
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "deleteWholeGroupcard RoomName not exist:[" + paramString + "]");
    }
  }

  public static boolean cS(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "deleteWholeChatroom: room:[" + paramString + "]");
      return false;
    }
    o localo = bg.qW().oT();
    if (localo.yu(paramString))
      localo.yz(paramString);
    while (true)
    {
      return cT(paramString);
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "deleteWholeChatroom RoomName not exist:[" + paramString + "]");
    }
  }

  private static boolean cT(String paramString)
  {
    return bg.qW().oZ().xX(paramString);
  }

  public static List cU(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "getMembersByChatRoomName: this is not room:[" + paramString + "]");
      return null;
    }
    return bg.qW().oZ().xV(paramString);
  }

  public static List cV(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "getMembersByChatRoomName: room:[" + paramString + "]");
      return null;
    }
    return bg.qW().oZ().xV(paramString);
  }

  public static int cW(String paramString)
  {
    List localList = cU(paramString);
    if (localList == null)
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "getMembersByChatRoomName: get room:[" + paramString + "] members count fail");
      return 0;
    }
    return localList.size();
  }

  public static List cX(String paramString)
  {
    int i = 0;
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKOIOdFJzm+vxoPdj8s3NANo=", "getOtherMembersByChatRoomName: room:[" + paramString + "]");
      return null;
    }
    List localList = cU(paramString);
    if ((localList == null) || (localList.size() <= 0))
      return null;
    String str = (String)bg.qW().oQ().get(2);
    boolean bool;
    if ((str != null) && (str.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
    }
    while (true)
    {
      if (i < localList.size())
      {
        if (((String)localList.get(i)).equals(str))
          localList.remove(i);
      }
      else
      {
        if (localList.size() > 0)
          break label156;
        return null;
        bool = false;
        break;
      }
      i++;
    }
    label156: return localList;
  }

  public static String d(List paramList)
  {
    return a(paramList, -1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.v
 * JD-Core Version:    0.6.2
 */