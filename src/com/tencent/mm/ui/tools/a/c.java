package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;

final class c extends d
{
  private AssetManager jWx;

  public c(Context paramContext, n paramn, e parame, a parama)
  {
    super(paramn, parame, parama);
    this.jWx = paramContext.getAssets();
  }

  // ERROR //
  private Bitmap Dq(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 25	com/tencent/mm/ui/tools/a/c:jWq	Lcom/tencent/mm/ui/tools/a/ab;
    //   6: invokevirtual 31	com/tencent/mm/ui/tools/a/ab:bby	()Z
    //   9: ifeq +100 -> 109
    //   12: new 33	android/graphics/BitmapFactory$Options
    //   15: dup
    //   16: invokespecial 36	android/graphics/BitmapFactory$Options:<init>	()V
    //   19: astore_3
    //   20: aload_3
    //   21: iconst_1
    //   22: putfield 40	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   25: aload_0
    //   26: getfield 19	com/tencent/mm/ui/tools/a/c:jWx	Landroid/content/res/AssetManager;
    //   29: aload_1
    //   30: invokevirtual 46	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   33: astore_2
    //   34: aload_2
    //   35: aconst_null
    //   36: aload_3
    //   37: invokestatic 52	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   40: pop
    //   41: aload_2
    //   42: invokestatic 58	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   45: aload_0
    //   46: getfield 25	com/tencent/mm/ui/tools/a/c:jWq	Lcom/tencent/mm/ui/tools/a/ab;
    //   49: getfield 62	com/tencent/mm/ui/tools/a/ab:fkq	I
    //   52: aload_0
    //   53: getfield 25	com/tencent/mm/ui/tools/a/c:jWq	Lcom/tencent/mm/ui/tools/a/ab;
    //   56: getfield 65	com/tencent/mm/ui/tools/a/ab:eSi	I
    //   59: aload_3
    //   60: invokestatic 69	com/tencent/mm/ui/tools/a/c:a	(IILandroid/graphics/BitmapFactory$Options;)V
    //   63: aload_0
    //   64: getfield 19	com/tencent/mm/ui/tools/a/c:jWx	Landroid/content/res/AssetManager;
    //   67: aload_1
    //   68: invokevirtual 46	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   71: astore 6
    //   73: aload 6
    //   75: aconst_null
    //   76: aload_3
    //   77: invokestatic 52	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   80: astore 8
    //   82: aload 6
    //   84: invokestatic 58	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   87: aload 8
    //   89: areturn
    //   90: astore 4
    //   92: aload_2
    //   93: invokestatic 58	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   96: aload 4
    //   98: athrow
    //   99: astore 7
    //   101: aload 6
    //   103: invokestatic 58	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   106: aload 7
    //   108: athrow
    //   109: aconst_null
    //   110: astore_3
    //   111: goto -48 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   25	41	90	finally
    //   73	82	99	finally
  }

  final Bitmap a(ab paramab)
  {
    return Dq(paramab.uri.toString().substring(jWz));
  }

  final s bbr()
  {
    return s.jWU;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.c
 * JD-Core Version:    0.6.2
 */