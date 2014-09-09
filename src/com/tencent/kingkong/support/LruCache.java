package com.tencent.kingkong.support;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;

  public LruCache(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    this.maxSize = paramInt;
    this.map = new LinkedHashMap(0, 0.75F, true);
  }

  private int safeSizeOf(Object paramObject1, Object paramObject2)
  {
    int i = sizeOf(paramObject1, paramObject2);
    if (i < 0)
      throw new IllegalStateException("Negative size: " + paramObject1 + "=" + paramObject2);
    return i;
  }

  protected Object create(Object paramObject)
  {
    return null;
  }

  public final int createCount()
  {
    try
    {
      int i = this.createCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected void entryRemoved(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3)
  {
  }

  public final void evictAll()
  {
    trimToSize(-1);
  }

  public final int evictionCount()
  {
    try
    {
      int i = this.evictionCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Object get(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException("key == null");
    Object localObject3;
    try
    {
      Object localObject2 = this.map.get(paramObject);
      if (localObject2 != null)
      {
        this.hitCount = (1 + this.hitCount);
        return localObject2;
      }
      this.missCount = (1 + this.missCount);
      localObject3 = create(paramObject);
      if (localObject3 == null)
        return null;
    }
    finally
    {
    }
    try
    {
      this.createCount = (1 + this.createCount);
      Object localObject5 = this.map.put(paramObject, localObject3);
      if (localObject5 != null)
        this.map.put(paramObject, localObject5);
      while (true)
      {
        if (localObject5 == null)
          break;
        entryRemoved(false, paramObject, localObject3, localObject5);
        return localObject5;
        this.size += safeSizeOf(paramObject, localObject3);
      }
    }
    finally
    {
    }
    trimToSize(this.maxSize);
    return localObject3;
  }

  public final int hitCount()
  {
    try
    {
      int i = this.hitCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int maxSize()
  {
    try
    {
      int i = this.maxSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int missCount()
  {
    try
    {
      int i = this.missCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Object put(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      throw new NullPointerException("key == null || value == null");
    try
    {
      this.putCount = (1 + this.putCount);
      this.size += safeSizeOf(paramObject1, paramObject2);
      Object localObject2 = this.map.put(paramObject1, paramObject2);
      if (localObject2 != null)
        this.size -= safeSizeOf(paramObject1, localObject2);
      if (localObject2 != null)
        entryRemoved(false, paramObject1, localObject2, paramObject2);
      trimToSize(this.maxSize);
      return localObject2;
    }
    finally
    {
    }
  }

  public final int putCount()
  {
    try
    {
      int i = this.putCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
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
        this.size -= safeSizeOf(paramObject, localObject2);
      if (localObject2 != null)
        entryRemoved(false, paramObject, localObject2, null);
      return localObject2;
    }
    finally
    {
    }
  }

  public void resize(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    try
    {
      this.maxSize = paramInt;
      trimToSize(paramInt);
      return;
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

  protected int sizeOf(Object paramObject1, Object paramObject2)
  {
    return 1;
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

  // ERROR //
  public void trimToSize(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 97	com/tencent/kingkong/support/LruCache:size	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 36	com/tencent/kingkong/support/LruCache:map	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 130	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 97	com/tencent/kingkong/support/LruCache:size	I
    //   23: ifeq +41 -> 64
    //   26: new 43	java/lang/IllegalStateException
    //   29: dup
    //   30: new 45	java/lang/StringBuilder
    //   33: dup
    //   34: aload_0
    //   35: invokevirtual 134	java/lang/Object:getClass	()Ljava/lang/Class;
    //   38: invokevirtual 139	java/lang/Class:getName	()Ljava/lang/String;
    //   41: invokestatic 142	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   44: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: ldc 144
    //   49: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 62	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 97	com/tencent/kingkong/support/LruCache:size	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 36	com/tencent/kingkong/support/LruCache:map	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 130	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 36	com/tencent/kingkong/support/LruCache:map	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 148	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 154 1 0
    //   97: invokeinterface 159 1 0
    //   102: ifeq +99 -> 201
    //   105: aload_0
    //   106: getfield 36	com/tencent/kingkong/support/LruCache:map	Ljava/util/LinkedHashMap;
    //   109: invokevirtual 148	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   112: invokeinterface 154 1 0
    //   117: invokeinterface 163 1 0
    //   122: checkcast 165	java/util/Map$Entry
    //   125: astore_3
    //   126: aload_3
    //   127: ifnonnull +6 -> 133
    //   130: aload_0
    //   131: monitorexit
    //   132: return
    //   133: aload_3
    //   134: invokeinterface 168 1 0
    //   139: astore 4
    //   141: aload_3
    //   142: invokeinterface 171 1 0
    //   147: astore 5
    //   149: aload_0
    //   150: getfield 36	com/tencent/kingkong/support/LruCache:map	Ljava/util/LinkedHashMap;
    //   153: aload 4
    //   155: invokevirtual 106	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   158: pop
    //   159: aload_0
    //   160: aload_0
    //   161: getfield 97	com/tencent/kingkong/support/LruCache:size	I
    //   164: aload_0
    //   165: aload 4
    //   167: aload 5
    //   169: invokespecial 99	com/tencent/kingkong/support/LruCache:safeSizeOf	(Ljava/lang/Object;Ljava/lang/Object;)I
    //   172: isub
    //   173: putfield 97	com/tencent/kingkong/support/LruCache:size	I
    //   176: aload_0
    //   177: iconst_1
    //   178: aload_0
    //   179: getfield 75	com/tencent/kingkong/support/LruCache:evictionCount	I
    //   182: iadd
    //   183: putfield 75	com/tencent/kingkong/support/LruCache:evictionCount	I
    //   186: aload_0
    //   187: monitorexit
    //   188: aload_0
    //   189: iconst_1
    //   190: aload 4
    //   192: aload 5
    //   194: aconst_null
    //   195: invokevirtual 95	com/tencent/kingkong/support/LruCache:entryRemoved	(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   198: goto -198 -> 0
    //   201: aconst_null
    //   202: astore_3
    //   203: goto -77 -> 126
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	126	59	finally
    //   130	132	59	finally
    //   133	188	59	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.support.LruCache
 * JD-Core Version:    0.6.2
 */