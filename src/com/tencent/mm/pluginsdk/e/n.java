package com.tencent.mm.pluginsdk.e;

public final class n
{
  public final int action;
  public final String content;
  public final int dOA;
  public final int errorCode;
  public final int hwu;
  public final String title;
  public final int type;
  public final String url;

  // ERROR //
  public n(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: invokespecial 21	java/lang/Object:<init>	()V
    //   7: iconst_5
    //   8: istore 5
    //   10: aload_3
    //   11: ldc 23
    //   13: invokestatic 29	com/tencent/mm/sdk/platformtools/x:bB	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   16: astore 14
    //   18: aload 14
    //   20: ifnonnull +99 -> 119
    //   23: new 31	java/lang/IllegalArgumentException
    //   26: dup
    //   27: ldc 33
    //   29: invokespecial 36	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   32: athrow
    //   33: astore 6
    //   35: aload 6
    //   37: astore 7
    //   39: ldc 38
    //   41: astore 8
    //   43: ldc 38
    //   45: astore 9
    //   47: iload 5
    //   49: istore 10
    //   51: iconst_0
    //   52: istore 11
    //   54: ldc 40
    //   56: aload 7
    //   58: invokevirtual 44	java/lang/Exception:toString	()Ljava/lang/String;
    //   61: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: iload 11
    //   66: istore 12
    //   68: ldc 38
    //   70: astore 13
    //   72: aload_0
    //   73: iload_2
    //   74: putfield 51	com/tencent/mm/pluginsdk/e/n:errorCode	I
    //   77: aload_0
    //   78: iload_1
    //   79: putfield 53	com/tencent/mm/pluginsdk/e/n:dOA	I
    //   82: aload_0
    //   83: iload 4
    //   85: putfield 55	com/tencent/mm/pluginsdk/e/n:type	I
    //   88: aload_0
    //   89: iload 12
    //   91: putfield 57	com/tencent/mm/pluginsdk/e/n:action	I
    //   94: aload_0
    //   95: aload 13
    //   97: putfield 59	com/tencent/mm/pluginsdk/e/n:content	Ljava/lang/String;
    //   100: aload_0
    //   101: iload 10
    //   103: putfield 61	com/tencent/mm/pluginsdk/e/n:hwu	I
    //   106: aload_0
    //   107: aload 8
    //   109: putfield 63	com/tencent/mm/pluginsdk/e/n:title	Ljava/lang/String;
    //   112: aload_0
    //   113: aload 9
    //   115: putfield 65	com/tencent/mm/pluginsdk/e/n:url	Ljava/lang/String;
    //   118: return
    //   119: aload 14
    //   121: ldc 67
    //   123: invokeinterface 73 2 0
    //   128: checkcast 75	java/lang/String
    //   131: invokestatic 81	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   134: invokevirtual 85	java/lang/Integer:intValue	()I
    //   137: istore 15
    //   139: aload 14
    //   141: ldc 87
    //   143: invokeinterface 73 2 0
    //   148: checkcast 75	java/lang/String
    //   151: invokestatic 81	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   154: invokevirtual 85	java/lang/Integer:intValue	()I
    //   157: istore 4
    //   159: aload 14
    //   161: ldc 89
    //   163: invokeinterface 73 2 0
    //   168: checkcast 75	java/lang/String
    //   171: invokestatic 81	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   174: invokevirtual 85	java/lang/Integer:intValue	()I
    //   177: istore 5
    //   179: aload 14
    //   181: ldc 91
    //   183: invokeinterface 73 2 0
    //   188: checkcast 75	java/lang/String
    //   191: astore 8
    //   193: aload 14
    //   195: ldc 93
    //   197: invokeinterface 73 2 0
    //   202: checkcast 75	java/lang/String
    //   205: astore 9
    //   207: aload 14
    //   209: ldc 95
    //   211: invokeinterface 73 2 0
    //   216: checkcast 75	java/lang/String
    //   219: astore 19
    //   221: iload 4
    //   223: istore 12
    //   225: iload 15
    //   227: istore 4
    //   229: iload 5
    //   231: istore 20
    //   233: aload 19
    //   235: astore 13
    //   237: iload 20
    //   239: istore 10
    //   241: goto -169 -> 72
    //   244: astore 16
    //   246: ldc 38
    //   248: astore 8
    //   250: ldc 38
    //   252: astore 9
    //   254: iload 5
    //   256: istore 10
    //   258: iload 4
    //   260: istore 11
    //   262: iload 15
    //   264: istore 4
    //   266: aload 16
    //   268: astore 7
    //   270: goto -216 -> 54
    //   273: astore 17
    //   275: ldc 38
    //   277: astore 9
    //   279: iload 5
    //   281: istore 10
    //   283: iload 4
    //   285: istore 11
    //   287: iload 15
    //   289: istore 4
    //   291: aload 17
    //   293: astore 7
    //   295: goto -241 -> 54
    //   298: astore 18
    //   300: iload 5
    //   302: istore 10
    //   304: iload 4
    //   306: istore 11
    //   308: iload 15
    //   310: istore 4
    //   312: aload 18
    //   314: astore 7
    //   316: goto -262 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   10	18	33	java/lang/Exception
    //   23	33	33	java/lang/Exception
    //   119	139	33	java/lang/Exception
    //   139	193	244	java/lang/Exception
    //   193	207	273	java/lang/Exception
    //   207	221	298	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.n
 * JD-Core Version:    0.6.2
 */