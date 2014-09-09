package android.support.v4.c;

import java.util.LinkedHashMap;
import java.util.Map;

public final class c
{
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap map = new LinkedHashMap(0, 0.75F, true);
  private int maxSize = 20;
  private int missCount;
  private int putCount;
  private int size;

  // ERROR //
  private void trimToSize(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	android/support/v4/c/c:size	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 27	android/support/v4/c/c:map	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 35	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 31	android/support/v4/c/c:size	I
    //   23: ifeq +41 -> 64
    //   26: new 37	java/lang/IllegalStateException
    //   29: dup
    //   30: new 39	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 44	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 50	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 56
    //   49: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 62	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 31	android/support/v4/c/c:size	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 27	android/support/v4/c/c:map	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 35	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 27	android/support/v4/c/c:map	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 66	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 72 1 0
    //   97: invokeinterface 78 1 0
    //   102: checkcast 80	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 83 1 0
    //   112: astore 4
    //   114: aload_3
    //   115: invokeinterface 86 1 0
    //   120: pop
    //   121: aload_0
    //   122: getfield 27	android/support/v4/c/c:map	Ljava/util/LinkedHashMap;
    //   125: aload 4
    //   127: invokevirtual 90	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   130: pop
    //   131: aload_0
    //   132: iconst_m1
    //   133: aload_0
    //   134: getfield 31	android/support/v4/c/c:size	I
    //   137: iadd
    //   138: putfield 31	android/support/v4/c/c:size	I
    //   141: aload_0
    //   142: iconst_1
    //   143: aload_0
    //   144: getfield 92	android/support/v4/c/c:evictionCount	I
    //   147: iadd
    //   148: putfield 92	android/support/v4/c/c:evictionCount	I
    //   151: aload_0
    //   152: monitorexit
    //   153: goto -153 -> 0
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	153	59	finally
  }

  public final void evictAll()
  {
    trimToSize(-1);
  }

  public final Object get(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException("key == null");
    try
    {
      Object localObject2 = this.map.get(paramObject);
      if (localObject2 != null)
      {
        this.hitCount = (1 + this.hitCount);
        return localObject2;
      }
      this.missCount = (1 + this.missCount);
      return null;
    }
    finally
    {
    }
  }

  public final Object put(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      throw new NullPointerException("key == null || value == null");
    try
    {
      this.putCount = (1 + this.putCount);
      this.size = (1 + this.size);
      Object localObject2 = this.map.put(paramObject1, paramObject2);
      if (localObject2 != null)
        this.size = (-1 + this.size);
      trimToSize(this.maxSize);
      return localObject2;
    }
    finally
    {
    }
  }

  public final Object remove(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException("key == null");
    try
    {
      Object localObject2 = this.map.remove(paramObject);
      if (localObject2 != null)
        this.size = (-1 + this.size);
      return localObject2;
    }
    finally
    {
    }
  }

  public final int size()
  {
    try
    {
      int i = this.size;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Map snapshot()
  {
    try
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap(this.map);
      return localLinkedHashMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String toString()
  {
    try
    {
      int i = this.hitCount + this.missCount;
      int j = 0;
      if (i != 0)
        j = 100 * this.hitCount / i;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(this.maxSize);
      arrayOfObject[1] = Integer.valueOf(this.hitCount);
      arrayOfObject[2] = Integer.valueOf(this.missCount);
      arrayOfObject[3] = Integer.valueOf(j);
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", arrayOfObject);
      return str;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.c
 * JD-Core Version:    0.6.2
 */