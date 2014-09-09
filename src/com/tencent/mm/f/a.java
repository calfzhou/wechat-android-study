package com.tencent.mm.f;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class a
{
  public static final String dPf = com.tencent.mm.storage.h.dgF + "configlist/";
  private SparseArray dPe = new SparseArray();

  private static String ct(int paramInt)
  {
    return dPf + "config_" + paramInt + ".xml";
  }

  private void e(int paramInt, String paramString)
  {
    b localb = new b(paramInt);
    localb.cL(paramString);
    this.dPe.put(Integer.valueOf(paramInt).intValue(), localb);
  }

  // ERROR //
  private void load(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 79	java/io/File
    //   5: dup
    //   6: iload_1
    //   7: invokestatic 81	com/tencent/mm/f/a:ct	(I)Ljava/lang/String;
    //   10: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 87	java/io/File:exists	()Z
    //   18: ifeq +157 -> 175
    //   21: new 89	java/io/FileInputStream
    //   24: dup
    //   25: aload_3
    //   26: invokespecial 92	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   29: astore 5
    //   31: new 94	java/io/InputStreamReader
    //   34: dup
    //   35: aload 5
    //   37: ldc 96
    //   39: invokespecial 99	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   42: astore 9
    //   44: new 101	java/io/BufferedReader
    //   47: dup
    //   48: aload 9
    //   50: invokespecial 104	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: astore 10
    //   55: new 106	java/lang/StringBuffer
    //   58: dup
    //   59: invokespecial 107	java/lang/StringBuffer:<init>	()V
    //   62: astore 11
    //   64: aload 10
    //   66: invokevirtual 110	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   69: astore 14
    //   71: aload 14
    //   73: ifnull +27 -> 100
    //   76: aload 11
    //   78: aload 14
    //   80: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   83: pop
    //   84: goto -20 -> 64
    //   87: astore 13
    //   89: aload 5
    //   91: ifnull +8 -> 99
    //   94: aload 5
    //   96: invokevirtual 118	java/io/InputStream:close	()V
    //   99: return
    //   100: aload_0
    //   101: iload_1
    //   102: aload 11
    //   104: invokevirtual 119	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   107: invokespecial 121	com/tencent/mm/f/a:e	(ILjava/lang/String;)V
    //   110: aload 9
    //   112: invokevirtual 122	java/io/InputStreamReader:close	()V
    //   115: aload 10
    //   117: invokevirtual 123	java/io/BufferedReader:close	()V
    //   120: aload 5
    //   122: ifnull -23 -> 99
    //   125: aload 5
    //   127: invokevirtual 118	java/io/InputStream:close	()V
    //   130: return
    //   131: astore 16
    //   133: return
    //   134: astore 7
    //   136: aload_2
    //   137: ifnull +7 -> 144
    //   140: aload_2
    //   141: invokevirtual 118	java/io/InputStream:close	()V
    //   144: aload 7
    //   146: athrow
    //   147: astore 6
    //   149: return
    //   150: astore 8
    //   152: goto -8 -> 144
    //   155: astore 12
    //   157: aload 5
    //   159: astore_2
    //   160: aload 12
    //   162: astore 7
    //   164: goto -28 -> 136
    //   167: astore 4
    //   169: aconst_null
    //   170: astore 5
    //   172: goto -83 -> 89
    //   175: aconst_null
    //   176: astore 5
    //   178: goto -58 -> 120
    //
    // Exception table:
    //   from	to	target	type
    //   31	64	87	java/lang/Exception
    //   64	71	87	java/lang/Exception
    //   76	84	87	java/lang/Exception
    //   100	120	87	java/lang/Exception
    //   125	130	131	java/io/IOException
    //   2	31	134	finally
    //   94	99	147	java/io/IOException
    //   140	144	150	java/io/IOException
    //   31	64	155	finally
    //   64	71	155	finally
    //   76	84	155	finally
    //   100	120	155	finally
    //   2	31	167	java/lang/Exception
  }

  public static int oa()
  {
    String str = e.or().getValue("VoiceVOIPSwitch");
    z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "voip is " + str);
    try
    {
      int j = ch.getInt(str, 0);
      i = j;
      z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "showVoiceVoipEntrance is " + i);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }

  // ERROR //
  private boolean renameTo(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 87	java/io/File:exists	()Z
    //   4: istore_3
    //   5: iconst_0
    //   6: istore 4
    //   8: iload_3
    //   9: ifeq +90 -> 99
    //   12: aload_1
    //   13: invokevirtual 162	java/io/File:isDirectory	()Z
    //   16: ifeq +86 -> 102
    //   19: aload_2
    //   20: invokevirtual 87	java/io/File:exists	()Z
    //   23: ifne +8 -> 31
    //   26: aload_2
    //   27: invokevirtual 165	java/io/File:mkdir	()Z
    //   30: pop
    //   31: aload_1
    //   32: invokevirtual 169	java/io/File:listFiles	()[Ljava/io/File;
    //   35: astore 21
    //   37: iconst_0
    //   38: istore 22
    //   40: iload 4
    //   42: aload 21
    //   44: arraylength
    //   45: if_icmpge +50 -> 95
    //   48: aload 21
    //   50: iload 4
    //   52: aaload
    //   53: astore 23
    //   55: aload_0
    //   56: aload 23
    //   58: new 79	java/io/File
    //   61: dup
    //   62: aload_2
    //   63: invokevirtual 172	java/io/File:getPath	()Ljava/lang/String;
    //   66: aload 23
    //   68: invokevirtual 175	java/io/File:getName	()Ljava/lang/String;
    //   71: invokespecial 177	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: invokespecial 179	com/tencent/mm/f/a:renameTo	(Ljava/io/File;Ljava/io/File;)Z
    //   77: istore 22
    //   79: iload 22
    //   81: ifeq +8 -> 89
    //   84: aload_1
    //   85: invokevirtual 182	java/io/File:delete	()Z
    //   88: pop
    //   89: iinc 4 1
    //   92: goto -52 -> 40
    //   95: iload 22
    //   97: istore 4
    //   99: iload 4
    //   101: ireturn
    //   102: new 89	java/io/FileInputStream
    //   105: dup
    //   106: aload_1
    //   107: invokespecial 92	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   110: astore 5
    //   112: new 184	java/io/FileOutputStream
    //   115: dup
    //   116: aload_2
    //   117: invokespecial 185	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   120: astore 6
    //   122: sipush 1024
    //   125: newarray byte
    //   127: astore 14
    //   129: aload 5
    //   131: aload 14
    //   133: invokevirtual 189	java/io/InputStream:read	([B)I
    //   136: istore 15
    //   138: iload 15
    //   140: iconst_m1
    //   141: if_icmpeq +51 -> 192
    //   144: aload 6
    //   146: aload 14
    //   148: iconst_0
    //   149: iload 15
    //   151: invokevirtual 195	java/io/OutputStream:write	([BII)V
    //   154: goto -25 -> 129
    //   157: astore 10
    //   159: aload 5
    //   161: astore 11
    //   163: aload 11
    //   165: ifnull +8 -> 173
    //   168: aload 11
    //   170: invokevirtual 118	java/io/InputStream:close	()V
    //   173: iconst_0
    //   174: istore 4
    //   176: aload 6
    //   178: ifnull -79 -> 99
    //   181: aload 6
    //   183: invokevirtual 196	java/io/OutputStream:close	()V
    //   186: iconst_0
    //   187: ireturn
    //   188: astore 12
    //   190: iconst_0
    //   191: ireturn
    //   192: aload 6
    //   194: invokevirtual 199	java/io/OutputStream:flush	()V
    //   197: aload_1
    //   198: invokevirtual 182	java/io/File:delete	()Z
    //   201: pop
    //   202: aload 5
    //   204: invokevirtual 118	java/io/InputStream:close	()V
    //   207: aload 6
    //   209: invokevirtual 196	java/io/OutputStream:close	()V
    //   212: iconst_1
    //   213: ireturn
    //   214: astore 7
    //   216: aconst_null
    //   217: astore 6
    //   219: aconst_null
    //   220: astore 5
    //   222: aload 5
    //   224: ifnull +8 -> 232
    //   227: aload 5
    //   229: invokevirtual 118	java/io/InputStream:close	()V
    //   232: aload 6
    //   234: ifnull +8 -> 242
    //   237: aload 6
    //   239: invokevirtual 196	java/io/OutputStream:close	()V
    //   242: aload 7
    //   244: athrow
    //   245: astore 17
    //   247: goto -40 -> 207
    //   250: astore 18
    //   252: goto -40 -> 212
    //   255: astore 13
    //   257: goto -84 -> 173
    //   260: astore 9
    //   262: goto -30 -> 232
    //   265: astore 8
    //   267: goto -25 -> 242
    //   270: astore 7
    //   272: aconst_null
    //   273: astore 6
    //   275: goto -53 -> 222
    //   278: astore 7
    //   280: goto -58 -> 222
    //   283: astore 20
    //   285: aconst_null
    //   286: astore 6
    //   288: aconst_null
    //   289: astore 11
    //   291: goto -128 -> 163
    //   294: astore 19
    //   296: aload 5
    //   298: astore 11
    //   300: aconst_null
    //   301: astore 6
    //   303: goto -140 -> 163
    //
    // Exception table:
    //   from	to	target	type
    //   122	129	157	java/lang/Exception
    //   129	138	157	java/lang/Exception
    //   144	154	157	java/lang/Exception
    //   192	202	157	java/lang/Exception
    //   181	186	188	java/io/IOException
    //   102	112	214	finally
    //   202	207	245	java/io/IOException
    //   207	212	250	java/io/IOException
    //   168	173	255	java/io/IOException
    //   227	232	260	java/io/IOException
    //   237	242	265	java/io/IOException
    //   112	122	270	finally
    //   122	129	278	finally
    //   129	138	278	finally
    //   144	154	278	finally
    //   192	202	278	finally
    //   102	112	283	java/lang/Exception
    //   112	122	294	java/lang/Exception
  }

  private String s(String paramString1, String paramString2)
  {
    if (this.dPe.get(1) == null)
      load(1);
    b localb = (b)this.dPe.get(1);
    if (localb == null)
      return null;
    return localb.U(paramString1, paramString2);
  }

  public final int cK(String paramString)
  {
    return ch.getInt(s("QQBroswer", paramString), 5);
  }

  public final void d(int paramInt, byte[] paramArrayOfByte)
  {
    File localFile1 = new File(dPf);
    if (!localFile1.exists())
      localFile1.mkdir();
    try
    {
      File localFile2 = new File(ct(paramInt));
      if (!localFile2.exists())
        localFile2.createNewFile();
      com.tencent.mm.a.c.a(ct(paramInt), paramArrayOfByte, paramArrayOfByte.length);
      e(paramInt, new String(paramArrayOfByte));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final String getMailAppAndroidMD5()
  {
    return s("MailApp", "MailAppAndroidMD5");
  }

  public final String getMailAppDownloadUrAndroid()
  {
    return s("MailApp", "MailAppDownloadUrAndroid");
  }

  public final String getMailAppIcon()
  {
    return s("MailApp", "MailAppIcon");
  }

  public final String getMailAppOpenUrlAndroid()
  {
    return s("MailApp", "MailAppOpenUrlAndroid");
  }

  public final void init()
  {
    for (int i = 0; i < b.dPg.length; i++)
      load(b.dPg[i]);
  }

  public final boolean nW()
  {
    File localFile1 = new File(com.tencent.mm.compatible.g.h.dOI + "configlist/");
    if (!localFile1.exists());
    File localFile2;
    do
    {
      return true;
      localFile2 = new File(dPf);
    }
    while (localFile2.exists());
    z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "bugfix");
    return renameTo(localFile1, localFile2);
  }

  public final void nX()
  {
    this.dPe.clear();
  }

  public final int nY()
  {
    String str1 = ch.aHJ();
    if (ch.jb(str1));
    String str2;
    do
    {
      return -1;
      str2 = s("VoipInviteTimeLimit", str1);
    }
    while (ch.jb(str2));
    try
    {
      int i = Integer.parseInt(str2);
      return i;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public final String nZ()
  {
    return s("HideWechatID", "idprefix");
  }

  public final int ob()
  {
    return ch.getInt(s("BrandService", "continueLocationReportInterval"), 5);
  }

  public final boolean oe()
  {
    int i = ch.getInt(s("ShowConfig", "hideaddfriend"), 0);
    boolean bool = false;
    if (i == 0)
      bool = true;
    return bool;
  }

  public final boolean of()
  {
    int i = 1;
    if (ch.getInt(s("ShowConfig", "hidePoiOversea"), i) == i);
    while (true)
    {
      z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "isHidePoiOversea : " + i);
      return i;
      int j = 0;
    }
  }

  public final String[] oh()
  {
    String str = s("WebViewConfig", "removeJavascriptInterface");
    if (ch.jb(str))
      return null;
    return str.split(";");
  }

  public final boolean oi()
  {
    int i = 1;
    if (ch.getInt(s("ShowConfig", "showShakeTV"), 0) == i);
    while (true)
    {
      z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "isShowShakeTV : " + i);
      return i;
      int j = 0;
    }
  }

  public final String oj()
  {
    String str = s("FreeWiFiConfig", "CheckURL");
    z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "get check url for free wifi : %s", new Object[] { str });
    return str;
  }

  public final boolean ok()
  {
    int i = 1;
    if (ch.getInt(s("ShowConfig", "showRecvTmpMsgBtn"), 0) == i);
    while (true)
    {
      z.d("!44@/B4Tb64lLpIGhQOF66mZzwHpIdHfcGA8oTfkk/LC/Wo=", "isShowRecvTmpMsgBtn : " + i);
      return i;
      int j = 0;
    }
  }

  public final int ol()
  {
    return ch.getInt(s("MailApp", "ShowMailAppRecommend"), 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.f.a
 * JD-Core Version:    0.6.2
 */