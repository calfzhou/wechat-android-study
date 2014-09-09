package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.c.b.b;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class o extends ah
{
  public static final String[] dmc = arrayOfString;
  private String path = null;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(k.dhu, "AppInfo");
  }

  public o(af paramaf, String paramString)
  {
    super(paramaf, k.dhu, "AppInfo", b.cKz);
    this.path = paramString;
    k localk1 = new k();
    localk1.field_appId = "wx4310bbd51be7d979";
    if (!super.c(localk1, new String[0]))
    {
      k localk2 = new k();
      localk2.field_appId = "wx4310bbd51be7d979";
      localk2.field_appName = "weixinfile";
      localk2.field_packageName = "com.tencent.mm.openapi";
      localk2.field_status = -1;
      super.b(localk2);
    }
  }

  public static k ayJ()
  {
    k localk = new k();
    localk.field_appName = "invalid_appname";
    localk.field_packageName = "";
    localk.field_signature = "";
    localk.field_status = 3;
    return localk;
  }

  public final Bitmap a(String paramString, int paramInt, float paramFloat)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getIcon : invalid argument");
      return null;
    }
    String str = ac(paramString, paramInt);
    if (!c.ac(str))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "icon does not exist, iconPath = " + str + ", iconType = " + paramInt);
      return null;
    }
    return e.c(str, paramFloat);
  }

  public final Cursor aH(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("select * from AppInfo");
    localStringBuilder.append(" where ");
    if (paramInt1 != 0)
      localStringBuilder.append(" ( serviceAppInfoFlag & ").append(paramInt1).append(" ) != 0 and ");
    localStringBuilder.append(" ( serviceShowFlag & ").append(paramInt2).append(" ) != 0");
    Cursor localCursor = rawQuery(localStringBuilder.toString(), new String[0]);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getServiceByAppInfoFlagAndShowFlag : cursor is null");
      return null;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localCursor.getCount());
    z.d("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getServiceByAppInfoFlagAndShowFlag count = %d", arrayOfObject);
    return localCursor;
  }

  public final String ac(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getIconPath : invalid argument");
      return null;
    }
    switch (paramInt)
    {
    default:
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getIconPath, unknown iconType = " + paramInt);
      return null;
    case 1:
      return this.path + f.d(paramString.getBytes()) + ".png";
    case 2:
      return this.path + f.d(paramString.getBytes()) + "_wm.png";
    case 3:
      return this.path + f.d(paramString.getBytes()) + "_sg.png";
    case 5:
      return this.path + f.d(paramString.getBytes()) + "_sl.png";
    case 4:
    }
    return this.path + f.d(paramString.getBytes()) + "_sp.png";
  }

  public final List ayH()
  {
    z.d("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getNullOpenIdList, maxCount = -1");
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = rawQuery("select appId from AppInfo where openId is NULL ", new String[0]);
    if (localCursor == null)
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "get null cursor");
    do
    {
      return localArrayList;
      int i = localCursor.getCount();
      if (i <= 0)
      {
        z.w("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getNullOpenIdList fail, cursor count = " + i);
        localCursor.close();
        return localArrayList;
      }
      if (localCursor.moveToFirst())
        while (!localCursor.isAfterLast())
        {
          int j = localCursor.getColumnIndex("appId");
          if (j >= 0)
          {
            String str = localCursor.getString(j);
            if (!ch.jb(str))
              localArrayList.add(str);
          }
          localCursor.moveToNext();
        }
    }
    while (localCursor == null);
    localCursor.close();
    return localArrayList;
  }

  public final Cursor ayI()
  {
    Cursor localCursor = rawQuery("select * from AppInfo where apptype like ',1" + ",'", new String[0]);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getAppByType : cursor is null");
      localCursor = null;
    }
    return localCursor;
  }

  public final boolean c(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "saveIcon, invalid argument");
      return false;
    }
    String str = ac(paramString, paramInt);
    if (str == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "saveIcon fail, iconPath is null");
      return false;
    }
    File localFile = new File(str);
    if (localFile.exists())
      localFile.delete();
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      localFileOutputStream.write(paramArrayOfByte);
      localFileOutputStream.close();
      Ba(paramString);
      return true;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "saveIcon, exception, e = " + localException.getMessage());
    }
    return false;
  }

  public final boolean p(String paramString, Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "saveIcon : invalid argument");
      return false;
    }
    String str = ac(paramString, 1);
    if (str == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "saveIcon fail, iconPath is null");
      return false;
    }
    File localFile = new File(str);
    if (localFile.exists())
      localFile.delete();
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localFileOutputStream);
      localFileOutputStream.close();
      Ba(paramString);
      return true;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "saveIcon : compress occurs an exception");
    }
    return false;
  }

  public final k uY(String paramString)
  {
    k localk;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "appId is null");
      localk = null;
    }
    do
    {
      return localk;
      localk = new k();
      localk.field_appId = paramString;
    }
    while (super.c(localk, new String[0]));
    return null;
  }

  public final k uZ(String paramString)
  {
    k localk;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "packageName is null");
      localk = null;
    }
    do
    {
      return localk;
      localk = new k();
      localk.field_packageName = paramString;
    }
    while (super.c(localk, new String[] { "packageName" }));
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.o
 * JD-Core Version:    0.6.2
 */