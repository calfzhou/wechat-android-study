package com.tencent.mm.compatible.loader;

import java.lang.reflect.Field;

public final class d
{
  private String classname;
  private boolean dNY;
  private Field dNZ;
  private String fieldName;
  private Object obj;

  public d(Object paramObject, String paramString1, String paramString2)
  {
    if (paramObject == null)
      throw new IllegalArgumentException("obj cannot be null");
    this.obj = paramObject;
    this.fieldName = paramString1;
    this.classname = paramString2;
  }

  // ERROR //
  private void prepare()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	com/tencent/mm/compatible/loader/d:dNY	Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_1
    //   10: putfield 36	com/tencent/mm/compatible/loader/d:dNY	Z
    //   13: aload_0
    //   14: getfield 27	com/tencent/mm/compatible/loader/d:obj	Ljava/lang/Object;
    //   17: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull -15 -> 7
    //   25: aload_1
    //   26: aload_0
    //   27: getfield 29	com/tencent/mm/compatible/loader/d:fieldName	Ljava/lang/String;
    //   30: invokevirtual 46	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   33: astore 10
    //   35: aload 10
    //   37: iconst_1
    //   38: invokevirtual 52	java/lang/reflect/Field:setAccessible	(Z)V
    //   41: aload_0
    //   42: aload 10
    //   44: putfield 54	com/tencent/mm/compatible/loader/d:dNZ	Ljava/lang/reflect/Field;
    //   47: aload_1
    //   48: invokevirtual 57	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   51: pop
    //   52: return
    //   53: astore 4
    //   55: aload_0
    //   56: getfield 31	com/tencent/mm/compatible/loader/d:classname	Ljava/lang/String;
    //   59: invokestatic 63	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   62: ifne +61 -> 123
    //   65: aload_1
    //   66: invokevirtual 67	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   69: astore 6
    //   71: aload 6
    //   73: arraylength
    //   74: istore 7
    //   76: iconst_0
    //   77: istore 8
    //   79: iload 8
    //   81: iload 7
    //   83: if_icmpge +40 -> 123
    //   86: aload 6
    //   88: iload 8
    //   90: aaload
    //   91: astore 9
    //   93: aload 9
    //   95: invokevirtual 70	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   98: invokevirtual 74	java/lang/Class:getName	()Ljava/lang/String;
    //   101: aload_0
    //   102: getfield 31	com/tencent/mm/compatible/loader/d:classname	Ljava/lang/String;
    //   105: invokevirtual 80	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifeq +23 -> 131
    //   111: aload 9
    //   113: iconst_1
    //   114: invokevirtual 52	java/lang/reflect/Field:setAccessible	(Z)V
    //   117: aload_0
    //   118: aload 9
    //   120: putfield 54	com/tencent/mm/compatible/loader/d:dNZ	Ljava/lang/reflect/Field;
    //   123: aload_1
    //   124: invokevirtual 57	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   127: astore_1
    //   128: goto -107 -> 21
    //   131: iinc 8 1
    //   134: goto -55 -> 79
    //   137: astore_2
    //   138: aload_1
    //   139: invokevirtual 57	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   142: pop
    //   143: aload_2
    //   144: athrow
    //   145: astore 5
    //   147: goto -24 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   25	47	53	java/lang/Exception
    //   25	47	137	finally
    //   55	76	137	finally
    //   86	123	137	finally
    //   55	76	145	java/lang/Exception
    //   86	123	145	java/lang/Exception
  }

  public final Object get()
  {
    prepare();
    if (this.dNZ == null)
      throw new NoSuchFieldException();
    try
    {
      Object localObject = this.dNZ.get(this.obj);
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new IllegalArgumentException("unable to cast object");
  }

  public final void set(Object paramObject)
  {
    prepare();
    if (this.dNZ == null)
      throw new NoSuchFieldException();
    this.dNZ.set(this.obj, paramObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.d
 * JD-Core Version:    0.6.2
 */