package com.tencent.mm.an;

import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  public int dAr = 0;
  public int hitCount = 0;

  public static String s(Map paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramMap != null);
    try
    {
      if (paramMap.size() > 0)
      {
        localStringBuilder.append("<voiptenmin>");
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          Object localObject = localEntry.getKey();
          d locald = (d)localEntry.getValue();
          localStringBuilder.append("<" + localObject);
          localStringBuilder.append(" hitcount = \"");
          localStringBuilder.append(locald.hitCount);
          localStringBuilder.append("\"");
          localStringBuilder.append(" sendcount = \"");
          localStringBuilder.append(locald.dAr);
          localStringBuilder.append("\"");
          localStringBuilder.append("/>");
        }
        localStringBuilder.append("</voiptenmin>");
      }
      z.d("!44@CnzAcTcbtYFRSXd7O2W+aoew+LcYo3Eeko0uZc3BjDo=", "mapToXml " + localStringBuilder.toString());
      return localStringBuilder.toString();
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  public static Map wm(String paramString)
  {
    // Byte code:
    //   0: ldc 89
    //   2: new 21	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 101
    //   8: invokespecial 67	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   18: invokestatic 97	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aconst_null
    //   22: astore_1
    //   23: aload_0
    //   24: ifnull +369 -> 393
    //   27: aload_0
    //   28: ldc 103
    //   30: invokestatic 109	com/tencent/mm/sdk/platformtools/x:bB	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   33: astore_3
    //   34: aconst_null
    //   35: astore_1
    //   36: aload_3
    //   37: ifnull +356 -> 393
    //   40: aload_3
    //   41: invokeinterface 28 1 0
    //   46: istore 4
    //   48: aconst_null
    //   49: astore_1
    //   50: iload 4
    //   52: ifle +341 -> 393
    //   55: new 111	java/util/HashMap
    //   58: dup
    //   59: invokespecial 112	java/util/HashMap:<init>	()V
    //   62: astore 5
    //   64: aload_3
    //   65: invokeinterface 38 1 0
    //   70: invokeinterface 44 1 0
    //   75: astore 7
    //   77: aload 7
    //   79: invokeinterface 50 1 0
    //   84: ifeq +301 -> 385
    //   87: aload 7
    //   89: invokeinterface 54 1 0
    //   94: checkcast 56	java/util/Map$Entry
    //   97: astore 8
    //   99: aload 8
    //   101: invokeinterface 59 1 0
    //   106: checkcast 114	java/lang/String
    //   109: astore 9
    //   111: aload 9
    //   113: ifnull +272 -> 385
    //   116: aload 9
    //   118: ldc 116
    //   120: invokevirtual 120	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   123: astore 10
    //   125: ldc 89
    //   127: new 21	java/lang/StringBuilder
    //   130: dup
    //   131: ldc 122
    //   133: invokespecial 67	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   136: aload 9
    //   138: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 97	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: ldc 89
    //   149: new 21	java/lang/StringBuilder
    //   152: dup
    //   153: ldc 124
    //   155: invokespecial 67	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload 10
    //   160: arraylength
    //   161: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   164: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 97	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: aload 9
    //   172: ifnull -95 -> 77
    //   175: aload 10
    //   177: arraylength
    //   178: iconst_4
    //   179: if_icmplt -102 -> 77
    //   182: ldc 89
    //   184: new 21	java/lang/StringBuilder
    //   187: dup
    //   188: ldc 126
    //   190: invokespecial 67	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: aload 8
    //   195: invokeinterface 62 1 0
    //   200: checkcast 114	java/lang/String
    //   203: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: ldc 128
    //   208: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload 10
    //   213: iconst_2
    //   214: aaload
    //   215: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokestatic 97	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: aload 5
    //   226: aload 10
    //   228: iconst_2
    //   229: aaload
    //   230: invokeinterface 132 2 0
    //   235: ifeq +103 -> 338
    //   238: aload 5
    //   240: aload 10
    //   242: iconst_2
    //   243: aaload
    //   244: invokeinterface 136 2 0
    //   249: checkcast 2	com/tencent/mm/an/d
    //   252: astore 11
    //   254: aload 9
    //   256: ldc 138
    //   258: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   261: ifeq +89 -> 350
    //   264: aload 11
    //   266: aload 8
    //   268: invokeinterface 62 1 0
    //   273: checkcast 114	java/lang/String
    //   276: iconst_0
    //   277: invokestatic 148	com/tencent/mm/sdk/platformtools/ch:getInt	(Ljava/lang/String;I)I
    //   280: putfield 13	com/tencent/mm/an/d:hitCount	I
    //   283: ldc 89
    //   285: new 21	java/lang/StringBuilder
    //   288: dup
    //   289: ldc 150
    //   291: invokespecial 67	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   294: aload 11
    //   296: getfield 13	com/tencent/mm/an/d:hitCount	I
    //   299: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   302: ldc 152
    //   304: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload 11
    //   309: getfield 15	com/tencent/mm/an/d:dAr	I
    //   312: invokevirtual 79	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   315: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokestatic 97	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   321: aload 5
    //   323: aload 10
    //   325: iconst_2
    //   326: aaload
    //   327: aload 11
    //   329: invokeinterface 156 3 0
    //   334: pop
    //   335: goto -258 -> 77
    //   338: new 2	com/tencent/mm/an/d
    //   341: dup
    //   342: invokespecial 157	com/tencent/mm/an/d:<init>	()V
    //   345: astore 11
    //   347: goto -93 -> 254
    //   350: aload 9
    //   352: ldc 159
    //   354: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   357: ifeq -74 -> 283
    //   360: aload 11
    //   362: aload 8
    //   364: invokeinterface 62 1 0
    //   369: checkcast 114	java/lang/String
    //   372: iconst_0
    //   373: invokestatic 148	com/tencent/mm/sdk/platformtools/ch:getInt	(Ljava/lang/String;I)I
    //   376: putfield 15	com/tencent/mm/an/d:dAr	I
    //   379: goto -96 -> 283
    //   382: astore_2
    //   383: aconst_null
    //   384: areturn
    //   385: aload 5
    //   387: areturn
    //   388: astore 6
    //   390: aload 5
    //   392: astore_1
    //   393: aload_1
    //   394: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   27	34	382	java/lang/Exception
    //   40	48	382	java/lang/Exception
    //   55	64	382	java/lang/Exception
    //   64	77	388	java/lang/Exception
    //   77	111	388	java/lang/Exception
    //   116	170	388	java/lang/Exception
    //   175	254	388	java/lang/Exception
    //   254	283	388	java/lang/Exception
    //   283	335	388	java/lang/Exception
    //   338	347	388	java/lang/Exception
    //   350	379	388	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.d
 * JD-Core Version:    0.6.2
 */