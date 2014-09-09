package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.graphics.Bitmap;

class j extends d
{
  final Context context;

  j(Context paramContext, n paramn, e parame, a parama)
  {
    super(paramn, parame, parama);
    this.context = paramContext;
  }

  Bitmap a(ab paramab)
  {
    return b(paramab);
  }

  // ERROR //
  protected final Bitmap b(ab paramab)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 13	com/tencent/mm/ui/tools/a/j:context	Landroid/content/Context;
    //   6: invokevirtual 24	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   9: astore_3
    //   10: aload_1
    //   11: invokevirtual 30	com/tencent/mm/ui/tools/a/ab:bby	()Z
    //   14: ifeq +146 -> 160
    //   17: new 32	android/graphics/BitmapFactory$Options
    //   20: dup
    //   21: invokespecial 35	android/graphics/BitmapFactory$Options:<init>	()V
    //   24: astore 4
    //   26: aload 4
    //   28: iconst_1
    //   29: putfield 39	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   32: aload_3
    //   33: aload_1
    //   34: getfield 43	com/tencent/mm/ui/tools/a/ab:uri	Landroid/net/Uri;
    //   37: invokevirtual 49	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   40: astore_2
    //   41: aload_2
    //   42: aconst_null
    //   43: aload 4
    //   45: invokestatic 55	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   48: pop
    //   49: aload_2
    //   50: invokestatic 61	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   53: aload_1
    //   54: getfield 65	com/tencent/mm/ui/tools/a/ab:fkq	I
    //   57: aload_1
    //   58: getfield 68	com/tencent/mm/ui/tools/a/ab:eSi	I
    //   61: aload 4
    //   63: invokestatic 71	com/tencent/mm/ui/tools/a/j:a	(IILandroid/graphics/BitmapFactory$Options;)V
    //   66: aload_3
    //   67: aload_1
    //   68: getfield 43	com/tencent/mm/ui/tools/a/ab:uri	Landroid/net/Uri;
    //   71: invokevirtual 49	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   74: astore 7
    //   76: aload 7
    //   78: aconst_null
    //   79: aload 4
    //   81: invokestatic 55	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   84: astore 9
    //   86: aload 9
    //   88: astore 10
    //   90: aload 7
    //   92: invokestatic 61	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   95: aload 10
    //   97: ifnonnull +41 -> 138
    //   100: aload_1
    //   101: getfield 43	com/tencent/mm/ui/tools/a/ab:uri	Landroid/net/Uri;
    //   104: invokevirtual 77	android/net/Uri:getPath	()Ljava/lang/String;
    //   107: invokestatic 83	com/tencent/mm/sdk/platformtools/MMNativeJpeg:IsJpegFile	(Ljava/lang/String;)Z
    //   110: ifeq +28 -> 138
    //   113: aload_1
    //   114: getfield 43	com/tencent/mm/ui/tools/a/ab:uri	Landroid/net/Uri;
    //   117: invokevirtual 77	android/net/Uri:getPath	()Ljava/lang/String;
    //   120: invokestatic 86	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   123: ifeq +15 -> 138
    //   126: aload_1
    //   127: getfield 43	com/tencent/mm/ui/tools/a/ab:uri	Landroid/net/Uri;
    //   130: invokevirtual 77	android/net/Uri:getPath	()Ljava/lang/String;
    //   133: invokestatic 90	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   136: astore 10
    //   138: aload 10
    //   140: areturn
    //   141: astore 5
    //   143: aload_2
    //   144: invokestatic 61	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   147: aload 5
    //   149: athrow
    //   150: astore 8
    //   152: aload 7
    //   154: invokestatic 61	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   157: aload 8
    //   159: athrow
    //   160: aconst_null
    //   161: astore 4
    //   163: goto -97 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   32	49	141	finally
    //   76	86	150	finally
  }

  final s bbr()
  {
    return s.jWU;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.j
 * JD-Core Version:    0.6.2
 */