package com.tencent.mm.ad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.a.c;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import junit.framework.Assert;

public final class m extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS packageinfo ( id int  PRIMARY KEY, version int  , name text  , size int  , packname text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE TABLE IF NOT EXISTS packageinfo2 ( localId text  PRIMARY KEY , id int  , version int  , name text  , size int  , packname text  , status int  , type int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  private String dAA;
  private h dmb;

  public m(h paramh, String paramString)
  {
    this.dmb = paramh;
    this.dAA = paramString;
  }

  public static int B(Context paramContext)
  {
    int i = 1;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int j;
    if (localDisplayMetrics.heightPixels > localDisplayMetrics.widthPixels)
    {
      j = i;
      if (localDisplayMetrics.density > 1.0F)
        break label65;
      if (j == 0)
        break label63;
      i = 4;
    }
    label63: label65: 
    while (j == 0)
    {
      return i;
      j = 0;
      break;
      return 2;
    }
    return 3;
  }

  public static String D(int paramInt1, int paramInt2)
  {
    return paramInt1 + "_" + paramInt2 + "_thumb.jpg";
  }

  public final l C(int paramInt1, int paramInt2)
  {
    String str = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.id = \"" + ch.iV(String.valueOf(paramInt1)) + "\" and packageinfo2." + "type = \"" + ch.iV(String.valueOf(paramInt2)) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    l locall = null;
    if (bool)
    {
      locall = new l();
      locall.b(localCursor);
    }
    localCursor.close();
    return locall;
  }

  public final String E(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 3:
    case 4:
    case 6:
    case 10:
    case 11:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    default:
      return "";
    case 0:
      return "";
    case 1:
      return paramInt1 + "_session_bg.zip";
    case 2:
      return paramInt1 + "_emoji_art.temp";
    case 8:
      return paramInt1 + "_regiondata.temp";
    case 7:
      return paramInt1 + "_configlist.cfg";
    case 9:
      return "_speex_upload.cfg";
    case 12:
      return "_rcpt_addr";
    case 18:
      l locall = C(paramInt1, paramInt2);
      return locall.getVersion() + "_feature.zip";
    case 5:
      return "brand_i18n.apk";
    case 19:
      return "_report_reason.temp";
    case 20:
      return "_pluginDesc.cfg";
    case 21:
    }
    return "_trace_config.cfg";
  }

  public final String F(int paramInt1, int paramInt2)
  {
    String str2;
    switch (paramInt2)
    {
    default:
      str2 = "";
    case 0:
    case 1:
      while (true)
      {
        return str2;
        return "";
        str2 = this.dAA + paramInt1 + "_session_bg/";
        try
        {
          File localFile = new File(str2);
          if (!localFile.exists())
          {
            localFile.mkdirs();
            return str2;
          }
        }
        catch (Exception localException)
        {
          z.e("!44@/B4Tb64lLpJ6jp9exyG3VlREQiimRbtRPC/3phAovSs=", "can not create dir, dir = " + str2);
          return str2;
        }
      }
    case 2:
      return "";
    case 18:
    }
    String str1 = E(paramInt1, paramInt2);
    return this.dAA + str1.replace(".zip", "");
  }

  public final void G(int paramInt1, int paramInt2)
  {
    c.deleteFile(this.dAA + E(paramInt1, paramInt2));
    l locall = C(paramInt1, paramInt2);
    if (locall != null)
    {
      locall.setStatus(5);
      s.yO().b(locall);
    }
  }

  public final boolean a(l paraml)
  {
    if (paraml == null);
    ContentValues localContentValues;
    do
    {
      return false;
      paraml.db(-1);
      localContentValues = paraml.ir();
    }
    while ((int)this.dmb.insert("packageinfo2", "localId", localContentValues) == -1);
    Bo();
    return true;
  }

  public final boolean b(l paraml)
  {
    if (paraml != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ContentValues localContentValues = paraml.ir();
      if (localContentValues.size() <= 0)
        break;
      h localh = this.dmb;
      String[] arrayOfString = new String[2];
      arrayOfString[0] = paraml.getId();
      arrayOfString[1] = paraml.yJ();
      if (localh.update("packageinfo2", localContentValues, "id= ? and type =?", arrayOfString) <= 0)
        break;
      Bo();
      return true;
    }
    Bo();
    return false;
  }

  public final boolean c(l paraml)
  {
    eb(paraml.yJ());
    paraml.setStatus(1);
    return b(paraml);
  }

  public final boolean eb(int paramInt)
  {
    String str = "update packageinfo2 set status = 2 where status = 1 and type = " + paramInt + ";";
    boolean bool = this.dmb.bp("packageinfo2", str);
    Bo();
    return bool;
  }

  public final boolean ec(int paramInt)
  {
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    if (localh.delete("packageinfo2", "type =?", arrayOfString) > 0)
    {
      Bo();
      return true;
    }
    return false;
  }

  public final l[] ed(int paramInt)
  {
    String str = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=" + paramInt;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    int i = localCursor.getCount();
    z.d("!44@/B4Tb64lLpJ6jp9exyG3VlREQiimRbtRPC/3phAovSs=", "getInfoByType : count:" + i + " type:" + paramInt);
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    l[] arrayOfl = new l[i];
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      l locall = new l();
      locall.b(localCursor);
      arrayOfl[j] = locall;
    }
    localCursor.close();
    return arrayOfl;
  }

  public final String i(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      return this.dAA + paramString + "_chatting_bg_vertical.jpg";
    return this.dAA + paramString + "_chatting_bg_horizontal.jpg";
  }

  public final String p(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 3:
    case 4:
      return i(paramString, true);
    case 1:
    case 2:
    }
    return i(paramString, false);
  }

  public final Cursor yK()
  {
    String str = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1";
    return this.dmb.rawQuery(str, null);
  }

  public final String yL()
  {
    return this.dAA;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.m
 * JD-Core Version:    0.6.2
 */