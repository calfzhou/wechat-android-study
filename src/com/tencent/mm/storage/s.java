package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cl;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class s extends ap
  implements ay
{
  public static final String[] dmc = arrayOfString;
  private final af dtV;
  private w iik;
  private am iil = new t(this);
  private am iim = new u(this);

  static
  {
    String[] arrayOfString = new String[8];
    arrayOfString[0] = ah.a(com.tencent.mm.h.a.dhu, "rconversation");
    arrayOfString[1] = ah.a(com.tencent.mm.h.a.dhu, "rbottleconversation");
    arrayOfString[2] = "CREATE TABLE IF NOT EXISTS conversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );";
    arrayOfString[3] = "CREATE TABLE IF NOT EXISTS bottleconversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );";
    arrayOfString[4] = "DROP INDEX IF EXISTS rconversation_unreadcount_index ";
    arrayOfString[5] = "DROP INDEX IF EXISTS multi_index ";
    arrayOfString[6] = "CREATE INDEX IF NOT EXISTS rconversation_multi_index ON  rconversation ( unReadCount,parentRef )";
    arrayOfString[7] = "CREATE INDEX IF NOT EXISTS rbottleconversation_unreadcount_index ON  rbottleconversation ( unReadCount )";
  }

  public s(af paramaf)
  {
    Assert.assertTrue(paramaf instanceof h);
    Cursor localCursor = paramaf.rawQuery("PRAGMA table_info( rconversation)", null);
    int j;
    do
    {
      if (!localCursor.moveToNext())
        break;
      j = localCursor.getColumnIndex("name");
    }
    while ((j < 0) || (!"flag".equalsIgnoreCase(localCursor.getString(j))));
    for (int i = 1; ; i = 0)
    {
      localCursor.close();
      List localList = ah.a(com.tencent.mm.h.a.dhu, "rconversation", paramaf);
      localList.addAll(ah.a(com.tencent.mm.h.a.dhu, "rbottleconversation", paramaf));
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        paramaf.bp("rconversation", (String)localIterator.next());
      if (i == 0)
        paramaf.bp("rconversation", "update rconversation set flag = conversationTime");
      this.dtV = paramaf;
      return;
    }
  }

  public static long a(r paramr, int paramInt, long paramLong)
  {
    if (paramr == null)
      return 0L;
    if (paramLong != 0L);
    while (true)
      switch (paramInt)
      {
      default:
        return a(paramr, paramLong);
        paramLong = ch.CM();
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    return 0x0 | a(paramr, paramLong);
    return 0xFFFFFFFF & a(paramr, paramLong);
    return 0x0 & a(paramr, paramLong);
    return 0x0 | a(paramr, paramLong);
    return 0xFFFFFFFF & a(paramr, paramLong);
    return 0x0 & a(paramr, paramLong);
  }

  private static long a(r paramr, long paramLong)
  {
    return 0x0 & paramr.jP() | 0xFFFFFFFF & paramLong;
  }

  private long aIF()
  {
    long l1 = System.currentTimeMillis();
    long l2 = 0L;
    Cursor localCursor = this.dtV.rawQuery("select max(conversationTime) as conversationTime from rconversation", null);
    while (localCursor.moveToNext())
      l2 = localCursor.getLong(0);
    localCursor.close();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(l2);
    arrayOfObject[1] = Long.valueOf(System.currentTimeMillis() - l1);
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "latestConversationTime = %s, cost = %d", arrayOfObject);
    return l2;
  }

  public static r aIK()
  {
    Cursor localCursor = bg.qW().oW().c(y.dkj, null, "officialaccounts");
    r localr = null;
    if (localCursor != null)
    {
      int i = localCursor.getCount();
      localr = null;
      if (i > 0)
      {
        boolean bool = localCursor.moveToFirst();
        localr = null;
        if (bool)
        {
          localr = new r();
          localr.b(localCursor);
        }
      }
      localCursor.close();
    }
    return localr;
  }

  private static long c(r paramr)
  {
    if (paramr != null)
      return a(paramr, paramr.jM());
    return 0xFFFFFFFF & ch.CM();
  }

  private static void e(r paramr)
  {
    if (paramr == null);
    do
    {
      do
        return;
      while (paramr.jI() <= 0);
      z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "jacks check attrFlag & cancel mark");
    }
    while ((0x100000 & paramr.jS()) == 0);
    paramr.bt(-1 + paramr.jI());
    paramr.by(0xFFEFFFFF & paramr.jS());
  }

  public static boolean g(r paramr)
  {
    if (paramr == null)
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "isPlacedTop failed, conversation null");
    while (a(paramr, 4, 0L) == 0L)
      return false;
    return true;
  }

  private static String yB(String paramString)
  {
    z.v("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "talker :" + paramString);
    if (i.yc(paramString))
      return "rbottleconversation";
    return "rconversation";
  }

  private String yL(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    String str1 = "select username from rcontact where (username like '%" + paramString + "%' or nickname like '%" + paramString + "%' or alias like '%" + paramString + "%' or pyInitial like '%" + paramString + "%' or quanPin like '%" + paramString + "%' or conRemark like '%" + paramString + "%' )and username not like '%@%'" + " and type & " + com.tencent.mm.g.a.xr() + "=0 ";
    Cursor localCursor = this.dtV.rawQuery(str1, null);
    z.v("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "contactsql %s", new Object[] { str1 });
    while (localCursor.moveToNext())
    {
      String str4 = localCursor.getString(localCursor.getColumnIndex("username"));
      if (!str4.endsWith("@chatroom"))
        localArrayList.add(str4);
    }
    localCursor.close();
    StringBuffer localStringBuffer;
    if (localArrayList.size() != 0)
    {
      localStringBuffer = new StringBuffer();
      localStringBuffer.append(" ( rconversation.username in ( select chatroomname from chatroom where ");
      localStringBuffer.append("memberlist like '%" + paramString + "%'");
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        localStringBuffer.append(" or memberlist like '%" + str3 + "%'");
      }
      localStringBuffer.append("))");
    }
    for (String str2 = "" + localStringBuffer.toString() + " or "; ; str2 = "")
      return " and ( rconversation.username like '%" + paramString + "%' or " + str2 + "rconversation.content like '%" + paramString + "%' or rcontact.nickname" + " like '%" + paramString + "%' or rcontact.alias" + " like '%" + paramString + "%' or rcontact.pyInitial" + " like '%" + paramString + "%' or rcontact.quanPin" + " like '%" + paramString + "%' or rcontact.conRemark" + " like '%" + paramString + "%'  ) ";
  }

  public static r yS(String paramString)
  {
    Cursor localCursor = bg.qW().oW().c(y.dkj, null, paramString);
    r localr = null;
    if (localCursor != null)
    {
      int i = localCursor.getCount();
      localr = null;
      if (i > 0)
      {
        boolean bool = localCursor.moveToFirst();
        localr = null;
        if (bool)
        {
          localr = new r();
          localr.b(localCursor);
        }
      }
      localCursor.close();
    }
    return localr;
  }

  public final int Bl(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select sum(atCount) from rconversation");
    localStringBuilder.append(" where unReadCount > 0");
    if (!ch.jb(paramString))
      localStringBuilder.append(" and username = '").append(paramString).append("'");
    String str = localStringBuilder.toString();
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "query sql: %s", new Object[] { str });
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = 0;
    if (localCursor != null)
    {
      boolean bool = localCursor.moveToFirst();
      i = 0;
      if (bool)
        i = localCursor.getInt(0);
      localCursor.close();
    }
    return i;
  }

  public final void W(LinkedList paramLinkedList)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = cl.aHP();
    z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "deleteConversations   stack:%s", arrayOfObject1);
    if (paramLinkedList.isEmpty())
    {
      z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "deleteConversation:namelist is null");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = (String)paramLinkedList.poll();
    localStringBuilder.append("delete from rconversation where ");
    localStringBuilder.append("username='").append(str1).append('\'');
    while (!paramLinkedList.isEmpty())
    {
      String str2 = (String)paramLinkedList.poll();
      localStringBuilder.append(" or username='").append(str2).append('\'');
    }
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = localStringBuilder.toString();
    z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "deleteConversations:sql is %s", arrayOfObject2);
    this.dtV.bp("rconversation", localStringBuilder.toString());
  }

  public final int a(r paramr, String paramString)
  {
    return a(paramr, paramString, true);
  }

  public final int a(r paramr, String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "update conversation failed");
      return 0;
    }
    if (paramBoolean)
      paramr.l(c(paramr));
    e(paramr);
    int i = this.dtV.update(yB(paramString), paramr.ir(), "username=?", new String[] { paramString });
    if (i != 0)
    {
      b(3, this, paramString);
      return i;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = yB(paramString);
    z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "update failed return 0,  table:%s", arrayOfObject);
    return i;
  }

  public final Cursor a(String paramString1, List paramList, String paramString2, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount");
    localStringBuilder.append(" from rconversation where ");
    if (com.tencent.mm.h.a.dPB == paramString2)
      localStringBuilder.append(" ( parentRef is null  or ").append("parentRef = '' ) ");
    while (true)
    {
      localStringBuilder.append(ch.ja(paramString1));
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append(" and rconversation.username").append(" != '").append(str).append("'");
      }
      if ("*".equals(paramString2))
        localStringBuilder.append(" 1 = 1 ");
      else
        localStringBuilder.append("parentRef = '").append(ch.iV(paramString2)).append("' ");
    }
    localStringBuilder.append(" order by flag desc");
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "getNecessaryCursor sql " + localStringBuilder.toString());
    return this.dtV.J(localStringBuilder.toString(), paramBoolean);
  }

  public final Cursor a(ArrayList paramArrayList, String paramString1, List paramList, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount");
    localStringBuilder.append(" from rconversation where (");
    int i = 0;
    if (i < paramArrayList.size())
    {
      if (i != -1 + paramArrayList.size())
        localStringBuilder.append("username = '" + (String)paramArrayList.get(i) + "' OR ");
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("username = '" + (String)paramArrayList.get(i) + "'");
      }
    }
    localStringBuilder.append(") and ");
    if (com.tencent.mm.h.a.dPB == paramString2)
      localStringBuilder.append(" ( parentRef is null  or ").append("parentRef = '' ) ");
    while (true)
    {
      localStringBuilder.append(ch.ja(paramString1));
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append(" and rconversation.username").append(" != '").append(str).append("'");
      }
      if ("*".equals(paramString2))
        localStringBuilder.append(" 1 = 1 ");
      else
        localStringBuilder.append("parentRef = '").append(ch.iV(paramString2)).append("' ");
    }
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "getNecessaryCursorByNames sql " + localStringBuilder.toString());
    return this.dtV.rawQuery(localStringBuilder.toString(), null);
  }

  public final void a(aw paramaw, ba paramba)
  {
    if (paramba == null)
    {
      z.f("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "null notifyInfo");
      return;
    }
    String str1 = paramba.cEh;
    r localr1 = yE(str1);
    r localr3;
    if (localr1 == null)
    {
      r localr2 = new r(str1);
      if (i.yc(str1))
        localr2.bu(1);
      localr3 = localr2;
    }
    for (int i = 1; ; i = 0)
    {
      if ((paramba != null) && (!paramba.ikd.isEmpty()) && (paramba.ikd.get(0) != null))
        localr3.bv(((ar)paramba.ikd.get(0)).jK());
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = paramba.cEh;
      arrayOfObject1[1] = paramba.ikc;
      arrayOfObject1[2] = Integer.valueOf(paramba.ike);
      z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "dkevent user:%s func:%s cnt:%d ", arrayOfObject1);
      ar localar1 = paramaw.bt(str1, " and not ( type = 10000 and isSend != 2 ) ");
      if ((localar1 != null) && (localar1.kk() != 0L))
      {
        if ((paramba.ike == 1) && (((ar)paramba.ikd.get(0)).kk() != localar1.kk()))
        {
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = Long.valueOf(localar1.kk());
          arrayOfObject3[1] = Long.valueOf(((ar)paramba.ikd.get(0)).kk());
          z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "Warning ! getLastMsg may wrong , lastid:%d  insertlist:%d", arrayOfObject3);
        }
        if (((paramba.ikc.equals("insert")) && (paramba.ike > 0)) || ((paramba.ikc.equals("update")) && (localr3.jI() + paramba.ike >= 0)))
          localr3.bt(localr3.jI() + paramba.ike);
      }
      if ((paramba.ikc.equals("insert")) && (paramba.ikd.size() > 0) && (y.dc(paramba.cEh)))
      {
        String str6 = com.tencent.mm.model.x.pG();
        Iterator localIterator = paramba.ikd.iterator();
        while (localIterator.hasNext())
        {
          ar localar2 = (ar)localIterator.next();
          if ((localar2.jK() != 1) && (localar2.aJD()) && (localar2.zk(str6)))
            localr3.bz(1 + localr3.jU());
        }
      }
      this.iil.ae(localr3);
      this.iil.Bo();
      if (str1 == null)
      {
        z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "talker == null");
        return;
      }
      if (!str1.equals(localr3.getUsername()))
      {
        z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "process message for conversation failed: inconsist username");
        return;
      }
      String str2;
      String str3;
      String str5;
      label727: int k;
      if ((localar1 != null) && (localar1.kk() != 0L))
      {
        z.v("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "onNotifyChange   msgId:" + localar1.kk());
        localr3.v(localar1);
        if (this.iik != null)
        {
          PString localPString1 = new PString();
          PString localPString2 = new PString();
          PInt localPInt = new PInt();
          this.iik.a(localar1, localPString1, localPString2, localPInt, localr3.cw(2097152));
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localPString2.value;
          z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "oreh onNotifyChange genDigest: pDigestUser.value=%s", arrayOfObject2);
          localr3.bu(localPString1.value);
          localr3.bw(localPString2.value);
          localr3.bx(localPInt.value);
        }
        localr3.bv(Integer.toString(localar1.getType()));
        int j = localar1.getType();
        str2 = localr3.getContent();
        boolean bool = ch.jb(str2);
        str3 = null;
        if (!bool)
          str3 = null;
        switch (j)
        {
        default:
          String str4 = ch.ja(localr3.jL());
          if (ch.jb(str3))
          {
            str5 = "";
            localr3.bu(str4.concat(str5));
            localr3.l(a(localr3, 1, localar1.kn()));
            if (i == 0)
              break label918;
            i locali = bg.qW().oT().ys(str1);
            if ((locali != null) && (!ch.jb(locali.getUsername())))
            {
              if ((0x800 & locali.getType()) == 0)
                break label912;
              k = 1;
              label803: if (k != 0)
                localr3.l(a(localr3, 2, 0L));
            }
            d(localr3);
          }
          break;
        case 49:
        }
      }
      while (true)
      {
        this.iim.ae(localr3);
        this.iim.Bo();
        return;
        str3 = (String)com.tencent.mm.sdk.platformtools.x.bB(str2, "msg").get(".msg.appmsg.title");
        z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "[oneliang][parseConversationMsgContentTitle] title:%s", new Object[] { str3 });
        break;
        str5 = " " + ch.ja(str3);
        break label727;
        label912: k = 0;
        break label803;
        label918: a(localr3, str1, true);
        continue;
        z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "update null conversation with talker " + str1);
        if (i == 0)
        {
          localr3.aIB();
          a(localr3, str1, true);
        }
        else if (bg.qW().oV().zF(str1) > 0)
        {
          localr3.k(ch.CM());
          d(localr3);
        }
      }
      localr3 = localr1;
    }
  }

  public final void a(v paramv)
  {
    this.iim.a(paramv, null);
  }

  public final void a(w paramw)
  {
    this.iik = paramw;
  }

  public final boolean aIC()
  {
    boolean bool1 = this.dtV.bp("rconversation", "delete from rconversation");
    boolean bool2 = this.dtV.bp("rconversation", "delete from rbottleconversation");
    if ((bool1) || (bool2));
    for (boolean bool3 = true; ; bool3 = false)
    {
      if (bool3)
        b(5, this, "");
      return bool3;
    }
  }

  public final boolean aID()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = cl.aHP();
    z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "deleteBottleConversation stack:%s", arrayOfObject);
    boolean bool = this.dtV.bp("rconversation", "delete from rbottleconversation");
    if (bool)
      b(5, this, "");
    return bool;
  }

  public final HashMap aIE()
  {
    long l = System.currentTimeMillis();
    HashMap localHashMap = new HashMap();
    Cursor localCursor = this.dtV.a("rconversation", new String[] { "username", "conversationTime" }, null, null, null, null);
    if (localCursor.getCount() <= 0)
    {
      localCursor.close();
      return localHashMap;
    }
    localCursor.moveToFirst();
    int i;
    if (localCursor == null)
      i = 0;
    while (true)
    {
      if (i == 0)
        break label162;
      localHashMap.put(localCursor.getString(0), Long.valueOf(localCursor.getLong(1)));
      localCursor.moveToNext();
      break;
      if ((localCursor.isClosed()) || (localCursor.isBeforeFirst()) || (localCursor.isAfterLast()))
        i = 0;
      else
        i = 1;
    }
    label162: localCursor.close();
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "kevin getALLTimeIndex:" + (System.currentTimeMillis() - l));
    return localHashMap;
  }

  public final List aIG()
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Object localObject = "select username from rconversation";
    int i = 0;
    if (i < localLinkedList1.size())
    {
      StringBuilder localStringBuilder = new StringBuilder().append((String)localObject);
      if (i > 0);
      for (String str2 = " and "; ; str2 = " where ")
      {
        String str3 = str2 + "username != \"" + ch.iV((String)localLinkedList1.get(i)) + "\"";
        i++;
        localObject = str3;
        break;
      }
    }
    String str1 = (String)localObject + " order by flag desc, conversationTime desc";
    Cursor localCursor = this.dtV.rawQuery(str1, null);
    while (localCursor.moveToNext())
      localLinkedList2.add(localCursor.getString(localCursor.getColumnIndex("username")));
    localCursor.close();
    return localLinkedList2;
  }

  public final Cursor aIH()
  {
    return this.dtV.rawQuery("select * from rbottleconversation order by flag desc, conversationTime desc", null);
  }

  public final String aII()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT rconversation.username");
    localStringBuilder.append(" FROM rconversation");
    localStringBuilder.append(" WHERE parentRef = 'officialaccounts").append("'");
    localStringBuilder.append(" ORDER BY flag DESC, conversationTime").append(" DESC ");
    localStringBuilder.append(" LIMIT 1 ");
    String str1 = localStringBuilder.toString();
    z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get last conversation user, sql is %s", new Object[] { str1 });
    Cursor localCursor = this.dtV.rawQuery(str1, null);
    String str2 = null;
    if (localCursor != null)
    {
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        str2 = localCursor.getString(0);
        localCursor.close();
      }
    }
    else
      return str2;
    localCursor.close();
    return null;
  }

  public final Cursor aIJ()
  {
    z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get bottle total conversation unread sql is %s", new Object[] { "select count(*) from rbottleconversation where unReadCount > 0" });
    return this.dtV.rawQuery("select count(*) from rbottleconversation where unReadCount > 0", null);
  }

  public final Cursor b(String paramString1, List paramList, String paramString2)
  {
    String str1 = " ";
    if ((paramString2 != null) && (paramString2.length() > 0))
      str1 = " and rconversation.username = rcontact.username ";
    String str2 = "select 1,unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rcontact.nickname from rconversation,rcontact" + " " + " where rconversation.username" + " = rcontact.username" + str1 + ch.ja(paramString1);
    Object localObject1 = "";
    if ((paramList != null) && (paramList.size() > 0))
    {
      Iterator localIterator = paramList.iterator();
      String str7;
      for (Object localObject2 = localObject1; localIterator.hasNext(); localObject2 = (String)localObject2 + " and rconversation.username != '" + str7 + "'")
        str7 = (String)localIterator.next();
      localObject1 = localObject2;
    }
    String str3 = str2 + (String)localObject1;
    if ((paramString2 != null) && (paramString2.length() > 0))
      str3 = str3 + yL(paramString2);
    String str4 = str3 + " order by ";
    String str5 = str4 + "rconversation.username like '%@chatroom' asc, ";
    String str6 = str5 + "flag desc, conversationTime desc";
    z.v("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "convsql %s", new Object[] { str6 });
    return this.dtV.rawQuery(str6, null);
  }

  public final void b(v paramv)
  {
    this.iil.a(paramv, null);
  }

  public final Cursor bD(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select unReadCount");
    localStringBuilder.append(" from rconversation where username").append(" = '").append(paramString1).append("' AND ( parentRef is ").append(com.tencent.mm.h.a.dPB).append(" or parentRef = '' ) ").append(ch.ja(null));
    String str = localStringBuilder.toString();
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor c(String paramString1, List paramList, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select * from rconversation where ");
    if (com.tencent.mm.h.a.dPB == paramString2)
      localStringBuilder.append(" ( parentRef is null  or ").append("parentRef = '' ) ");
    while (true)
    {
      localStringBuilder.append(ch.ja(paramString1));
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append(" and rconversation.username").append(" != '").append(str).append("'");
      }
      if ("*".equals(paramString2))
        localStringBuilder.append(" 1 = 1 ");
      else
        localStringBuilder.append("parentRef = '").append(ch.iV(paramString2)).append("' ");
    }
    localStringBuilder.append(" order by flag desc, conversationTime").append(" desc");
    return this.dtV.rawQuery(localStringBuilder.toString(), null);
  }

  public final void c(v paramv)
  {
    this.iil.remove(paramv);
  }

  public final void c(String[] paramArrayOfString, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Update rconversation");
    localStringBuilder.append(" set parentRef = '").append(ch.ja(paramString)).append("' where 1 != 1 ");
    for (int i = 0; i <= 0; i++)
    {
      String str2 = paramArrayOfString[0];
      localStringBuilder.append(" or username = '").append(str2).append("'");
    }
    String str1 = localStringBuilder.toString();
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "update sql: %s", new Object[] { str1 });
    if (this.dtV.bp("rconversation", str1))
      for (int j = 0; j <= 0; j++)
        b(3, this, paramArrayOfString[0]);
  }

  public final long d(r paramr)
  {
    String str = ch.ja(paramr.getUsername());
    if (str.length() <= 0)
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "insert conversation failed, username empty");
      return -1L;
    }
    paramr.l(c(paramr));
    e(paramr);
    long l = this.dtV.insert(yB(str), null, paramr.ir());
    if (l != -1L)
      b(2, this, paramr.getUsername());
    while (true)
    {
      return l;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = yB(str);
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "insert failed return -1, table:%s", arrayOfObject);
    }
  }

  public final Cursor d(String paramString1, List paramList, String paramString2)
  {
    String str1 = " ";
    if ((paramString2 != null) && (paramString2.length() > 0))
      str1 = " and rconversation.username = rcontact.username ";
    String str2 = "select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rconversation.digest, rconversation.digestUser, rconversation.hasTrunc, rcontact.nickname from rconversation,rcontact" + " " + " where rconversation.username" + " = rcontact.username" + str1 + ch.ja(paramString1);
    Object localObject1 = "";
    if ((paramList != null) && (paramList.size() > 0))
    {
      Iterator localIterator = paramList.iterator();
      String str6;
      for (Object localObject2 = localObject1; localIterator.hasNext(); localObject2 = (String)localObject2 + " and rconversation.username != '" + str6 + "'")
        str6 = (String)localIterator.next();
      localObject1 = localObject2;
    }
    String str3 = str2 + (String)localObject1;
    String str4 = str3 + " and ( verifyFlag & 8 ) = 0";
    if ((paramString2 != null) && (paramString2.length() > 0))
      str4 = str4 + new StringBuilder(" and ( rconversation.username like '%").append(paramString2).append("%' or content like '%").append(paramString2).append("%' or rcontact.nickname").append(" like '%").append(paramString2).append("%' or rcontact.alias").append(" like '%").append(paramString2).append("%' or rcontact.pyInitial").append(" like '%").append(paramString2).append("%' or rcontact.quanPin").append(" like '%").append(paramString2).append("%' or rcontact.conRemark").append(" like '%").append(paramString2).append("%'  ) ").toString();
    if ((paramString2 == null) || (paramString2.equals("")));
    for (String str5 = str4 + " order by flag desc, conversationTime desc"; ; str5 = str4 + " order by rconversation.username like \"%@chatroom\" asc")
    {
      z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "getSearchCursor sql " + str5);
      return this.dtV.rawQuery(str5, null);
    }
  }

  public final int dY(String paramString)
  {
    String str = "select sum(unReadCount) from rconversation,rcontact where rconversation.username = rcontact.username" + ch.ja(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    int j = 0;
    if (i > 0)
    {
      localCursor.moveToFirst();
      j = localCursor.getInt(0);
    }
    localCursor.close();
    return j;
  }

  public final boolean f(r paramr)
  {
    boolean bool;
    if (paramr == null)
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "unSetPlacedTop conversation null");
      bool = false;
    }
    do
    {
      return bool;
      bool = this.dtV.bp("rconversation", "update " + yB(paramr.getUsername()) + " set flag = " + a(paramr, 3, paramr.jM()) + " where username = \"" + ch.iV(paramr.getUsername()) + "\"");
    }
    while (!bool);
    b(3, this, paramr.getUsername());
    return bool;
  }

  public final w ih()
  {
    return this.iik;
  }

  public final Cursor k(String paramString, List paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select sum(unReadCount) from rconversation").append(", rcontact");
    localStringBuilder.append(" where rconversation.unReadCount").append(" > 0 AND (rconversation.parentRef").append(" is ").append(com.tencent.mm.h.a.dPB).append(" or parentRef = '' ) AND ").append("rconversation.username = ").append("rcontact.username").append(ch.ja(paramString)).append(" AND ( type & 512").append(" ) == 0 AND ( attrflag & 2097152 ) == 0").append(" AND rcontact.username").append(" != 'officialaccounts'");
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localStringBuilder.append(" AND rconversation.username").append(" != '").append(str2).append("'");
      }
    }
    String str1 = localStringBuilder.toString();
    z.v("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get total unread with black list, sql is %s", new Object[] { str1 });
    return this.dtV.rawQuery(str1, null);
  }

  protected final boolean vQ()
  {
    boolean bool = true;
    Object[] arrayOfObject;
    if ((this.dtV == null) || (this.dtV.aHQ()))
    {
      arrayOfObject = new Object[bool];
      if (this.dtV != null)
        break label54;
    }
    label54: for (Object localObject = "null"; ; localObject = Boolean.valueOf(this.dtV.aHQ()))
    {
      arrayOfObject[0] = localObject;
      z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }

  public final void yC(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = cl.aHP();
    z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "delChatContact username:%s  stack:%s", arrayOfObject);
    if (this.dtV.delete(yB(paramString), "username=?", new String[] { paramString }) != 0)
      b(5, this, paramString);
  }

  public final boolean yD(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = cl.aHP();
    z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "deleteMessageEndByName nameTag:%s  stack:%s", arrayOfObject);
    boolean bool = this.dtV.bp("rconversation", "delete from " + yB(paramString) + " where username like '%" + paramString + "'");
    if (bool)
      b(5, this, paramString);
    return bool;
  }

  public final r yE(String paramString)
  {
    Cursor localCursor = this.dtV.a(yB(paramString), null, "username=?", new String[] { paramString }, null, null);
    if (localCursor.getCount() <= 0)
    {
      z.w("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get null with username:" + paramString);
      localCursor.close();
      return null;
    }
    localCursor.moveToFirst();
    r localr = new r();
    localr.b(localCursor);
    localCursor.close();
    return localr;
  }

  public final boolean yF(String paramString)
  {
    boolean bool = true;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "update conversation failed");
      bool = false;
    }
    int i;
    do
    {
      r localr;
      int j;
      int k;
      do
      {
        do
        {
          do
          {
            return bool;
            localr = yE(paramString);
          }
          while (localr == null);
          if ((localr.jI() != 0) || (!paramString.equals(localr.getUsername())))
            break;
          j = localr.jS();
        }
        while ((ch.jb(paramString)) || (yE(paramString) == null));
        k = j & 0xFFEFFFFF;
      }
      while ((k == j) || (!this.dtV.bp("rconversation", "update " + yB(paramString) + " set attrflag = " + k + " where username = \"" + ch.iV(paramString) + "\"")));
      b(3, this, paramString);
      return bool;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("unReadCount", Integer.valueOf(0));
      localContentValues.put("atCount", Integer.valueOf(0));
      localContentValues.put("attrflag", Integer.valueOf(0xFFEFFFFF & localr.jS()));
      af localaf = this.dtV;
      String str = yB(paramString);
      String[] arrayOfString = new String[bool];
      arrayOfString[0] = ch.iV(paramString);
      i = localaf.update(str, localContentValues, "username= ?", arrayOfString);
      if (i > 0)
        b(3, this, paramString);
    }
    while (i > 0);
    return false;
  }

  public final boolean yG(String paramString)
  {
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "update conversation failed");
      bool = false;
    }
    do
    {
      return bool;
      r localr = yE(paramString);
      if ((localr == null) || ((localr.jI() > 0) && (paramString.equals(localr.getUsername()))))
        return true;
      bool = this.dtV.bp("rconversation", "update " + yB(paramString) + " set unReadCount = 1, atCount" + " = 0, attrflag = " + (0x100000 | localr.jS()) + ", flag = " + a(localr, ch.CM()) + " where username = \"" + ch.iV(paramString) + "\"");
    }
    while (!bool);
    b(3, this, paramString);
    return bool;
  }

  public final boolean yH(String paramString)
  {
    boolean bool = false;
    if ((paramString == null) || (paramString.length() <= 0))
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "setMoveUp conversation failed");
    r localr;
    do
    {
      return bool;
      localr = yE(paramString);
      if (localr == null)
      {
        z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "setMoveUp conv == null");
        return false;
      }
      bool = this.dtV.bp("rconversation", "update " + yB(localr.getUsername()) + " set flag = " + a(localr, 1, 1L + aIF()) + " where username = \"" + ch.iV(localr.getUsername()) + "\"");
    }
    while (!bool);
    b(3, this, localr.getUsername());
    return bool;
  }

  public final boolean yI(String paramString)
  {
    boolean bool = false;
    if ((paramString == null) || (paramString.length() <= 0))
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "setPlacedTop conversation failed");
    r localr;
    do
    {
      do
      {
        return bool;
        localr = yE(paramString);
        bool = false;
      }
      while (localr == null);
      bool = this.dtV.bp("rconversation", "update " + yB(localr.getUsername()) + " set flag = " + a(localr, 2, 0L) + " where username = \"" + ch.iV(localr.getUsername()) + "\"");
    }
    while (!bool);
    b(3, this, localr.getUsername());
    return bool;
  }

  public final boolean yJ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "unSetPlacedTop conversation failed");
      return false;
    }
    return f(yE(paramString));
  }

  public final boolean yK(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "isPlacedTop failed");
      return false;
    }
    return g(yE(paramString));
  }

  public final Cursor yM(String paramString)
  {
    String str = "select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, nickname from rconversation,rcontact where rconversation.username = rcontact.username" + ch.ja(paramString) + " order by flag desc, conversationTime" + " desc";
    return this.dtV.rawQuery(str, null);
  }

  public final boolean yN(String paramString)
  {
    Cursor localCursor = this.dtV.a(yB(paramString), null, "username=?", new String[] { paramString }, null, null);
    if (localCursor.getCount() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localCursor.close();
      return bool;
    }
  }

  public final Cursor yO(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT username, unReadCount");
    localStringBuilder.append(" FROM rconversation");
    localStringBuilder.append(" WHERE username LIKE '%@chatroom' ");
    localStringBuilder.append(ch.ja(paramString));
    localStringBuilder.append(" AND unReadCount > 0");
    String str = localStringBuilder.toString();
    z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get chatroom unread talker, sql is %s", new Object[] { str });
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor yP(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT COUNT(rconversation.username)");
    localStringBuilder.append(" FROM rconversation, rcontact");
    localStringBuilder.append(" WHERE unReadCount > 0");
    localStringBuilder.append(" AND rconversation.username = rcontact.username");
    localStringBuilder.append(ch.ja(paramString));
    localStringBuilder.append(" AND ( type & 512").append(" ) == 0");
    localStringBuilder.append(" AND ( attrflag & 2097152 ) == 0");
    localStringBuilder.append(" AND ( ( parentRef is ").append(com.tencent.mm.h.a.dPB).append(" or parentRef = '' ) ");
    localStringBuilder.append(" AND rcontact.username").append(" != 'officialaccounts')");
    String str = localStringBuilder.toString();
    z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get total unread talker, sql is %s", new Object[] { str });
    return this.dtV.rawQuery(str, null);
  }

  public final int yQ(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT SUM(rconversation.unReadCount").append(")");
    localStringBuilder.append(" FROM rconversation");
    localStringBuilder.append(" WHERE parentRef = '").append(paramString).append("'");
    String str = localStringBuilder.toString();
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "getTotalUnreadBizCount sql %s", new Object[] { str });
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = 0;
    if (localCursor != null)
    {
      int j = localCursor.getCount();
      i = 0;
      if (j > 0)
      {
        localCursor.moveToFirst();
        i = localCursor.getInt(0);
      }
      localCursor.close();
    }
    return i;
  }

  public final String yR(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT rconversation.username");
    localStringBuilder.append(" FROM rconversation");
    localStringBuilder.append(" WHERE parentRef = '").append(paramString).append("'");
    localStringBuilder.append(" ORDER BY flag DESC, conversationTime").append(" DESC ");
    localStringBuilder.append(" LIMIT 1 ");
    String str1 = localStringBuilder.toString();
    z.i("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "get last enterprise conversation user, sql is %s", new Object[] { str1 });
    Cursor localCursor = this.dtV.rawQuery(str1, null);
    String str2 = null;
    if (localCursor != null)
    {
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        str2 = localCursor.getString(0);
        localCursor.close();
      }
    }
    else
      return str2;
    localCursor.close();
    return null;
  }

  public final void yT(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Update rconversation");
    localStringBuilder.append(" set parentRef = '', unReadCount = 0").append(" where username = \"" + ch.iV(paramString) + "\"");
    String str = localStringBuilder.toString();
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "removeParentRefAndUnread sql: %s", new Object[] { str });
    if (this.dtV.bp("rconversation", str))
      b(3, this, paramString);
  }

  public final void yU(String paramString)
  {
    int i = this.dtV.delete(yB(paramString), "username=? or parentRef =?", new String[] { paramString, paramString });
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(i);
    z.d("!44@/B4Tb64lLpJN/RyYD3u7HK+YneAQ/0gN4D0Emw3Mmi8=", "delEnterpriseFatherAndChildConv %s %d", arrayOfObject);
    if (i != 0)
      b(5, this, paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.s
 * JD-Core Version:    0.6.2
 */