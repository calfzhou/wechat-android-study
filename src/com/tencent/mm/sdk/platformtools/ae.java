package com.tencent.mm.sdk.platformtools;

import java.util.LinkedHashMap;
import java.util.Map;

public class ae
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;

  public ae(int paramInt)
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

  public final boolean T(Object paramObject)
  {
    try
    {
      boolean bool = this.map.containsKey(paramObject);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected Object create(Object paramObject)
  {
    return null;
  }

  protected void entryRemoved(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3)
  {
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
    //   3: getfield 95	com/tencent/mm/sdk/platformtools/ae:size	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 36	com/tencent/mm/sdk/platformtools/ae:map	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 130	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 95	com/tencent/mm/sdk/platformtools/ae:size	I
    //   23: ifeq +41 -> 64
    //   26: new 43	java/lang/IllegalStateException
    //   29: dup
    //   30: new 45	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 135	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 140	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 142
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
    //   65: getfield 95	com/tencent/mm/sdk/platformtools/ae:size	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 36	com/tencent/mm/sdk/platformtools/ae:map	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 130	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 36	com/tencent/mm/sdk/platformtools/ae:map	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 146	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 152 1 0
    //   97: invokeinterface 158 1 0
    //   102: checkcast 160	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 163 1 0
    //   112: astore 4
    //   114: aload_3
    //   115: invokeinterface 166 1 0
    //   120: astore 5
    //   122: aload_0
    //   123: getfield 36	com/tencent/mm/sdk/platformtools/ae:map	Ljava/util/LinkedHashMap;
    //   126: aload 4
    //   128: invokevirtual 107	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 95	com/tencent/mm/sdk/platformtools/ae:size	I
    //   137: aload_0
    //   138: aload 4
    //   140: aload 5
    //   142: invokespecial 97	com/tencent/mm/sdk/platformtools/ae:safeSizeOf	(Ljava/lang/Object;Ljava/lang/Object;)I
    //   145: isub
    //   146: putfield 95	com/tencent/mm/sdk/platformtools/ae:size	I
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 168	com/tencent/mm/sdk/platformtools/ae:evictionCount	I
    //   155: iadd
    //   156: putfield 168	com/tencent/mm/sdk/platformtools/ae:evictionCount	I
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_0
    //   162: iconst_1
    //   163: aload 4
    //   165: aload 5
    //   167: aconst_null
    //   168: invokevirtual 93	com/tencent/mm/sdk/platformtools/ae:entryRemoved	(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: goto -171 -> 0
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	161	59	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ae
 * JD-Core Version:    0.6.2
 */