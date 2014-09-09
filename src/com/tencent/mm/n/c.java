package com.tencent.mm.n;

import android.graphics.Bitmap;
import com.tencent.mm.a.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class c
{
  public static Bitmap A(long paramLong)
  {
    return a(z(paramLong), false, -1);
  }

  public static String D(String paramString1, String paramString2)
  {
    return paramString1 + "?access_token=" + paramString2;
  }

  public static Bitmap a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = ch.jb(paramString);
    Bitmap localBitmap = null;
    if (!bool1)
    {
      int i = bg.qW().oD();
      localBitmap = null;
      if (i != 0)
        break label33;
    }
    while (true)
    {
      return localBitmap;
      label33: m localm = af.sh();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Integer.valueOf(paramInt1);
      arrayOfObject[2] = Integer.valueOf(paramInt2);
      z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "getHDBitmap user:%s, width:%d, height:%d", arrayOfObject);
      boolean bool2 = ch.jb(paramString);
      localBitmap = null;
      if (bool2);
      while (localBitmap == null)
      {
        s locals = new s();
        locals.a(paramString, new d(locals));
        return a(paramString, false, 1);
        localBitmap = com.tencent.mm.sdk.platformtools.i.o(localm.g(paramString, true), paramInt1, paramInt2);
      }
    }
  }

  public static Bitmap a(String paramString, boolean paramBoolean, int paramInt)
  {
    if ((ch.jb(paramString)) || (bg.qW().oD() == 0))
      return null;
    if (!bg.qW().isSDCardAvailable())
      return af.sh().x(ak.getContext());
    if (com.tencent.mm.storage.i.yc(paramString))
      paramString = com.tencent.mm.storage.i.ye(paramString);
    return af.sL().b(paramString, paramBoolean, paramInt);
  }

  public static x a(String paramString, sk paramsk)
  {
    x localx = new x();
    localx.db(-1);
    localx.setUsername(paramString);
    localx.ff(paramsk.hTz);
    localx.fe(paramsk.hTy);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = localx.getUsername();
    arrayOfObject[1] = localx.st();
    arrayOfObject[2] = localx.su();
    z.d("!32@/B4Tb64lLpKycU6bb1/YLVPsRNAI909l", "dkhurl contact %s b[%s] s[%s]", arrayOfObject);
    boolean bool;
    if (paramsk.ima != 0)
    {
      bool = true;
      localx.T(bool);
      if ((paramsk.ilV != 3) && (paramsk.ilV != 4))
        break label116;
      localx.bi(paramsk.ilV);
    }
    label116: 
    do
    {
      do
      {
        return localx;
        bool = false;
        break;
      }
      while (paramsk.ilV != 2);
      localx.bi(3);
    }
    while (com.tencent.mm.model.x.pG().equals(paramString));
    af.sh().h(paramString, false);
    af.sh().h(paramString, true);
    af.sL().eN(paramString);
    return localx;
  }

  public static boolean c(long paramLong, int paramInt)
  {
    if (paramInt != 3)
      return false;
    return eK(z(paramLong));
  }

  public static Bitmap eE(String paramString)
  {
    return a(paramString + "@google", false, -1);
  }

  private static String eF(String paramString)
  {
    return "http://graph.facebook.com/" + paramString + "/picture";
  }

  public static void eG(String paramString)
  {
    if (ch.jb(paramString));
    String str;
    x localx;
    do
    {
      return;
      str = paramString + "@fb";
      localx = af.sJ().fg(str);
    }
    while ((localx != null) && (str.equals(localx.getUsername())) && (3 == localx.ji()));
    if (localx == null)
      localx = new x();
    localx.setUsername(str);
    localx.bi(3);
    localx.fe(eF(paramString));
    localx.ff(eF(paramString));
    localx.T(true);
    localx.db(31);
    af.sJ().a(localx);
  }

  public static Bitmap eH(String paramString)
  {
    return a(paramString + "@fb", false, -1);
  }

  public static long eI(String paramString)
  {
    if (!com.tencent.mm.storage.i.yb(paramString))
      return -1L;
    String[] arrayOfString = paramString.split("@");
    try
    {
      long l = Long.parseLong(arrayOfString[0]);
      return l;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  public static long eJ(String paramString)
  {
    if (!com.tencent.mm.storage.i.ya(paramString))
      return -1L;
    String[] arrayOfString = paramString.split("@");
    try
    {
      long l = Long.parseLong(arrayOfString[0]);
      return l;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  public static boolean eK(String paramString)
  {
    if (paramString == null)
    {
      z.w("!32@/B4Tb64lLpKycU6bb1/YLVPsRNAI909l", "setQQAvatarImgFlag failed : invalid username");
      return false;
    }
    if (!paramString.endsWith("@qqim"))
    {
      z.w("!32@/B4Tb64lLpKycU6bb1/YLVPsRNAI909l", "setQQAvatarImgFlag failed : invalid username");
      return false;
    }
    x localx = new x();
    localx.setUsername(paramString);
    localx.bi(3);
    localx.db(3);
    return af.sJ().a(localx);
  }

  public static String eL(String paramString)
  {
    if ((ch.jb(paramString)) || (bg.qW().oD() == 0));
    while (!bg.qW().isSDCardAvailable())
      return null;
    if (com.tencent.mm.storage.i.yc(paramString))
      return af.sh().g(com.tencent.mm.storage.i.ye(paramString), false);
    return af.sh().g(paramString, false);
  }

  public static void eM(String paramString)
  {
    x localx = af.sJ().fg(paramString);
    if (localx == null);
    while (!paramString.equals(localx.getUsername()))
      return;
    localx.dd(0);
    localx.db(64);
    af.sJ().a(localx);
  }

  public static boolean k(String paramString, int paramInt)
  {
    if (ch.jb(paramString))
      return false;
    x localx = af.sJ().fg(paramString);
    if ((localx != null) && (paramString.equals(localx.getUsername())) && (paramInt == localx.ji()))
      return true;
    if (localx == null)
      localx = new x();
    localx.setUsername(paramString);
    localx.bi(paramInt);
    localx.db(3);
    return af.sJ().a(localx);
  }

  private static String z(long paramLong)
  {
    return new k(paramLong) + "@qqim";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.c
 * JD-Core Version:    0.6.2
 */