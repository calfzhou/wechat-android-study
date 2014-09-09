package com.tencent.mm.compatible.loader;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Process;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.a.l;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class g
{
  public static e dOf;
  public static PluginResourceLoader dOg;
  private static String dOh;
  private static String dOi;
  private static String dOj;
  private static Map dOk;
  private static String dOl = null;

  private static void P(Context paramContext)
  {
    if (dOk != null);
    while (true)
    {
      return;
      Map localMap;
      try
      {
        String str = ch.b(paramContext.getAssets().open("preload/libraries.ini"));
        localMap = x.AL(str);
        z.v("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "libraries.ini content\n%s", new Object[] { str });
        if ((localMap == null) || (localMap.size() <= 0))
        {
          z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "parse libraries.ini failed");
          return;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "load preload libraries failed");
        return;
      }
      dOk = new HashMap(localMap.size());
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localEntry.getKey();
        arrayOfObject[1] = localEntry.getValue();
        z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "preload file, plugin=%s, md5=%s", arrayOfObject);
        dOk.put(localEntry.getKey(), localEntry.getValue());
      }
    }
  }

  // ERROR //
  public static String a(String paramString1, File paramFile, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 128	com/tencent/mm/sdk/platformtools/ch:CM	()J
    //   3: lstore_3
    //   4: aload_0
    //   5: invokestatic 132	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   8: ifeq +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: new 134	java/lang/StringBuilder
    //   16: dup
    //   17: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   20: getstatic 138	com/tencent/mm/compatible/loader/g:dOf	Lcom/tencent/mm/compatible/loader/e;
    //   23: invokestatic 143	com/tencent/mm/compatible/loader/e:a	(Lcom/tencent/mm/compatible/loader/e;)Ljava/lang/String;
    //   26: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_0
    //   30: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore 5
    //   38: new 134	java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   45: getstatic 153	com/tencent/mm/compatible/loader/g:dOi	Ljava/lang/String;
    //   48: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc 155
    //   53: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload 5
    //   58: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: ldc 157
    //   63: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: astore 6
    //   71: new 159	java/io/File
    //   74: dup
    //   75: getstatic 153	com/tencent/mm/compatible/loader/g:dOi	Ljava/lang/String;
    //   78: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   81: astore 7
    //   83: aload 7
    //   85: invokevirtual 165	java/io/File:exists	()Z
    //   88: ifeq +11 -> 99
    //   91: aload 7
    //   93: invokevirtual 168	java/io/File:isDirectory	()Z
    //   96: ifne +20 -> 116
    //   99: aload 7
    //   101: invokevirtual 171	java/io/File:mkdirs	()Z
    //   104: ifne +12 -> 116
    //   107: ldc 53
    //   109: ldc 173
    //   111: invokestatic 176	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: aconst_null
    //   115: areturn
    //   116: new 159	java/io/File
    //   119: dup
    //   120: aload 6
    //   122: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   125: astore 8
    //   127: aload 8
    //   129: invokevirtual 165	java/io/File:exists	()Z
    //   132: ifeq +85 -> 217
    //   135: aload 8
    //   137: invokestatic 182	com/tencent/mm/a/f:c	(Ljava/io/File;)Ljava/lang/String;
    //   140: astore 24
    //   142: aload 24
    //   144: ifnull +53 -> 197
    //   147: aload 24
    //   149: aload_2
    //   150: invokevirtual 187	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   153: ifeq +44 -> 197
    //   156: aload_0
    //   157: aload 8
    //   159: invokestatic 190	com/tencent/mm/compatible/loader/g:b	(Ljava/lang/String;Ljava/io/File;)V
    //   162: iconst_2
    //   163: anewarray 4	java/lang/Object
    //   166: astore 25
    //   168: aload 25
    //   170: iconst_0
    //   171: aload 8
    //   173: aastore
    //   174: aload 25
    //   176: iconst_1
    //   177: lload_3
    //   178: invokestatic 194	com/tencent/mm/sdk/platformtools/ch:ac	(J)J
    //   181: invokestatic 200	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   184: aastore
    //   185: ldc 53
    //   187: ldc 202
    //   189: aload 25
    //   191: invokestatic 114	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload 6
    //   196: areturn
    //   197: ldc 53
    //   199: ldc 204
    //   201: iconst_2
    //   202: anewarray 4	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload 24
    //   209: aastore
    //   210: dup
    //   211: iconst_1
    //   212: aload_2
    //   213: aastore
    //   214: invokestatic 206	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: aload 6
    //   219: invokestatic 211	com/tencent/mm/a/c:deleteFile	(Ljava/lang/String;)Z
    //   222: pop
    //   223: iconst_3
    //   224: anewarray 4	java/lang/Object
    //   227: astore 10
    //   229: aload 10
    //   231: iconst_0
    //   232: aload_1
    //   233: invokevirtual 214	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   236: aastore
    //   237: aload 10
    //   239: iconst_1
    //   240: aload 6
    //   242: aastore
    //   243: aload 10
    //   245: iconst_2
    //   246: aload_2
    //   247: aastore
    //   248: ldc 53
    //   250: ldc 216
    //   252: aload 10
    //   254: invokestatic 114	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: iconst_1
    //   258: anewarray 4	java/lang/Object
    //   261: astore 11
    //   263: aload 11
    //   265: iconst_0
    //   266: lload_3
    //   267: invokestatic 194	com/tencent/mm/sdk/platformtools/ch:ac	(J)J
    //   270: invokestatic 200	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   273: aastore
    //   274: ldc 53
    //   276: ldc 218
    //   278: aload 11
    //   280: invokestatic 114	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: aload_1
    //   284: invokevirtual 214	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   287: aload 6
    //   289: invokestatic 224	com/tencent/mm/sdk/platformtools/p:bA	(Ljava/lang/String;Ljava/lang/String;)Z
    //   292: ifne +21 -> 313
    //   295: ldc 53
    //   297: ldc 226
    //   299: iconst_1
    //   300: anewarray 4	java/lang/Object
    //   303: dup
    //   304: iconst_0
    //   305: aload 5
    //   307: aastore
    //   308: invokestatic 228	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: aconst_null
    //   312: areturn
    //   313: aload_0
    //   314: aload 8
    //   316: invokestatic 190	com/tencent/mm/compatible/loader/g:b	(Ljava/lang/String;Ljava/io/File;)V
    //   319: iconst_1
    //   320: anewarray 4	java/lang/Object
    //   323: astore 12
    //   325: aload 12
    //   327: iconst_0
    //   328: lload_3
    //   329: invokestatic 194	com/tencent/mm/sdk/platformtools/ch:ac	(J)J
    //   332: invokestatic 200	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   335: aastore
    //   336: ldc 53
    //   338: ldc 230
    //   340: aload 12
    //   342: invokestatic 114	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: new 232	java/util/jar/JarFile
    //   348: dup
    //   349: aload 6
    //   351: invokespecial 233	java/util/jar/JarFile:<init>	(Ljava/lang/String;)V
    //   354: astore 13
    //   356: aload 13
    //   358: invokevirtual 237	java/util/jar/JarFile:entries	()Ljava/util/Enumeration;
    //   361: astore 18
    //   363: aload 18
    //   365: invokeinterface 242 1 0
    //   370: ifeq +214 -> 584
    //   373: aload 18
    //   375: invokeinterface 245 1 0
    //   380: checkcast 247	java/util/jar/JarEntry
    //   383: astore 19
    //   385: aload 19
    //   387: invokevirtual 250	java/util/jar/JarEntry:getName	()Ljava/lang/String;
    //   390: astore 21
    //   392: aload 21
    //   394: invokestatic 253	com/tencent/mm/compatible/loader/e:cG	()Ljava/lang/String;
    //   397: invokevirtual 256	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   400: ifeq +104 -> 504
    //   403: aload 13
    //   405: aload 19
    //   407: invokevirtual 260	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   410: aload 21
    //   412: invokestatic 253	com/tencent/mm/compatible/loader/e:cG	()Ljava/lang/String;
    //   415: invokevirtual 263	java/lang/String:length	()I
    //   418: invokevirtual 267	java/lang/String:substring	(I)Ljava/lang/String;
    //   421: invokestatic 270	com/tencent/mm/compatible/loader/g:a	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   424: goto -61 -> 363
    //   427: astore 20
    //   429: new 272	java/lang/Error
    //   432: dup
    //   433: ldc_w 274
    //   436: aload 20
    //   438: invokespecial 277	java/lang/Error:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   441: athrow
    //   442: astore 15
    //   444: aload 13
    //   446: astore 16
    //   448: aload 16
    //   450: invokestatic 280	com/tencent/mm/sdk/platformtools/ch:a	(Ljava/util/zip/ZipFile;)V
    //   453: iconst_4
    //   454: anewarray 4	java/lang/Object
    //   457: astore 17
    //   459: aload 17
    //   461: iconst_0
    //   462: invokestatic 253	com/tencent/mm/compatible/loader/e:cG	()Ljava/lang/String;
    //   465: aastore
    //   466: aload 17
    //   468: iconst_1
    //   469: invokestatic 283	com/tencent/mm/compatible/loader/e:nz	()Ljava/lang/String;
    //   472: aastore
    //   473: aload 17
    //   475: iconst_2
    //   476: invokestatic 286	com/tencent/mm/compatible/loader/e:nC	()Ljava/lang/String;
    //   479: aastore
    //   480: aload 17
    //   482: iconst_3
    //   483: lload_3
    //   484: invokestatic 194	com/tencent/mm/sdk/platformtools/ch:ac	(J)J
    //   487: invokestatic 200	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   490: aastore
    //   491: ldc 53
    //   493: ldc_w 288
    //   496: aload 17
    //   498: invokestatic 114	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   501: aload 6
    //   503: areturn
    //   504: aload 21
    //   506: invokestatic 283	com/tencent/mm/compatible/loader/e:nz	()Ljava/lang/String;
    //   509: invokevirtual 256	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   512: ifeq +37 -> 549
    //   515: aload 13
    //   517: aload 19
    //   519: invokevirtual 260	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   522: aload 21
    //   524: invokestatic 283	com/tencent/mm/compatible/loader/e:nz	()Ljava/lang/String;
    //   527: invokevirtual 263	java/lang/String:length	()I
    //   530: invokevirtual 267	java/lang/String:substring	(I)Ljava/lang/String;
    //   533: invokestatic 270	com/tencent/mm/compatible/loader/g:a	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   536: goto -173 -> 363
    //   539: astore 14
    //   541: aload 13
    //   543: invokestatic 280	com/tencent/mm/sdk/platformtools/ch:a	(Ljava/util/zip/ZipFile;)V
    //   546: aload 14
    //   548: athrow
    //   549: aload 21
    //   551: invokestatic 286	com/tencent/mm/compatible/loader/e:nC	()Ljava/lang/String;
    //   554: invokevirtual 256	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   557: ifeq -194 -> 363
    //   560: aload 13
    //   562: aload 19
    //   564: invokevirtual 260	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   567: aload 21
    //   569: invokestatic 286	com/tencent/mm/compatible/loader/e:nC	()Ljava/lang/String;
    //   572: invokevirtual 263	java/lang/String:length	()I
    //   575: invokevirtual 267	java/lang/String:substring	(I)Ljava/lang/String;
    //   578: invokestatic 270	com/tencent/mm/compatible/loader/g:a	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   581: goto -218 -> 363
    //   584: aload 13
    //   586: invokestatic 280	com/tencent/mm/sdk/platformtools/ch:a	(Ljava/util/zip/ZipFile;)V
    //   589: goto -136 -> 453
    //   592: astore 23
    //   594: aload 23
    //   596: astore 14
    //   598: aconst_null
    //   599: astore 13
    //   601: goto -60 -> 541
    //   604: astore 22
    //   606: aconst_null
    //   607: astore 16
    //   609: goto -161 -> 448
    //
    // Exception table:
    //   from	to	target	type
    //   385	424	427	java/lang/SecurityException
    //   504	536	427	java/lang/SecurityException
    //   549	581	427	java/lang/SecurityException
    //   356	363	442	java/io/IOException
    //   363	385	442	java/io/IOException
    //   385	424	442	java/io/IOException
    //   429	442	442	java/io/IOException
    //   504	536	442	java/io/IOException
    //   549	581	442	java/io/IOException
    //   356	363	539	finally
    //   363	385	539	finally
    //   385	424	539	finally
    //   429	442	539	finally
    //   504	536	539	finally
    //   549	581	539	finally
    //   345	356	592	finally
    //   345	356	604	java/io/IOException
  }

  @TargetApi(9)
  public static void a(Application paramApplication)
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 9)
      {
        dOl = paramApplication.getApplicationInfo().nativeLibraryDir;
        str1 = ak.aHh() + ".plugin.";
        dOh = paramApplication.getDir("cache", 0).getAbsolutePath();
        dOi = paramApplication.getDir("dex", 0).getAbsolutePath();
        dOj = paramApplication.getDir("lib", 0).getAbsolutePath();
        str2 = "mBase";
        str3 = "mPackageInfo";
        str4 = "mClassLoader";
        str5 = "mResources";
      }
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          String str1;
          String str2;
          String str3;
          String str4;
          String str5;
          if (!ch.jb(v.dNG.dNa))
          {
            str2 = v.dNG.dNa;
            z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "mBase %s ", new Object[] { str2 });
          }
          String str6 = str2;
          if (!ch.jb(v.dNG.dNb))
          {
            str3 = v.dNG.dNb;
            z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "defPackageInfo %s ", new Object[] { str3 });
          }
          String str7 = str3;
          if (!ch.jb(v.dNG.dNc))
          {
            str4 = v.dNG.dNc;
            z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "defClassLoader %s ", new Object[] { str4 });
          }
          String str8 = str4;
          if (!ch.jb(v.dNG.dNd))
          {
            str5 = v.dNG.dNd;
            z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "defResources %s ", new Object[] { str5 });
          }
          String str9 = str5;
          Object localObject = new d((Context)new d(paramApplication, str6, null).get(), str7, null).get();
          d locald1 = new d(localObject, str8, null);
          dOf = new e((ClassLoader)locald1.get(), str1, (byte)0);
          locald1.set(dOf);
          d locald2 = new d(localObject, str9, Resources.class.getName());
          dOg = new PluginResourceLoader((Resources)locald2.get());
          locald2.set(dOg);
          if (dOf == null)
            z.f("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "init multi class loader error");
          return;
          dOl = paramApplication.getApplicationInfo().dataDir + "/lib";
        }
        localException1 = localException1;
        z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "locate system native library dir failed");
      }
      catch (Exception localException2)
      {
        while (true)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localException2.getMessage();
          z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "init loader failed :%s", arrayOfObject);
        }
      }
    }
  }

  // ERROR //
  private static void a(java.io.InputStream paramInputStream, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 159	java/io/File
    //   5: dup
    //   6: new 134	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   13: getstatic 330	com/tencent/mm/compatible/loader/g:dOj	Ljava/lang/String;
    //   16: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc 155
    //   21: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: aload_1
    //   25: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   34: astore_3
    //   35: aload_3
    //   36: invokevirtual 165	java/io/File:exists	()Z
    //   39: ifeq +23 -> 62
    //   42: aload_3
    //   43: invokevirtual 414	java/io/File:isFile	()Z
    //   46: istore 19
    //   48: iload 19
    //   50: ifne +12 -> 62
    //   53: aload_0
    //   54: ifnull +7 -> 61
    //   57: aload_0
    //   58: invokevirtual 419	java/io/InputStream:close	()V
    //   61: return
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: astore 12
    //   68: aload 12
    //   70: iconst_0
    //   71: aload_3
    //   72: invokevirtual 214	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   75: aastore
    //   76: ldc 53
    //   78: ldc_w 421
    //   81: aload 12
    //   83: invokestatic 114	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: new 423	java/io/FileOutputStream
    //   89: dup
    //   90: aload_3
    //   91: iconst_0
    //   92: invokespecial 426	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   95: astore 5
    //   97: sipush 16384
    //   100: newarray byte
    //   102: astore 14
    //   104: aload_0
    //   105: aload 14
    //   107: invokevirtual 430	java/io/InputStream:read	([B)I
    //   110: istore 18
    //   112: iload 18
    //   114: ifle +18 -> 132
    //   117: aload 5
    //   119: aload 14
    //   121: iconst_0
    //   122: iload 18
    //   124: invokevirtual 434	java/io/FileOutputStream:write	([BII)V
    //   127: goto -23 -> 104
    //   130: astore 15
    //   132: aload 5
    //   134: invokevirtual 435	java/io/FileOutputStream:close	()V
    //   137: aload_0
    //   138: ifnull -77 -> 61
    //   141: aload_0
    //   142: invokevirtual 419	java/io/InputStream:close	()V
    //   145: return
    //   146: astore 17
    //   148: return
    //   149: astore 9
    //   151: aload_2
    //   152: ifnull +7 -> 159
    //   155: aload_2
    //   156: invokevirtual 435	java/io/FileOutputStream:close	()V
    //   159: aload_0
    //   160: ifnull -99 -> 61
    //   163: aload_0
    //   164: invokevirtual 419	java/io/InputStream:close	()V
    //   167: return
    //   168: astore 10
    //   170: return
    //   171: astore 4
    //   173: aconst_null
    //   174: astore 5
    //   176: aload 4
    //   178: astore 6
    //   180: aload 5
    //   182: ifnull +8 -> 190
    //   185: aload 5
    //   187: invokevirtual 435	java/io/FileOutputStream:close	()V
    //   190: aload_0
    //   191: ifnull +7 -> 198
    //   194: aload_0
    //   195: invokevirtual 419	java/io/InputStream:close	()V
    //   198: aload 6
    //   200: athrow
    //   201: astore 20
    //   203: return
    //   204: astore 16
    //   206: goto -69 -> 137
    //   209: astore 11
    //   211: goto -52 -> 159
    //   214: astore 8
    //   216: goto -26 -> 190
    //   219: astore 7
    //   221: goto -23 -> 198
    //   224: astore 6
    //   226: goto -46 -> 180
    //   229: astore 13
    //   231: aload 5
    //   233: astore_2
    //   234: goto -83 -> 151
    //
    // Exception table:
    //   from	to	target	type
    //   104	112	130	java/io/IOException
    //   117	127	130	java/io/IOException
    //   141	145	146	java/io/IOException
    //   2	48	149	java/io/FileNotFoundException
    //   62	97	149	java/io/FileNotFoundException
    //   163	167	168	java/io/IOException
    //   2	48	171	finally
    //   62	97	171	finally
    //   57	61	201	java/io/IOException
    //   132	137	204	java/io/IOException
    //   155	159	209	java/io/IOException
    //   185	190	214	java/io/IOException
    //   194	198	219	java/io/IOException
    //   97	104	224	finally
    //   104	112	224	finally
    //   117	127	224	finally
    //   97	104	229	java/io/FileNotFoundException
    //   104	112	229	java/io/FileNotFoundException
    //   117	127	229	java/io/FileNotFoundException
  }

  private static void b(String paramString, File paramFile)
  {
    if ((!new File(p.sA(paramString) + File.separator + "preload/shoot/shoot.png").exists()) && (ch.w(ak.getContext(), Process.myPid()).equalsIgnoreCase(ak.getPackageName() + ":tools")))
    {
      new l();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = paramFile.getAbsolutePath();
      z.i("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "copyPluingResource:%s,%s", arrayOfObject);
    }
    try
    {
      l.l(paramFile.getAbsolutePath(), p.sA(paramString));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static String i(Context paramContext, String paramString)
  {
    long l = ch.CM();
    P(paramContext);
    if (dOk == null)
    {
      z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extractVoipDex preload so files loaded failed");
      return null;
    }
    String str1 = dOj + "/" + paramString;
    String str2 = (String)dOk.get(paramString);
    if (str2 == null)
    {
      z.w("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extractVoipDex not in preloadfiles");
      return null;
    }
    File localFile = new File(str1);
    if (localFile.exists())
    {
      String str3 = f.c(localFile);
      if ((str3 != null) && (str3.equalsIgnoreCase(str2)))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localFile;
        arrayOfObject2[1] = Long.valueOf(ch.ac(l));
        z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extractVoipDex: targetFilePath:[%s] time:%d", arrayOfObject2);
        return str1;
      }
      z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extractVoipDex target file exists, but md5 check failed, target=%s assets=%s", new Object[] { str3, str2 });
    }
    c.deleteFile(str1);
    if (!com.tencent.mm.sdk.platformtools.p.n(paramContext, "preload/" + paramString, str1))
    {
      z.f("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extractVoipDex  copyAssets failed");
      return null;
    }
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Long.valueOf(ch.ac(l));
    arrayOfObject1[1] = paramString;
    arrayOfObject1[2] = str2;
    z.i("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extractVoipDex time:%d so:%s md5:%s ", arrayOfObject1);
    return str1;
  }

  public static String j(Context paramContext, String paramString)
  {
    long l = ch.CM();
    if (ch.jb(paramString))
      return null;
    String str1 = e.a(dOf) + paramString;
    String str2 = dOi + "/" + str1 + ".jar";
    P(paramContext);
    if (dOk == null)
    {
      z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "preload files loaded failed, plugin=%s", new Object[] { paramString });
      return null;
    }
    String str3 = (String)dOk.get(str1 + ".jar");
    if (str3 == null)
    {
      z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extract: donot in the preloadfile plugin=%s", new Object[] { paramString });
      return null;
    }
    File localFile1 = new File(dOi);
    if (((!localFile1.exists()) || (!localFile1.isDirectory())) && (!localFile1.mkdirs()))
    {
      z.f("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extract: create target dex directory failed");
      return null;
    }
    File localFile2 = new File(str2);
    if (localFile2.exists())
    {
      String str5 = f.c(localFile2);
      if ((str5 != null) && (str5.equalsIgnoreCase(str3)))
      {
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = localFile2;
        arrayOfObject5[1] = Long.valueOf(ch.ac(l));
        z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "dkstart extractAssetsDexFile: targetFilePath:[%s] time:%d", arrayOfObject5);
        return str2;
      }
      z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "target file exists, but md5 check failed, target=%s assets=%s", new Object[] { str5, str3 });
    }
    c.deleteFile(str2);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = ("preload/" + str1);
    arrayOfObject1[1] = str2;
    arrayOfObject1[2] = str3;
    z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "dkstart copy assets from %s to %s, md5=%s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(ch.ac(l));
    z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "dkstart before extractAssetsDexFile: copyAssets time:%d", arrayOfObject2);
    if (!com.tencent.mm.sdk.platformtools.p.n(paramContext, "preload/" + str1 + ".jar", str2))
    {
      z.f("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "extract: copy to target failed, plugin=%s", new Object[] { str1 });
      return null;
    }
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Long.valueOf(ch.ac(l));
    z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "dkstart extractAssetsDexFile: copyAssets time:%d", arrayOfObject3);
    while (true)
    {
      JarFile localJarFile;
      JarEntry localJarEntry;
      String str4;
      try
      {
        localJarFile = new JarFile(str2);
        Enumeration localEnumeration = localJarFile.entries();
        if (localEnumeration.hasMoreElements())
        {
          localJarEntry = (JarEntry)localEnumeration.nextElement();
          try
          {
            str4 = localJarEntry.getName();
            if (str4.startsWith(e.cG()))
              a(localJarFile.getInputStream(localJarEntry), str4.substring(e.cG().length()));
          }
          catch (SecurityException localSecurityException)
          {
            throw new Error("Signature verification failed", localSecurityException);
          }
        }
      }
      catch (IOException localIOException)
      {
        Object[] arrayOfObject4 = new Object[4];
        arrayOfObject4[0] = e.cG();
        arrayOfObject4[1] = e.nz();
        arrayOfObject4[2] = e.nC();
        arrayOfObject4[3] = Long.valueOf(ch.ac(l));
        z.d("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "dkstart extracting shared libraries, %s, %s, %s , time:%d", arrayOfObject4);
        return str2;
      }
      if (str4.startsWith(e.nz()))
        a(localJarFile.getInputStream(localJarEntry), str4.substring(e.nz().length()));
      else if (str4.startsWith(e.nC()))
        a(localJarFile.getInputStream(localJarEntry), str4.substring(e.nC().length()));
    }
  }

  public static ClassLoader q(String paramString1, String paramString2)
  {
    long l = ch.CM();
    if (paramString2 == null)
    {
      z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "addChainLoader add new class loader failed, path:%s tag:%s ", new Object[] { paramString2, paramString1 });
      return null;
    }
    String str;
    if (dOl != null)
    {
      str = dOj + File.pathSeparator + dOl;
      if (str == null)
        break label163;
      dOf.dOa = new DexClassLoader(paramString2, dOh, str, dOf.dOa);
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Long.valueOf(ch.ac(l));
      arrayOfObject[1] = Boolean.valueOf(false);
      arrayOfObject[2] = paramString1;
      arrayOfObject[3] = paramString2;
      arrayOfObject[4] = dOl;
      z.i("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "start time check dkstart addChainLoader time:%d WITH_RESOURCE:%b tag:%s path:%s systemLibraryPath:%s", arrayOfObject);
      return dOf.dOa;
      str = dOj;
      break;
      label163: z.e("!44@/B4Tb64lLpJyF0hVO40qtOlS3r+GiUgKC0txJ2ZVKok=", "nativeLibPath == null, That's impossible");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.g
 * JD-Core Version:    0.6.2
 */