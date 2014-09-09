package com.tencent.mm.sdk.platformtools;

import com.tencent.mm.a.b;

public final class cr
{
  private final b iFY;
  private ae iFZ = new ae(256);

  public cr(String paramString)
  {
    this.iFY = new b(paramString);
  }

  // ERROR //
  public final String xc(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 32
    //   3: invokevirtual 38	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   6: ifeq +171 -> 177
    //   9: aload_0
    //   10: getfield 20	com/tencent/mm/sdk/platformtools/cr:iFZ	Lcom/tencent/mm/sdk/platformtools/ae;
    //   13: aload_1
    //   14: invokevirtual 42	com/tencent/mm/sdk/platformtools/ae:T	(Ljava/lang/Object;)Z
    //   17: ifeq +15 -> 32
    //   20: aload_0
    //   21: getfield 20	com/tencent/mm/sdk/platformtools/cr:iFZ	Lcom/tencent/mm/sdk/platformtools/ae;
    //   24: aload_1
    //   25: invokevirtual 46	com/tencent/mm/sdk/platformtools/ae:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   28: checkcast 34	java/lang/String
    //   31: areturn
    //   32: aload_1
    //   33: iconst_1
    //   34: invokevirtual 50	java/lang/String:substring	(I)Ljava/lang/String;
    //   37: astore 4
    //   39: aload 4
    //   41: astore_3
    //   42: aload_3
    //   43: ldc 52
    //   45: invokevirtual 56	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   48: astore 6
    //   50: aload 6
    //   52: arraylength
    //   53: iconst_1
    //   54: if_icmple +130 -> 184
    //   57: aload 6
    //   59: iconst_0
    //   60: aaload
    //   61: astore 7
    //   63: aload 6
    //   65: iconst_0
    //   66: aaload
    //   67: invokestatic 62	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   70: invokevirtual 66	java/lang/Integer:intValue	()I
    //   73: istore 8
    //   75: aload_3
    //   76: iconst_1
    //   77: aload 7
    //   79: invokevirtual 69	java/lang/String:length	()I
    //   82: iadd
    //   83: iload 8
    //   85: iconst_1
    //   86: aload 7
    //   88: invokevirtual 69	java/lang/String:length	()I
    //   91: iadd
    //   92: iadd
    //   93: invokevirtual 72	java/lang/String:substring	(II)Ljava/lang/String;
    //   96: astore 9
    //   98: aload_3
    //   99: iload 8
    //   101: iconst_1
    //   102: aload 7
    //   104: invokevirtual 69	java/lang/String:length	()I
    //   107: iadd
    //   108: iadd
    //   109: invokevirtual 50	java/lang/String:substring	(I)Ljava/lang/String;
    //   112: astore 10
    //   114: new 74	java/lang/StringBuilder
    //   117: dup
    //   118: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   121: aload_0
    //   122: getfield 26	com/tencent/mm/sdk/platformtools/cr:iFY	Lcom/tencent/mm/a/b;
    //   125: aload 9
    //   127: invokevirtual 78	com/tencent/mm/a/b:aa	(Ljava/lang/String;)Ljava/lang/String;
    //   130: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: aload 10
    //   135: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: astore 11
    //   143: aload_0
    //   144: getfield 20	com/tencent/mm/sdk/platformtools/cr:iFZ	Lcom/tencent/mm/sdk/platformtools/ae;
    //   147: aload_1
    //   148: aload 11
    //   150: invokevirtual 90	com/tencent/mm/sdk/platformtools/ae:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: aload 11
    //   156: areturn
    //   157: astore_2
    //   158: aload_1
    //   159: astore_3
    //   160: new 74	java/lang/StringBuilder
    //   163: dup
    //   164: ldc 92
    //   166: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: aload_3
    //   170: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: astore_1
    //   177: aload_1
    //   178: areturn
    //   179: astore 5
    //   181: goto -21 -> 160
    //   184: aload_3
    //   185: astore_1
    //   186: goto -9 -> 177
    //
    // Exception table:
    //   from	to	target	type
    //   0	32	157	java/lang/Exception
    //   32	39	157	java/lang/Exception
    //   42	154	179	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cr
 * JD-Core Version:    0.6.2
 */