package com.tencent.mm.storage;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class RegionCodeDecoder
{
  private static RegionCodeDecoder ikN = null;
  public static final String ikO = "/data/data/" + ak.getContext().getPackageName() + "/MicroMsg/regioncode/";
  private String ikP = "";
  private String ikQ = "";

  public static RegionCodeDecoder aKA()
  {
    if (ikN == null)
      ikN = new RegionCodeDecoder();
    RegionCodeDecoder localRegionCodeDecoder = ikN;
    if (!y.aGW().equals(localRegionCodeDecoder.ikP))
      localRegionCodeDecoder.aHZ();
    return ikN;
  }

  // ERROR //
  private static void aKB()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 76
    //   4: newarray byte
    //   6: astore_1
    //   7: invokestatic 28	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   10: invokevirtual 80	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   13: ldc 82
    //   15: invokevirtual 88	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore 12
    //   20: aload 12
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull +12 -> 36
    //   27: aload_3
    //   28: ifnull +7 -> 35
    //   31: aload_3
    //   32: invokevirtual 93	java/io/InputStream:close	()V
    //   35: return
    //   36: iconst_0
    //   37: istore 13
    //   39: iconst_0
    //   40: istore 14
    //   42: iload 13
    //   44: iconst_4
    //   45: if_icmpge +352 -> 397
    //   48: iload 14
    //   50: aload_3
    //   51: invokevirtual 97	java/io/InputStream:read	()I
    //   54: iload 13
    //   56: bipush 8
    //   58: imul
    //   59: ishl
    //   60: ior
    //   61: istore 34
    //   63: iinc 13 1
    //   66: iload 34
    //   68: istore 14
    //   70: goto -28 -> 42
    //   73: iload 16
    //   75: iconst_4
    //   76: if_icmpge +24 -> 100
    //   79: iload 17
    //   81: aload_3
    //   82: invokevirtual 97	java/io/InputStream:read	()I
    //   85: iload 16
    //   87: bipush 8
    //   89: imul
    //   90: ishl
    //   91: ior
    //   92: istore 17
    //   94: iinc 16 1
    //   97: goto -24 -> 73
    //   100: iload 17
    //   102: newarray byte
    //   104: astore 20
    //   106: aload_3
    //   107: aload 20
    //   109: invokevirtual 100	java/io/InputStream:read	([B)I
    //   112: pop
    //   113: new 63	java/lang/String
    //   116: dup
    //   117: aload 20
    //   119: invokespecial 103	java/lang/String:<init>	([B)V
    //   122: astore 22
    //   124: iconst_0
    //   125: istore 23
    //   127: iconst_0
    //   128: istore 24
    //   130: iload 23
    //   132: iconst_4
    //   133: if_icmpge +28 -> 161
    //   136: iload 24
    //   138: aload_3
    //   139: invokevirtual 97	java/io/InputStream:read	()I
    //   142: iload 23
    //   144: bipush 8
    //   146: imul
    //   147: ishl
    //   148: ior
    //   149: istore 25
    //   151: iinc 23 1
    //   154: iload 25
    //   156: istore 24
    //   158: goto -28 -> 130
    //   161: new 105	java/io/File
    //   164: dup
    //   165: aload 22
    //   167: invokestatic 109	com/tencent/mm/storage/RegionCodeDecoder:zR	(Ljava/lang/String;)Ljava/lang/String;
    //   170: invokespecial 110	java/io/File:<init>	(Ljava/lang/String;)V
    //   173: astore 26
    //   175: aload 26
    //   177: invokevirtual 114	java/io/File:exists	()Z
    //   180: ifne +9 -> 189
    //   183: aload 26
    //   185: invokevirtual 117	java/io/File:createNewFile	()Z
    //   188: pop
    //   189: new 119	java/io/FileOutputStream
    //   192: dup
    //   193: aload 26
    //   195: invokespecial 122	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   198: astore 5
    //   200: iconst_0
    //   201: istore 27
    //   203: iload 27
    //   205: iload 24
    //   207: if_icmpge +54 -> 261
    //   210: iload 24
    //   212: iload 27
    //   214: isub
    //   215: istore 29
    //   217: iload 29
    //   219: ldc 76
    //   221: if_icmple +7 -> 228
    //   224: ldc 76
    //   226: istore 29
    //   228: aload_3
    //   229: aload_1
    //   230: iconst_0
    //   231: iload 29
    //   233: invokevirtual 125	java/io/InputStream:read	([BII)I
    //   236: istore 30
    //   238: iload 27
    //   240: iload 30
    //   242: iadd
    //   243: istore 31
    //   245: aload 5
    //   247: aload_1
    //   248: iconst_0
    //   249: iload 30
    //   251: invokevirtual 129	java/io/FileOutputStream:write	([BII)V
    //   254: iload 31
    //   256: istore 27
    //   258: goto -55 -> 203
    //   261: aload 5
    //   263: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   266: iinc 15 1
    //   269: goto +131 -> 400
    //   272: aload_3
    //   273: ifnull -238 -> 35
    //   276: aload_3
    //   277: invokevirtual 93	java/io/InputStream:close	()V
    //   280: return
    //   281: astore 33
    //   283: return
    //   284: astore 8
    //   286: aconst_null
    //   287: astore 9
    //   289: aload 9
    //   291: ifnull +8 -> 299
    //   294: aload 9
    //   296: invokevirtual 93	java/io/InputStream:close	()V
    //   299: aload_0
    //   300: ifnull -265 -> 35
    //   303: aload_0
    //   304: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   307: return
    //   308: astore 10
    //   310: return
    //   311: astore_2
    //   312: aconst_null
    //   313: astore_3
    //   314: aload_2
    //   315: astore 4
    //   317: aconst_null
    //   318: astore 5
    //   320: aload_3
    //   321: ifnull +7 -> 328
    //   324: aload_3
    //   325: invokevirtual 93	java/io/InputStream:close	()V
    //   328: aload 5
    //   330: ifnull +8 -> 338
    //   333: aload 5
    //   335: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   338: aload 4
    //   340: athrow
    //   341: astore 35
    //   343: return
    //   344: astore 11
    //   346: goto -47 -> 299
    //   349: astore 7
    //   351: goto -23 -> 328
    //   354: astore 6
    //   356: goto -18 -> 338
    //   359: astore 19
    //   361: aload 19
    //   363: astore 4
    //   365: aconst_null
    //   366: astore 5
    //   368: goto -48 -> 320
    //   371: astore 4
    //   373: goto -53 -> 320
    //   376: astore 18
    //   378: aload_3
    //   379: astore 9
    //   381: aconst_null
    //   382: astore_0
    //   383: goto -94 -> 289
    //   386: astore 28
    //   388: aload 5
    //   390: astore_0
    //   391: aload_3
    //   392: astore 9
    //   394: goto -105 -> 289
    //   397: iconst_0
    //   398: istore 15
    //   400: iload 15
    //   402: iload 14
    //   404: if_icmpge -132 -> 272
    //   407: iconst_0
    //   408: istore 16
    //   410: iconst_0
    //   411: istore 17
    //   413: goto -340 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   276	280	281	java/io/IOException
    //   7	20	284	java/lang/Exception
    //   303	307	308	java/io/IOException
    //   7	20	311	finally
    //   31	35	341	java/io/IOException
    //   294	299	344	java/io/IOException
    //   324	328	349	java/io/IOException
    //   333	338	354	java/io/IOException
    //   48	63	359	finally
    //   79	94	359	finally
    //   100	124	359	finally
    //   136	151	359	finally
    //   161	189	359	finally
    //   189	200	359	finally
    //   228	238	371	finally
    //   245	254	371	finally
    //   261	266	371	finally
    //   48	63	376	java/lang/Exception
    //   79	94	376	java/lang/Exception
    //   100	124	376	java/lang/Exception
    //   136	151	376	java/lang/Exception
    //   161	189	376	java/lang/Exception
    //   189	200	376	java/lang/Exception
    //   228	238	386	java/lang/Exception
    //   245	254	386	java/lang/Exception
    //   261	266	386	java/lang/Exception
  }

  private String aKC()
  {
    StringBuilder localStringBuilder = new StringBuilder("mmregioncode_");
    if (this.ikP.equalsIgnoreCase("zh_HK"));
    String str2;
    File localFile;
    for (String str1 = "zh_TW"; ; str1 = this.ikP)
    {
      str2 = str1 + ".txt";
      localFile = new File(ikO);
      if (localFile.exists())
        break;
      localFile.mkdir();
      return null;
    }
    String[] arrayOfString = localFile.list();
    if ((arrayOfString == null) || (arrayOfString.length == 0))
      return null;
    int i = arrayOfString.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      String str3 = arrayOfString[j];
      if (str3.equals(str2))
        return str3;
      if ((k == 0) && (str3.equals("mmregioncode_en.txt")))
        k = 1;
      j++;
    }
    if (k != 0)
      return "mmregioncode_en.txt";
    return null;
  }

  private static String getLocName(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    return RegionCodeDecoder.DecoderJni.getLocName(paramString);
  }

  public static final String v(String paramString1, String paramString2, String paramString3)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (!ch.jb(paramString1))
    {
      localStringBuffer.append(paramString1);
      if (!ch.jb(paramString2))
      {
        localStringBuffer.append('_');
        localStringBuffer.append(paramString2);
        if (!ch.jb(paramString3))
        {
          localStringBuffer.append('_');
          localStringBuffer.append(paramString3);
        }
      }
    }
    return localStringBuffer.toString();
  }

  public static String zR(String paramString)
  {
    if (!ch.jb(paramString))
      if ((ch.jb(paramString)) || ((!paramString.equalsIgnoreCase("zh_TW")) && (!paramString.equalsIgnoreCase("zh_HK")) && (!paramString.equalsIgnoreCase("zh_CN")) && (!paramString.equalsIgnoreCase("en")) && (!paramString.equalsIgnoreCase("th")) && (!paramString.equals("id")) && (!paramString.equals("vi")) && (!paramString.equalsIgnoreCase("pt")) && (!paramString.equalsIgnoreCase("es")) && (!paramString.equalsIgnoreCase("ru")) && (!paramString.equalsIgnoreCase("ar")) && (!paramString.equalsIgnoreCase("iw")) && (!paramString.equalsIgnoreCase("pl")) && (!paramString.equalsIgnoreCase("hi")) && (!paramString.equalsIgnoreCase("ja")) && (!paramString.equalsIgnoreCase("it")) && (!paramString.equalsIgnoreCase("ko")) && (!paramString.equalsIgnoreCase("ms")) && (!paramString.equalsIgnoreCase("tr")) && (!paramString.equalsIgnoreCase("de")) && (!paramString.equalsIgnoreCase("fr"))))
        break label232;
    label232: for (int i = 1; i == 0; i = 0)
    {
      z.e("!44@/B4Tb64lLpJmIJaV8eMcmZabjvLFuEDHSmAhvCRiAjA=", "unsupported language:" + paramString);
      return null;
    }
    if (paramString.equalsIgnoreCase("zh_HK"))
      paramString = "zh_TW";
    return ikO + "mmregioncode_" + paramString + ".txt";
  }

  public static final boolean zS(String paramString)
  {
    if (ch.jb(paramString))
      return false;
    return paramString.equalsIgnoreCase("cn");
  }

  public static String zT(String paramString)
  {
    return getLocName(paramString);
  }

  public final void aHZ()
  {
    File localFile = new File(ikO);
    if (!localFile.exists())
    {
      localFile.mkdir();
      aKB();
    }
    String[] arrayOfString = localFile.list();
    if ((arrayOfString == null) || (arrayOfString.length == 0))
      aKB();
    this.ikP = y.aGW();
    String str1 = aKC();
    if (ch.jb(str1))
      z.e("!44@/B4Tb64lLpJmIJaV8eMcmZabjvLFuEDHSmAhvCRiAjA=", "buildMap error, no codeFile found, curLang: " + this.ikP);
    String str2;
    do
    {
      return;
      str2 = ikO + str1;
    }
    while (str2.equals(this.ikQ));
    this.ikQ = str2;
    RegionCodeDecoder.DecoderJni.buildFromFile(this.ikQ);
  }

  public final RegionCodeDecoder.Region[] aKD()
  {
    if (ch.jb(this.ikQ))
      return null;
    return RegionCodeDecoder.DecoderJni.getCountries(this.ikQ);
  }

  public final String bv(String paramString1, String paramString2)
  {
    boolean bool1 = ch.jb(paramString1);
    String str = null;
    if (!bool1)
    {
      boolean bool2 = ch.jb(paramString2);
      str = null;
      if (!bool2)
        break label43;
    }
    while (true)
    {
      if (ch.jb(str))
        str = ch.ja(paramString2);
      return str;
      label43: str = getLocName(v(paramString1, paramString2, null));
    }
  }

  public final RegionCodeDecoder.Region[] bw(String paramString1, String paramString2)
  {
    if ((ch.jb(this.ikQ)) || (ch.jb(paramString1)) || (ch.jb(paramString2)))
      return null;
    return RegionCodeDecoder.DecoderJni.getCities(this.ikQ, paramString1, paramString2);
  }

  public final String w(String paramString1, String paramString2, String paramString3)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)) || (ch.jb(paramString3)));
    for (String str = null; ; str = getLocName(v(paramString1, paramString2, paramString3)))
    {
      if (ch.jb(str))
        str = ch.ja(paramString3);
      return str;
    }
  }

  public final String zU(String paramString)
  {
    String str = getLocName(paramString);
    if (ch.jb(str))
      str = ch.ja(paramString);
    return str;
  }

  public final RegionCodeDecoder.Region[] zV(String paramString)
  {
    if ((ch.jb(this.ikQ)) || (ch.jb(paramString)))
      return null;
    return RegionCodeDecoder.DecoderJni.getProvinces(this.ikQ, paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.RegionCodeDecoder
 * JD-Core Version:    0.6.2
 */