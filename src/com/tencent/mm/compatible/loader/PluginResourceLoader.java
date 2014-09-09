package com.tencent.mm.compatible.loader;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.ZipFile;

public class PluginResourceLoader extends Resources
{
  private HashMap bh = new HashMap();
  public Resources dOr = null;
  private Method dOs;
  private Method dOt;
  private final c dOu = new c();

  public PluginResourceLoader(Resources paramResources)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.dOr = paramResources;
    String str1 = "loadDrawable";
    String str2 = "loadXmlResourceParser";
    try
    {
      if (!ch.jb(v.dNG.dNk))
      {
        str1 = v.dNG.dNk;
        z.d("!44@/B4Tb64lLpIJk40rTE9aTumNyErzJXzgXYHaEFsdwLU=", "loadDrawable %s ", new Object[] { str1 });
      }
      if (!ch.jb(v.dNG.dNl))
      {
        str2 = v.dNG.dNl;
        z.d("!44@/B4Tb64lLpIJk40rTE9aTumNyErzJXzgXYHaEFsdwLU=", "loadXmlResourceParser %s ", new Object[] { str2 });
      }
      Class[] arrayOfClass1 = new Class[2];
      arrayOfClass1[0] = TypedValue.class;
      arrayOfClass1[1] = Integer.TYPE;
      this.dOs = Resources.class.getDeclaredMethod(str1, arrayOfClass1);
      this.dOs.setAccessible(true);
      Class[] arrayOfClass2 = new Class[4];
      arrayOfClass2[0] = String.class;
      arrayOfClass2[1] = Integer.TYPE;
      arrayOfClass2[2] = Integer.TYPE;
      arrayOfClass2[3] = String.class;
      this.dOt = Resources.class.getDeclaredMethod(str2, arrayOfClass2);
      this.dOt.setAccessible(true);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }

  private XmlResourceParser a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    try
    {
      Method localMethod = this.dOt;
      Resources localResources = this.dOr;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = Integer.valueOf(paramInt1);
      arrayOfObject[2] = Integer.valueOf(paramInt2);
      arrayOfObject[3] = paramString2;
      XmlResourceParser localXmlResourceParser = (XmlResourceParser)localMethod.invoke(localResources, arrayOfObject);
      return localXmlResourceParser;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private Drawable a(TypedValue paramTypedValue, int paramInt)
  {
    try
    {
      Method localMethod = this.dOs;
      Resources localResources = this.dOr;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramTypedValue;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      Drawable localDrawable3 = (Drawable)localMethod.invoke(localResources, arrayOfObject);
      return localDrawable3;
    }
    catch (StackOverflowError localStackOverflowError)
    {
      z.e("!44@/B4Tb64lLpIJk40rTE9aTumNyErzJXzgXYHaEFsdwLU=", "load drawable StackOverflowError");
      try
      {
        if ((paramTypedValue.string != null) && (paramTypedValue.string.toString().endsWith(".xml")))
        {
          XmlResourceParser localXmlResourceParser = a(paramTypedValue.string.toString(), paramInt, paramTypedValue.assetCookie, "drawable");
          Drawable localDrawable2 = Drawable.createFromXml(this, localXmlResourceParser);
          localXmlResourceParser.close();
          return localDrawable2;
        }
      }
      catch (Exception localException2)
      {
        Iterator localIterator = this.bh.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Drawable localDrawable1 = a((ZipFile)((Map.Entry)localIterator.next()).getValue(), paramTypedValue);
          if (localDrawable1 != null)
            return localDrawable1;
        }
        z.d("!44@/B4Tb64lLpIJk40rTE9aTumNyErzJXzgXYHaEFsdwLU=", "loadFromZipFile null");
        return null;
      }
    }
    catch (Exception localException1)
    {
      label57: break label57;
    }
  }

