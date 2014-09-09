package com.tencent.mm.compatible.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class a extends BitmapFactory
{
  public static Bitmap decodeResource(Resources paramResources, int paramInt)
  {
    return decodeResource(paramResources, paramInt, null);
  }

  // ERROR //
  public static Bitmap decodeResource(Resources paramResources, int paramInt, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_2
    //   3: invokestatic 19	com/tencent/mm/sdk/platformtools/i:a	(Landroid/graphics/BitmapFactory$Options;)V
    //   6: new 21	android/util/TypedValue
    //   9: dup
    //   10: invokespecial 25	android/util/TypedValue:<init>	()V
    //   13: astore 4
    //   15: aload_0
    //   16: iload_1
    //   17: aload 4
    //   19: invokevirtual 31	android/content/res/Resources:openRawResource	(ILandroid/util/TypedValue;)Ljava/io/InputStream;
    //   22: astore 10
    //   24: aload 10
    //   26: astore 8
    //   28: aload_0
    //   29: aload 4
    //   31: aload 8
    //   33: aconst_null
    //   34: aload_2
    //   35: invokestatic 35	com/tencent/mm/compatible/d/a:decodeResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   38: astore 16
    //   40: aload 16
    //   42: astore_3
    //   43: aload_3
    //   44: ifnonnull +13 -> 57
    //   47: aload 8
    //   49: invokestatic 39	com/tencent/mm/compatible/d/a:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   52: astore 15
    //   54: aload 15
    //   56: astore_3
    //   57: aload 8
    //   59: ifnull +8 -> 67
    //   62: aload 8
    //   64: invokevirtual 44	java/io/InputStream:close	()V
    //   67: aload_3
    //   68: ifnonnull +70 -> 138
    //   71: aload_2
    //   72: ifnull +66 -> 138
    //   75: new 46	java/lang/IllegalArgumentException
    //   78: dup
    //   79: ldc 48
    //   81: invokespecial 51	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   84: athrow
    //   85: astore 7
    //   87: aconst_null
    //   88: astore 8
    //   90: aload 8
    //   92: ifnull -25 -> 67
    //   95: aload 8
    //   97: invokevirtual 44	java/io/InputStream:close	()V
    //   100: goto -33 -> 67
    //   103: astore 9
    //   105: goto -38 -> 67
    //   108: astore 5
    //   110: aload_3
    //   111: ifnull +7 -> 118
    //   114: aload_3
    //   115: invokevirtual 44	java/io/InputStream:close	()V
    //   118: aload 5
    //   120: athrow
    //   121: astore 12
    //   123: aconst_null
    //   124: astore_3
    //   125: goto -82 -> 43
    //   128: astore 13
    //   130: goto -63 -> 67
    //   133: astore 6
    //   135: goto -17 -> 118
    //   138: aload_3
    //   139: areturn
    //   140: astore 11
    //   142: aload 8
    //   144: astore_3
    //   145: aload 11
    //   147: astore 5
    //   149: goto -39 -> 110
    //   152: astore 14
    //   154: goto -64 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   6	24	85	java/lang/Exception
    //   95	100	103	java/io/IOException
    //   6	24	108	finally
    //   28	40	121	java/lang/Exception
    //   62	67	128	java/io/IOException
    //   114	118	133	java/io/IOException
    //   28	40	140	finally
    //   47	54	140	finally
    //   47	54	152	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.d.a
 * JD-Core Version:    0.6.2
 */