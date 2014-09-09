package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.graphics.Bitmap;

final class i extends j
{
  private static final String[] jWI = { "orientation" };

  i(Context paramContext, n paramn, e parame, a parama)
  {
    super(paramContext, paramn, parame, parama);
  }

  // ERROR //
  private static int a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic 14	com/tencent/mm/ui/tools/a/i:jWI	[Ljava/lang/String;
    //   5: aconst_null
    //   6: aconst_null
    //   7: aconst_null
    //   8: invokevirtual 28	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   11: astore 6
    //   13: aload 6
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull +16 -> 33
    //   20: aload_3
    //   21: invokeinterface 34 1 0
    //   26: istore 9
    //   28: iload 9
    //   30: ifne +19 -> 49
    //   33: aload_3
    //   34: ifnull +9 -> 43
    //   37: aload_3
    //   38: invokeinterface 37 1 0
    //   43: iconst_0
    //   44: istore 7
    //   46: iload 7
    //   48: ireturn
    //   49: aload_3
    //   50: iconst_0
    //   51: invokeinterface 41 2 0
    //   56: istore 10
    //   58: iload 10
    //   60: istore 7
    //   62: aload_3
    //   63: ifnull -17 -> 46
    //   66: aload_3
    //   67: invokeinterface 37 1 0
    //   72: iload 7
    //   74: ireturn
    //   75: astore 4
    //   77: aconst_null
    //   78: astore 5
    //   80: aload 5
    //   82: ifnull +10 -> 92
    //   85: aload 5
    //   87: invokeinterface 37 1 0
    //   92: iconst_0
    //   93: ireturn
    //   94: astore_2
    //   95: aconst_null
    //   96: astore_3
    //   97: aload_3
    //   98: ifnull +9 -> 107
    //   101: aload_3
    //   102: invokeinterface 37 1 0
    //   107: aload_2
    //   108: athrow
    //   109: astore_2
    //   110: goto -13 -> 97
    //   113: astore 8
    //   115: aload_3
    //   116: astore 5
    //   118: goto -38 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   0	13	75	java/lang/RuntimeException
    //   0	13	94	finally
    //   20	28	109	finally
    //   49	58	109	finally
    //   20	28	113	java/lang/RuntimeException
    //   49	58	113	java/lang/RuntimeException
  }

  final Bitmap a(ab paramab)
  {
    this.jWG = a(this.context.getContentResolver(), paramab.uri);
    return super.b(paramab);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.i
 * JD-Core Version:    0.6.2
 */