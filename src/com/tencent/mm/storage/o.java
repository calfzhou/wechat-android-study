package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.mm.a.d;
import com.tencent.mm.as.c;
import com.tencent.mm.as.g;
import com.tencent.mm.dbsupport.newcursor.n;
import com.tencent.mm.g.a;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class o extends ap
  implements g
{
  public static final String[] cKz = { "CREATE UNIQUE INDEX IF NOT EXISTS  contact_username_unique_index ON rcontact ( username )", "CREATE INDEX IF NOT EXISTS  contact_alias_index ON rcontact ( alias )", "CREATE INDEX IF NOT EXISTS  en_username_unique_index ON rcontact ( encryptUsername )", "CREATE UNIQUE INDEX IF NOT EXISTS  bottle_username_unique_index ON bottlecontact ( username )", "CREATE INDEX IF NOT EXISTS type_verifyFlag_index ON rcontact ( type,verifyFlag ) " };
  public static final String[] dmc;
  private static String iih = "showHead = 32";
  private static String iii = "type & 64 !=0 ";
  private com.tencent.mm.as.f djR = null;
  private final am dqF = new p(this);
  private af dtV;
  private af iie;
  private final d iif = new d(200);
  private final d iig = new d(400);

  static
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = ah.a(i.dhu, "rcontact");
    arrayOfString[1] = ah.a(i.dhu, "bottlecontact");
    arrayOfString[2] = ah.a(j.dhu, "ContactCmdBuf");
    arrayOfString[3] = "CREATE TABLE IF NOT EXISTS contact ( contactID INTEGER PRIMARY KEY, sex INT, type INT, showHead INT, username VARCHAR(40), nickname VARCHAR(40), pyInitial VARCHAR(40), quanPin VARCHAR(60), reserved TEXT );";
    arrayOfString[4] = "CREATE TABLE IF NOT EXISTS contact_ext ( username VARCHAR(40), Uin INTEGER DEFAULT 0, Email VARCHAR(128), Mobile VARCHAR(40), ShowFlag INTEGER DEFAULT 0 , ConType INTEGER DEFAULT 0 , ConRemark TEXT, ConRemark_PYShort TEXT, ConRemark_PYFull TEXT, ConQQMBlog TEXT, ConSMBlog TEXT, DomainList TEXT, reserved1 INT DEFAULT 0 , reserved2 INT DEFAULT 0 , reserved3 INT DEFAULT 0 , reserved4 INT DEFAULT 0 , reserved5 INT DEFAULT 0 , reserved6 TEXT, reserved7 TEXT, reserved8 TEXT, reserved9 TEXT, reserved10 TEXT, weiboflag  INT DEFAULT 0 ,weibonickname TEXT  );";
    dmc = arrayOfString;
  }

  public o(com.tencent.mm.as.h paramh, com.tencent.mm.as.f paramf)
  {
    Cursor localCursor1 = paramh.rawQuery("PRAGMA table_info( contact_ext )", null);
    int k = 0;
    int m = 0;
    while ((localCursor1.moveToNext()) && ((m == 0) || (k == 0)))
    {
      int i2 = localCursor1.getColumnIndex("name");
      if (i2 >= 0)
      {
        String str = localCursor1.getString(i2);
        if ("weiboNickname".equalsIgnoreCase(str))
          k = i;
        else if ("weiboFlag".equalsIgnoreCase(str))
          m = i;
      }
    }
    localCursor1.close();
    if (m == 0)
      paramh.bp("contact_ext", "Alter table contact_ext add weiboFlag INT DEFAULT 0 ");
    if (k == 0)
      paramh.bp("contact_ext", "Alter table contact_ext add weiboNickname INT DEFAULT 0 ");
    Cursor localCursor2 = paramh.rawQuery("PRAGMA table_info( rcontact )", null);
    int i1;
    do
    {
      if (!localCursor2.moveToNext())
        break;
      i1 = localCursor2.getColumnIndex("name");
    }
    while ((i1 < 0) || (!"verifyFlag".equalsIgnoreCase(localCursor2.getString(i1))));
    while (true)
    {
      localCursor2.close();
      if (i == 0)
        paramh.bp("rcontact", "Alter table rcontact add verifyFlag INT DEFAULT 0 ");
      Iterator localIterator1 = ah.a(a.dhu, "bottlecontact", paramh).iterator();
      while (localIterator1.hasNext())
        paramh.bp("bottlecontact", (String)localIterator1.next());
      Iterator localIterator2 = ah.a(a.dhu, "rcontact", paramh).iterator();
      while (localIterator2.hasNext())
        paramh.bp("rcontact", (String)localIterator2.next());
      String[] arrayOfString = cKz;
      int n = arrayOfString.length;
      while (j < n)
      {
        paramh.bp("rcontact", arrayOfString[j]);
        j++;
      }
      this.dtV = paramh;
      this.djR = paramf;
      this.iie = paramh;
      return;
      i = 0;
    }
  }

  private Cursor a(String paramString1, String paramString2, String paramString3, List paramList1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, List paramList2)
  {
    String str1 = "select * ,rowid from rcontact ";
    if (paramInt == 2)
      str1 = "select 2, *,rowid from rcontact ";
    String str2 = str1 + e(paramString2, paramString3, paramList1) + yA(paramString1) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str2);
    Cursor localCursor = this.dtV.rawQuery(str2, null);
    if (paramBoolean3)
    {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      while (localCursor.moveToNext())
      {
        String str3 = localCursor.getString(localCursor.getColumnIndex("username"));
        if (!str3.endsWith("@chatroom"))
          localArrayList1.add(str3);
        else
          localArrayList2.add(str3);
      }
      if ((paramList2 != null) && (paramList2.size() != 0))
        localArrayList1.addAll(paramList2);
      if (localArrayList1.size() != 0)
        return new MergeCursor(new Cursor[] { localCursor, a(paramString1, localArrayList1, localArrayList2, null, paramList1) });
    }
    return localCursor;
  }

  private static String a(String paramString, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    if (paramArrayList1.size() == 0)
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" and (username in (");
    localStringBuffer.append("select chatroomname from chatroom where ");
    if ((paramArrayList2 != null) && (paramArrayList2.size() != 0))
    {
      Iterator localIterator3 = paramArrayList2.iterator();
      while (localIterator3.hasNext())
      {
        String str3 = (String)localIterator3.next();
        localStringBuffer.append("chatroomname != '" + str3 + "' and ");
      }
    }
    localStringBuffer.append("(memberlist like '%" + paramString + "%'");
    Iterator localIterator1 = paramArrayList1.iterator();
    while (localIterator1.hasNext())
    {
      String str2 = (String)localIterator1.next();
      localStringBuffer.append(" or memberlist like '%" + str2 + "%'");
    }
    if ((paramArrayList3 != null) && (paramArrayList3.size() != 0))
    {
      Iterator localIterator2 = paramArrayList3.iterator();
      while (localIterator2.hasNext())
      {
        String str1 = (String)localIterator2.next();
        localStringBuffer.append(" or chatroomname = '" + str1 + "'");
      }
    }
    localStringBuffer.append(")))");
    return localStringBuffer.toString();
  }

  private static String aIv()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" order by showHead asc, ");
    localStringBuffer.append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" case when length(conRemark) > 0 then upper(conRemark) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" upper(quanPin) asc, ");
    localStringBuffer.append(" upper(nickname) asc, ");
    localStringBuffer.append(" upper(username) asc ");
    return localStringBuffer.toString();
  }

  private static String aIw()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" order by case when verifyFlag & " + i.aIi() + " != 0 then 0 else 1 end , showHead asc, ");
    localStringBuffer.append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" case when length(conRemark) > 0 then upper(conRemark) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" upper(quanPin) asc, ");
    localStringBuffer.append(" upper(nickname) asc, ");
    localStringBuffer.append(" upper(username) asc ");
    return localStringBuffer.toString();
  }

  private static String aIx()
  {
    String str1 = "type & " + a.uN() + "!=0";
    String str2 = " where (" + str1 + ") and ";
    return str2 + "type & " + a.xr() + "=0  ";
  }

  private static String aIy()
  {
    String str = "type & " + a.uN() + "!=0";
    return "( (" + str + ") and type & " + a.uR() + "=0 and username like '%" + "@chatroom')";
  }

  private static String aIz()
  {
    String str = "type & " + a.uN() + "!=0";
    return "( (" + str + ") and type & " + a.uR() + "=0 and username like '%" + "@talkroom')";
  }

  private static String aM(List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append(" or username = '").append(str).append("'");
    }
    return localStringBuilder.toString();
  }

  public static String b(String paramString, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    String str1 = " and ( 1 != 1 ";
    int j = 0;
    if (j < i)
    {
      String str2 = paramArrayOfString[j];
      if ("@all.android".equals(str2))
        str1 = str1 + " or 1 = 1";
      while (true)
      {
        j++;
        break;
        if ("@micromsg.qq.com".equals(str2))
          str1 = str1 + " or " + paramString + " not like '%@%'";
        else if ("@chatroom".equals(str2))
          str1 = str1 + " or " + paramString + " like '%@chatroom'";
        else if ("@talkroom".equals(str2))
          str1 = str1 + " or " + paramString + " like '%@talkroom'";
        else if ("@t.qq.com".equals(str2))
          str1 = str1 + " or " + paramString + " like '%@t.qq.com'";
        else if ("@qqim".equals(str2))
          str1 = str1 + " or " + paramString + " like '%@qqim'";
        else if ("@chatroom_exclusive".equals(str2))
          str1 = str1 + " or " + paramString + "not like %@chatroom";
      }
    }
    return str1 + " ) ";
  }

  private static String e(String paramString1, String paramString2, List paramList)
  {
    boolean bool = true;
    String str1;
    if ((paramString1 == null) || (paramString1.equals("@all.android")))
      str1 = "" + r(bool, false);
    Object localObject2;
    while (true)
    {
      localObject1 = "";
      if ((paramList == null) || (paramList.size() <= 0))
        break label1979;
      Iterator localIterator = paramList.iterator();
      String str2;
      for (localObject2 = localObject1; localIterator.hasNext(); localObject2 = (String)localObject2 + " and username != '" + str2 + "'")
        str2 = (String)localIterator.next();
      if (paramString1.equals("@all.contact.android"))
      {
        str1 = "" + aIx();
      }
      else if (paramString1.equals("@all.chatroom.contact"))
      {
        StringBuilder localStringBuilder11 = new StringBuilder().append("");
        String str30 = "(type & " + a.uN() + "!=0 and username like '%@chatroom" + "')";
        String str31 = " where (" + str30 + ") and ";
        str1 = new StringBuilder().append(str31).append("type & ").append(a.xr()).append("=0 ").toString();
      }
      else
      {
        if (paramString1.equals("@all.contact.without.chatroom"))
        {
          StringBuilder localStringBuilder10 = new StringBuilder().append("");
          String str28 = r(false, false);
          if ((str28 != null) && (str28.length() > 0));
          while (true)
          {
            Assert.assertTrue(bool);
            String str29 = " or (" + aIz() + ')';
            str1 = new StringBuilder().append(str28).append(" and ( username not like '%@%'").append(str29).append(")").toString();
            break;
            bool = false;
          }
        }
        if (paramString1.equals("@black.android"))
        {
          str1 = "" + new StringBuilder(" where type & ").append(a.uR()).append("!=0").toString();
        }
        else if (paramString1.equals("@t.qq.com"))
        {
          str1 = "" + new StringBuilder(" where username like '%").append("@t.qq.com").append("'").toString();
        }
        else
        {
          if (paramString1.equals("@domain.android"))
          {
            StringBuilder localStringBuilder9 = new StringBuilder().append("");
            String str27 = r(bool, false);
            if ((str27 != null) && (str27.length() > 0));
            while (true)
            {
              Assert.assertTrue(bool);
              str1 = new StringBuilder().append(str27).append(" and domainList like '%").append(paramString2).append("%'").toString();
              break;
              bool = false;
            }
          }
          if (paramString1.equals("@micromsg.qq.com"))
          {
            StringBuilder localStringBuilder8 = new StringBuilder().append("");
            String str24 = r(false, false);
            if ((str24 != null) && (str24.length() > 0));
            while (true)
            {
              Assert.assertTrue(bool);
              String str25 = " or (" + aIy() + ')';
              String str26 = " or (" + aIz() + ')';
              str1 = new StringBuilder().append(str24).append(" and ( username not like '%@%'").append(str25).append(str26).append(")").toString();
              break;
              bool = false;
            }
          }
          if (paramString1.equals("@micromsg.no.verify.biz.qq.com"))
          {
            StringBuilder localStringBuilder7 = new StringBuilder().append("");
            String str18 = "type & " + a.uN() + " !=0 ";
            String str19 = " where (" + str18 + ") and ";
            String str20 = str19 + "type & " + a.xr() + " =0 and ";
            String str21 = str20 + "type & " + a.uR() + " =0 and ";
            String str22 = str21 + "verifyFlag & " + i.aIi() + " =0";
            if ((str22 != null) && (str22.length() > 0));
            while (true)
            {
              Assert.assertTrue(bool);
              String str23 = " or (" + aIy() + ')';
              str1 = new StringBuilder().append(str22).append(" and ( username not like '%@%'").append(str23).append(")").toString();
              break;
              bool = false;
            }
          }
          if (paramString1.equals("@micromsg.with.all.biz.qq.com"))
          {
            StringBuilder localStringBuilder6 = new StringBuilder().append("");
            String str13 = "type & " + a.uN() + " !=0 ";
            String str14 = " where (" + str13 + ") and ";
            String str15 = str14 + "type & " + a.xr() + " =0 and ";
            String str16 = str15 + "type & " + a.uR() + " =0";
            if ((str16 != null) && (str16.length() > 0));
            while (true)
            {
              Assert.assertTrue(bool);
              String str17 = " or (" + aIy() + ')';
              str1 = new StringBuilder().append(str16).append(" and ( username not like '%@%'").append(str17).append(")").toString();
              break;
              bool = false;
            }
          }
          if (paramString1.equals("@qqim"))
          {
            StringBuilder localStringBuilder5 = new StringBuilder().append("");
            String str12 = r(false, false);
            if ((str12 != null) && (str12.length() > 0));
            while (true)
            {
              Assert.assertTrue(bool);
              str1 = new StringBuilder().append(str12).append(" and username like '%").append("@qqim").append("'").toString();
              break;
              bool = false;
            }
          }
          if (paramString1.equals("@all.chatroom"))
          {
            StringBuilder localStringBuilder4 = new StringBuilder().append("");
            String str8 = "type & " + a.uN() + " !=0";
            String str9 = str8 + " or type & 2 !=0";
            String str10 = str9 + " or type & 4 !=0";
            String str11 = str10 + " or 1";
            str1 = new StringBuilder(" where (").append(str11).append(") ").toString();
          }
          else if (paramString1.equals("@verify.contact"))
          {
            StringBuilder localStringBuilder3 = new StringBuilder().append("");
            String str6 = "type & " + a.uN() + " != 0 and ";
            String str7 = str6 + "verifyFlag & " + i.aIh() + " != 0";
            str1 = new StringBuilder(" where (").append(str7).append(") ").toString();
          }
          else if (paramString1.equals("@biz.contact"))
          {
            StringBuilder localStringBuilder2 = new StringBuilder().append("");
            String str4 = "type & " + a.uN() + " != 0 and ";
            String str5 = str4 + "verifyFlag & " + i.aIi() + " != 0";
            str1 = new StringBuilder(" where (").append(str5).append(") ").toString();
          }
          else if (paramString1.equals("@all.weixin.android"))
          {
            StringBuilder localStringBuilder1 = new StringBuilder().append("");
            String str3 = "type & " + a.uN() + " != 0 or  (username not like '%" + "@qqim' and username not like '%" + "@qr' and username not like '%" + "@bottle' and username not like '%" + "@fb' and username not like '%" + "@google' and username not like '%" + "@t.qq.com' and username not like '%" + "@t.sina.com' and username not like '%" + "@t.sina.com')";
            str1 = new StringBuilder(" where (").append(str3).append(") ").toString();
          }
          else
          {
            z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "unknow role type");
            str1 = "" + r(false, false);
          }
        }
      }
    }
    Object localObject1 = localObject2;
    label1979: return str1 + (String)localObject1;
  }

  private static String e(List paramList, boolean paramBoolean)
  {
    String str1 = r(false, paramBoolean) + " AND " + iii;
    Object localObject1 = "";
    if ((paramList != null) && (paramList.size() > 0))
    {
      Iterator localIterator = paramList.iterator();
      String str2;
      for (Object localObject2 = localObject1; localIterator.hasNext(); localObject2 = (String)localObject2 + " AND username != '" + str2 + "'")
        str2 = (String)localIterator.next();
      localObject1 = localObject2;
    }
    return str1 + (String)localObject1;
  }

  private static String r(boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = "type & " + a.uN() + "!=0";
    if (paramBoolean1)
      str1 = str1 + " or type & " + a.uT() + "!=0";
    String str2 = " where (" + str1 + ")";
    String str3 = str2 + " and type & " + a.xr() + "=0 ";
    String str4 = str3 + " and type & " + a.uR() + " =0 ";
    if (!paramBoolean2)
      str4 = str4 + " and verifyFlag & " + i.aIi() + " =0 ";
    return str4;
  }

  private static String yA(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return "";
    String str1 = " and (" + "conRemark like '%" + paramString + "%' or ";
    String str2 = str1 + "conRemarkPYFull like '%" + paramString + "%' or ";
    String str3 = str2 + "conRemarkPYShort like '%" + paramString + "%' or ";
    String str4 = str3 + "alias like '%" + paramString + "%' or ";
    String str5 = str4 + "username like '%" + paramString + "%' or ";
    String str6 = str5 + "nickname like '%" + paramString + "%' or ";
    String str7 = str6 + "pyInitial like '%" + paramString + "%' or ";
    return str7 + "quanPin like '%" + paramString + "%' )";
  }

  private static String yk(String paramString)
  {
    return "select *,rowid from " + yl(paramString) + " ";
  }

  public static String yl(String paramString)
  {
    if (i.yc(paramString))
      return "bottlecontact";
    return "rcontact";
  }

  private void yn(String paramString)
  {
    if (!ch.jb(paramString))
    {
      this.iif.remove(paramString);
      this.iig.remove(paramString);
    }
  }

  private static String z(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      return "";
    Object localObject = " and (";
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      if (i > 0)
        localObject = (String)localObject + " or ";
      String str = (String)localObject + "username = '" + paramArrayOfString[i] + "' ";
      i++;
      localObject = str;
    }
    return (String)localObject + " )";
  }

  public final void C(i parami)
  {
    if ((parami == null) || (parami.getUsername() == null) || (parami.getType() == 0))
      return;
    this.iif.b(parami.getUsername(), parami);
    this.iig.b(parami.getUsername(), Integer.valueOf(parami.getType()));
  }

  public final boolean D(i parami)
  {
    if (yu(parami.getUsername()))
      if (a(parami.getUsername(), parami) != 0);
    while (G(parami) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }

  public final boolean E(i parami)
  {
    boolean bool;
    if (parami != null)
    {
      bool = true;
      Assert.assertTrue("contact NULL !", bool);
      yn(parami.getUsername());
      if (!ch.jb(parami.jk()))
        yn(parami.jk());
      parami.be(parami.ox());
      this.dqF.ae(parami);
      this.dqF.Bo();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = parami.getUsername();
      arrayOfObject[1] = Integer.valueOf(parami.jc());
      arrayOfObject[2] = Integer.valueOf(parami.jd());
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "replace : username=%s, showHead=%d, verifyFlag=%d", arrayOfObject);
      ContentValues localContentValues = parami.ir();
      if ((int)parami.dhv > 0)
        localContentValues.put("rowid", Integer.valueOf((int)parami.dhv));
      if (this.dtV.replace(yl(parami.getUsername()), a.dhu.ihb, localContentValues) <= 0L)
        break label183;
    }
    label183: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        break label189;
      return false;
      bool = false;
      break;
    }
    label189: b(4, this, parami.getUsername());
    return true;
  }

  public final boolean F(i parami)
  {
    return G(parami) > 0;
  }

  public final int G(i parami)
  {
    if (ch.ja(parami.getUsername()).length() <= 0)
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "FATAL ERROR, invalid contact, empty username");
      return -1;
    }
    parami.be(parami.ox());
    this.dqF.ae(parami);
    this.dqF.Bo();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = parami.getUsername();
    arrayOfObject[1] = Integer.valueOf(parami.jc());
    arrayOfObject[2] = Integer.valueOf(parami.jd());
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "insert : username=%s, showHead=%d, verifyFlag=%d", arrayOfObject);
    ContentValues localContentValues = parami.ir();
    int i = (int)this.dtV.insert(yl(parami.getUsername()), a.dhu.ihb, localContentValues);
    if (i != -1)
    {
      parami.dhv = i;
      C(parami);
      b(2, this, parami.getUsername());
      return i;
    }
    z.e("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "insert failed: username=" + parami.getUsername());
    return -1;
  }

  public final int a(com.tencent.mm.as.f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final int a(String paramString, i parami)
  {
    if (i.yc(paramString))
      paramString = i.ye(paramString);
    yn(paramString);
    if (!ch.jb(parami.jk()))
      yn(parami.jk());
    parami.be(parami.ox());
    this.dqF.ae(parami);
    this.dqF.Bo();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = parami.getUsername();
    arrayOfObject[1] = Integer.valueOf(parami.jc());
    arrayOfObject[2] = Integer.valueOf(parami.jd());
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "update : username=%s, showHead=%d, verifyFlag=%d", arrayOfObject);
    ContentValues localContentValues = parami.ir();
    if ((int)parami.dhv > 0)
      localContentValues.put("rowid", Integer.valueOf((int)parami.dhv));
    int i = localContentValues.size();
    int j = 0;
    if (i > 0)
      j = this.dtV.update(yl(paramString), localContentValues, "username=?", new String[] { paramString });
    if (j != 0)
      b(4, this, paramString);
    return j;
  }

  public final Cursor a(String paramString1, String paramString2, String paramString3, List paramList, boolean paramBoolean)
  {
    return a(paramString1, paramString2, paramString3, paramList, false, false, paramBoolean, 1, null);
  }

  public final Cursor a(String paramString1, String paramString2, List paramList1, List paramList2, List paramList3)
  {
    String str = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList1) + aM(paramList2) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (paramList3.size() == 0)
      return localCursor;
    Cursor[] arrayOfCursor = new Cursor[1 + paramList3.size()];
    for (int i = 0; i < paramList3.size(); i++)
      arrayOfCursor[i] = ((Cursor)paramList3.get(i));
    arrayOfCursor[(-1 + arrayOfCursor.length)] = localCursor;
    return new MergeCursor(arrayOfCursor);
  }

  public final Cursor a(String paramString1, String paramString2, List paramList1, List paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff from rcontact " + e(paramString1, paramString2, paramList1) + aM(paramList2) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str1);
    if (paramBoolean1)
    {
      n[] arrayOfn = new n[2];
      String str2 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff from rcontact " + e(paramList1, paramBoolean2) + aIw();
      z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "favourSql " + str1);
      Cursor localCursor1 = this.dtV.J(str2, true);
      Cursor localCursor2 = this.dtV.J(str1, true);
      if (((localCursor1 instanceof n)) && ((localCursor2 instanceof n)))
      {
        arrayOfn[0] = ((n)localCursor1);
        arrayOfn[1] = ((n)localCursor2);
        return new com.tencent.mm.dbsupport.newcursor.h(arrayOfn);
      }
      return c.aKQ();
    }
    return this.dtV.J(str1, true);
  }

  public final Cursor a(String paramString1, String paramString2, List paramList, boolean paramBoolean)
  {
    return a(paramString1, paramString2, paramList, paramBoolean, false);
  }

  public final Cursor a(String paramString1, String paramString2, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + aM(null) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str1);
    if (paramBoolean1)
    {
      Cursor[] arrayOfCursor = new Cursor[2];
      String str2 = "select * ,rowid from rcontact " + e(paramList, false) + aIw();
      z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "favourSql " + str1);
      arrayOfCursor[0] = this.dtV.rawQuery(str2, null);
      arrayOfCursor[1] = this.dtV.rawQuery(str1, null);
      return new MergeCursor(arrayOfCursor);
    }
    return this.dtV.rawQuery(str1, null);
  }

  public final Cursor a(String paramString, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, List paramList)
  {
    String str = "select * ,rowid from rcontact " + e("@all.contact.android", "", paramList) + a(paramString, paramArrayList1, paramArrayList2, paramArrayList3) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "roomsSql " + str);
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor a(String paramString1, List paramList, Cursor paramCursor, String paramString2)
  {
    String str1 = "select * ,rowid from rcontact " + e(paramList, false) + aIw();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "favourSql " + str1);
    String str2 = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + aIv();
    Cursor[] arrayOfCursor;
    if (ch.jb(paramString2))
      if (paramCursor != null)
      {
        arrayOfCursor = new Cursor[3];
        arrayOfCursor[0] = paramCursor;
        arrayOfCursor[1] = this.dtV.rawQuery(str1, null);
        arrayOfCursor[2] = this.dtV.rawQuery(str2, null);
      }
    while (true)
    {
      return new MergeCursor(arrayOfCursor);
      arrayOfCursor = new Cursor[2];
      arrayOfCursor[0] = this.dtV.rawQuery(str1, null);
      arrayOfCursor[1] = this.dtV.rawQuery(str2, null);
      continue;
      if (paramCursor != null)
      {
        arrayOfCursor = new Cursor[2];
        arrayOfCursor[0] = paramCursor;
        arrayOfCursor[1] = this.dtV.rawQuery(str2, null);
      }
      else
      {
        arrayOfCursor = new Cursor[1];
        arrayOfCursor[0] = this.dtV.rawQuery(str2, null);
      }
    }
  }

  public final Cursor a(String[] paramArrayOfString, String paramString1, String paramString2, List paramList)
  {
    String str = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + z(paramArrayOfString) + yA(paramString2) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "dkaddr : " + str);
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor a(String[] paramArrayOfString, String paramString, List paramList)
  {
    Object localObject = "select * ,rowid from rcontact " + e(paramString, null, paramList) + z(paramArrayOfString);
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      String str1 = (String)localObject + " order by 1=1 ";
      int i = paramArrayOfString.length;
      localObject = str1;
      int j = 0;
      while (j < i)
      {
        String str2 = paramArrayOfString[j];
        String str3 = (String)localObject + ",username='" + str2 + "' desc";
        j++;
        localObject = str3;
      }
    }
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getSearchCursorByArrOrder sql : " + (String)localObject);
    return this.dtV.rawQuery((String)localObject, null);
  }

  public final void a(q paramq)
  {
    this.dqF.a(paramq, null);
  }

  public final Cursor aIA()
  {
    return this.dtV.rawQuery("select * ,rowid from rcontact  where rowid = -1", null);
  }

  public final List aIp()
  {
    String str = "select username from rcontact where " + aIy();
    Cursor localCursor = this.dtV.rawQuery(str, null);
    LinkedList localLinkedList = new LinkedList();
    if (localCursor == null)
      return localLinkedList;
    if (localCursor.moveToFirst())
      do
        localLinkedList.add(localCursor.getString(0));
      while (localCursor.moveToNext());
    localCursor.close();
    return localLinkedList;
  }

  public final Cursor aIq()
  {
    String str = "select * ,rowid from rcontact  where " + new StringBuilder("type & ").append(a.uR()).append("=0 and username like '%").append("@chatroom'").toString();
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor aIr()
  {
    String str = "select * ,rowid from rcontact " + aIx() + " AND type & 256" + " !=0 " + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str);
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor aIs()
  {
    String str = "select * ,rowid from rcontact  where " + iii + " and verifyFlag & " + i.aIi() + " !=0 ";
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "dkbf:" + str);
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor aIt()
  {
    String str = "select * ,rowid from rcontact " + aIx() + " AND " + iii + " AND " + iih + aIw();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str);
    return this.dtV.rawQuery(str, null);
  }

  public final int aIu()
  {
    String str = "select count(rowid) from rcontact " + e("@biz.contact", null, null);
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    int j = 0;
    if (i > 0)
    {
      localCursor.moveToLast();
      j = localCursor.getInt(0);
    }
    localCursor.close();
    return j;
  }

  public final Cursor aJ(List paramList)
  {
    int i = 0;
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str1 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff from rcontact  where ";
      label22: if (i >= paramList.size())
        break label142;
      if (i == -1 + paramList.size())
        break label97;
    }
    label97: for (String str1 = str1 + "username = '" + (String)paramList.get(i) + "' OR "; ; str1 = str1 + "username = '" + (String)paramList.get(i) + "'")
    {
      i++;
      break label22;
      bool = false;
      break;
    }
    label142: String str2 = str1 + aIv();
    return this.dtV.rawQuery(str2, null);
  }

  public final Cursor aK(List paramList)
  {
    int i = 0;
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str1 = "select * ,rowid from rcontact  where ";
      label22: if (i >= paramList.size())
        break label142;
      if (i == -1 + paramList.size())
        break label97;
    }
    label97: for (String str1 = str1 + "username = '" + (String)paramList.get(i) + "' OR "; ; str1 = str1 + "username = '" + (String)paramList.get(i) + "'")
    {
      i++;
      break label22;
      bool = false;
      break;
    }
    label142: String str2 = str1 + aIv();
    return this.dtV.rawQuery(str2, null);
  }

  public final Cursor aL(List paramList)
  {
    int i = 0;
    if (paramList.size() > 0);
    StringBuilder localStringBuilder;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("select username, alias").append(", nickname, conRemark");
      localStringBuilder.append(" from rcontact where ");
      while (i < paramList.size())
      {
        if (i != 0)
          localStringBuilder.append(" or ");
        localStringBuilder.append("username = '").append((String)paramList.get(i)).append("'");
        i++;
      }
    }
    return this.dtV.rawQuery(localStringBuilder.toString(), null);
  }

  public final List aN(List paramList)
  {
    if (paramList.isEmpty())
    {
      z.w("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getFilterList: but white list is empty");
      return new LinkedList();
    }
    long l = ch.CN();
    LinkedList localLinkedList = new LinkedList();
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("username='").append((String)paramList.get(0)).append("'");
    for (int i = 1; i < paramList.size(); i++)
      localStringBuilder1.append(" or username='").append((String)paramList.get(i)).append("'");
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("showHead asc, ");
    localStringBuilder2.append("pyInitial asc, ");
    localStringBuilder2.append("quanPin asc, ");
    localStringBuilder2.append("nickname asc, ");
    localStringBuilder2.append("username asc ");
    Object[] arrayOfObject1 = new Object[6];
    arrayOfObject1[0] = "username";
    arrayOfObject1[1] = "rcontact";
    arrayOfObject1[2] = localStringBuilder1.toString();
    arrayOfObject1[3] = "type";
    arrayOfObject1[4] = Integer.valueOf(a.uN());
    arrayOfObject1[5] = localStringBuilder2.toString();
    String str = String.format("select %s from %s where (%s) and (%s & %d != 0)  order by %s", arrayOfObject1);
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getFilterList: sql is %s", new Object[] { str });
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      while (!localCursor.isAfterLast())
      {
        localLinkedList.add(localCursor.getString(0));
        localCursor.moveToNext();
      }
      localCursor.close();
    }
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Long.valueOf(ch.ad(l));
    arrayOfObject2[1] = paramList;
    arrayOfObject2[2] = localLinkedList.toString();
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getFilerList: use time[%d ms] whiteList[%s], usernameList[%s]", arrayOfObject2);
    return localLinkedList;
  }

  public final int aY(List paramList)
  {
    String str = "select count(*) from rcontact " + e(paramList, false) + aIw();
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      return 0;
    }
    localCursor.moveToFirst();
    int i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }

  public final int b(String paramString, i parami)
  {
    if ((ch.jb(paramString)) || (ch.jb(parami.getUsername())))
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "update : wrong input!");
      return 0;
    }
    if (i.yc(parami.getUsername()))
      parami.setUsername(i.ye(parami.getUsername()));
    yn(parami.getUsername());
    if (!ch.jb(parami.jk()))
      yn(parami.jk());
    parami.be(parami.ox());
    this.dqF.ae(parami);
    this.dqF.Bo();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = parami.getUsername();
    arrayOfObject[2] = Integer.valueOf(parami.jc());
    arrayOfObject[3] = Integer.valueOf(parami.jd());
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "update : oldUsername=%s, username=%s, showHead=%d, verifyFlag=%d", arrayOfObject);
    int i = this.dtV.delete(yl(paramString), "username=?", new String[] { paramString });
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "delete " + yl(paramString) + " user :" + paramString + ", res:" + i);
    ContentValues localContentValues = parami.ir();
    int j = localContentValues.size();
    int k = 0;
    if (j > 0)
      k = (int)this.dtV.replace(yl(parami.getUsername()), a.dhu.ihb, localContentValues);
    b(3, this, paramString);
    b(3, this, parami.getUsername());
    return k;
  }

  public final int b(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select count(username) from rcontact where ");
    localStringBuilder.append("type & ").append(a.uN()).append(" !=0 and ");
    localStringBuilder.append("type & ").append(a.xr()).append(" =0 and ");
    localStringBuilder.append("type & ").append(a.uR()).append(" =0 and ");
    localStringBuilder.append("verifyFlag & 8").append(" = 0 and ");
    localStringBuilder.append("( username not like '%@%')");
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      int k = paramArrayOfString1.length;
      for (int m = 0; m < k; m++)
      {
        String str3 = paramArrayOfString1[m];
        localStringBuilder.append(" and rcontact.username").append(" != '").append(str3).append("'");
      }
    }
    for (int i = 0; i < 4; i++)
    {
      String str2 = paramArrayOfString2[i];
      localStringBuilder.append(" and rcontact.username").append(" != '").append(str2).append("'");
    }
    localStringBuilder.append(" or username = 'weixin").append("'");
    String str1 = localStringBuilder.toString();
    Cursor localCursor = this.dtV.rawQuery(str1, null);
    int j;
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      j = localCursor.getInt(0);
      localCursor.close();
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str1;
      arrayOfObject[1] = Integer.valueOf(j);
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getNormalContactCount, sql:%s, result:%d", arrayOfObject);
      return j;
      j = 0;
    }
  }

  public final Cursor b(String paramString1, String paramString2, List paramList1, List paramList2)
  {
    return a(paramString1, paramString2, null, paramList1, false, true, true, 2, paramList2);
  }

  public final Cursor b(String paramString1, String paramString2, List paramList1, List paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = "select username from rcontact " + e(paramString1, paramString2, paramList1) + aM(paramList2) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str1);
    if (paramBoolean1)
    {
      n[] arrayOfn = new n[2];
      String str2 = "select username from rcontact " + e(paramList1, paramBoolean2) + aIw();
      z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "favourSql " + str1);
      Cursor localCursor1 = this.dtV.J(str2, true);
      Cursor localCursor2 = this.dtV.J(str1, true);
      if (((localCursor1 instanceof n)) && ((localCursor2 instanceof n)))
      {
        arrayOfn[0] = ((n)localCursor1);
        arrayOfn[1] = ((n)localCursor2);
        return new com.tencent.mm.dbsupport.newcursor.h(arrayOfn);
      }
      return c.aKQ();
    }
    return this.dtV.rawQuery(str1, null);
  }

  public final void b(q paramq)
  {
    if (this.dqF != null)
      this.dqF.remove(paramq);
  }

  public final int[] b(String paramString1, String paramString2, String paramString3, List paramList)
  {
    String str = "select distinct showHead from rcontact " + e(paramString1, paramString2, paramList) + yA(paramString3) + aIv();
    long l1 = System.currentTimeMillis();
    Cursor localCursor = this.dtV.rawQuery(str, null);
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - l1));
    long l2 = System.currentTimeMillis();
    if (localCursor.getCount() >= 0);
    int[] arrayOfInt;
    for (int i = localCursor.getCount(); ; i = 0)
    {
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - l2));
      arrayOfInt = new int[i];
      if (localCursor.getCount() <= 0)
        break;
      for (int j = 0; j < i; j++)
      {
        localCursor.moveToPosition(j);
        arrayOfInt[j] = localCursor.getInt(0);
      }
    }
    localCursor.close();
    return arrayOfInt;
  }

  public final int[] b(String paramString1, String paramString2, String[] paramArrayOfString, List paramList)
  {
    String str = "select distinct showHead from rcontact " + e(paramString1, paramString2, paramList) + z(paramArrayOfString) + aIv();
    long l1 = System.currentTimeMillis();
    Cursor localCursor = this.dtV.rawQuery(str, null);
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct db.rawQuery last" + (System.currentTimeMillis() - l1));
    long l2 = System.currentTimeMillis();
    if (localCursor.getCount() >= 0);
    int[] arrayOfInt;
    for (int i = localCursor.getCount(); ; i = 0)
    {
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct  cu.getCount() last" + (System.currentTimeMillis() - l2));
      arrayOfInt = new int[i];
      if (localCursor.getCount() <= 0)
        break;
      for (int j = 0; j < i; j++)
      {
        localCursor.moveToPosition(j);
        arrayOfInt[j] = localCursor.getInt(0);
      }
    }
    localCursor.close();
    return arrayOfInt;
  }

  public final int c(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select count(username) from rcontact where ");
    localStringBuilder.append("type & ").append(a.uN()).append(" !=0 and ");
    localStringBuilder.append("type & ").append(a.xr()).append(" =0 and ");
    localStringBuilder.append("type & ").append(a.uR()).append(" =0 and ");
    localStringBuilder.append("verifyFlag & 8").append(" = 0 and ");
    localStringBuilder.append("( username like '%@chatroom')");
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      int k = paramArrayOfString1.length;
      for (int m = 0; m < k; m++)
      {
        String str3 = paramArrayOfString1[m];
        localStringBuilder.append(" and rcontact.username").append(" != '").append(str3).append("'");
      }
    }
    for (int i = 0; i < 4; i++)
    {
      String str2 = paramArrayOfString2[i];
      localStringBuilder.append(" and rcontact.username").append(" != '").append(str2).append("'");
    }
    String str1 = localStringBuilder.toString();
    Cursor localCursor = this.dtV.rawQuery(str1, null);
    int j;
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      j = localCursor.getInt(0);
      localCursor.close();
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str1;
      arrayOfObject[1] = Integer.valueOf(j);
      z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getChatroomContactCount, sql:%s, result:%d", arrayOfObject);
      return j;
      j = 0;
    }
  }

  public final Cursor c(String paramString1, String paramString2, List paramList1, List paramList2)
  {
    return a(paramString1, paramString2, null, paramList1, false, false, true, 2, paramList2);
  }

  public final void c(String paramString, i parami)
  {
    if (paramString == null);
    ContentValues localContentValues;
    do
    {
      return;
      if (i.yc(paramString))
        paramString = i.ye(paramString);
      parami.be(parami.ox());
      if (y.a(parami))
      {
        parami.be(43);
        parami.aV(com.tencent.mm.platformtools.f.jw(parami.oc()));
        parami.aW(com.tencent.mm.platformtools.f.jv(parami.oc()));
        parami.aZ(com.tencent.mm.platformtools.f.jv(parami.od()));
        parami.ba(parami.od());
        return;
      }
      if (y.dG(parami.getUsername()))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(31);
        z.i("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "update official account helper showhead %d", arrayOfObject2);
        parami.be(31);
      }
      this.dqF.ae(parami);
      this.dqF.Bo();
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = parami.getUsername();
      arrayOfObject1[1] = Integer.valueOf(parami.jc());
      arrayOfObject1[2] = Integer.valueOf(parami.jd());
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "username=%s, showHead=%d, verifyFlag=%d", arrayOfObject1);
      localContentValues = parami.ir();
      if ((int)parami.dhv > 0)
        localContentValues.put("rowid", Integer.valueOf((int)parami.dhv));
    }
    while (localContentValues.size() <= 0);
    this.dtV.update(yl(paramString), localContentValues, "username=?", new String[] { paramString });
  }

  public final int[] c(String paramString1, String paramString2, String paramString3, List paramList)
  {
    long l1 = System.currentTimeMillis();
    String str1 = "select count(*) from rcontact " + e(paramString1, paramString2, paramList) + yA(paramString3);
    String str2 = str1 + " group by showHead";
    Cursor localCursor = this.dtV.rawQuery(str2, null);
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - l1));
    long l2 = System.currentTimeMillis();
    int i = localCursor.getCount();
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - l2));
    int[] arrayOfInt = null;
    if (i > 0)
    {
      arrayOfInt = new int[i];
      for (int j = 0; j < i; j++)
      {
        localCursor.moveToPosition(j);
        arrayOfInt[j] = localCursor.getInt(0);
      }
    }
    localCursor.close();
    return arrayOfInt;
  }

  public final int[] c(String paramString1, String paramString2, String[] paramArrayOfString, List paramList)
  {
    String str1 = "select count(*) from rcontact " + e(paramString1, paramString2, paramList) + z(paramArrayOfString);
    String str2 = str1 + " group by showHead";
    Cursor localCursor = this.dtV.rawQuery(str2, null);
    int i = localCursor.getCount();
    int[] arrayOfInt = null;
    if (i > 0)
    {
      int j = localCursor.getCount();
      arrayOfInt = new int[j];
      for (int k = 0; k < j; k++)
      {
        localCursor.moveToPosition(k);
        arrayOfInt[k] = localCursor.getInt(0);
      }
    }
    localCursor.close();
    return arrayOfInt;
  }

  public final i cT(long paramLong)
  {
    boolean bool = paramLong < 0L;
    i locali = null;
    if (!bool);
    do
    {
      return locali;
      String str = "select * ,rowid from rcontact  where rowid=" + paramLong;
      Cursor localCursor = this.dtV.rawQuery(str, null);
      int i = localCursor.getCount();
      locali = null;
      if (i != 0)
      {
        locali = new i();
        localCursor.moveToFirst();
        locali.b(localCursor);
        C(locali);
      }
      localCursor.close();
    }
    while (locali == null);
    locali.aIk();
    return locali;
  }

  public final Cursor d(String paramString1, String paramString2, String paramString3, List paramList)
  {
    return a(paramString1, paramString2, paramString3, paramList, false, false, false, 1, null);
  }

  public final Cursor d(String paramString1, String paramString2, List paramList)
  {
    String str = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + aIv();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", str);
    return this.dtV.rawQuery(str, null);
  }

  public final Cursor d(List paramList, boolean paramBoolean)
  {
    String str = "select * ,rowid from rcontact " + e(paramList, paramBoolean) + aIw();
    z.v("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "favourSql " + str);
    return this.dtV.rawQuery(str, null);
  }

  public final int h(String paramString, byte[] paramArrayOfByte)
  {
    int i = -1;
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getCmdbuf failed user is null");
      return i;
    }
    j localj = new j();
    localj.field_cmdbuf = paramArrayOfByte;
    localj.field_username = paramString;
    int j = (int)this.dtV.replace("ContactCmdBuf", "username", localj.ir());
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    if (paramArrayOfByte == null);
    while (true)
    {
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = Integer.valueOf(j);
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "setCmdbuf user:%s buf:%d result:%d", arrayOfObject);
      return j;
      i = paramArrayOfByte.length;
    }
  }

  public final void sx()
  {
    this.iif.clear();
    this.iig.clear();
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
      z.w("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }

  public final String wj()
  {
    return "rcontact";
  }

  public final i ym(String paramString)
  {
    i locali = (i)this.iif.get(paramString);
    if (locali != null)
      return locali;
    return null;
  }

  public final boolean yo(String paramString)
  {
    if ((ch.jb(paramString)) || ((paramString.contains("@")) && (!paramString.endsWith("@stranger"))))
      return false;
    Integer localInteger = (Integer)this.iig.get(paramString);
    if (localInteger != null)
      return a.cv(localInteger.intValue());
    i locali = ys(paramString);
    if ((locali == null) || ((!locali.getUsername().equals(paramString)) && (!paramString.equals(locali.jk()))))
    {
      this.iig.b(paramString, Integer.valueOf(0));
      return false;
    }
    this.iig.b(paramString, Integer.valueOf(locali.getType()));
    return a.cv(locali.getType());
  }

  public final i yp(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    i locali = new i();
    String str = "select *,rowid from rcontact where alias=" + com.tencent.mm.as.h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locali.b(localCursor);
      C(locali);
    }
    localCursor.close();
    locali.aIk();
    return locali;
  }

  public final i yq(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    if (i.yc(paramString))
      paramString = i.ye(paramString);
    i locali1 = ym(paramString);
    if (locali1 != null)
    {
      locali1.aIk();
      return locali1;
    }
    i locali2 = new i();
    String str = yk(paramString) + " where username=" + com.tencent.mm.as.h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locali2.b(localCursor);
      C(locali2);
    }
    localCursor.close();
    locali2.aIk();
    return locali2;
  }

  public final i yr(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    if (i.yc(paramString))
      paramString = i.ye(paramString);
    i locali1 = ym(paramString);
    if (locali1 != null)
      return locali1;
    i locali2 = new i();
    String str = yk(paramString) + " where username=" + com.tencent.mm.as.h.cG(paramString) + " or encryptUsername=" + com.tencent.mm.as.h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locali2.b(localCursor);
      C(locali2);
    }
    localCursor.close();
    return locali2;
  }

  public final i ys(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    if (i.yc(paramString))
      paramString = i.ye(paramString);
    i locali1 = ym(paramString);
    if (locali1 != null)
      return locali1;
    i locali2 = new i();
    String str = yk(paramString) + " where username=" + com.tencent.mm.as.h.cG(paramString) + " or encryptUsername=" + com.tencent.mm.as.h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locali2.b(localCursor);
      locali2.aIk();
      C(locali2);
    }
    localCursor.close();
    return locali2;
  }

  public final i yt(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    if (i.yc(paramString))
      paramString = i.ye(paramString);
    i locali1 = ym(paramString);
    if (locali1 != null)
    {
      locali1.aIk();
      return locali1;
    }
    i locali2 = new i();
    String str = yk(paramString) + " where encryptUsername=" + com.tencent.mm.as.h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locali2.b(localCursor);
      C(locali2);
    }
    localCursor.close();
    locali2.aIk();
    return locali2;
  }

  public final boolean yu(String paramString)
  {
    i locali = ys(paramString);
    return (locali != null) && (!ch.jb(locali.getUsername())) && (locali.getUsername().equals(paramString));
  }

  public final boolean yv(String paramString)
  {
    if (ch.jb(paramString))
      return false;
    String str = "select count(*) from " + yl(paramString) + " where type & " + a.uR() + " !=0 and username=" + com.tencent.mm.as.h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    boolean bool = false;
    if (i > 0)
    {
      localCursor.moveToFirst();
      int j = localCursor.getInt(0);
      bool = false;
      if (j > 0)
        bool = true;
    }
    localCursor.close();
    return bool;
  }

  public final boolean yw(String paramString)
  {
    Cursor localCursor = d(paramString, null, null);
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "isBlackList : resCnt:" + localCursor.getCount());
    if (localCursor.getCount() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localCursor.close();
      return bool;
    }
  }

  public final byte[] yx(String paramString)
  {
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getCmdbuf failed user is null");
      return null;
    }
    j localj = new j();
    Cursor localCursor = this.dtV.a("ContactCmdBuf", null, "username=?", new String[] { paramString }, null, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localj.b(localCursor);
    }
    localCursor.close();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    if (localj.field_cmdbuf == null);
    for (int i = -1; ; i = localj.field_cmdbuf.length)
    {
      arrayOfObject[1] = Integer.valueOf(i);
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "getCmdbuf user:%s buf:%d", arrayOfObject);
      return localj.field_cmdbuf;
    }
  }

  public final int yy(String paramString)
  {
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "delCmdBuf failed user is null");
      return -1;
    }
    int i = this.dtV.delete("ContactCmdBuf", "username=?", new String[] { paramString });
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(i);
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "delCmdBuf user:%s ret:%d", arrayOfObject);
    return i;
  }

  public final int yz(String paramString)
  {
    if (paramString.length() > 0);
    int i;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (i.yc(paramString))
        paramString = i.ye(paramString);
      ys(paramString);
      yn(paramString);
      i = this.dtV.delete(yl(paramString), "username=?", new String[] { paramString });
      yy(paramString);
      z.d("!32@/B4Tb64lLpLSOpQlr7qYXa3KX0iP+QzT", "delete " + yl(paramString) + " user :" + paramString + ", res:" + i);
      if (i != 0)
        break;
      return i;
    }
    b(5, this, paramString);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.o
 * JD-Core Version:    0.6.2
 */