package com.tencent.mm.a;

public final class m
{
  // ERROR //
  public static byte[] f(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 12	java/util/zip/Deflater
    //   3: dup
    //   4: invokespecial 16	java/util/zip/Deflater:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual 19	java/util/zip/Deflater:reset	()V
    //   12: aload_1
    //   13: aload_0
    //   14: invokevirtual 23	java/util/zip/Deflater:setInput	([B)V
    //   17: aload_1
    //   18: invokevirtual 26	java/util/zip/Deflater:finish	()V
    //   21: new 28	java/io/ByteArrayOutputStream
    //   24: dup
    //   25: aload_0
    //   26: arraylength
    //   27: invokespecial 31	java/io/ByteArrayOutputStream:<init>	(I)V
    //   30: astore_2
    //   31: sipush 1024
    //   34: newarray byte
    //   36: astore 7
    //   38: aload_1
    //   39: invokevirtual 35	java/util/zip/Deflater:finished	()Z
    //   42: ifne +31 -> 73
    //   45: aload_2
    //   46: aload 7
    //   48: iconst_0
    //   49: aload_1
    //   50: aload 7
    //   52: invokevirtual 39	java/util/zip/Deflater:deflate	([B)I
    //   55: invokevirtual 43	java/io/ByteArrayOutputStream:write	([BII)V
    //   58: goto -20 -> 38
    //   61: astore 5
    //   63: aload_2
    //   64: invokevirtual 46	java/io/ByteArrayOutputStream:close	()V
    //   67: aload_1
    //   68: invokevirtual 49	java/util/zip/Deflater:end	()V
    //   71: aload_0
    //   72: areturn
    //   73: aload_2
    //   74: invokevirtual 53	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   77: astore 8
    //   79: aload 8
    //   81: astore_0
    //   82: aload_2
    //   83: invokevirtual 46	java/io/ByteArrayOutputStream:close	()V
    //   86: goto -19 -> 67
    //   89: astore 9
    //   91: goto -24 -> 67
    //   94: astore_3
    //   95: aload_2
    //   96: invokevirtual 46	java/io/ByteArrayOutputStream:close	()V
    //   99: aload_3
    //   100: athrow
    //   101: astore 6
    //   103: goto -36 -> 67
    //   106: astore 4
    //   108: goto -9 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   31	38	61	java/lang/Exception
    //   38	58	61	java/lang/Exception
    //   73	79	61	java/lang/Exception
    //   82	86	89	java/io/IOException
    //   31	38	94	finally
    //   38	58	94	finally
    //   73	79	94	finally
    //   63	67	101	java/io/IOException
    //   95	99	106	java/io/IOException
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.m
 * JD-Core Version:    0.6.2
 */