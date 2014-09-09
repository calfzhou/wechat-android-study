package com.tencent.mm.dbsupport.newcursor;

public final class j
{
  // ERROR //
  public static void Ce()
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_0
    //   2: new 10	android/os/StatFs
    //   5: dup
    //   6: invokestatic 16	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   9: invokevirtual 22	java/io/File:getPath	()Ljava/lang/String;
    //   12: invokespecial 26	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 30	android/os/StatFs:getAvailableBlocks	()I
    //   20: i2l
    //   21: lstore 9
    //   23: aload_2
    //   24: invokevirtual 33	android/os/StatFs:getBlockSize	()I
    //   27: istore 11
    //   29: lload 9
    //   31: iload 11
    //   33: i2l
    //   34: lmul
    //   35: lstore 4
    //   37: aload_2
    //   38: invokevirtual 36	android/os/StatFs:getBlockCount	()I
    //   41: i2l
    //   42: aload_2
    //   43: invokevirtual 33	android/os/StatFs:getBlockSize	()I
    //   46: i2l
    //   47: lmul
    //   48: lstore 6
    //   50: aload_2
    //   51: invokevirtual 39	android/os/StatFs:getFreeBlocks	()I
    //   54: i2l
    //   55: lstore 13
    //   57: aload_2
    //   58: invokevirtual 33	android/os/StatFs:getBlockSize	()I
    //   61: istore 15
    //   63: lload 13
    //   65: iload 15
    //   67: i2l
    //   68: lmul
    //   69: lstore_0
    //   70: iconst_3
    //   71: anewarray 4	java/lang/Object
    //   74: astore 8
    //   76: aload 8
    //   78: iconst_0
    //   79: lload 4
    //   81: invokestatic 45	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   84: aastore
    //   85: aload 8
    //   87: iconst_1
    //   88: lload 6
    //   90: invokestatic 45	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   93: aastore
    //   94: aload 8
    //   96: iconst_2
    //   97: lload_0
    //   98: invokestatic 45	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   101: aastore
    //   102: ldc 47
    //   104: ldc 49
    //   106: aload 8
    //   108: invokestatic 55	com/tencent/kingkong/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: return
    //   112: astore_3
    //   113: lload_0
    //   114: lstore 4
    //   116: ldc 47
    //   118: ldc 57
    //   120: invokestatic 61	com/tencent/kingkong/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: lload_0
    //   124: lstore 6
    //   126: goto -56 -> 70
    //   129: astore 12
    //   131: goto -15 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   2	29	112	java/lang/Exception
    //   37	63	129	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.j
 * JD-Core Version:    0.6.2
 */