package com.tencent.mm.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  private boolean dfw = false;
  private String filePath = "";
  private Map values;

  public d(String paramString)
  {
    this.filePath = paramString;
    aIf();
    this.dfw = false;
  }

  private void aIf()
  {
    try
    {
      File localFile = new File(this.filePath);
      if (!localFile.exists())
        localFile.createNewFile();
      if (localFile.length() == 0L)
        this.values = new HashMap();
      while (true)
      {
        return;
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
        this.values = ((Map)localObjectInputStream.readObject());
        localObjectInputStream.close();
        localFileInputStream.close();
      }
    }
    catch (Exception localException)
    {
      while (true)
        this.values = new HashMap();
    }
    finally
    {
    }
  }

  // ERROR //
  private void mt()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 74	com/tencent/mm/sdk/platformtools/ch:CM	()J
    //   5: lstore_3
    //   6: new 76	java/io/FileOutputStream
    //   9: dup
    //   10: aload_0
    //   11: getfield 21	com/tencent/mm/storage/d:filePath	Ljava/lang/String;
    //   14: invokespecial 77	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   17: astore 5
    //   19: new 79	java/io/ObjectOutputStream
    //   22: dup
    //   23: aload 5
    //   25: invokespecial 82	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   28: astore 6
    //   30: aload 6
    //   32: aload_0
    //   33: getfield 46	com/tencent/mm/storage/d:values	Ljava/util/Map;
    //   36: invokevirtual 86	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   39: aload 6
    //   41: invokevirtual 87	java/io/ObjectOutputStream:close	()V
    //   44: aload 5
    //   46: invokevirtual 90	java/io/FileOutputStream:flush	()V
    //   49: aload 5
    //   51: invokevirtual 91	java/io/FileOutputStream:close	()V
    //   54: iconst_2
    //   55: anewarray 4	java/lang/Object
    //   58: astore 7
    //   60: aload 7
    //   62: iconst_0
    //   63: aload_0
    //   64: getfield 46	com/tencent/mm/storage/d:values	Ljava/util/Map;
    //   67: invokeinterface 95 1 0
    //   72: invokeinterface 101 1 0
    //   77: arraylength
    //   78: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: aastore
    //   82: aload 7
    //   84: iconst_1
    //   85: lload_3
    //   86: invokestatic 111	com/tencent/mm/sdk/platformtools/ch:ac	(J)J
    //   89: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   92: aastore
    //   93: ldc 118
    //   95: ldc 120
    //   97: aload 7
    //   99: invokestatic 126	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: aload_0
    //   103: monitorexit
    //   104: return
    //   105: astore_2
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    //   110: astore_1
    //   111: goto -9 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   2	102	105	finally
    //   2	102	110	java/io/IOException
  }

  public final Object get(int paramInt)
  {
    try
    {
      Object localObject2 = this.values.get(Integer.valueOf(paramInt));
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }

  public final Object get(int paramInt, Object paramObject)
  {
    try
    {
      Object localObject2 = this.values.get(Integer.valueOf(paramInt));
      if (localObject2 == null)
        return paramObject;
      paramObject = localObject2;
    }
    finally
    {
    }
  }

  public final void set(int paramInt, Object paramObject)
  {
    try
    {
      this.values.put(Integer.valueOf(paramInt), paramObject);
      if (!this.dfw)
        mt();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.d
 * JD-Core Version:    0.6.2
 */