package com.tencent.mm.am;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.support.v4.app.Fragment;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static boolean hMZ = false;
  private static final Map hrb;
  private static HashMap hrc;

  static
  {
    HashMap localHashMap = new HashMap();
    hrb = localHashMap;
    localHashMap.put("location", "talkroom");
    hrb.put("talkroom", "voip");
    hrc = new HashMap();
  }

  private static com.tencent.mm.pluginsdk.b.c CN(String paramString)
  {
    com.tencent.mm.pluginsdk.b.c localc1 = (com.tencent.mm.pluginsdk.b.c)hrc.get(paramString);
    if (localc1 != null)
      return localc1;
    com.tencent.mm.pluginsdk.b.c localc2 = (com.tencent.mm.pluginsdk.b.c)ak.getContext().getClassLoader().loadClass(ak.aHh() + ".plugin." + paramString + ".Plugin").newInstance();
    hrc.put(paramString, localc2);
    return localc2;
  }

  private static boolean CO(String paramString)
  {
    String[] arrayOfString = com.tencent.mm.pluginsdk.downloader.a.b.htG;
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

  // ERROR //
  public static com.tencent.mm.pluginsdk.b.c a(String paramString, b paramb, c paramc)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 19	com/tencent/mm/am/a:hrb	Ljava/util/Map;
    //   6: aload_0
    //   7: invokeinterface 110 2 0
    //   12: checkcast 96	java/lang/String
    //   15: astore 4
    //   17: aload 4
    //   19: ifnull +269 -> 288
    //   22: ldc 112
    //   24: ldc 114
    //   26: iconst_2
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_0
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: aload 4
    //   38: aastore
    //   39: invokestatic 120	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload 4
    //   44: astore 5
    //   46: getstatic 33	com/tencent/mm/am/a:hrc	Ljava/util/HashMap;
    //   49: aload_0
    //   50: invokevirtual 41	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   53: checkcast 43	com/tencent/mm/pluginsdk/b/c
    //   56: astore 6
    //   58: aload 6
    //   60: ifnull +15 -> 75
    //   63: aload_1
    //   64: invokeinterface 125 1 0
    //   69: ldc 2
    //   71: monitorexit
    //   72: aload 6
    //   74: areturn
    //   75: aload_0
    //   76: invokestatic 127	com/tencent/mm/am/a:CN	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/b/c;
    //   79: astore 6
    //   81: aload 6
    //   83: ifnull -14 -> 69
    //   86: aload_1
    //   87: invokeinterface 125 1 0
    //   92: goto -23 -> 69
    //   95: astore 7
    //   97: aload_0
    //   98: invokestatic 129	com/tencent/mm/am/a:CO	(Ljava/lang/String;)Z
    //   101: ifne +104 -> 205
    //   104: aload 5
    //   106: invokestatic 49	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   109: aload 5
    //   111: invokestatic 135	com/tencent/mm/compatible/loader/g:j	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   114: invokestatic 139	com/tencent/mm/compatible/loader/g:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;
    //   117: pop
    //   118: aload_0
    //   119: invokestatic 127	com/tencent/mm/am/a:CN	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/b/c;
    //   122: astore 6
    //   124: aload 6
    //   126: ifnull -57 -> 69
    //   129: aload_1
    //   130: invokeinterface 125 1 0
    //   135: goto -66 -> 69
    //   138: astore 12
    //   140: iconst_2
    //   141: anewarray 4	java/lang/Object
    //   144: astore 13
    //   146: aload 13
    //   148: iconst_0
    //   149: aload_0
    //   150: aastore
    //   151: aload 13
    //   153: iconst_1
    //   154: aload 12
    //   156: invokevirtual 140	java/lang/ClassNotFoundException:toString	()Ljava/lang/String;
    //   159: aastore
    //   160: ldc 112
    //   162: ldc 142
    //   164: aload 13
    //   166: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: ldc 112
    //   171: ldc 147
    //   173: iconst_1
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload_0
    //   180: aastore
    //   181: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   184: aload_2
    //   185: new 149	java/lang/IllegalArgumentException
    //   188: dup
    //   189: ldc 151
    //   191: invokespecial 154	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   194: invokeinterface 160 2 0
    //   199: aconst_null
    //   200: astore 6
    //   202: goto -133 -> 69
    //   205: aload_0
    //   206: aload_1
    //   207: aload_2
    //   208: invokestatic 163	com/tencent/mm/am/a:b	(Ljava/lang/String;Lcom/tencent/mm/am/b;Lcom/tencent/mm/am/c;)V
    //   211: goto -93 -> 118
    //   214: astore_3
    //   215: ldc 2
    //   217: monitorexit
    //   218: aload_3
    //   219: athrow
    //   220: astore 10
    //   222: iconst_2
    //   223: anewarray 4	java/lang/Object
    //   226: astore 11
    //   228: aload 11
    //   230: iconst_0
    //   231: aload_0
    //   232: aastore
    //   233: aload 11
    //   235: iconst_1
    //   236: aload 10
    //   238: invokevirtual 164	java/lang/InstantiationException:toString	()Ljava/lang/String;
    //   241: aastore
    //   242: ldc 112
    //   244: ldc 166
    //   246: aload 11
    //   248: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: goto -82 -> 169
    //   254: astore 8
    //   256: iconst_2
    //   257: anewarray 4	java/lang/Object
    //   260: astore 9
    //   262: aload 9
    //   264: iconst_0
    //   265: aload_0
    //   266: aastore
    //   267: aload 9
    //   269: iconst_1
    //   270: aload 8
    //   272: invokevirtual 167	java/lang/IllegalAccessException:toString	()Ljava/lang/String;
    //   275: aastore
    //   276: ldc 112
    //   278: ldc 169
    //   280: aload 9
    //   282: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: goto -116 -> 169
    //   288: aload_0
    //   289: astore 5
    //   291: goto -245 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   75	81	95	java/lang/Exception
    //   86	92	95	java/lang/Exception
    //   118	124	138	java/lang/ClassNotFoundException
    //   129	135	138	java/lang/ClassNotFoundException
    //   3	17	214	finally
    //   22	42	214	finally
    //   46	58	214	finally
    //   63	69	214	finally
    //   75	81	214	finally
    //   86	92	214	finally
    //   97	118	214	finally
    //   118	124	214	finally
    //   129	135	214	finally
    //   140	169	214	finally
    //   169	199	214	finally
    //   205	211	214	finally
    //   222	251	214	finally
    //   256	285	214	finally
    //   118	124	220	java/lang/InstantiationException
    //   129	135	220	java/lang/InstantiationException
    //   118	124	254	java/lang/IllegalAccessException
    //   129	135	254	java/lang/IllegalAccessException
  }

  public static void a(Context paramContext, String paramString, Intent paramIntent)
  {
    if (paramIntent == null)
      paramIntent = new Intent();
    String str = ak.aHh();
    if (paramString.startsWith("."))
      paramString = str + paramString;
    paramIntent.setClassName(ak.getPackageName(), paramString);
    if ((paramContext instanceof Activity))
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    paramIntent.addFlags(268435456);
    paramContext.startActivity(paramIntent);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    a(paramContext, paramString1, paramString2, null, paramInt, true);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent)
  {
    a(paramString1, new d(paramIntent, paramString1, paramString2, paramContext), new e(paramString1));
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    a(paramContext, paramString1, paramString2, paramIntent, paramInt, true);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "start activity for result, need try load plugin[%B]", arrayOfObject);
    a(paramString1, new h(paramIntent, paramString1, paramString2, paramContext, paramInt), new i(paramString1));
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "start activity, need try load plugin[%B]", arrayOfObject);
    f localf = new f(paramString1, paramIntent, paramString2, paramContext);
    g localg = new g(paramString1);
    if (paramBoolean)
    {
      a(paramString1, localf, localg);
      return;
    }
    localf.onDone();
  }

  public static void a(Fragment paramFragment, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(true);
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "start activity for result, need try load plugin[%B]", arrayOfObject);
    a(paramString1, new j(paramIntent, paramString1, paramString2, paramFragment, paramInt), new k(paramString1));
  }

  public static void a(String paramString, com.tencent.mm.pluginsdk.d paramd, com.tencent.mm.pluginsdk.c paramc)
  {
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "--> registerApplication: %s", new Object[] { paramString });
    com.tencent.mm.pluginsdk.b.c localc = vr(paramString);
    if (localc == null)
    {
      z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "register application failed, plugin=%s", new Object[] { paramString });
      return;
    }
    com.tencent.mm.pluginsdk.e locale = localc.createApplication();
    if (locale == null)
    {
      z.w("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "register application failed, plugin=%s", new Object[] { paramString });
      return;
    }
    locale.a(paramc);
    locale.a(paramd);
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "<-- registerApplication successfully: %s", new Object[] { paramString });
  }

  public static boolean aCl()
  {
    return false;
  }

  public static void b(Context paramContext, String paramString, Intent paramIntent)
  {
    String str = ak.aHh();
    if (paramString.startsWith("."))
      paramString = str + paramString;
    paramIntent.setClassName(ak.getPackageName(), paramString);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramIntent, 2);
      return;
    }
    z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "context not activity, skipped");
  }

  public static void b(Context paramContext, String paramString1, String paramString2, Intent paramIntent)
  {
    a(paramContext, paramString1, paramString2, paramIntent, true);
  }

  public static void b(File paramFile, String paramString1, String paramString2)
  {
    if (hMZ)
      return;
    ak.getContext();
    com.tencent.mm.compatible.loader.g.q(paramString1, com.tencent.mm.compatible.loader.g.a(paramString1, paramFile, paramString2));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramFile.getName();
    z.i("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "addDex finished, plugin=%s:%s", arrayOfObject);
    if (ch.w(ak.getContext(), Process.myPid()).equals(ak.getPackageName()))
    {
      a("shoot", null, null);
      i("shoot", bg.qF().adE());
      a("shootstub", null, null);
      i("shootstub", bg.qF().adE());
    }
    hMZ = true;
  }

  private static void b(String paramString, b paramb, c paramc)
  {
    while (true)
    {
      try
      {
        if (CO(paramString))
        {
          z.i("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "try load plugin from internet, plugin=%s", new Object[] { paramString });
          try
          {
            Context localContext = ak.getContext();
            com.tencent.mm.pluginsdk.downloader.c.bcs().a(paramString, new l(paramString, localContext, paramb, paramc));
            return;
          }
          catch (Exception localException)
          {
            z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", localException.toString());
            paramc.b(localException);
            continue;
          }
        }
      }
      finally
      {
      }
      paramc.b(null);
    }
  }

  public static Class bj(String paramString1, String paramString2)
  {
    while (true)
    {
      try
      {
        str1 = (String)hrb.get(paramString1);
        if (str1 != null)
        {
          z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "load plugin with mapping %s -> %s", new Object[] { paramString1, str1 });
          Object localObject2;
          if (!vq(paramString1))
          {
            z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "plugin load failed, plugin=%s", new Object[] { paramString1 });
            localObject2 = null;
            return localObject2;
          }
          String str2 = ak.aHh() + ".plugin." + paramString1;
          if (paramString2.startsWith("."))
          {
            String str3 = str2 + paramString2;
            paramString2 = str3;
          }
          try
          {
            Class localClass2 = ak.getContext().getClassLoader().loadClass(paramString2);
            localObject2 = localClass2;
          }
          catch (Exception localException)
          {
            com.tencent.mm.compatible.loader.g.q(str1, com.tencent.mm.compatible.loader.g.j(ak.getContext(), str1));
            try
            {
              Class localClass1 = ak.getContext().getClassLoader().loadClass(paramString2);
              localObject2 = localClass1;
            }
            catch (ClassNotFoundException localClassNotFoundException)
            {
              z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "plugin load failed ClassNotFoundException , plugin=%s", new Object[] { paramString1 });
              z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "plugin load failed, plugin=%s", new Object[] { paramString1 });
              localObject2 = null;
            }
          }
          continue;
        }
      }
      finally
      {
      }
      String str1 = paramString1;
    }
  }

  public static void i(String paramString, Map paramMap)
  {
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "-->createSubCore: %s", new Object[] { paramString });
    com.tencent.mm.pluginsdk.b.c localc = vr(paramString);
    if (localc == null)
    {
      z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "register subcore failed, plugin=%s", new Object[] { paramString });
      return;
    }
    bd localbd = localc.createSubCore();
    if (localbd == null)
    {
      z.w("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "create sub core failed, plugin=%s", new Object[] { paramString });
      return;
    }
    paramMap.put("plugin." + paramString, localbd);
    if (bg.oE())
      localbd.O(true);
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "<--createSubCore successfully: %s", new Object[] { paramString });
  }

  public static void l(Context paramContext, String paramString1, String paramString2)
  {
    a(paramContext, paramString1, paramString2, null, true);
  }

  public static com.tencent.mm.pluginsdk.b.a m(Context paramContext, String paramString1, String paramString2)
  {
    com.tencent.mm.pluginsdk.b.c localc = vr(paramString1);
    if (localc == null)
    {
      z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "create contact widget failed, plugin=%s, type=%s", new Object[] { paramString1, paramString2 });
      return null;
    }
    com.tencent.mm.pluginsdk.b.b localb = localc.getContactWidgetFactory();
    if (localb == null)
    {
      z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "create contact widget factory failed, plugin=%s, type=%s", new Object[] { paramString1, paramString2 });
      return null;
    }
    return localb.z(paramContext, paramString2);
  }

  public static boolean to(String paramString)
  {
    try
    {
      Object localObject2 = hrc.get(paramString);
      if (localObject2 != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  private static boolean vq(String paramString)
  {
    try
    {
      com.tencent.mm.pluginsdk.b.c localc = vr(paramString);
      if (localc != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  // ERROR //
  private static com.tencent.mm.pluginsdk.b.c vr(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 127	com/tencent/mm/am/a:CN	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/b/c;
    //   7: astore 9
    //   9: aload 9
    //   11: astore_3
    //   12: ldc 2
    //   14: monitorexit
    //   15: aload_3
    //   16: areturn
    //   17: astore 7
    //   19: iconst_2
    //   20: anewarray 4	java/lang/Object
    //   23: astore 8
    //   25: aload 8
    //   27: iconst_0
    //   28: aload_0
    //   29: aastore
    //   30: aload 8
    //   32: iconst_1
    //   33: aload 7
    //   35: invokevirtual 140	java/lang/ClassNotFoundException:toString	()Ljava/lang/String;
    //   38: aastore
    //   39: ldc 112
    //   41: ldc_w 441
    //   44: aload 8
    //   46: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: goto +70 -> 119
    //   52: astore 5
    //   54: iconst_2
    //   55: anewarray 4	java/lang/Object
    //   58: astore 6
    //   60: aload 6
    //   62: iconst_0
    //   63: aload_0
    //   64: aastore
    //   65: aload 6
    //   67: iconst_1
    //   68: aload 5
    //   70: invokevirtual 164	java/lang/InstantiationException:toString	()Ljava/lang/String;
    //   73: aastore
    //   74: ldc 112
    //   76: ldc 166
    //   78: aload 6
    //   80: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: goto +36 -> 119
    //   86: astore 4
    //   88: ldc 2
    //   90: monitorexit
    //   91: aload 4
    //   93: athrow
    //   94: astore_1
    //   95: iconst_2
    //   96: anewarray 4	java/lang/Object
    //   99: astore_2
    //   100: aload_2
    //   101: iconst_0
    //   102: aload_0
    //   103: aastore
    //   104: aload_2
    //   105: iconst_1
    //   106: aload_1
    //   107: invokevirtual 167	java/lang/IllegalAccessException:toString	()Ljava/lang/String;
    //   110: aastore
    //   111: ldc 112
    //   113: ldc 169
    //   115: aload_2
    //   116: invokestatic 145	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aconst_null
    //   120: astore_3
    //   121: goto -109 -> 12
    //
    // Exception table:
    //   from	to	target	type
    //   3	9	17	java/lang/ClassNotFoundException
    //   3	9	52	java/lang/InstantiationException
    //   3	9	86	finally
    //   19	49	86	finally
    //   54	83	86	finally
    //   95	119	86	finally
    //   3	9	94	java/lang/IllegalAccessException
  }

  public static com.tencent.mm.pluginsdk.b.a z(Context paramContext, String paramString)
  {
    return m(paramContext, paramString, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.a
 * JD-Core Version:    0.6.2
 */