package com.tencent.mm.ui.tools.a;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

public final class t
  implements e
{
  private int evictionCount;
  private int hitCount;
  final LinkedHashMap map;
  private final int maxSize;
  private int missCount;
  private int putCount;
  private int size;

  private t(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("Max size must be positive.");
    this.maxSize = paramInt;
    this.map = new LinkedHashMap(0, 0.75F, true);
  }

  public t(Context paramContext)
  {
    this(Math.min(1048576 * ((ActivityManager)paramContext.getSystemService("activity")).getMemoryClass() / 5, 20971520));
  }

  // ERROR //
  private void trimToSize(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	com/tencent/mm/ui/tools/a/t:size	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 37	com/tencent/mm/ui/tools/a/t:map	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 69	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 65	com/tencent/mm/ui/tools/a/t:size	I
    //   23: ifeq +41 -> 64
    //   26: new 71	java/lang/IllegalStateException
    //   29: dup
    //   30: new 73	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 78	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 84	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 90
    //   49: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 94	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 65	com/tencent/mm/ui/tools/a/t:size	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 37	com/tencent/mm/ui/tools/a/t:map	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 69	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 37	com/tencent/mm/ui/tools/a/t:map	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 98	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 104 1 0
    //   97: invokeinterface 110 1 0
    //   102: checkcast 112	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 115 1 0
    //   112: checkcast 117	java/lang/String
    //   115: astore 4
    //   117: aload_3
    //   118: invokeinterface 120 1 0
    //   123: checkcast 122	android/graphics/Bitmap
    //   126: astore 5
    //   128: aload_0
    //   129: getfield 37	com/tencent/mm/ui/tools/a/t:map	Ljava/util/LinkedHashMap;
    //   132: aload 4
    //   134: invokevirtual 126	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   137: pop
    //   138: aload_0
    //   139: aload_0
    //   140: getfield 65	com/tencent/mm/ui/tools/a/t:size	I
    //   143: aload 5
    //   145: invokestatic 132	com/tencent/mm/ui/tools/a/af:s	(Landroid/graphics/Bitmap;)I
    //   148: isub
    //   149: putfield 65	com/tencent/mm/ui/tools/a/t:size	I
    //   152: aload_0
    //   153: iconst_1
    //   154: aload_0
    //   155: getfield 134	com/tencent/mm/ui/tools/a/t:evictionCount	I
    //   158: iadd
    //   159: putfield 134	com/tencent/mm/ui/tools/a/t:evictionCount	I
    //   162: aload_0
    //   163: monitorexit
    //   164: goto -164 -> 0
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	164	59	finally
  }

  public final void clear()
  {
    try
    {
      trimToSize(-1);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Bitmap gK(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException("key == null");
    try
    {
      Bitmap localBitmap = (Bitmap)this.map.get(paramString);
      if (localBitmap != null)
      {
        this.hitCount = (1 + this.hitCount);
        return localBitmap;
      }
      this.missCount = (1 + this.missCount);
      return null;
    }
    finally
    {
    }
  }

  public final void u(String paramString, Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramBitmap == null))
      throw new NullPointerException("key == null || bitmap == null");
    try
    {
      this.putCount = (1 + this.putCount);
      this.size += af.s(paramBitmap);
      Bitmap localBitmap = (Bitmap)this.map.put(paramString, paramBitmap);
      if (localBitmap != null)
        this.size -= af.s(localBitmap);
      trimToSize(this.maxSize);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.t
 * JD-Core Version:    0.6.2
 */