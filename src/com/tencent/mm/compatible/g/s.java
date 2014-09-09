package com.tencent.mm.compatible.g;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.z;

public final class s
{
  public static void Y(Context paramContext)
  {
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu"));
    try
    {
      Intent localIntent1 = new Intent();
      localIntent1.setClassName("com.android.settings", "com.android.settings.applications.AppsCheckReadPermission");
      paramContext.startActivity(localIntent1);
      return;
    }
    catch (Exception localException1)
    {
      z.e("!32@/B4Tb64lLpL0qTj+UKAbT/EkU1Pg7QxL", "unable start activity AppsCheckReadPermission");
      try
      {
        Intent localIntent2 = new Intent("android.settings.APP_OPS_SETTINGS");
        localIntent2.addCategory("android.intent.category.DEFAULT");
        paramContext.startActivity(localIntent2);
        return;
      }
      catch (Exception localException2)
      {
        z.e("!32@/B4Tb64lLpL0qTj+UKAbT/EkU1Pg7QxL", "unable start activity APP_OPS_SETTINGS");
        try
        {
          Intent localIntent3 = new Intent();
          localIntent3.setClassName("com.android.settings", "com.android.settings.Settings$AppControlSettingsActivity");
          paramContext.startActivity(localIntent3);
          return;
        }
        catch (Exception localException3)
        {
          z.e("!32@/B4Tb64lLpL0qTj+UKAbT/EkU1Pg7QxL", "unable start activity AppControlSettingsActivity");
        }
      }
    }
  }

  // ERROR //
  private static boolean cr(int paramInt)
  {
    // Byte code:
    //   0: iload_0
    //   1: ifne +5 -> 6
    //   4: iconst_1
    //   5: ireturn
    //   6: invokestatic 81	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   9: ldc 83
    //   11: invokevirtual 87	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull +198 -> 214
    //   19: ldc 89
    //   21: invokestatic 95	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   24: astore 13
    //   26: iconst_3
    //   27: anewarray 91	java/lang/Class
    //   30: astore 14
    //   32: aload 14
    //   34: iconst_0
    //   35: getstatic 101	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   38: aastore
    //   39: aload 14
    //   41: iconst_1
    //   42: getstatic 101	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   45: aastore
    //   46: aload 14
    //   48: iconst_2
    //   49: ldc 18
    //   51: aastore
    //   52: aload 13
    //   54: ldc 103
    //   56: aload 14
    //   58: invokevirtual 107	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   61: astore 15
    //   63: aload 15
    //   65: astore_2
    //   66: aload_2
    //   67: ifnull +182 -> 249
    //   70: iconst_3
    //   71: anewarray 4	java/lang/Object
    //   74: astore 7
    //   76: aload 7
    //   78: iconst_0
    //   79: iload_0
    //   80: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: aastore
    //   84: aload 7
    //   86: iconst_1
    //   87: invokestatic 81	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   90: invokevirtual 115	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   93: getfield 121	android/content/pm/ApplicationInfo:uid	I
    //   96: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   99: aastore
    //   100: aload 7
    //   102: iconst_2
    //   103: invokestatic 125	com/tencent/mm/sdk/platformtools/ak:getPackageName	()Ljava/lang/String;
    //   106: aastore
    //   107: aload_2
    //   108: aload_1
    //   109: aload 7
    //   111: invokevirtual 131	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   114: checkcast 97	java/lang/Integer
    //   117: invokevirtual 135	java/lang/Integer:intValue	()I
    //   120: istore 8
    //   122: iload 8
    //   124: istore 5
    //   126: iload 5
    //   128: ifeq +121 -> 249
    //   131: iconst_1
    //   132: anewarray 4	java/lang/Object
    //   135: astore 6
    //   137: aload 6
    //   139: iconst_0
    //   140: iload 5
    //   142: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   145: aastore
    //   146: ldc 44
    //   148: ldc 137
    //   150: aload 6
    //   152: invokestatic 140	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: iconst_0
    //   156: ireturn
    //   157: astore 11
    //   159: iconst_1
    //   160: anewarray 4	java/lang/Object
    //   163: astore 12
    //   165: aload 12
    //   167: iconst_0
    //   168: aload 11
    //   170: invokevirtual 143	java/lang/NoSuchMethodException:getMessage	()Ljava/lang/String;
    //   173: aastore
    //   174: ldc 44
    //   176: ldc 145
    //   178: aload 12
    //   180: invokestatic 140	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: aconst_null
    //   184: astore_2
    //   185: goto -119 -> 66
    //   188: astore 9
    //   190: iconst_1
    //   191: anewarray 4	java/lang/Object
    //   194: astore 10
    //   196: aload 10
    //   198: iconst_0
    //   199: aload 9
    //   201: invokevirtual 146	java/lang/ClassNotFoundException:getMessage	()Ljava/lang/String;
    //   204: aastore
    //   205: ldc 44
    //   207: ldc 148
    //   209: aload 10
    //   211: invokestatic 140	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: aconst_null
    //   215: astore_2
    //   216: goto -150 -> 66
    //   219: astore_3
    //   220: iconst_1
    //   221: anewarray 4	java/lang/Object
    //   224: astore 4
    //   226: aload 4
    //   228: iconst_0
    //   229: aload_3
    //   230: invokevirtual 149	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   233: aastore
    //   234: ldc 44
    //   236: ldc 151
    //   238: aload 4
    //   240: invokestatic 140	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: iconst_m1
    //   244: istore 5
    //   246: goto -120 -> 126
    //   249: iconst_1
    //   250: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   19	63	157	java/lang/NoSuchMethodException
    //   19	63	188	java/lang/ClassNotFoundException
    //   70	122	219	java/lang/Exception
  }

  public static boolean nU()
  {
    if (!Build.MANUFACTURER.equalsIgnoreCase("meizu"))
      return true;
    int j;
    if (Build.VERSION.SDK_INT == 17)
      j = 36;
    while (true)
    {
      return cr(j);
      int i = Build.VERSION.SDK_INT;
      j = 0;
      if (i >= 19)
        j = 27;
    }
  }

  public static boolean nV()
  {
    if (!Build.MANUFACTURER.equalsIgnoreCase("meizu"))
      return true;
    int j;
    if (Build.VERSION.SDK_INT == 17)
      j = 35;
    while (true)
    {
      return cr(j);
      int i = Build.VERSION.SDK_INT;
      j = 0;
      if (i >= 19)
        j = 26;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.s
 * JD-Core Version:    0.6.2
 */