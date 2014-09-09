package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.f.e;
import com.tencent.mm.sdk.platformtools.ch;

public final class i extends com.tencent.mm.g.a
{
  private CharSequence ihQ;

  public i()
  {
  }

  public i(String paramString)
  {
    super(paramString);
  }

  public static int aIh()
  {
    return 16;
  }

  public static int aIi()
  {
    return 8;
  }

  public static String g(Cursor paramCursor)
  {
    return paramCursor.getString(paramCursor.getColumnIndex("username"));
  }

  public static boolean nY(int paramInt)
  {
    return (paramInt & 0x8) > 0;
  }

  public static boolean xY(String paramString)
  {
    if (paramString != null)
      return paramString.endsWith("@t.qq.com");
    return false;
  }

  public static boolean xZ(String paramString)
  {
    if (paramString != null)
      return paramString.endsWith("@qr");
    return false;
  }

  public static boolean ya(String paramString)
  {
    if (paramString != null)
      return paramString.endsWith("@qqim");
    return false;
  }

  public static boolean yb(String paramString)
  {
    if (paramString != null)
      return paramString.endsWith("@fb");
    return false;
  }

  public static boolean yc(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
      if (!paramString.contains("@bottle:"))
      {
        boolean bool2 = paramString.endsWith("@bottle");
        bool1 = false;
        if (!bool2);
      }
      else
      {
        bool1 = true;
      }
    return bool1;
  }

  public static boolean yd(String paramString)
  {
    if (ch.jb(paramString));
    while (true)
    {
      return false;
      String str = e.os().nZ();
      if (str == null)
        str = "wx_;wxid_;gh_;a0;a1;a2;a3;a4;a5;a6;a7;a8;a9;q0;q1;q2;q3;q4;q5;q6;q7;q8;q9;qq0;qq1;qq2;qq3;qq4;qq5;qq6;qq7;qq8;qq9;f0;f1;f2;f3;f4;f5;f6;f7;f8;f9;F0;F1;F2;F3;F4;F5;F6;F7;F8;F9;";
      String[] arrayOfString = str.split(";");
      for (int i = 0; i < arrayOfString.length; i++)
        if ((arrayOfString[i] != null) && (paramString.startsWith(arrayOfString[i])))
          return true;
    }
  }

  public static String ye(String paramString)
  {
    if (yc(paramString))
    {
      String[] arrayOfString = paramString.split(":");
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
        return paramString;
      return arrayOfString[0];
    }
    if ((paramString != null) && (paramString.contains("@")))
      return "";
    return paramString + "@bottle";
  }

  public final CharSequence aHW()
  {
    return this.ihQ;
  }

  public final boolean aIg()
  {
    return (0x8 & jd()) > 0;
  }

  public final boolean aIj()
  {
    return (int)ch.CL() - jA() > 86400L;
  }

  public final void aIk()
  {
    String str = jz();
    if (ch.jb(str));
    String[] arrayOfString;
    do
    {
      return;
      arrayOfString = str.split("_");
    }
    while (arrayOfString.length <= 0);
    if (arrayOfString.length > 2)
    {
      if (RegionCodeDecoder.zS(arrayOfString[0]))
        super.bi(RegionCodeDecoder.aKA().bv(arrayOfString[0], arrayOfString[1]));
      while (true)
      {
        super.bj(RegionCodeDecoder.aKA().w(arrayOfString[0], arrayOfString[1], arrayOfString[2]));
        return;
        super.bi(RegionCodeDecoder.aKA().zU(arrayOfString[0]));
      }
    }
    if (arrayOfString.length == 2)
    {
      super.bi(RegionCodeDecoder.aKA().zU(arrayOfString[0]));
      super.bj(RegionCodeDecoder.aKA().bv(arrayOfString[0], arrayOfString[1]));
      return;
    }
    super.bi(RegionCodeDecoder.aKA().zU(arrayOfString[0]));
    super.bj("");
  }

  @Deprecated
  public final void bi(String paramString)
  {
    super.bi(paramString);
  }

  @Deprecated
  public final void bj(String paramString)
  {
    super.bj(paramString);
  }

  public final void bn(String paramString)
  {
    super.bn(paramString);
    aIk();
  }

  public final String getCountryCode()
  {
    String str = jz();
    if (ch.jb(str))
      return "";
    String[] arrayOfString = str.split("_");
    if ((arrayOfString == null) || (arrayOfString.length <= 0))
      return "";
    return ch.ja(arrayOfString[0]);
  }

  public final String jp()
  {
    return super.jp();
  }

  public final String jq()
  {
    return super.jq();
  }

  public final void q(CharSequence paramCharSequence)
  {
    this.ihQ = paramCharSequence;
  }

  public final String rT()
  {
    String str = jz();
    if (ch.jb(str))
      return "";
    String[] arrayOfString = str.split("_");
    if ((arrayOfString == null) || (arrayOfString.length < 3))
      return "";
    return ch.ja(arrayOfString[2]);
  }

  public final String rU()
  {
    String str = jz();
    if (ch.jb(str))
      return "";
    String[] arrayOfString = str.split("_");
    if ((arrayOfString == null) || (arrayOfString.length < 2))
      return "";
    return ch.ja(arrayOfString[1]);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.i
 * JD-Core Version:    0.6.2
 */