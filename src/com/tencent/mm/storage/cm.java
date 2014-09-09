package com.tencent.mm.storage;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.a.c;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedHashMap;

public final class cm extends ai
{
  private String ikU = null;
  private e ikV = null;
  private boolean ikW = false;

  public cm(e parame)
  {
    this.ikV = parame;
  }

  // ERROR //
  public static boolean Aa(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 32	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_1
    //   8: ifeq +5 -> 13
    //   11: iload_2
    //   12: ireturn
    //   13: aload_0
    //   14: ldc 34
    //   16: invokestatic 40	com/tencent/mm/sdk/platformtools/x:bB	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   19: astore 4
    //   21: iconst_0
    //   22: istore_2
    //   23: aload 4
    //   25: ifnull -14 -> 11
    //   28: new 42	java/io/File
    //   31: dup
    //   32: getstatic 47	com/tencent/mm/storage/h:dgF	Ljava/lang/String;
    //   35: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: astore 5
    //   40: aload 5
    //   42: invokevirtual 54	java/io/File:exists	()Z
    //   45: ifne +9 -> 54
    //   48: aload 5
    //   50: invokevirtual 57	java/io/File:mkdirs	()Z
    //   53: pop
    //   54: aconst_null
    //   55: astore 6
    //   57: new 59	java/io/FileWriter
    //   60: dup
    //   61: new 61	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   68: getstatic 47	com/tencent/mm/storage/h:dgF	Ljava/lang/String;
    //   71: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: ldc 68
    //   76: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokespecial 73	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   85: astore 7
    //   87: aload 7
    //   89: aload_0
    //   90: invokevirtual 76	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   93: iconst_1
    //   94: istore_2
    //   95: aload 7
    //   97: invokevirtual 79	java/io/FileWriter:close	()V
    //   100: aload 7
    //   102: invokevirtual 79	java/io/FileWriter:close	()V
    //   105: iload_2
    //   106: ireturn
    //   107: astore 12
    //   109: iload_2
    //   110: ireturn
    //   111: astore 13
    //   113: aconst_null
    //   114: astore 7
    //   116: aload 7
    //   118: ifnull -107 -> 11
    //   121: aload 7
    //   123: invokevirtual 79	java/io/FileWriter:close	()V
    //   126: iload_2
    //   127: ireturn
    //   128: astore 9
    //   130: iload_2
    //   131: ireturn
    //   132: astore 10
    //   134: aload 6
    //   136: ifnull +8 -> 144
    //   139: aload 6
    //   141: invokevirtual 79	java/io/FileWriter:close	()V
    //   144: aload 10
    //   146: athrow
    //   147: astore 11
    //   149: goto -5 -> 144
    //   152: astore 10
    //   154: aload 7
    //   156: astore 6
    //   158: goto -24 -> 134
    //   161: astore 8
    //   163: goto -47 -> 116
    //   166: astore_3
    //   167: iconst_0
    //   168: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   100	105	107	java/io/IOException
    //   57	87	111	java/lang/Exception
    //   121	126	128	java/io/IOException
    //   57	87	132	finally
    //   139	144	147	java/io/IOException
    //   87	93	152	finally
    //   95	100	152	finally
    //   87	93	161	java/lang/Exception
    //   95	100	161	java/lang/Exception
    //   13	21	166	java/lang/Exception
  }

  private void Aj()
  {
    String str = (String)this.ikV.get(77825);
    z.d("!56@/B4Tb64lLpKpHNn9ujFdl//tcM0HGGs0ntbYiQQPgBIIWLF7K5/W5A==", "readConfig xml " + str);
    if (!ch.jb(this.ikU))
      super.Ba(str);
  }

  public static String aKK()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    String str1 = Build.FINGERPRINT;
    if (str1 != null)
      str1 = str1.replace("/", ":");
    localLinkedHashMap.put("fingerprint", str1);
    localLinkedHashMap.put("manufacturer", Build.MANUFACTURER);
    localLinkedHashMap.put("device", Build.DEVICE);
    localLinkedHashMap.put("model", Build.MODEL);
    localLinkedHashMap.put("product", Build.PRODUCT);
    localLinkedHashMap.put("board", Build.BOARD);
    localLinkedHashMap.put("release", Build.VERSION.RELEASE);
    localLinkedHashMap.put("codename", Build.VERSION.CODENAME);
    localLinkedHashMap.put("incremental", Build.VERSION.INCREMENTAL);
    localLinkedHashMap.put("display", Build.DISPLAY);
    String str2 = ch.a(localLinkedHashMap);
    z.d("!56@/B4Tb64lLpKpHNn9ujFdl//tcM0HGGs0ntbYiQQPgBIIWLF7K5/W5A==", "getLocalFingerprint  " + str2);
    return str2;
  }

  public static String aKL()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<deviceinfo>");
    localStringBuffer.append("<MANUFACTURER name=\"");
    localStringBuffer.append(Build.MANUFACTURER);
    localStringBuffer.append("\">");
    localStringBuffer.append("<MODEL name=\"");
    localStringBuffer.append(Build.MODEL);
    localStringBuffer.append("\">");
    localStringBuffer.append("<VERSION_RELEASE name=\"");
    localStringBuffer.append(Build.VERSION.RELEASE);
    localStringBuffer.append("\">");
    localStringBuffer.append("<VERSION_INCREMENTAL name=\"");
    localStringBuffer.append(Build.VERSION.INCREMENTAL);
    localStringBuffer.append("\">");
    localStringBuffer.append("<DISPLAY name=\"");
    localStringBuffer.append(Build.DISPLAY);
    localStringBuffer.append("\">");
    localStringBuffer.append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
    z.d("!56@/B4Tb64lLpKpHNn9ujFdl//tcM0HGGs0ntbYiQQPgBIIWLF7K5/W5A==", "getFingerprint  " + localStringBuffer.toString());
    return localStringBuffer.toString();
  }

  public final void aKI()
  {
    String str1 = h.dgF;
    String str2 = str1 + "deviceconfig.cfg";
    if (!c.ac(str2))
    {
      Aj();
      return;
    }
    byte[] arrayOfByte = c.b(str2, 0, -1);
    if (ch.B(arrayOfByte))
    {
      Aj();
      return;
    }
    String str3 = new String(arrayOfByte);
    if (ch.jb(str3))
    {
      Aj();
      return;
    }
    z.d("!56@/B4Tb64lLpKpHNn9ujFdl//tcM0HGGs0ntbYiQQPgBIIWLF7K5/W5A==", "readFromLocal info " + str3);
    this.ikV.set(77825, str3);
    this.ikW = true;
    super.Ba(str3);
  }

  public final String aKJ()
  {
    this.ikU = ((String)this.ikV.get(77825));
    z.d("!56@/B4Tb64lLpKpHNn9ujFdl//tcM0HGGs0ntbYiQQPgBIIWLF7K5/W5A==", "getInfoByKey xml " + this.ikU + " key 77825");
    return this.ikU;
  }

  public final int zZ(String paramString)
  {
    z.d("!56@/B4Tb64lLpKpHNn9ujFdl//tcM0HGGs0ntbYiQQPgBIIWLF7K5/W5A==", "dkconf info:[%s] ", new Object[] { paramString });
    if (this.ikW)
      return 0;
    this.ikV.set(77825, paramString);
    this.ikU = null;
    super.Ba(paramString);
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cm
 * JD-Core Version:    0.6.2
 */