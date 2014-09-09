package com.tencent.mm.compatible.loader;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class b extends ContextWrapper
{
  private static final Map dNW = new HashMap();
  private String dNS;
  private Context dNT;
  private ClassLoader dNU;
  private AssetManager dNV;
  private Resources kX;
  private String pkgName;

  // ERROR //
  private b(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 32	android/content/ContextWrapper:<init>	(Landroid/content/Context;)V
    //   8: aload_1
    //   9: ifnull +175 -> 184
    //   12: aload_2
    //   13: ifnull +171 -> 184
    //   16: ldc 34
    //   18: iload 4
    //   20: invokestatic 40	junit/framework/Assert:assertTrue	(Ljava/lang/String;Z)V
    //   23: aload_0
    //   24: aload_2
    //   25: putfield 42	com/tencent/mm/compatible/loader/b:dNS	Ljava/lang/String;
    //   28: aload_0
    //   29: aload_3
    //   30: putfield 44	com/tencent/mm/compatible/loader/b:pkgName	Ljava/lang/String;
    //   33: aload_0
    //   34: aload_1
    //   35: putfield 46	com/tencent/mm/compatible/loader/b:dNT	Landroid/content/Context;
    //   38: aload_0
    //   39: new 48	dalvik/system/DexClassLoader
    //   42: dup
    //   43: aload_2
    //   44: aload_1
    //   45: ldc 50
    //   47: iconst_0
    //   48: invokevirtual 56	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   51: invokevirtual 62	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   54: aconst_null
    //   55: aload_1
    //   56: invokevirtual 66	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   59: invokespecial 69	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   62: putfield 71	com/tencent/mm/compatible/loader/b:dNU	Ljava/lang/ClassLoader;
    //   65: aload_0
    //   66: ldc 73
    //   68: invokevirtual 79	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   71: checkcast 73	android/content/res/AssetManager
    //   74: putfield 81	com/tencent/mm/compatible/loader/b:dNV	Landroid/content/res/AssetManager;
    //   77: ldc 73
    //   79: ldc 83
    //   81: iconst_1
    //   82: anewarray 75	java/lang/Class
    //   85: dup
    //   86: iconst_0
    //   87: ldc 85
    //   89: aastore
    //   90: invokevirtual 89	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   93: astore 9
    //   95: aload_0
    //   96: getfield 81	com/tencent/mm/compatible/loader/b:dNV	Landroid/content/res/AssetManager;
    //   99: astore 10
    //   101: iconst_1
    //   102: anewarray 91	java/lang/Object
    //   105: astore 11
    //   107: aload 11
    //   109: iconst_0
    //   110: aload_0
    //   111: getfield 42	com/tencent/mm/compatible/loader/b:dNS	Ljava/lang/String;
    //   114: aastore
    //   115: aload 9
    //   117: aload 10
    //   119: aload 11
    //   121: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   124: pop
    //   125: aload_0
    //   126: getfield 46	com/tencent/mm/compatible/loader/b:dNT	Landroid/content/Context;
    //   129: invokevirtual 101	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   132: invokevirtual 107	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   135: astore 7
    //   137: aload_0
    //   138: getfield 46	com/tencent/mm/compatible/loader/b:dNT	Landroid/content/Context;
    //   141: invokevirtual 101	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   144: invokevirtual 111	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   147: astore 8
    //   149: aload_0
    //   150: new 103	android/content/res/Resources
    //   153: dup
    //   154: aload_0
    //   155: getfield 81	com/tencent/mm/compatible/loader/b:dNV	Landroid/content/res/AssetManager;
    //   158: aload 7
    //   160: aload 8
    //   162: invokespecial 114	android/content/res/Resources:<init>	(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    //   165: putfield 116	com/tencent/mm/compatible/loader/b:kX	Landroid/content/res/Resources;
    //   168: ldc 118
    //   170: ldc 120
    //   172: iconst_1
    //   173: anewarray 91	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_3
    //   179: aastore
    //   180: invokestatic 126	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: return
    //   184: iconst_0
    //   185: istore 4
    //   187: goto -171 -> 16
    //   190: astore 5
    //   192: ldc 118
    //   194: aload 5
    //   196: invokevirtual 129	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   199: invokestatic 133	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: return
    //   203: astore 6
    //   205: goto -80 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   23	65	190	java/lang/Exception
    //   125	183	190	java/lang/Exception
    //   65	125	203	java/lang/Exception
  }

  public static b a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!paramBoolean);
    try
    {
      b localb = (b)dNW.get(paramString1);
      if (localb == null)
      {
        Map localMap = dNW;
        localb = new b(paramContext, paramString1, paramString2);
        localMap.put(paramString1, localb);
      }
      return localb;
    }
    finally
    {
    }
  }

  public final AssetManager getAssets()
  {
    return this.dNV;
  }

  public final ClassLoader getClassLoader()
  {
    return this.dNU;
  }

  public final Drawable getDrawable(String paramString)
  {
    if (paramString == null);
    int i;
    do
    {
      do
      {
        return null;
        z.d("!44@/B4Tb64lLpKZ+WKYuZxb10Zd5ThmB9upTqrbQ4TW1SU=", "packname:%s", new Object[] { paramString });
        if (this.kX != null)
        {
          int j = this.kX.getIdentifier(paramString, "drawable", this.pkgName);
          if (j > 0)
            return this.kX.getDrawable(j);
        }
      }
      while (this.dNT == null);
      i = this.dNT.getResources().getIdentifier(paramString, "drawable", this.dNT.getPackageName());
    }
    while (i <= 0);
    return this.dNT.getResources().getDrawable(i);
  }

  public final String getPackageName()
  {
    return this.pkgName;
  }

  public final Resources getResources()
  {
    return this.kX;
  }

  public final String getString(String paramString)
  {
    return getString(paramString, "");
  }

  public final String getString(String paramString1, String paramString2)
  {
    if (paramString1 == null);
    int i;
    do
    {
      do
      {
        return paramString2;
        if (this.kX != null)
        {
          int j = this.kX.getIdentifier(paramString1, "string", this.pkgName);
          if (j > 0)
            return this.kX.getString(j);
        }
      }
      while (this.dNT == null);
      i = this.dNT.getResources().getIdentifier(paramString1, "string", this.dNT.getPackageName());
    }
    while (i <= 0);
    return this.dNT.getString(i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.b
 * JD-Core Version:    0.6.2
 */