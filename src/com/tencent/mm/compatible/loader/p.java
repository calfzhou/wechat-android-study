package com.tencent.mm.compatible.loader;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public class p
{
  private static final String TAG = p.class.getSimpleName();
  private static ConcurrentHashMap jsF = new ConcurrentHashMap(1);
  public static String[] jsH = { "shoot" };

  private static File Yd()
  {
    File localFile = new File(ak.getContext().getFilesDir(), "plugin_repo");
    if ((!localFile.exists()) && (!localFile.mkdirs()))
      localFile = null;
    return localFile;
  }

  public static File a(PluginDescription paramPluginDescription)
  {
    if ((paramPluginDescription != null) && (paramPluginDescription.cHL != null) && (paramPluginDescription.cHL.length() > 0))
      return new File(Yd(), "com.tencent.mm.plugin." + paramPluginDescription.cHL + ".jar");
    return null;
  }

  // ERROR //
  public static void b(PluginDescription paramPluginDescription)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 100	java/io/FileOutputStream
    //   5: dup
    //   6: aload_0
    //   7: getfield 103	com/tencent/mm/compatible/loader/PluginDescription:name	Ljava/lang/String;
    //   10: invokestatic 107	com/tencent/mm/compatible/loader/p:sD	(Ljava/lang/String;)Ljava/io/File;
    //   13: invokespecial 110	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   16: astore_2
    //   17: new 112	java/io/ObjectOutputStream
    //   20: dup
    //   21: aload_2
    //   22: invokespecial 115	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   25: astore_3
    //   26: aload_3
    //   27: aload_0
    //   28: invokevirtual 119	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   31: aload_3
    //   32: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   35: aload_2
    //   36: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   39: return
    //   40: astore 4
    //   42: aconst_null
    //   43: astore_3
    //   44: getstatic 20	com/tencent/mm/compatible/loader/p:TAG	Ljava/lang/String;
    //   47: aload 4
    //   49: ldc 127
    //   51: iconst_0
    //   52: anewarray 4	java/lang/Object
    //   55: invokestatic 133	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload_3
    //   59: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   62: aload_1
    //   63: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   66: return
    //   67: astore 6
    //   69: aconst_null
    //   70: astore_2
    //   71: getstatic 20	com/tencent/mm/compatible/loader/p:TAG	Ljava/lang/String;
    //   74: aload 6
    //   76: ldc 127
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 133	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aload_1
    //   86: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   89: aload_2
    //   90: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   93: return
    //   94: astore 5
    //   96: aconst_null
    //   97: astore_2
    //   98: aload_1
    //   99: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   102: aload_2
    //   103: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   106: aload 5
    //   108: athrow
    //   109: astore 5
    //   111: goto -13 -> 98
    //   114: astore 5
    //   116: aload_3
    //   117: astore_1
    //   118: goto -20 -> 98
    //   121: astore 5
    //   123: aload_1
    //   124: astore_2
    //   125: aload_3
    //   126: astore_1
    //   127: goto -29 -> 98
    //   130: astore 6
    //   132: aconst_null
    //   133: astore_1
    //   134: goto -63 -> 71
    //   137: astore 6
    //   139: aload_3
    //   140: astore_1
    //   141: goto -70 -> 71
    //   144: astore 4
    //   146: aload_2
    //   147: astore_1
    //   148: aconst_null
    //   149: astore_3
    //   150: goto -106 -> 44
    //   153: astore 4
    //   155: aload_2
    //   156: astore_1
    //   157: goto -113 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   2	17	40	java/io/FileNotFoundException
    //   2	17	67	java/io/IOException
    //   2	17	94	finally
    //   17	26	109	finally
    //   71	85	109	finally
    //   26	31	114	finally
    //   44	58	121	finally
    //   17	26	130	java/io/IOException
    //   26	31	137	java/io/IOException
    //   17	26	144	java/io/FileNotFoundException
    //   26	31	153	java/io/FileNotFoundException
  }

  public static String sA(String paramString)
  {
    if (!jsF.contains(paramString))
    {
      String str2 = ak.getContext().getDir(paramString + "_res", 0).getAbsolutePath();
      File localFile = new File(str2);
      if (!localFile.exists())
        localFile.mkdirs();
      jsF.put(paramString, str2);
    }
    String str1 = TAG;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = jsF.get(paramString);
    z.i(str1, "getResFolder:%s", arrayOfObject);
    return (String)jsF.get(paramString);
  }

  private static File sD(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
      return new File(Yd(), paramString + "_config.json");
    return null;
  }

  public static File sF(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
      return new File(Yd(), "com.tencent.mm.plugin." + paramString + ".jar");
    return null;
  }

  // ERROR //
  public static PluginDescription uu(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 173	java/io/FileInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokestatic 107	com/tencent/mm/compatible/loader/p:sD	(Ljava/lang/String;)Ljava/io/File;
    //   10: invokespecial 174	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   13: astore_2
    //   14: new 176	java/io/ObjectInputStream
    //   17: dup
    //   18: aload_2
    //   19: invokespecial 179	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: astore_3
    //   23: aload_3
    //   24: invokevirtual 183	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   27: checkcast 67	com/tencent/mm/compatible/loader/PluginDescription
    //   30: astore 9
    //   32: aload_3
    //   33: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   36: aload_2
    //   37: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   40: aload 9
    //   42: areturn
    //   43: astore 13
    //   45: aconst_null
    //   46: astore 5
    //   48: aconst_null
    //   49: astore 6
    //   51: aload 5
    //   53: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   56: aload 6
    //   58: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   61: aconst_null
    //   62: areturn
    //   63: astore 12
    //   65: aconst_null
    //   66: astore_3
    //   67: aconst_null
    //   68: astore_2
    //   69: aload_3
    //   70: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   73: aload_2
    //   74: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   77: aconst_null
    //   78: areturn
    //   79: astore 8
    //   81: aconst_null
    //   82: astore_2
    //   83: aload_1
    //   84: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   87: aload_2
    //   88: invokestatic 125	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   91: aload 8
    //   93: athrow
    //   94: astore 8
    //   96: aconst_null
    //   97: astore_1
    //   98: goto -15 -> 83
    //   101: astore 8
    //   103: aload_3
    //   104: astore_1
    //   105: goto -22 -> 83
    //   108: astore 11
    //   110: aconst_null
    //   111: astore_3
    //   112: goto -43 -> 69
    //   115: astore 7
    //   117: goto -48 -> 69
    //   120: astore 10
    //   122: aload_2
    //   123: astore 6
    //   125: aconst_null
    //   126: astore 5
    //   128: goto -77 -> 51
    //   131: astore 4
    //   133: aload_3
    //   134: astore 5
    //   136: aload_2
    //   137: astore 6
    //   139: goto -88 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   2	14	43	java/io/IOException
    //   2	14	63	java/lang/ClassNotFoundException
    //   2	14	79	finally
    //   14	23	94	finally
    //   23	32	101	finally
    //   14	23	108	java/lang/ClassNotFoundException
    //   23	32	115	java/lang/ClassNotFoundException
    //   14	23	120	java/io/IOException
    //   23	32	131	java/io/IOException
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.p
 * JD-Core Version:    0.6.2
 */