package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.g.a;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.protocal.a.sv;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class y
{
  public static final String dkj = o.b("rconversation.username", new String[] { "@chatroom", "@micromsg.qq.com" });
  public static final String dkk = o.b("rconversation.username", new String[] { "@t.qq.com" });
  public static final String dkl = o.b("rconversation.username", new String[] { "@qqim" });
  public static final String dkm = o.b("rconversation.username", new String[] { "@chatroom_exclusive" });
  private static Set dkn = new HashSet();
  public static final String[] dko = { "qqmail", "fmessage", "tmessage", "qmessage", "qqsync", "floatbottle", "lbsapp", "shakeapp", "medianote", "qqfriend", "newsapp", "blogapp", "facebookapp", "masssendapp", "feedsapp", "voipapp", "cardpackage", "voicevoipapp", "voiceinputapp", "officialaccounts", "googlecontact", "linkedinplugin" };

  public static String a(i parami, String paramString)
  {
    if (parami == null);
    do
    {
      return paramString;
      if ((paramString.toLowerCase().endsWith("@chatroom")) && (ch.jb(parami.iV())))
      {
        String str = bg.qW().oZ().dh(paramString);
        if (!ch.jb(str))
          return str;
      }
    }
    while ((parami.od() == null) || (parami.od().length() <= 0));
    return parami.od();
  }

  public static String a(i parami, String paramString, boolean paramBoolean)
  {
    if (parami == null);
    do
    {
      return paramString;
      if ((paramBoolean) && (ch.jb(parami.iV())))
        return bg.qW().oZ().dh(paramString);
    }
    while ((parami.od() == null) || (parami.od().length() <= 0));
    return parami.od();
  }

  public static void a(Set paramSet)
  {
    dkn = paramSet;
  }

  public static boolean a(i parami)
  {
    if (parami == null);
    while ((!ch.ja(parami.getUsername()).endsWith("@chatroom")) || (!a.cv(parami.getType())))
      return false;
    return true;
  }

  public static boolean a(com.tencent.mm.storage.r paramr)
  {
    String str = paramr.getUsername();
    if (dP(str));
    do
    {
      do
        return false;
      while ((dO(str)) || (dG(str)) || (dH(str)) || (paramr.jM() == -1L));
      if (!dj(str))
        break;
    }
    while (!com.tencent.mm.q.r.fF(str));
    return true;
    return true;
  }

  public static int[] a(String paramString1, String paramString2, List paramList, String paramString3)
  {
    int i = 0;
    long l1 = System.currentTimeMillis();
    int[] arrayOfInt1 = bg.qW().oT().b(paramString1, paramString2, paramString3, paramList);
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - l1));
    if (arrayOfInt1.length <= 0);
    int[] arrayOfInt2;
    do
    {
      return null;
      long l2 = System.currentTimeMillis();
      arrayOfInt2 = bg.qW().oT().c(paramString1, paramString2, paramString3, paramList);
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - l2));
    }
    while (arrayOfInt2 == null);
    if (arrayOfInt1.length == arrayOfInt2.length);
    int[] arrayOfInt3;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      arrayOfInt3 = new int[arrayOfInt2.length];
      int j = 0;
      int m;
      for (int k = 0; i < arrayOfInt1.length; k = m)
      {
        m = k + 1;
        arrayOfInt3[k] = j;
        j += arrayOfInt2[i];
        i++;
      }
    }
    return arrayOfInt3;
  }

  public static int[] a(String paramString1, String paramString2, List paramList, String[] paramArrayOfString)
  {
    int i = 0;
    int[] arrayOfInt1 = bg.qW().oT().b(paramString1, paramString2, paramArrayOfString, paramList);
    if (arrayOfInt1.length <= 0);
    int[] arrayOfInt2;
    do
    {
      return null;
      arrayOfInt2 = bg.qW().oT().c(paramString1, paramString2, paramArrayOfString, paramList);
    }
    while (arrayOfInt2 == null);
    if (arrayOfInt1.length == arrayOfInt2.length);
    int[] arrayOfInt3;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      arrayOfInt3 = new int[arrayOfInt2.length];
      int j = 0;
      int m;
      for (int k = 0; i < arrayOfInt1.length; k = m)
      {
        m = k + 1;
        arrayOfInt3[k] = j;
        j += arrayOfInt2[i];
        i++;
      }
    }
    return arrayOfInt3;
  }

  public static String[] a(String paramString1, String paramString2, String paramString3, List paramList)
  {
    int i = 0;
    long l = System.currentTimeMillis();
    int[] arrayOfInt = bg.qW().oT().b(paramString1, paramString2, paramString3, paramList);
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (arrayOfInt.length <= 0)
      return null;
    String[] arrayOfString = new String[arrayOfInt.length];
    int j = 0;
    if (i < arrayOfInt.length)
    {
      char c = (char)arrayOfInt[i];
      if (c == '{')
      {
        int n = j + 1;
        arrayOfString[j] = "#";
        j = n;
      }
      while (true)
      {
        i++;
        break;
        if (c == ' ')
        {
          int m = j + 1;
          arrayOfString[j] = "$";
          j = m;
        }
        else
        {
          int k = j + 1;
          arrayOfString[j] = String.valueOf(c);
          j = k;
        }
      }
    }
    return arrayOfString;
  }

  public static String[] a(String paramString1, String paramString2, String[] paramArrayOfString, List paramList)
  {
    int i = 0;
    long l = System.currentTimeMillis();
    int[] arrayOfInt = bg.qW().oT().b(paramString1, paramString2, paramArrayOfString, paramList);
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (arrayOfInt.length <= 0)
      return null;
    String[] arrayOfString = new String[arrayOfInt.length];
    int j = 0;
    if (i < arrayOfInt.length)
    {
      char c = (char)arrayOfInt[i];
      if (c == '{')
      {
        int n = j + 1;
        arrayOfString[j] = "#";
        j = n;
      }
      while (true)
      {
        i++;
        break;
        if (c == ' ')
        {
          int m = j + 1;
          arrayOfString[j] = "$";
          j = m;
        }
        else
        {
          int k = j + 1;
          arrayOfString[j] = String.valueOf(c);
          j = k;
        }
      }
    }
    return arrayOfString;
  }

  public static void b(i parami)
  {
    boolean bool;
    i locali;
    if (parami != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali != null) && (!ch.jb(locali.getUsername())))
        break label52;
    }
    while (true)
    {
      parami.oM();
      n(parami);
      return;
      bool = false;
      break;
      label52: parami = locali;
    }
  }

  public static void b(i parami, String paramString)
  {
    i locali = bg.qW().oT().ys(parami.getUsername());
    if ((locali != null) && (paramString != null));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      locali.aT(paramString);
      n(locali);
      return;
    }
  }

  public static boolean b(com.tencent.mm.storage.r paramr)
  {
    return !dG(paramr.getUsername());
  }

  public static void c(i parami)
  {
    boolean bool;
    i locali;
    if (parami != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali != null) && (!ch.jb(locali.getUsername())))
        break label52;
    }
    while (true)
    {
      parami.oB();
      n(parami);
      return;
      bool = false;
      break;
      label52: parami = locali;
    }
  }

  public static void c(String paramString, boolean paramBoolean)
  {
    i locali = bg.qW().oT().ys(paramString);
    if ((locali == null) || (ch.jb(locali.getUsername())))
      return;
    if (paramBoolean)
      locali.uJ();
    while (true)
    {
      m(locali);
      return;
      locali.uL();
    }
  }

  public static boolean cF(int paramInt)
  {
    return i.nY(paramInt);
  }

  public static void d(i parami)
  {
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali == null) || (ch.jb(locali.getUsername())))
        locali = parami;
      locali.oL();
      n(locali);
      com.tencent.mm.storage.r localr = bg.qW().oW().yE(parami.getUsername());
      if ((localr != null) && ("@blacklist".equals(localr.jR())))
      {
        s locals = bg.qW().oW();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = localr.getUsername();
        locals.c(arrayOfString, "");
      }
      return;
    }
  }

  public static void d(String paramString, boolean paramBoolean)
  {
    boolean bool;
    i locali;
    if (!ch.jb(paramString))
    {
      bool = true;
      Assert.assertTrue(bool);
      locali = bg.qW().oT().ys(paramString);
      if ((locali != null) && (!ch.jb(locali.getUsername())))
        break label44;
    }
    label44: 
    do
    {
      return;
      bool = false;
      break;
      locali.setType(0x800 | locali.getType());
      n(locali);
    }
    while (!paramBoolean);
    bg.qW().oW().yI(paramString);
  }

  public static boolean dA(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("voicevoipapp");
    return false;
  }

  public static boolean dB(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("voiceinputapp");
    return false;
  }

  public static boolean dC(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("linkedinplugin");
    return false;
  }

  public static boolean dD(String paramString)
  {
    return dE(paramString);
  }

  public static boolean dE(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("gh_22b87fa7cb3c");
    return false;
  }

  public static boolean dF(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("blogapp");
    return false;
  }

  public static boolean dG(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("officialaccounts");
    return false;
  }

  public static boolean dH(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("helper_entry");
    return false;
  }

  public static boolean dI(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("qqfriend");
    return false;
  }

  public static boolean dJ(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("googlecontact");
    return false;
  }

  public static boolean dK(String paramString)
  {
    return "filehelper".equalsIgnoreCase(paramString);
  }

  public static boolean dL(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("pc_share");
    return false;
  }

  public static boolean dN(String paramString)
  {
    if (dO(paramString));
    while ((dP(paramString)) || (dG(paramString)) || (dH(paramString)))
      return true;
    return false;
  }

  public static boolean dO(String paramString)
  {
    String str = (String)bg.qW().oQ().get(21);
    return ((str != null) && (str.equalsIgnoreCase(paramString))) || (paramString.equalsIgnoreCase("weixin"));
  }

  public static boolean dP(String paramString)
  {
    String[] arrayOfString = dko;
    int i = arrayOfString.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfString[j].equalsIgnoreCase(paramString))
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean dQ(String paramString)
  {
    if (dP(paramString));
    while ((i.ya(paramString)) || (i.xY(paramString)) || (i.yc(paramString)))
      return true;
    return false;
  }

  public static int dR(String paramString)
  {
    boolean bool;
    String str;
    if (ch.ja(paramString).length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = paramString.trim().toLowerCase();
      if (!str.endsWith("@chatroom"))
        break label40;
    }
    label40: 
    do
    {
      return 1;
      bool = false;
      break;
      if (i.xY(str))
        return 11;
      if (i.ya(str))
        return 36;
    }
    while (!i.yc(str));
    return 1;
  }

  public static int dS(String paramString)
  {
    if (ch.ja(paramString).length() > 0);
    String str;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      str = paramString.trim().toLowerCase();
      if (!str.endsWith("@chatroom"))
        break;
      return 3;
    }
    if (i.xY(str))
      return 13;
    if (i.ya(str))
      return 39;
    if (i.yc(str))
      return 3;
    if (str.contains("@"))
      return 3;
    return 3;
  }

  public static boolean dT(String paramString)
  {
    int i = 1;
    if (bg.qW().oT().ys(paramString).jv() != i)
      i = 0;
    return i;
  }

  public static boolean dU(String paramString)
  {
    i locali = bg.qW().oT().ys(paramString);
    return (locali != null) && (locali.zW());
  }

  public static boolean dV(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    while ((!paramString.startsWith("t.qq.com/")) && (!paramString.startsWith("http://t.qq.com/")))
      return false;
    return true;
  }

  public static String dW(String paramString)
  {
    if (dV(paramString))
      return paramString.replace("http://t.qq.com/", "").replace("t.qq.com/", "");
    return "";
  }

  public static String dX(String paramString)
  {
    if (dkn.contains(paramString))
      paramString = "";
    return paramString;
  }

  public static boolean db(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    while ((paramString.contains("@")) && (!paramString.endsWith("@micromsg.qq.com")))
      return false;
    return true;
  }

  public static boolean dc(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return false;
    return paramString.endsWith("@chatroom");
  }

  public static boolean dd(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return false;
    return paramString.endsWith("@lbsroom");
  }

  public static boolean de(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    i locali;
    do
    {
      do
        return false;
      while (!paramString.endsWith("@chatroom"));
      locali = bg.qW().oT().ys(paramString);
    }
    while ((locali == null) || (!a.cv(locali.getType())));
    return true;
  }

  public static boolean df(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return false;
    return paramString.endsWith("@stranger");
  }

  public static String dg(String paramString)
  {
    i locali = bg.qW().oT().ys(paramString);
    if (locali == null)
      return "";
    if (!ch.jb(locali.ja()))
      return locali.ja();
    return "";
  }

  public static String dh(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return "";
    return a(bg.qW().oT().ys(paramString), paramString);
  }

  public static boolean di(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return true;
    return a.cv(bg.qW().oT().ys(paramString).getType());
  }

  public static boolean dj(String paramString)
  {
    if (ch.jb(paramString));
    i locali;
    do
    {
      return false;
      locali = bg.qW().oT().ys(paramString);
    }
    while (locali == null);
    return i.nY(locali.jd());
  }

  public static void dk(String paramString)
  {
    if (ch.jb(paramString));
    i locali;
    do
    {
      return;
      locali = bg.qW().oT().ys(paramString);
    }
    while (locali == null);
    locali.setType(0);
    bg.qW().oT().a(paramString, locali);
  }

  public static boolean dl(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("qqmail");
    return false;
  }

  public static boolean dm(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("fmessage");
    return false;
  }

  public static boolean dn(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("tmessage");
    return false;
  }

  public static boolean jdMethod_do(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("floatbottle");
    return false;
  }

  public static boolean dp(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("qmessage");
    return false;
  }

  public static boolean dq(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("facebookapp");
    return false;
  }

  public static boolean dr(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("masssendapp");
    return false;
  }

  public static boolean ds(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("feedsapp");
    return false;
  }

  public static boolean dt(String paramString)
  {
    return "qqsync".equalsIgnoreCase(paramString);
  }

  public static boolean du(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
      if (!paramString.equalsIgnoreCase("weixin"))
      {
        boolean bool2 = paramString.equalsIgnoreCase("gh_9639b5a92773");
        bool1 = false;
        if (!bool2);
      }
      else
      {
        bool1 = true;
      }
    return bool1;
  }

  public static boolean dv(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("lbsapp");
    return false;
  }

  public static boolean dw(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("shakeapp");
    return false;
  }

  public static boolean dx(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("medianote");
    return false;
  }

  public static boolean dy(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("newsapp");
    return false;
  }

  public static boolean dz(String paramString)
  {
    if (paramString != null)
      return paramString.equalsIgnoreCase("voipapp");
    return false;
  }

  public static void e(i parami)
  {
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali == null) || (ch.jb(locali.getUsername())))
        locali = parami;
      locali.uJ();
      locali.be(parami.ox());
      m(locali);
      return;
    }
  }

  public static void e(String paramString, boolean paramBoolean)
  {
    boolean bool;
    i locali;
    if (!ch.jb(paramString))
    {
      bool = true;
      Assert.assertTrue(bool);
      locali = bg.qW().oT().ys(paramString);
      if ((locali != null) && (!ch.jb(locali.getUsername())))
        break label44;
    }
    label44: 
    do
    {
      return;
      bool = false;
      break;
      locali.setType(0xFFFFF7FF & locali.getType());
      n(locali);
    }
    while (!paramBoolean);
    bg.qW().oW().yJ(paramString);
  }

  public static boolean e(List paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0));
    while (true)
    {
      return false;
      for (int i = 0; i < paramList.size(); i++)
        if (i.xY((String)paramList.get(i)))
          return true;
    }
  }

  public static void f(i parami)
  {
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali == null) || (ch.jb(locali.getUsername())))
        locali = parami;
      locali.uL();
      locali.be(parami.ox());
      m(locali);
      return;
    }
  }

  public static void g(i parami)
  {
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali == null) || (ch.jb(locali.getUsername())))
        locali = parami;
      locali.setType(0x40 | locali.getType());
      locali.be(parami.ox());
      n(locali);
      return;
    }
  }

  public static void h(i parami)
  {
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali == null) || (ch.jb(locali.getUsername())))
        locali = parami;
      locali.uH();
      locali.be(parami.ox());
      n(locali);
      return;
    }
  }

  public static void i(i parami)
  {
    boolean bool;
    i locali;
    if (parami != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali != null) && (!ch.jb(locali.getUsername())))
        break label60;
    }
    while (true)
    {
      parami.setType(0x200 | parami.getType());
      n(parami);
      return;
      bool = false;
      break;
      label60: parami = locali;
    }
  }

  public static void j(i parami)
  {
    boolean bool;
    i locali;
    if (parami != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      locali = bg.qW().oT().ys(parami.getUsername());
      if ((locali != null) && (!ch.jb(locali.getUsername())))
        break label60;
    }
    while (true)
    {
      parami.setType(0xFFFFFDFF & parami.getType());
      n(parami);
      return;
      bool = false;
      break;
      label60: parami = locali;
    }
  }

  public static void k(i parami)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (parami != null)
    {
      bool2 = bool1;
      Assert.assertTrue("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=: user is null", bool2);
      if ((int)parami.dhv == 0)
        break label74;
      bool3 = bool1;
      label25: Assert.assertTrue("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=: contactId == 0", bool3);
      if (parami.getUsername().length() <= 0)
        break label79;
    }
    while (true)
    {
      Assert.assertTrue("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=: username length <= 0", bool1);
      parami.oz();
      bg.qW().oT().a(parami.getUsername(), parami);
      return;
      bool2 = false;
      break;
      label74: bool3 = false;
      break label25;
      label79: bool1 = false;
    }
  }

  public static void l(i parami)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (parami != null)
    {
      bool2 = bool1;
      Assert.assertTrue(bool2);
      if ((int)parami.dhv == 0)
        break label69;
      bool3 = bool1;
      label22: Assert.assertTrue(bool3);
      if (parami.getUsername().length() <= 0)
        break label74;
    }
    while (true)
    {
      Assert.assertTrue(bool1);
      parami.oz();
      bg.qW().oT().a(parami.getUsername(), parami);
      n(parami);
      return;
      bool2 = false;
      break;
      label69: bool3 = false;
      break label22;
      label74: bool1 = false;
    }
  }

  private static void m(i parami)
  {
    boolean bool;
    sv localsv;
    if (parami != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((int)parami.dhv == 0)
      {
        bg.qW().oT().G(parami);
        bg.qW().oT().ys(parami.getUsername());
      }
      bg.qW().oT().a(parami.getUsername(), parami);
      localsv = new sv();
      localsv.imq = parami.getUsername();
      if (!parami.zY())
        break label111;
    }
    label111: for (localsv.imE = 1; ; localsv.imE = 2)
    {
      bg.qW().oS().a(new com.tencent.mm.storage.bg(52, localsv));
      return;
      bool = false;
      break;
    }
  }

  public static void n(i parami)
  {
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if ((int)parami.dhv == 0)
      {
        bg.qW().oT().G(parami);
        bg.qW().oT().ys(parami.getUsername());
      }
      bg.qW().oT().a(parami.getUsername(), parami);
      o(parami);
      return;
    }
  }

  public static void o(i parami)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = parami.getUsername();
    arrayOfObject[1] = parami.ja();
    arrayOfObject[2] = Integer.valueOf(parami.getType());
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "oplog modContact user:%s remark:%s type:%d ", arrayOfObject);
    new sk();
    sk localsk = new sk();
    localsk.hVf = new vt().wF(ch.ja(parami.getUsername()));
    localsk.ifj = new vt().wF(ch.ja(parami.iV()));
    localsk.hUY = new vt().wF(ch.ja(parami.iW()));
    localsk.hUZ = new vt().wF(ch.ja(parami.iX()));
    localsk.dtf = parami.jj();
    localsk.hUC = 3967;
    localsk.hUD = parami.getType();
    localsk.ilQ = new vt().wF(ch.ja(parami.ja()));
    localsk.ilR = new vt().wF(ch.ja(parami.jh()));
    localsk.ilS = new vt().wF(ch.ja(parami.jg()));
    localsk.hUI = parami.js();
    localsk.ilZ = new vt().wF(ch.ja(parami.jb()));
    localsk.hUM = parami.jv();
    localsk.dth = parami.jw();
    localsk.dtg = ch.ja(parami.jo());
    localsk.Kt = ch.ja(parami.rT());
    localsk.Ks = ch.ja(parami.rU());
    localsk.ifQ = ch.ja(parami.jt());
    localsk.ifS = parami.je();
    localsk.ilV = 0;
    localsk.hOU = new ws();
    localsk.dtm = ch.ja(parami.getCountryCode());
    localsk.hVh = parami.jn();
    bg.qW().oS().a(new com.tencent.mm.storage.bg(2, localsk));
  }

  public static boolean p(i parami)
  {
    return (0x1 & parami.je()) != 0;
  }

  public static List qj()
  {
    return bg.qW().oT().aIp();
  }

  public static List qk()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = bg.qW().oT().aIq();
    if (localCursor.moveToFirst())
      do
      {
        i locali = new i();
        locali.b(localCursor);
        localArrayList.add(locali);
      }
      while (localCursor.moveToNext());
    localCursor.close();
    return localArrayList;
  }

  public static boolean ql()
  {
    return bg.qW().oT().yw("@t.qq.com");
  }

  public static boolean qm()
  {
    return bg.qW().oT().yw("@qqim");
  }

  public static boolean qn()
  {
    return false;
  }

  public static boolean qo()
  {
    if (!x.qi());
    cj localcj;
    do
    {
      return false;
      localcj = bg.qW().oY().zX("@t.qq.com");
    }
    while ((localcj == null) || (ch.jb(localcj.getName())));
    return true;
  }

  public static boolean qp()
  {
    if (!x.qi());
    cj localcj;
    do
    {
      return false;
      localcj = bg.qW().oY().zX("@t.qq.com");
    }
    while ((localcj == null) || (ch.ja(localcj.getName()).length() == 0));
    return true;
  }

  public static List qq()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = bg.qW().oT().aIt();
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      return localLinkedList;
    }
    localCursor.moveToFirst();
    do
    {
      i locali = new i();
      locali.b(localCursor);
      localLinkedList.add(locali);
    }
    while (localCursor.moveToNext());
    localCursor.close();
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "getFavourList size:  " + localLinkedList.size());
    return localLinkedList;
  }

  public static List qr()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = bg.qW().oT().aIr();
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      return localLinkedList;
    }
    localCursor.moveToFirst();
    do
    {
      i locali = new i();
      locali.b(localCursor);
      localLinkedList.add(locali.getUsername());
    }
    while (localCursor.moveToNext());
    localCursor.close();
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXclEbAfS9M4zkqYuJPbwLXY=", "getSnsBlackContactList size:  " + localLinkedList.size());
    return localLinkedList;
  }

  public static String u(String paramString1, String paramString2)
  {
    String str2;
    if (ch.jb(paramString2))
      str2 = dh(paramString1);
    while (true)
    {
      return str2;
      String str1 = dg(paramString1);
      if (!ch.jb(str1))
        return str1;
      com.tencent.mm.storage.b localb = bg.qW().oZ().xS(paramString2);
      str2 = null;
      if (localb == null);
      while (ch.jb(str2))
      {
        return dh(paramString1);
        boolean bool = localb.aId();
        str2 = null;
        if (bool)
          str2 = localb.dh(paramString1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.y
 * JD-Core Version:    0.6.2
 */