  // ERROR //
  private Drawable a(ZipFile paramZipFile, TypedValue paramTypedValue)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_2
    //   3: getfield 140	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   6: ifnonnull +9 -> 15
    //   9: aconst_null
    //   10: astore 7
    //   12: aload 7
    //   14: areturn
    //   15: aload_2
    //   16: getfield 155	android/util/TypedValue:assetCookie	I
    //   19: i2l
    //   20: bipush 32
    //   22: lshl
    //   23: aload_2
    //   24: getfield 203	android/util/TypedValue:data	I
    //   27: i2l
    //   28: lor
    //   29: lstore 4
    //   31: aload_0
    //   32: getfield 46	com/tencent/mm/compatible/loader/PluginResourceLoader:dOu	Lcom/tencent/mm/compatible/loader/c;
    //   35: lload 4
    //   37: invokevirtual 207	com/tencent/mm/compatible/loader/c:get	(J)Ljava/lang/Object;
    //   40: checkcast 209	java/lang/ref/WeakReference
    //   43: astore 6
    //   45: aload 6
    //   47: ifnull +50 -> 97
    //   50: aload 6
    //   52: invokevirtual 211	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   55: checkcast 213	android/graphics/drawable/Drawable$ConstantState
    //   58: astore 23
    //   60: aload 23
    //   62: ifnull +26 -> 88
    //   65: aload 23
    //   67: aload_0
    //   68: invokevirtual 217	android/graphics/drawable/Drawable$ConstantState:newDrawable	(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   71: astore 7
    //   73: aload 7
    //   75: ifnull +28 -> 103
    //   78: ldc 70
    //   80: ldc 219
    //   82: invokestatic 222	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload 7
    //   87: areturn
    //   88: aload_0
    //   89: getfield 46	com/tencent/mm/compatible/loader/PluginResourceLoader:dOu	Lcom/tencent/mm/compatible/loader/c;
    //   92: lload 4
    //   94: invokevirtual 226	com/tencent/mm/compatible/loader/c:delete	(J)V
    //   97: aconst_null
    //   98: astore 7
    //   100: goto -27 -> 73
    //   103: aload_2
    //   104: getfield 140	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   107: invokeinterface 146 1 0
    //   112: astore 8
    //   114: iconst_2
    //   115: anewarray 74	java/lang/Object
    //   118: astore 10
    //   120: aload 10
    //   122: iconst_0
    //   123: aload 8
    //   125: aastore
    //   126: aload 10
    //   128: iconst_1
    //   129: aload_1
    //   130: invokevirtual 229	java/util/zip/ZipFile:getName	()Ljava/lang/String;
    //   133: aastore
    //   134: ldc 70
    //   136: ldc 231
    //   138: aload 10
    //   140: invokestatic 233	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_1
    //   144: aload 8
    //   146: invokevirtual 237	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   149: astore 11
    //   151: aload_1
    //   152: aload 11
    //   154: invokevirtual 241	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   157: astore 19
    //   159: aload 19
    //   161: astore_3
    //   162: aload_0
    //   163: aload_2
    //   164: aload_3
    //   165: aload 8
    //   167: invokestatic 245	android/graphics/drawable/Drawable:createFromResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   170: astore 21
    //   172: aload 21
    //   174: astore 7
    //   176: aload_3
    //   177: ifnull +7 -> 184
    //   180: aload_3
    //   181: invokevirtual 248	java/io/InputStream:close	()V
    //   184: aload 7
    //   186: ifnonnull +20 -> 206
    //   189: aload_1
    //   190: aload 11
    //   192: invokevirtual 241	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   195: aload 8
    //   197: invokestatic 252	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   200: astore 18
    //   202: aload 18
    //   204: astore 7
    //   206: aload 7
    //   208: ifnull -196 -> 12
    //   211: aload_0
    //   212: getfield 46	com/tencent/mm/compatible/loader/PluginResourceLoader:dOu	Lcom/tencent/mm/compatible/loader/c;
    //   215: lload 4
    //   217: new 209	java/lang/ref/WeakReference
    //   220: dup
    //   221: aload 7
    //   223: invokevirtual 256	android/graphics/drawable/Drawable:getConstantState	()Landroid/graphics/drawable/Drawable$ConstantState;
    //   226: invokespecial 259	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   229: invokevirtual 263	com/tencent/mm/compatible/loader/c:put	(JLjava/lang/Object;)V
    //   232: aload 7
    //   234: areturn
    //   235: astore 16
    //   237: aload_3
    //   238: ifnull -54 -> 184
    //   241: aload_3
    //   242: invokevirtual 248	java/io/InputStream:close	()V
    //   245: goto -61 -> 184
    //   248: astore 17
    //   250: goto -66 -> 184
    //   253: astore 12
    //   255: aconst_null
    //   256: astore 13
    //   258: aload 12
    //   260: astore 14
    //   262: aload 13
    //   264: ifnull +8 -> 272
    //   267: aload 13
    //   269: invokevirtual 248	java/io/InputStream:close	()V
    //   272: aload 14
    //   274: athrow
    //   275: astore 9
    //   277: goto -71 -> 206
    //   280: astore 22
    //   282: goto -98 -> 184
    //   285: astore 15
    //   287: goto -15 -> 272
    //   290: astore 20
    //   292: aload_3
    //   293: astore 13
    //   295: aload 20
    //   297: astore 14
    //   299: goto -37 -> 262
    //
    // Exception table:
    //   from	to	target	type
    //   151	159	235	java/lang/Exception
    //   162	172	235	java/lang/Exception
    //   241	245	248	java/lang/Exception
    //   151	159	253	finally
    //   114	151	275	java/lang/Exception
    //   189	202	275	java/lang/Exception
    //   272	275	275	java/lang/Exception
    //   180	184	280	java/lang/Exception
    //   267	272	285	java/lang/Exception
    //   162	172	290	finally
  }

  private static InputStream b(ZipFile paramZipFile, TypedValue paramTypedValue)
  {
    if (paramTypedValue.string == null)
      return null;
    String str = paramTypedValue.string.toString();
    try
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = paramZipFile.getName();
      z.d("!44@/B4Tb64lLpIJk40rTE9aTumNyErzJXzgXYHaEFsdwLU=", "try load stream from zip, entry=%s, file=%s", arrayOfObject);
      InputStream localInputStream = paramZipFile.getInputStream(paramZipFile.getEntry(str));
      return localInputStream;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  Drawable loadDrawable(TypedValue paramTypedValue, int paramInt)
  {
    return a(paramTypedValue, paramInt);
  }

  Drawable loadDrawable(TypedValue paramTypedValue, int paramInt, boolean paramBoolean)
  {
    return a(paramTypedValue, paramInt);
  }

  public InputStream openRawResource(int paramInt, TypedValue paramTypedValue)
  {
    InputStream localInputStream1 = null;
    getValue(paramInt, paramTypedValue, true);
    InputStream localInputStream2;
    try
    {
      InputStream localInputStream3 = super.openRawResource(paramInt, paramTypedValue);
      localInputStream2 = localInputStream3;
      if (localInputStream2 == null)
      {
        Iterator localIterator = this.bh.entrySet().iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          localInputStream1 = b((ZipFile)((Map.Entry)localIterator.next()).getValue(), paramTypedValue);
        }
        while (localInputStream1 == null);
        return localInputStream1;
      }
    }
    catch (Exception localException)
    {
      while (true)
        localInputStream2 = null;
    }
    return localInputStream2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.PluginResourceLoader
 * JD-Core Version:    0.6.2
 */