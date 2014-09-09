package com.tencent.mm.app;

import android.os.FileObserver;

final class j extends FileObserver
{
  j(h paramh, String paramString)
  {
    super(paramString, 712);
  }

  // ERROR //
  public final void onEvent(int paramInt, String paramString)
  {
    // Byte code:
    //   0: invokestatic 21	java/lang/System:currentTimeMillis	()J
    //   3: aload_0
    //   4: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   7: invokestatic 27	com/tencent/mm/app/h:a	(Lcom/tencent/mm/app/h;)J
    //   10: lsub
    //   11: ldc2_w 28
    //   14: lcmp
    //   15: ifge +10 -> 25
    //   18: iconst_1
    //   19: istore_3
    //   20: iload_3
    //   21: ifeq +9 -> 30
    //   24: return
    //   25: iconst_0
    //   26: istore_3
    //   27: goto -7 -> 20
    //   30: aload_0
    //   31: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   34: getfield 33	com/tencent/mm/app/h:cGj	Ljava/util/HashSet;
    //   37: astore 4
    //   39: aload 4
    //   41: monitorenter
    //   42: iload_1
    //   43: lookupswitch	default:+41->84, 8:+53->96, 64:+137->180, 128:+122->165, 512:+137->180
    //   85: iconst_1
    //   86: monitorexit
    //   87: return
    //   88: astore 6
    //   90: aload 4
    //   92: monitorexit
    //   93: aload 6
    //   95: athrow
    //   96: ldc 35
    //   98: new 37	java/lang/StringBuilder
    //   101: dup
    //   102: ldc 39
    //   104: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   107: aload_2
    //   108: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 56	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload_0
    //   118: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   121: getfield 60	com/tencent/mm/app/h:cGn	Landroid/os/ConditionVariable;
    //   124: invokevirtual 66	android/os/ConditionVariable:open	()V
    //   127: aload_0
    //   128: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   131: getfield 70	com/tencent/mm/app/h:cGr	Lcom/tencent/mm/app/k;
    //   134: ifnonnull +31 -> 165
    //   137: aload_0
    //   138: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   141: new 72	com/tencent/mm/app/k
    //   144: dup
    //   145: aload_0
    //   146: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   149: invokespecial 75	com/tencent/mm/app/k:<init>	(Lcom/tencent/mm/app/h;)V
    //   152: putfield 70	com/tencent/mm/app/h:cGr	Lcom/tencent/mm/app/k;
    //   155: aload_0
    //   156: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   159: getfield 70	com/tencent/mm/app/h:cGr	Lcom/tencent/mm/app/k;
    //   162: invokevirtual 78	com/tencent/mm/app/k:start	()V
    //   165: aload_0
    //   166: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   169: getfield 33	com/tencent/mm/app/h:cGj	Ljava/util/HashSet;
    //   172: aload_2
    //   173: invokevirtual 84	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   176: pop
    //   177: goto -93 -> 84
    //   180: aload_0
    //   181: getfield 10	com/tencent/mm/app/j:cGs	Lcom/tencent/mm/app/h;
    //   184: getfield 33	com/tencent/mm/app/h:cGj	Ljava/util/HashSet;
    //   187: aload_2
    //   188: invokevirtual 87	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   191: pop
    //   192: goto -108 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   84	87	88	finally
    //   96	165	88	finally
    //   165	177	88	finally
    //   180	192	88	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.j
 * JD-Core Version:    0.6.2
 */