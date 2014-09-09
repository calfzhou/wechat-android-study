package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mm.a.f;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.sdk.platformtools.ak;

public final class t
  implements q
{
  private String eNy;
  private int height;
  private String url;
  private int width;

  public t(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.eNy = paramString1;
    this.url = paramString2;
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public final String DA()
  {
    return this.eNy;
  }

  public final String DB()
  {
    return this.eNy;
  }

  public final boolean DC()
  {
    return true;
  }

  public final boolean DD()
  {
    return false;
  }

  public final Bitmap DE()
  {
    return BitmapFactory.decodeResource(ak.getContext().getResources(), h.Xu);
  }

  public final String Dy()
  {
    return bg.qW().pa() + "/" + f.d(this.url.getBytes());
  }

  public final String Dz()
  {
    return this.url;
  }

  // ERROR //
  public final Bitmap a(Bitmap paramBitmap, com.tencent.mm.platformtools.r paramr)
  {
    // Byte code:
    //   0: getstatic 105	com/tencent/mm/platformtools/r:dUL	Lcom/tencent/mm/platformtools/r;
    //   3: aload_2
    //   4: if_acmpne +150 -> 154
    //   7: iconst_1
    //   8: anewarray 4	java/lang/Object
    //   11: astore 4
    //   13: aload 4
    //   15: iconst_0
    //   16: aload_0
    //   17: getfield 21	com/tencent/mm/pluginsdk/ui/tools/t:url	Ljava/lang/String;
    //   20: aastore
    //   21: ldc 107
    //   23: ldc 109
    //   25: aload 4
    //   27: invokestatic 115	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: getfield 23	com/tencent/mm/pluginsdk/ui/tools/t:width	I
    //   34: ifle +23 -> 57
    //   37: aload_0
    //   38: getfield 25	com/tencent/mm/pluginsdk/ui/tools/t:height	I
    //   41: ifle +16 -> 57
    //   44: aload_1
    //   45: aload_0
    //   46: getfield 23	com/tencent/mm/pluginsdk/ui/tools/t:width	I
    //   49: aload_0
    //   50: getfield 25	com/tencent/mm/pluginsdk/ui/tools/t:height	I
    //   53: invokestatic 121	com/tencent/mm/sdk/platformtools/i:b	(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    //   56: astore_1
    //   57: new 123	java/io/File
    //   60: dup
    //   61: aload_0
    //   62: invokevirtual 125	com/tencent/mm/pluginsdk/ui/tools/t:Dy	()Ljava/lang/String;
    //   65: invokespecial 128	java/io/File:<init>	(Ljava/lang/String;)V
    //   68: astore 5
    //   70: aload 5
    //   72: invokevirtual 131	java/io/File:createNewFile	()Z
    //   75: pop
    //   76: new 133	java/io/FileOutputStream
    //   79: dup
    //   80: aload 5
    //   82: invokespecial 136	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   85: astore 7
    //   87: aload_1
    //   88: getstatic 142	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   91: bipush 100
    //   93: aload 7
    //   95: invokevirtual 148	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   98: pop
    //   99: aload 7
    //   101: invokevirtual 151	java/io/FileOutputStream:flush	()V
    //   104: aload 7
    //   106: invokevirtual 154	java/io/FileOutputStream:close	()V
    //   109: aload_1
    //   110: areturn
    //   111: aload 7
    //   113: ifnull +41 -> 154
    //   116: aload 7
    //   118: invokevirtual 154	java/io/FileOutputStream:close	()V
    //   121: aload_1
    //   122: areturn
    //   123: aload 10
    //   125: ifnull +8 -> 133
    //   128: aload 10
    //   130: invokevirtual 154	java/io/FileOutputStream:close	()V
    //   133: aload 11
    //   135: athrow
    //   136: astore 9
    //   138: aload 7
    //   140: astore 10
    //   142: aload 9
    //   144: astore 11
    //   146: goto -23 -> 123
    //   149: astore 8
    //   151: goto -40 -> 111
    //   154: aload_1
    //   155: areturn
    //   156: astore 13
    //   158: aconst_null
    //   159: astore 7
    //   161: goto -50 -> 111
    //   164: astore_3
    //   165: aload_1
    //   166: areturn
    //   167: astore 11
    //   169: aconst_null
    //   170: astore 10
    //   172: goto -49 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   87	104	136	finally
    //   87	104	149	java/io/FileNotFoundException
    //   76	87	156	java/io/FileNotFoundException
    //   7	57	164	java/io/IOException
    //   57	76	164	java/io/IOException
    //   104	109	164	java/io/IOException
    //   116	121	164	java/io/IOException
    //   128	133	164	java/io/IOException
    //   133	136	164	java/io/IOException
    //   76	87	167	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.t
 * JD-Core Version:    0.6.2
 */