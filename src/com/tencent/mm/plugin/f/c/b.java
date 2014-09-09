package com.tencent.mm.plugin.f.c;

import android.util.SparseArray;
import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.a.c;
import com.tencent.mm.plugin.f.a.d;
import com.tencent.mm.plugin.f.a.e;
import com.tencent.mm.plugin.f.b.l;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

final class b
  implements m
{
  private SparseArray fTn = new SparseArray();
  private HashMap fTo = new HashMap();
  private Object lock = new Object();

  private static String aeT()
  {
    if (bg.oE())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = bg.qW().pq();
      arrayOfObject[1] = f.d("__file_client_perf__".getBytes());
      return String.format("%s/%s", arrayOfObject);
    }
    return "";
  }

  // ERROR //
  private c aeW()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 28	com/tencent/mm/plugin/f/c/b:lock	Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_3
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 21	com/tencent/mm/plugin/f/c/b:fTn	Landroid/util/SparseArray;
    //   15: astore 5
    //   17: aload_0
    //   18: new 18	android/util/SparseArray
    //   21: dup
    //   22: invokespecial 19	android/util/SparseArray:<init>	()V
    //   25: putfield 21	com/tencent/mm/plugin/f/c/b:fTn	Landroid/util/SparseArray;
    //   28: aload_3
    //   29: monitorexit
    //   30: invokestatic 73	com/tencent/mm/plugin/f/c/b:aeT	()Ljava/lang/String;
    //   33: astore 6
    //   35: iload_1
    //   36: anewarray 4	java/lang/Object
    //   39: astore 7
    //   41: aload 7
    //   43: iconst_0
    //   44: aload 6
    //   46: aastore
    //   47: ldc 75
    //   49: ldc 77
    //   51: aload 7
    //   53: invokestatic 83	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: aload 6
    //   58: invokestatic 88	com/tencent/mm/sdk/platformtools/ch:oE	(Ljava/lang/String;)[B
    //   61: astore 8
    //   63: iload_1
    //   64: anewarray 4	java/lang/Object
    //   67: astore 9
    //   69: aload 8
    //   71: ifnonnull +174 -> 245
    //   74: iload_1
    //   75: istore 10
    //   77: aload 9
    //   79: iconst_0
    //   80: iload 10
    //   82: invokestatic 94	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   85: aastore
    //   86: ldc 75
    //   88: ldc 96
    //   90: aload 9
    //   92: invokestatic 83	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload 8
    //   97: ifnull +379 -> 476
    //   100: aload 8
    //   102: arraylength
    //   103: ifle +373 -> 476
    //   106: new 98	com/tencent/mm/plugin/f/a/c
    //   109: dup
    //   110: invokespecial 99	com/tencent/mm/plugin/f/a/c:<init>	()V
    //   113: aload 8
    //   115: invokevirtual 103	com/tencent/mm/plugin/f/a/c:al	([B)Lcom/tencent/mm/plugin/f/a/c;
    //   118: astore 22
    //   120: aload 22
    //   122: astore 11
    //   124: aload 6
    //   126: invokestatic 109	com/tencent/mm/plugin/f/c/q:pV	(Ljava/lang/String;)Z
    //   129: ifne +9 -> 138
    //   132: aload 6
    //   134: invokestatic 112	com/tencent/mm/sdk/platformtools/ch:deleteFile	(Ljava/lang/String;)Z
    //   137: pop
    //   138: iload_1
    //   139: anewarray 4	java/lang/Object
    //   142: astore 12
    //   144: aload 11
    //   146: ifnonnull +146 -> 292
    //   149: aload 12
    //   151: iconst_0
    //   152: iload_1
    //   153: invokestatic 94	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   156: aastore
    //   157: ldc 75
    //   159: ldc 114
    //   161: aload 12
    //   163: invokestatic 116	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: aload 11
    //   168: ifnull +256 -> 424
    //   171: aload 11
    //   173: getfield 120	com/tencent/mm/plugin/f/a/c:fSM	Ljava/util/LinkedList;
    //   176: invokevirtual 126	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   179: astore 15
    //   181: aload 15
    //   183: invokeinterface 131 1 0
    //   188: ifeq +236 -> 424
    //   191: aload 15
    //   193: invokeinterface 135 1 0
    //   198: checkcast 137	com/tencent/mm/plugin/f/a/d
    //   201: astore 16
    //   203: aload 5
    //   205: aload 16
    //   207: getfield 141	com/tencent/mm/plugin/f/a/d:hUh	I
    //   210: invokevirtual 145	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   213: checkcast 137	com/tencent/mm/plugin/f/a/d
    //   216: astore 17
    //   218: aload 17
    //   220: ifnonnull +77 -> 297
    //   223: aload 5
    //   225: aload 16
    //   227: getfield 141	com/tencent/mm/plugin/f/a/d:hUh	I
    //   230: aload 16
    //   232: invokevirtual 149	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   235: goto -54 -> 181
    //   238: astore 4
    //   240: aload_3
    //   241: monitorexit
    //   242: aload 4
    //   244: athrow
    //   245: iconst_0
    //   246: istore 10
    //   248: goto -171 -> 77
    //   251: astore 20
    //   253: aload 6
    //   255: invokestatic 109	com/tencent/mm/plugin/f/c/q:pV	(Ljava/lang/String;)Z
    //   258: ifne +218 -> 476
    //   261: aload 6
    //   263: invokestatic 112	com/tencent/mm/sdk/platformtools/ch:deleteFile	(Ljava/lang/String;)Z
    //   266: pop
    //   267: aconst_null
    //   268: astore 11
    //   270: goto -132 -> 138
    //   273: astore 18
    //   275: aload 6
    //   277: invokestatic 109	com/tencent/mm/plugin/f/c/q:pV	(Ljava/lang/String;)Z
    //   280: ifne +9 -> 289
    //   283: aload 6
    //   285: invokestatic 112	com/tencent/mm/sdk/platformtools/ch:deleteFile	(Ljava/lang/String;)Z
    //   288: pop
    //   289: aload 18
    //   291: athrow
    //   292: iconst_0
    //   293: istore_1
    //   294: goto -145 -> 149
    //   297: aload 17
    //   299: aload 16
    //   301: getfield 152	com/tencent/mm/plugin/f/a/d:hUm	I
    //   304: putfield 152	com/tencent/mm/plugin/f/a/d:hUm	I
    //   307: aload 17
    //   309: getfield 155	com/tencent/mm/plugin/f/a/d:hUk	I
    //   312: aload 16
    //   314: getfield 155	com/tencent/mm/plugin/f/a/d:hUk	I
    //   317: if_icmple +13 -> 330
    //   320: aload 17
    //   322: aload 16
    //   324: getfield 155	com/tencent/mm/plugin/f/a/d:hUk	I
    //   327: putfield 155	com/tencent/mm/plugin/f/a/d:hUk	I
    //   330: aload 17
    //   332: getfield 158	com/tencent/mm/plugin/f/a/d:hUj	I
    //   335: aload 16
    //   337: getfield 158	com/tencent/mm/plugin/f/a/d:hUj	I
    //   340: if_icmpge +13 -> 353
    //   343: aload 17
    //   345: aload 16
    //   347: getfield 158	com/tencent/mm/plugin/f/a/d:hUj	I
    //   350: putfield 158	com/tencent/mm/plugin/f/a/d:hUj	I
    //   353: aload 17
    //   355: aload 17
    //   357: getfield 161	com/tencent/mm/plugin/f/a/d:hUi	I
    //   360: aload 17
    //   362: getfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   365: imul
    //   366: aload 16
    //   368: getfield 161	com/tencent/mm/plugin/f/a/d:hUi	I
    //   371: aload 16
    //   373: getfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   376: imul
    //   377: iadd
    //   378: aload 17
    //   380: getfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   383: aload 16
    //   385: getfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   388: iadd
    //   389: idiv
    //   390: putfield 161	com/tencent/mm/plugin/f/a/d:hUi	I
    //   393: aload 17
    //   395: aload 16
    //   397: getfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   400: aload 17
    //   402: getfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   405: iadd
    //   406: putfield 164	com/tencent/mm/plugin/f/a/d:hUl	I
    //   409: aload 5
    //   411: aload 17
    //   413: getfield 141	com/tencent/mm/plugin/f/a/d:hUh	I
    //   416: aload 17
    //   418: invokevirtual 149	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   421: goto -240 -> 181
    //   424: new 98	com/tencent/mm/plugin/f/a/c
    //   427: dup
    //   428: invokespecial 99	com/tencent/mm/plugin/f/a/c:<init>	()V
    //   431: astore 13
    //   433: iload_2
    //   434: aload 5
    //   436: invokevirtual 168	android/util/SparseArray:size	()I
    //   439: if_icmpge +24 -> 463
    //   442: aload 13
    //   444: getfield 120	com/tencent/mm/plugin/f/a/c:fSM	Ljava/util/LinkedList;
    //   447: aload 5
    //   449: iload_2
    //   450: invokevirtual 171	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   453: invokevirtual 175	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   456: pop
    //   457: iinc 2 1
    //   460: goto -27 -> 433
    //   463: aload 13
    //   465: aload 5
    //   467: invokevirtual 168	android/util/SparseArray:size	()I
    //   470: putfield 178	com/tencent/mm/plugin/f/a/c:fSK	I
    //   473: aload 13
    //   475: areturn
    //   476: aconst_null
    //   477: astore 11
    //   479: goto -341 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   11	30	238	finally
    //   106	120	251	java/lang/Exception
    //   106	120	273	finally
  }

  public final x aeS()
  {
    c localc = aeW();
    if (localc.fSK > 0)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(localc.fSK);
      z.v("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "clientPerfList.size is %d", arrayOfObject);
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = localc.fSM.iterator();
      while (localIterator.hasNext())
        localLinkedList.add((d)localIterator.next());
      return new l(localLinkedList);
    }
    z.d("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "clientPerfList.size is 0, return null");
    return null;
  }

  public final int b(e parame)
  {
    if ((parame == null) || (parame.getType() != 0))
      return 0;
    d locald1 = (d)parame;
    if (locald1.aeM())
    {
      if (!this.fTo.containsKey(Long.valueOf(locald1.aeN())))
        this.fTo.put(Long.valueOf(locald1.aeN()), locald1);
      return 0;
    }
    if (locald1.rw())
    {
      this.fTo.remove(Long.valueOf(locald1.aeN()));
      return 0;
    }
    d locald2 = (d)this.fTo.get(Long.valueOf(locald1.aeN()));
    if (locald2 == null)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(locald1.hUh);
      z.v("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "begin record not find, eventID=%d", arrayOfObject2);
      return -1;
    }
    this.fTo.remove(Long.valueOf(locald1.aeN()));
    long l = locald1.aeO() - locald2.aeO();
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(locald1.hUh);
    arrayOfObject1[1] = Integer.valueOf((int)l);
    z.v("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "eventID:%d  time:%d", arrayOfObject1);
    locald1.hUi = ((int)l);
    locald1.hUm = locald2.hUm;
    d locald3;
    synchronized (this.lock)
    {
      locald3 = (d)this.fTn.get(locald1.hUh);
      if (locald3 == null)
      {
        locald3 = new d();
        locald3.hUh = locald1.hUh;
        locald3.hUk = locald1.hUi;
        locald3.hUj = locald1.hUi;
        locald3.hUi = locald1.hUi;
        locald3.hUm = locald1.hUm;
        locald3.hUn = locald1.hUn;
        locald3.hUl = (1 + locald3.hUl);
        this.fTn.put(locald3.hUh, locald3);
        if (locald3 == null)
          return 0;
      }
      else
      {
        if (locald3.hUk > locald1.hUi)
          locald3.hUk = locald1.hUi;
        if (locald3.hUj < locald1.hUi)
          locald3.hUj = locald1.hUi;
        locald3.hUi = ((locald3.hUi * locald3.hUl + locald1.hUi) / (1 + locald3.hUl));
        locald3.hUn = locald1.hUn;
      }
    }
    return locald3.hUl;
  }

  public final void clear()
  {
    this.fTo.clear();
    synchronized (this.lock)
    {
      this.fTn = new SparseArray();
      return;
    }
  }

  public final void save()
  {
    try
    {
      c localc = aeW();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localc.toString();
      z.v("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "clientPerfList = %s", arrayOfObject1);
      String str = aeT();
      z.v("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "history file name = %s", new Object[] { str });
      if (localc.fSK > 0)
      {
        ch.f(str, localc.toByteArray());
        z.d("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "save client perf list ok!");
      }
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localc.fSK);
      z.v("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "list size is %d", arrayOfObject2);
      return;
    }
    catch (IOException localIOException)
    {
      z.w("!44@/B4Tb64lLpJgOlQkz3QhjYl+54nkHlBiEMrKxqraDrQ=", "save error");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.b
 * JD-Core Version:    0.6.2
 */